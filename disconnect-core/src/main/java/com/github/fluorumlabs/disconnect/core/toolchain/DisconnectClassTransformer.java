package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.IPC;
import com.github.fluorumlabs.disconnect.core.RPC;
import com.github.fluorumlabs.disconnect.core.annotations.*;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectSymbols;
import com.github.fluorumlabs.disconnect.core.logging.DisconnectLoggerFactorySubstitution;
import com.github.fluorumlabs.disconnect.core.logging.DisconnectProductionLoggerFactorySubstitution;
import js.lang.Unknown;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.teavm.backend.javascript.TeaVMJavaScriptHost;
import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.emit.ValueEmitter;
import org.teavm.model.instructions.*;
import org.teavm.model.util.ModelUtils;
import org.teavm.vm.spi.TeaVMHost;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;


public class DisconnectClassTransformer implements ClassHolderTransformer {
	public DisconnectTeaVMRendererListener getRendererListener() {
		return rendererListener;
	}

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

		if (cls.getName().equals(LoggerFactory.class.getName())) {
			if ("production".equals(host.getProperties().getProperty("frontend.build"))) {
				substitute(cls, DisconnectProductionLoggerFactorySubstitution.class, context.getHierarchy());
			} else {
				substitute(cls, DisconnectLoggerFactorySubstitution.class, context.getHierarchy());
			}
		}

		AnnotationContainer annotations = cls.getAnnotations();

		Stream.concat(
				Optional.ofNullable(annotations.get(ImportStyle.class.getName()))
						.map(Stream::of)
						.orElse(Stream.empty()),
				Optional.ofNullable(annotations.get(ImportStyle.Container.class.getName()))
						.map(Stream::of)
						.orElse(Stream.empty())
						.flatMap(ah -> ah.getValue("value").getList().stream().map(AnnotationValue::getAnnotation)))
				.forEach(annotationReader -> {
					String module = annotationReader.getValue("value").getString();
					String symbol = "css"+DigestUtils.md5Hex(module);

					rendererListener.addInjectedSymbol("\"" + symbol + "\": \"" + relativeImport(module) + "\"");
					rendererListener.addImportedSymbol(symbol);
				});

		Optional.ofNullable(annotations.get(ImportTemplate.class.getName()))
				.ifPresent(annotationReader -> {
					String module = annotationReader.getValue("value").getString();
					String symbol = "tpl"+DigestUtils.md5Hex(module);

					rendererListener.addInjectedSymbol("\"" + symbol + "\": \"" + relativeImport(module) + "\"");
					rendererListener.addImportedSymbol(symbol);
				});

		cls.getFields().stream()
				.filter(fh -> fh.getModifiers().contains(ElementModifier.STATIC) && fh.getAnnotations().get(ImportObject.class.getName()) != null)
				.forEach(fh -> {
					String symbolName = StringUtils.replace(cls.getName(), ".", "_") + "$" + fh.getName() + "$import$";
					// Add clinit initializer
					addClinitInitializer(cls, fh, context, symbolName);
					// Add import
					AnnotationHolder annotationHolder = fh.getAnnotations().get(ImportObject.class.getName());
					String module = annotationHolder.getValue("module").getString();
					String symbol = annotationHolder.getValue("symbol") != null ?
							annotationHolder.getValue("symbol").getString() : "";

					if (symbol.isEmpty()) {
						rendererListener.addInjectedSymbol("\"" + symbolName + "\": \"" + relativeImport(module) +
								"\"");
						rendererListener.addImportedSymbol(symbolName);
					} else {
						rendererListener.addInjectedSymbol("\"" + symbolName + "\": [\"" + relativeImport(module) +
								"\", \"" + symbol + "\"]");
						rendererListener.addImportedSymbol(symbolName);
					}
				});

		processNpmImports(cls, context);

