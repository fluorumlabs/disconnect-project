package org.vaadin.disconnect.toolchain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.teavm.backend.javascript.TeaVMJavaScriptHost;
import org.teavm.flavour.json.JsonPersistable;
import org.teavm.model.*;
import org.teavm.model.instructions.*;
import org.teavm.vm.spi.TeaVMHost;
import org.vaadin.disconnect.core.annotations.*;
import org.vaadin.disconnect.core.client.RPC;
import org.vaadin.disconnect.core.server.RPCHandler;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 8/19/2019.
 */
public class DisconnectClassTransformer implements ClassHolderTransformer {
    private DisconnectTeaVMRendererListener rendererListener;
    private final TeaVMHost host;

    private Map<String, String> importedSymbols = new HashMap<>();

    public DisconnectClassTransformer(TeaVMHost host) {
        this.host = host;
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        if (rendererListener == null) {
            rendererListener = new DisconnectTeaVMRendererListener();
            TeaVMJavaScriptHost extension = host.getExtension(TeaVMJavaScriptHost.class);
            extension.add(rendererListener);
        }

        AnnotationContainer annotations = cls.getAnnotations();

        Optional<AnnotationHolder> webComponentAnnotation = Optional.ofNullable(annotations.get(WebComponent.class.getName()));
        webComponentAnnotation.ifPresent(annotationHolder -> {
            rendererListener.setEnableWebComponents(true);
        });

        Stream.concat(
                Optional.ofNullable((AnnotationReader) annotations.get(NpmPackage.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty()),
                Optional.ofNullable(annotations.get(NpmPackage.Container.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty())
                        .flatMap(ah -> ah.getValue("value").getList().stream().map(AnnotationValue::getAnnotation)))
                .forEach(annotationReader -> {
                    String npmPackage = annotationReader.getValue("name").getString();
                    String version = annotationReader.getValue("version").getString();
                    rendererListener.addPackage("    \"" + npmPackage + "\": \"" + version + "\"");
                });

        Stream.concat(
                Optional.ofNullable((AnnotationReader) annotations.get(Import.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty()),
                Optional.ofNullable(annotations.get(Import.Container.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty())
                        .flatMap(ah -> ah.getValue("value").getList().stream().map(AnnotationValue::getAnnotation)))
                .forEach(annotationReader -> {
                    String module = annotationReader.getValue("module").getString();
                    boolean object = annotationReader.getValue("object") != null && annotationReader.getValue("object").getBoolean();
                    List<AnnotationValue> symbols = Optional.ofNullable(annotationReader.getValue("symbols"))
                            .map(AnnotationValue::getList)
                            .orElse(Collections.emptyList());

                    for (AnnotationValue symbol : symbols) {
                        String symbolName = symbol.getString();
                        importedSymbols.putIfAbsent(symbolName, module);
                        if (!module.equals(importedSymbols.get(symbolName))) {
                            context.getDiagnostics().error(null, "Class {{c0}} imports JS symbol '" + symbolName + "' from module '" + module + "', which was already imported previously from '" + importedSymbols.get(symbolName) + "'", cls.getName());
                        }
                    }

                    String symbolsJoined = symbols.stream()
                            .map(AnnotationValue::getString)
                            .collect(Collectors.joining(", "));

                    if (symbols.isEmpty()) {
                        rendererListener.addImport("import '" + module + "';");
                    } else if (object) {
                        rendererListener.addImport("import { " + symbolsJoined + " } from '" + module + "';");
                    } else {
                        rendererListener.addImport("import " + symbolsJoined + " from '" + module + "';");
                    }
                });

        if (cls.getInterfaces().contains(Serializable.class.getName()) && !cls.getName().startsWith("java")) {
            cls.getAnnotations().add(new AnnotationHolder(JsonPersistable.class.getName()));

            cls.getFields().stream()
                    .filter(fieldHolder -> fieldHolder.getModifiers().contains(ElementModifier.TRANSIENT))
                    .forEach(fieldHolder -> fieldHolder.getAnnotations().add(new AnnotationHolder(JsonIgnore.class.getName())));
        }

        AnnotationHolder serviceAnnotation = cls.getAnnotations().get(Service.class.getName());
        if (serviceAnnotation != null) {
            String serviceName;
            AnnotationValue value = serviceAnnotation.getValue("value");
            if (value != null && !value.getString().isEmpty()) {
                serviceName = value.getString();
            } else {
                serviceName = StringUtils.uncapitalize(cls.getName().replaceAll("[a-z0-9_]+\\.", ""));
            }
            // That's a service. Let's fuck things up!
            // 1. Remove all fields (make it true stateless)
            new ArrayList<>(cls.getFields()).forEach(cls::removeField);
            // 2. Remove all non-public methods and constructors
            new ArrayList<>(cls.getMethods()).stream()
                    .filter(methodHolder -> (methodHolder.getLevel() != AccessLevel.PUBLIC)
                            || methodHolder.getName().equals("<init>"))
                    .forEach(cls::removeMethod);
            // 3. Replace body of all remaining methods with call
            // to RPC helper
            cls.getMethods().stream().filter(methodHolder -> methodHolder.getAnnotations().get(AllowClientCalls.class.getName()) != null).forEach(methodHolder -> {
                setupCaching(serviceName, methodHolder, context);
                methodHolder.setProgram(createRPCDelegator(serviceName, methodHolder));
            });

            // 4. Create default constructor
            cls.addMethod(createDefaultConstructor());
        }

        // Add initializers for @Resources
        cls.getFields().forEach(fieldHolder -> {
            if (fieldHolder.getAnnotations().get(Resource.class.getName()) != null) {
                addInitializer(cls, fieldHolder);
            }
        });
    }

    private void setupCaching(String serviceName, MethodHolder methodHolder, ClassHolderTransformerContext context) {
        String methodName = methodHolder.getName();

        AnnotationHolder allowClientCalls = methodHolder.getAnnotations().get(AllowClientCalls.class.getName());
        AnnotationHolder enableCache = methodHolder.getAnnotations().get(EnableCache.class.getName());
        AnnotationHolder enableBgSync = methodHolder.getAnnotations().get(EnableBackgroundSync.class.getName());

        String method = "POST";
        String cachingStrategy = null;
        Long maxAge = 24 * 60 * 60L;
        Integer maxEntries = null;
        Long retentionTime = 24 * 60L;

        if (allowClientCalls != null) {
            if (allowClientCalls.getValue("method") != null) {
                AllowClientCalls.Method value = AllowClientCalls.Method.valueOf(allowClientCalls.getValue("method").getEnumValue().getFieldName());
                switch (value) {
                    case GET:
                        method = "GET";
                        break;
                    case POST:
                    default:
                        method = "POST";
                        break;
                }
            }
        }

        if (enableBgSync != null) {
            cachingStrategy = "workbox.strategies.NetworkOnly";

            TimeUnit unit = TimeUnit.MINUTES;

            if (enableBgSync.getValue("unit") != null) {
                unit = TimeUnit.valueOf(enableBgSync.getValue("unit").getEnumValue().getFieldName());
            }
            if (enableBgSync.getValue("maxRetentionTime") != null) {
                int value = enableBgSync.getValue("maxRetentionTime").getInt();
                if (value > 0) {
                    retentionTime = unit.toMinutes(value);
                }
            }
        }

        if (enableCache != null) {
            cachingStrategy = "workbox.strategies.NetworkFirst";

            TimeUnit unit = TimeUnit.MINUTES;

            if (enableCache.getValue("strategy") != null) {
                EnableCache.CachingStrategy strategy = EnableCache.CachingStrategy.valueOf(enableCache.getValue("strategy").getEnumValue().getFieldName());
                switch (strategy) {
                    case STALE_WHILE_REVALIDATE:
                        cachingStrategy = "workbox.strategies.CacheWhileRevalidate";
                        break;
                    case CACHE_ONLY:
                        cachingStrategy = "workbox.strategies.CacheOnly";
                        break;
                    case CACHE_FIRST:
                        cachingStrategy = "workbox.strategies.CacheFirst";
                        break;
                    case NETWORK_ONLY:
                        cachingStrategy = "workbox.strategies.NetworkOnly";
                        break;
                    case NETWORK_FIRST:
                        cachingStrategy = "workbox.strategies.NetworkFirst";
                        break;
                }
            }

            if (enableCache.getValue("unit") != null) {
                unit = TimeUnit.valueOf(enableCache.getValue("unit").getEnumValue().getFieldName());
            }
            if (enableCache.getValue("maxAge") != null) {
                int value = enableCache.getValue("maxAge").getInt();
                if (value > 0) {
                    maxAge = unit.toSeconds(value);
                }
            }
            if (enableCache.getValue("maxEntries") != null) {
                int value = enableCache.getValue("maxEntries").getInt();
                if (value > 0) {
                    maxEntries = value;
                }
            }
        }

        if (enableBgSync != null && enableCache == null) {
            context.getDiagnostics().warning(null, "Missing @EnableCache annotation for {{c0}}." + methodName + "; will use @EnableCache(strategy = EnableCache.Strategy.NETWORK_ONLY)", methodHolder.getOwnerName());
        }
        if (enableBgSync != null && methodHolder.getResultType() != ValueType.VOID) {
            context.getDiagnostics().error(null, "{{c0}}." + methodName + " is annotated with @EnableBackgroundSync, but has non-void return type", methodHolder.getOwnerName());
        }

        if (cachingStrategy == null) {
            return;
        }

        StringBuilder configLine = new StringBuilder();
        configLine.append("    registerRPCStrategy(workbox, '").append(method).append("', '/rpc/");
        configLine.append(RPCHandler.toKebabCase(serviceName));
        configLine.append("/");
        configLine.append(RPCHandler.toKebabCase(methodName));
        configLine.append("', ");
        configLine.append(cachingStrategy);
        configLine.append(", ");

        if (enableCache != null || enableBgSync != null) {
            configLine.append("{ purgeOnQuotaError: true");
            if (maxAge != null) {
                configLine.append(", maxAgeSeconds: ").append(maxAge);
            }
            if (maxEntries != null) {
                configLine.append(", maxEntries: ").append(maxEntries);
            }
            configLine.append(" }, ");
        } else {
            configLine.append("null, ");
        }

        if (enableBgSync != null) {
            configLine.append("{ queueName: '").append(serviceName).append("_").append(methodName).append("'");
            if (retentionTime != null) {
                configLine.append(", maxRetentionTime: ").append(retentionTime);
            }
            configLine.append(" }");
        } else {
            configLine.append("null");
        }
        configLine.append(");");
        rendererListener.addRPCRouteConfig(configLine.toString());
    }

    private void addInitializer(ClassHolder cls, FieldHolder fieldHolder) {
        cls.getMethods().stream()
                .filter(methodHolder -> methodHolder.getName().equals("<init>"))
                .forEach(methodHolder -> {
                    Program program = methodHolder.getProgram();
                    BasicBlock block = program.basicBlockAt(program.basicBlockCount() - 1);

                    String type = ((ValueType.Object) fieldHolder.getType()).getClassName();

                    // last instruction is exit
                    Variable instance = program.createVariable();
                    ConstructInstruction constructInstruction = new ConstructInstruction();
                    constructInstruction.setType(type);
                    constructInstruction.setReceiver(instance);

                    InvokeInstruction invokeInstruction = new InvokeInstruction();
                    invokeInstruction.setType(InvocationType.SPECIAL);
                    invokeInstruction.setMethod(new MethodReference(type, "<init>", ValueType.VOID));
                    invokeInstruction.setInstance(instance);

                    PutFieldInstruction putFieldInstruction = new PutFieldInstruction();
                    putFieldInstruction.setInstance(program.variableAt(0));
                    putFieldInstruction.setValue(instance);
                    putFieldInstruction.setField(fieldHolder.getReference());
                    putFieldInstruction.setFieldType(fieldHolder.getType());

                    block.getLastInstruction().insertPrevious(constructInstruction);
                    block.getLastInstruction().insertPrevious(invokeInstruction);
                    block.getLastInstruction().insertPrevious(putFieldInstruction);
                });
    }

    private Program createRPCDelegator(String serviceName, MethodHolder method) {
        Program program = new Program();
        program.createVariable(); // this

        List<Variable> argumentList = new ArrayList<>();

        for (int i = 0; i < method.parameterCount(); i++) {
            argumentList.add(program.createVariable());
        }

        Variable endpointVar = program.createVariable();
        Variable typeVar = program.createVariable();

        BasicBlock block = program.createBasicBlock();
        block.add(createStringConstantInstruction(endpointVar, RPC.ENDPOINT + "/" + RPCHandler.toKebabCase(serviceName) + "/" + RPCHandler.toKebabCase(method.getName())));
        block.add(createClassConstantInstruction(typeVar, method.getResultType()));

        // Create argument array
        Variable arrayLength = program.createVariable();
        block.add(createIntegerConstantInstruction(arrayLength, method.parameterCount()));

        Variable arguments = program.createVariable();
        block.add(createConstructArrayInstruction(arguments, new ValueType.Object(Object.class.getName()), arrayLength));
        Variable argumentsUnwrapped = program.createVariable();
        block.add(createUnwrapArrayInstruction(argumentsUnwrapped, arguments, ArrayElementType.OBJECT));

        for (int i = 0; i < method.parameterCount(); i++) {
            Variable index = program.createVariable();
            block.add(createIntegerConstantInstruction(index, i));
            block.add(createPutElementInstruction(argumentsUnwrapped, index, argumentList.get(i), ArrayElementType.OBJECT));
        }

        AnnotationValue methodValue = method.getAnnotations().get(AllowClientCalls.class.getName()).getValue("method");

        String methodPrefix;
        if (methodValue != null) {
            AllowClientCalls.Method value = AllowClientCalls.Method.valueOf(methodValue.getEnumValue().getFieldName());
            switch (value) {
                case POST:
                    methodPrefix = "callPost";
                    break;
                case GET:
                default:
                    methodPrefix = "callGet";
                    break;
            }
        } else {
            methodPrefix = "callPost";
        }

        if (method.getAnnotations().get(EnableBackgroundSync.class.getName()) != null) {
            InvokeInstruction invokeInstruction = new InvokeInstruction();
            invokeInstruction.setType(InvocationType.SPECIAL);
            invokeInstruction.setArguments(endpointVar, arguments);
            invokeInstruction.setMethod(new MethodReference(RPC.class, methodPrefix + "Ignore", String.class, Object[].class, void.class));
            block.add(invokeInstruction);

            ExitInstruction exitInstruction = new ExitInstruction();
            block.add(exitInstruction);
        } else if (method.getResultType() == ValueType.VOID) {
            InvokeInstruction invokeInstruction = new InvokeInstruction();
            invokeInstruction.setType(InvocationType.SPECIAL);
            invokeInstruction.setArguments(endpointVar, arguments);
            invokeInstruction.setMethod(new MethodReference(RPC.class, methodPrefix, String.class, Object[].class, void.class));
            block.add(invokeInstruction);

            ExitInstruction exitInstruction = new ExitInstruction();
            block.add(exitInstruction);
        } else {
            Variable result = program.createVariable();

            InvokeInstruction invokeInstruction = new InvokeInstruction();
            invokeInstruction.setType(InvocationType.SPECIAL);
            invokeInstruction.setReceiver(result);
            invokeInstruction.setArguments(endpointVar, typeVar, arguments);
            invokeInstruction.setMethod(new MethodReference(RPC.class, methodPrefix, String.class, Class.class, Object[].class, Serializable.class));
            block.add(invokeInstruction);

            Variable convertedResult = program.createVariable();
            CastInstruction castInstruction = new CastInstruction();
            castInstruction.setTargetType(method.getResultType());
            castInstruction.setValue(result);
            castInstruction.setReceiver(convertedResult);
            block.add(castInstruction);

            ExitInstruction exitInstruction = new ExitInstruction();
            exitInstruction.setValueToReturn(convertedResult);
            block.add(exitInstruction);
        }

        return program;
    }

    private Instruction createPutElementInstruction(Variable argumentsUnwrapped, Variable index, Variable variable, ArrayElementType type) {
        PutElementInstruction instruction = new PutElementInstruction(type);
        instruction.setArray(argumentsUnwrapped);
        instruction.setIndex(index);
        instruction.setValue(variable);
        return instruction;
    }

    private Instruction createUnwrapArrayInstruction(Variable argumentsUnwrapped, Variable arguments, ArrayElementType type) {
        UnwrapArrayInstruction instruction = new UnwrapArrayInstruction(type);
        instruction.setArray(arguments);
        instruction.setReceiver(argumentsUnwrapped);
        return instruction;
    }

    private Instruction createConstructArrayInstruction(Variable array, ValueType.Object type, Variable arrayLength) {
        ConstructArrayInstruction instruction = new ConstructArrayInstruction();
        instruction.setReceiver(array);
        instruction.setItemType(type);
        instruction.setSize(arrayLength);
        return instruction;
    }

    private Instruction createStringConstantInstruction(Variable receiver, String value) {
        StringConstantInstruction instruction = new StringConstantInstruction();
        instruction.setConstant(value);
        instruction.setReceiver(receiver);
        return instruction;
    }

    private Instruction createClassConstantInstruction(Variable receiver, ValueType value) {
        ClassConstantInstruction instruction = new ClassConstantInstruction();
        instruction.setConstant(value);
        instruction.setReceiver(receiver);
        return instruction;
    }

    private Instruction createIntegerConstantInstruction(Variable receiver, int value) {
        IntegerConstantInstruction instruction = new IntegerConstantInstruction();
        instruction.setConstant(value);
        instruction.setReceiver(receiver);
        return instruction;
    }

    private MethodHolder createDefaultConstructor() {
        MethodHolder ctor = new MethodHolder("<init>", ValueType.VOID);
        Program program = new Program();
        Variable that = program.createVariable();
        BasicBlock block = program.createBasicBlock();

        InvokeInstruction invokeInstruction = new InvokeInstruction();
        invokeInstruction.setType(InvocationType.SPECIAL);
        invokeInstruction.setReceiver(that);
        invokeInstruction.setMethod(new MethodReference(Object.class.getName(), "<init>", ValueType.VOID));
        block.add(invokeInstruction);

        ExitInstruction exitInstruction = new ExitInstruction();
        block.add(exitInstruction);

        ctor.setProgram(program);
        return ctor;
    }
}
