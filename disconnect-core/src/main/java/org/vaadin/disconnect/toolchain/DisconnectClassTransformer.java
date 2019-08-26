package org.vaadin.disconnect.toolchain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.vaadin.disconnect.core.annotations.Import;
import org.vaadin.disconnect.core.annotations.NpmPackage;
import org.vaadin.disconnect.core.annotations.WebComponent;
import org.vaadin.disconnect.core.client.RPC;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.teavm.backend.javascript.TeaVMJavaScriptHost;
import org.teavm.flavour.json.JsonPersistable;
import org.teavm.model.*;
import org.teavm.model.instructions.*;
import org.teavm.vm.spi.TeaVMHost;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;
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
        webComponentAnnotation
                .map(annotation -> annotation.getValue("tagName"))
                .map(AnnotationValue::getList)
                .ifPresent(list -> {
                    for (AnnotationValue annotationValue : list) {
                        rendererListener.addIgnoredWebComponent(annotationValue.getString());
                    }
                });

        webComponentAnnotation
                .map(annotation -> annotation.getValue("regEx"))
                .map(AnnotationValue::getString)
                .filter(StringUtils::isNotEmpty)
                .ifPresent(regex -> {
                    rendererListener.addIgnoredWebComponentRegEx(regex);
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

        if (cls.getAnnotations().get(Service.class.getName()) != null) {
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
            cls.getMethods().forEach(methodHolder -> {
                methodHolder.setProgram(createRPCDelegator(methodHolder));
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

    private Program createRPCDelegator(MethodHolder method) {
        Program program = new Program();
        program.createVariable(); // this

        List<Variable> argumentList = new ArrayList<>();

        for (int i = 0; i < method.parameterCount(); i++) {
            argumentList.add(program.createVariable());
        }

        Variable serviceVar = program.createVariable();
        Variable methodVar = program.createVariable();
        Variable typeVar = program.createVariable();

        BasicBlock block = program.createBasicBlock();
        block.add(createStringConstantInstruction(serviceVar, method.getOwnerName()));
        block.add(createStringConstantInstruction(methodVar, method.getName()));
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

        Variable result = program.createVariable();

        InvokeInstruction invokeInstruction = new InvokeInstruction();
        invokeInstruction.setType(InvocationType.SPECIAL);
        invokeInstruction.setReceiver(result);
        invokeInstruction.setArguments(serviceVar, methodVar, typeVar, arguments);
        invokeInstruction.setMethod(new MethodReference(RPC.class, "call", String.class, String.class, Class.class, Object[].class, Serializable.class));
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