		AnnotationHolder serviceAnnotation = cls.getAnnotations().get("org.springframework.stereotype.Service");
		boolean isIpc = false;
		if (serviceAnnotation == null && rendererListener.isApplication()) {
			serviceAnnotation = cls.getAnnotations().get(CompilationUnit.class.getName());
			if (serviceAnnotation != null) {
				isIpc = true;
			}
		}
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
			if (isIpc) {
				cls.getMethods().stream().filter(methodHolder -> methodHolder.getAnnotations().get(AllowClientCalls.class.getName()) != null).forEach(methodHolder -> {
					//setupCaching(serviceName, methodHolder, context);
					methodHolder.setProgram(createIPCDelegator(serviceName, methodHolder, context));
				});
			} else {
				cls.getMethods().stream().filter(methodHolder -> methodHolder.getAnnotations().get(AllowClientCalls.class.getName()) != null).forEach(methodHolder -> {
					//setupCaching(serviceName, methodHolder, context);
					methodHolder.setProgram(createRPCDelegator(serviceName, methodHolder, context));
				});
			}

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

	private void substitute(ClassHolder cls, Class<?> target, ClassHierarchy hierarchy) {
		ClassReader subst = hierarchy.getClassSource().get(target.getName());
		for (FieldHolder field : cls.getFields().toArray(new FieldHolder[0])) {
			cls.removeField(field);
		}
		for (MethodHolder method : cls.getMethods().toArray(new MethodHolder[0])) {
			cls.removeMethod(method);
		}
		for (FieldReader field : subst.getFields()) {
			cls.addField(ModelUtils.copyField(field));
		}
		for (MethodReader method : subst.getMethods()) {
			cls.addMethod(ModelUtils.copyMethod(method));
		}
	}

	private void processNpmImports(ClassHolder cls, ClassHolderTransformerContext context) {
		AnnotationContainer annotations = cls.getAnnotations();

		Optional<AnnotationHolder> webComponentAnnotation =
				Optional.ofNullable(annotations.get(WebComponent.class.getName()));
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
					String version = annotationReader.getValue("version") != null ? annotationReader.getValue("version"
					).getString() : "latest";
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
					List<AnnotationValue> symbols = Optional.ofNullable(annotationReader.getValue("symbols"))
							.map(AnnotationValue::getList)
							.orElse(Collections.emptyList());

					for (AnnotationValue symbol : symbols) {
						String symbolName = symbol.getString();
						importedSymbols.putIfAbsent(symbolName, module);
						if (!module.equals(importedSymbols.get(symbolName))) {
							context.getDiagnostics().error(null, "Class {{c0}} imports JS symbol '" + symbolName + "'" +
									" " +
									"from module '" + module + "', which was already imported previously from '" + importedSymbols.get(symbolName) + "'", cls.getName());
						}
					}

					boolean object =
							!symbols.isEmpty() && (annotationReader.getValue("defaultExport") == null || !annotationReader.getValue("defaultExport").getBoolean());

					String symbolsJoined = symbols.stream()
							.map(AnnotationValue::getString)
							.collect(Collectors.joining(", "));

					if (symbols.isEmpty()) {
						rendererListener.addImport("import '" + module + "';");
					} else if (object) {
						symbols.stream()
								.map(AnnotationValue::getString)
								.forEach(symbol -> {
									rendererListener.addInjectedSymbol("\"" + symbol + "\": [\"" + relativeImport(module) + "\", \"" + symbol + "\"]");
									rendererListener.addImportedSymbol(symbol);
								});
					} else {
						symbols.stream()
								.map(AnnotationValue::getString)
								.forEach(symbol -> {
									rendererListener.addInjectedSymbol("\"" + symbol + "\": \"" + relativeImport(module) + "\"");
									rendererListener.addImportedSymbol(symbol);
								});
					}
				});
	}

	private void addClinitInitializer(ClassHolder cls, FieldHolder fh, ClassHolderTransformerContext context,
									  String symbolName) {
		MethodHolder clinit = cls.getMethod(new MethodDescriptor("<clinit>", ValueType.VOID));
		if (clinit == null) {
			clinit = new MethodHolder("<clinit>", ValueType.VOID);
			clinit.getModifiers().add(ElementModifier.STATIC);

			ProgramEmitter $ = ProgramEmitter.create(clinit, context.getHierarchy());
			$.exit();

			cls.addMethod(clinit);
		}

		Program clinitProgram = clinit.getProgram();
		BasicBlock basicBlock = clinitProgram.basicBlockAt(0);

		Instruction first = basicBlock.getFirstInstruction();

		Variable varSymbol = clinitProgram.createVariable();
		Variable varValue = clinitProgram.createVariable();
		Variable varResult = clinitProgram.createVariable();
		first.insertPrevious(createStringConstantInstruction(varSymbol, symbolName));

		InvokeInstruction invokeInstruction = new InvokeInstruction();
		invokeInstruction.setType(InvocationType.SPECIAL);
		invokeInstruction.setMethod(new MethodReference(DisconnectSymbols.class, "get", String.class, Unknown.class));
		invokeInstruction.setArguments(varSymbol);
		invokeInstruction.setReceiver(varValue);

		first.insertPrevious(invokeInstruction);

		CastInstruction castInstruction = new CastInstruction();
		castInstruction.setValue(varValue);
		castInstruction.setReceiver(varResult);
		castInstruction.setTargetType(fh.getType());

		first.insertPrevious(castInstruction);

		PutFieldInstruction putFieldInstruction = new PutFieldInstruction();
		putFieldInstruction.setValue(varResult);
		putFieldInstruction.setField(fh.getReference());
		putFieldInstruction.setFieldType(fh.getType());

		first.insertPrevious(putFieldInstruction);
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
				AllowClientCalls.Method value =
						AllowClientCalls.Method.valueOf(allowClientCalls.getValue("method").getEnumValue().getFieldName());
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
				EnableCache.CachingStrategy strategy = EnableCache.CachingStrategy.valueOf(enableCache.getValue(
						"strategy").getEnumValue().getFieldName());
				switch (strategy) {
					case STALE_WHILE_REVALIDATE:
						cachingStrategy = "workbox.strategies.StaleWhileRevalidate";
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
			context.getDiagnostics().warning(null, "Missing @EnableCache annotation for {{c0}}." + methodName + "; " +
					"will use @EnableCache(strategy = EnableCache.Strategy.NETWORK_ONLY)",
					methodHolder.getOwnerName());
		}
		if (enableBgSync != null && methodHolder.getResultType() != ValueType.VOID) {
			context.getDiagnostics().error(null, "{{c0}}." + methodName + " is annotated with @EnableBackgroundSync," +
					" " +
					"but has non-void return type", methodHolder.getOwnerName());
		}

		if (cachingStrategy == null) {
			return;
		}

		StringBuilder configLine = new StringBuilder();
		configLine.append("    registerRPCStrategy(workbox, '").append(method).append("', '/rpc/");
		configLine.append(toKebabCase(serviceName));
		configLine.append("/");
		configLine.append(toKebabCase(methodName));
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
					BasicBlock block = program.basicBlockAt(0);

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

					Instruction firstInstruction = block.getFirstInstruction();
					firstInstruction.insertPrevious(constructInstruction);
					firstInstruction.insertPrevious(invokeInstruction);
					firstInstruction.insertPrevious(putFieldInstruction);
				});
	}

	private Program createRPCDelegator(String serviceName, MethodHolder method,
									   ClassHolderTransformerContext context) {
		ProgramEmitter $ = ProgramEmitter.create(method, context.getHierarchy());

		String argumentClass = method.getOwnerName() + StringUtils.capitalize(method.getName()) +
				"Arguments";
		String resultClass = method.getOwnerName() + StringUtils.capitalize(method.getName()) +
				"Result";

		ValueEmitter arguments = $.construct(argumentClass);
		ValueEmitter result = $.construct(resultClass);

		for (int i = 0; i < method.parameterCount(); i++) {
			arguments.setField("arg" + i, $.var(i + 1, method.getParameterTypes()[i]));
		}

		String endpoint;
		boolean isSse = false;
		if (method.getResultType().isObject(Stream.class)) {
			endpoint = RPC.ENDPOINT + "/stream/" + toKebabCase(serviceName) + "/" + toKebabCase(method.getName());
			isSse = true;
		} else {
			endpoint = RPC.ENDPOINT + "/" + toKebabCase(serviceName) + "/" + toKebabCase(method.getName());
		}

		ValueEmitter endPoint = $.constant(endpoint);

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

		if (isSse) {
			$.invoke(RPC.class, "callSse", Stream.class, endPoint, arguments.cast(Serializable.class),
					result.cast(Serializable.class)).cast(method.getResultType()).returnValue();
		} else {
			if (method.getAnnotations().get(EnableBackgroundSync.class.getName()) != null) {
				$.invoke(RPC.class.getName(), methodPrefix + "Ignore",
						endPoint, arguments.cast(Serializable.class));
				$.exit();
			} else if (method.getResultType() == ValueType.VOID) {
				$.invoke(RPC.class.getName(), methodPrefix + "Ignore",
						endPoint, arguments.cast(Serializable.class));
				$.exit();
			} else {
				$.invoke(RPC.class.getName(), methodPrefix,
						endPoint, arguments.cast(Serializable.class), result.cast(Serializable.class));
				result.getField("result", method.getResultType()).returnValue();
			}
		}

		return $.getProgram();
	}

	private Program createIPCDelegator(String serviceName, MethodHolder method,
									   ClassHolderTransformerContext context) {
		ProgramEmitter $ = ProgramEmitter.create(method, context.getHierarchy());

		String argumentClass = method.getOwnerName() + StringUtils.capitalize(method.getName()) +
				"Arguments";
		String resultClass = method.getOwnerName() + StringUtils.capitalize(method.getName()) +
				"Result";

		ValueEmitter arguments = $.construct(argumentClass);
		ValueEmitter result = $.construct(resultClass);

		for (int i = 0; i < method.parameterCount(); i++) {
			arguments.setField("arg" + i, $.var(i + 1, method.getParameterTypes()[i]));
		}

		String endPointName = toKebabCase(serviceName) + ".js?t=" + DisconnectTeaVMRendererListener.BUILD_TIMESTAMP;
		String methodName = toKebabCase(method.getName());

		ValueEmitter endPointValue = $.constant(endPointName);
		ValueEmitter methodNameValue = $.constant(methodName);

		if (method.getResultType() == ValueType.VOID) {
			$.invoke(IPC.class.getName(), "callIgnore",
					endPointValue, methodNameValue, arguments.cast(Serializable.class));
			$.exit();
		} else {
			$.invoke(IPC.class.getName(), "call",
					endPointValue, methodNameValue, arguments.cast(Serializable.class), result.cast(Serializable.class));
			result.getField("result", method.getResultType()).returnValue();
		}

		return $.getProgram();
	}

	private Instruction createPutElementInstruction(Variable argumentsUnwrapped, Variable index, Variable variable,
													ArrayElementType type) {
		PutElementInstruction instruction = new PutElementInstruction(type);
		instruction.setArray(argumentsUnwrapped);
		instruction.setIndex(index);
		instruction.setValue(variable);
		return instruction;
	}

	private Instruction createUnwrapArrayInstruction(Variable argumentsUnwrapped, Variable arguments,
													 ArrayElementType type) {
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

	public static String relativeImport(String module) {
		if (module.startsWith("./")) {
			return "." + module;
		} else {
			return module;
		}
	}

}
