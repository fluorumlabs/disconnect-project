package com.github.fluorumlabs.disconnect;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.squareup.javapoet.*;
import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.ext.autolink.AutolinkExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension;
import com.vladsch.flexmark.ext.ins.InsExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.formatter.internal.Formatter;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Symbol;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.CustomEvent;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.teavm.jso.*;

import javax.annotation.Nullable;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
@SuppressWarnings("ALL")
public class App {
	public static String rootPackage = "com.github.fluorumlabs.disconnect.highcharts";
	//public static String rootPackage = "com.github.fluorumlabs.disconnect.vaadin";
	//public static String rootPackage = "com.github.fluorumlabs.disconnect.polymer";

	public static String sourcePath = "C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\zzz\\@vaadin\\";
	//public static String sourcePath = "C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit\\zzz\\@polymer\\";

	public static String targetPath = "C:\\Users\\arigy\\Documents\\Marketing\\disconnect-project\\disconnect-vaadin";
	//public static String targetPath = "C:\\Users\\arigy\\Documents\\Marketing\\disconnect-project\\disconnect
	// -vaadin";
	//public static String targetPath = "C:\\Users\\arigy\\Documents\\Marketing\\disconnect-project\\disconnect
	// -polymer";

	public static String npmPackage = "highcharts";
	//public static String npmPackage = "@vaadin/router";
	//public static String npmPackage = "@vaadin/vaadin";
	//public static String npmPackage = "@polymer/polymer";

	public static String importRoot = "highcharts";
	//public static String importRoot = "@vaadin";
	//public static String importRoot = "@polymer";

	public static String npmVersion = "6.1.4";
	//public static String npmVersion = "1.6.0";
	//public static String npmVersion = "15.0.0-beta1";
	//public static String npmVersion = "3.3.1";

	public static String dtsPath = "C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\zzz\\@vaadin\\router" +
			"\\interfaces.d.ts";

	private static final MutableDataSet flexmarkOptions = new MutableDataSet();

	private static final Parser parser;

	private static final HtmlRenderer htmlRenderer;

	private static final com.vladsch.flexmark.formatter.internal.Formatter formatter;

	private static final List<Extension> extensionList = Arrays.asList(TablesExtension.create(),
			StrikethroughExtension.create(),
			AutolinkExtension.create(),
			InsExtension.create());

	static {
		flexmarkOptions.set(FlexmarkHtmlParserPatched.BR_AS_EXTRA_BLANK_LINES, false);

		parser = Parser.builder(flexmarkOptions).extensions(extensionList).build();
		htmlRenderer = HtmlRenderer.builder(flexmarkOptions).extensions(extensionList).build();
		formatter = Formatter.builder(flexmarkOptions).extensions(extensionList).build();
	}


	private static final Pattern KEBAB_SPLIT = Pattern.compile("-");

	private static String toCamelCase(String kebabCase) {
		return StringUtils.uncapitalize(Stream.of(KEBAB_SPLIT.split(kebabCase))
				.map(StringUtils::capitalize)
				.collect(Collectors.joining()));
	}

	private static String renderMarkdown(String markdown) {
		String render = htmlRenderer.render(parser.parse(markdown));
		return StringUtils.replaceEach(render, new String[]{"<p>", "</p>"}, new String[]{"", "\n"});
	}

	/**
	 *
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		processDTs("C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\node_modules\\highcharts" +
				"\\highcharts.d.ts", "Highcharts");
//    	processDTs("C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\zzz\\@vaadin\\router" +
//                "\\interfaces.d.ts");
//    	processDTs("C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\zzz\\@vaadin\\router" +
//                "\\dist\\vaadin-router.d.ts");
//        processWCA("C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit\\zzz\\@vaadin\\vaadin.json");
		//processPolymer(sourcePath);
	}

	private static final List<String> commentsCollector = new ArrayList<>();

	private static final Map<String, String> typeAlias = new HashMap<>();

	private static String resolveAlias(String type) {
		return typeAlias.getOrDefault(type, type);
	}

	private static void processDTs(String dtsPath, String globals) throws IOException {
		List<String> strings = Files.readAllLines(Paths.get(dtsPath));

		ListIterator<String> stringListIterator = strings.listIterator();
		List<String> globalStrings = new ArrayList<>();

		while (stringListIterator.hasNext()) {
			String line = stringListIterator.next().trim();
			if (extractJsDoc(line, stringListIterator)) {
				continue;
			}

			if (line.startsWith("declare")) {
				line = StringUtils.removeStart(line, "declare").trim();
			}
			if (line.startsWith("export")) {
				line = StringUtils.removeStart(line, "export").trim();
			}
			if (line.startsWith("class ") || line.startsWith("interface ")) {
				processClass(line, stringListIterator);
			} else if (line.startsWith("type ")) {
				processType(line, stringListIterator, null);
			} else if (line.startsWith("let ") || line.startsWith("function ") || line.startsWith("const ")) {
				globalStrings.add("/**");
				globalStrings.addAll(commentsCollector);
				globalStrings.add("*/");
				globalStrings.add(line);
				commentsCollector.clear();
				continue;
			} else if (line.startsWith("namespace ") || line.endsWith("}")) {
				continue;
			} else if (line.startsWith("import ")) {
				continue;
			} else if (line.startsWith("}")) {
				return;
			} else if (line.startsWith("{")) {
				return;
			} else {
				System.out.println(line);
			}
		}

		globalStrings.add("}");

		processClass("interface " + globals, globalStrings.listIterator());
	}

	static class Parameter {
		String name;

		boolean optional;

		Set<TypeName> types;
	}

	private static TypeName processType(String line, ListIterator<String> stringListIterator,
										TypeSpec.Builder enclosing) throws IOException {
		// look ahead
		String ahead = line;
		ahead = skip(ahead, "type");
		String aheadTypeName = extract(ahead, "=");
		ahead = skip(ahead, aheadTypeName, "=");
		if (ahead.startsWith("{")) {
			// uh it's an interface
			return processClass("interface " + aheadTypeName + ahead, stringListIterator);
		}
		String javaDoc = renderMarkdown(String.join("\n", commentsCollector));
		commentsCollector.clear();

		if (!line.endsWith(";")) {
			// continuation detected
			while (stringListIterator.hasNext()) {
				String nextLine = stringListIterator.next().trim();
				line = line + " " + nextLine;
				if (nextLine.endsWith(";")) {
					break;
				}
			}
		}
		line = StringUtils.removeEnd(line, ";");

		line = skip(line, "type");
		String typeName = extract(line, "=");
		line = skip(line, typeName, "=");

		line = removeOuterBrackets(line);
		line = StringUtils.remove(line, "|null");
		line = StringUtils.remove(line, "| null");
		line = StringUtils.remove(line, "|undefined");
		line = StringUtils.remove(line, "| undefined");

		String rawType = line;

		if (line.contains("=>")) {
			line = StringUtils.removeEnd(line, ";");
			String typeSignature = line;
			String signature = extract(line, "=>");
			line = skip(line, signature, "=>");
			signature = StringUtils.removeEnd(StringUtils.removeStart(signature, "("), ")");

			line = resolveAlias(line);

			Set<TypeName> returnTypeNames = new HashSet<>();
			returnTypeNames.addAll(processUnionType(line, typeName));
			if (returnTypeNames.isEmpty()) {
				String fakeIndexKey = typeName + "Result";
				String fakeType = "type " + fakeIndexKey + " = " + line + ";";
				TypeName newType = processType(fakeType, new ArrayList<String>().listIterator(), enclosing);

				if (newType != null) {
					returnTypeNames.add(newType);
				} else {
					returnTypeNames.add(resolveType(line, typeName));
				}
			}

			List<Parameter> parameters = new ArrayList<>();
			while (!signature.isEmpty()) {
				String part = extract(signature, ",");
				signature = skip(signature, part, ",");
				String identifier = extract(part, ":");
				part = skip(part, identifier, ":");
				Parameter parameter = new Parameter();

				if (identifier.endsWith("?")) {
					parameter.optional = true;
					identifier = StringUtils.removeEnd(identifier, "?");
				}

				if (identifier.equals("this")) {
					continue;
				}

				part = resolveAlias(part);

				parameter.name = identifier;
				parameter.types = new HashSet<>();
				parameter.types.addAll(processUnionType(part, typeName + StringUtils.capitalize(identifier)));
				if (parameter.types.isEmpty()) {
					parameter.types.add(resolveType(part, typeName));
				}

				parameters.add(parameter);
			}
			String genericSignature = "";

			if (typeName.contains("<")) {
				// generic
				genericSignature = typeName;
				typeName = extract(genericSignature, "<");
				genericSignature = skip(genericSignature, typeName, "<");
			}

			TypeSpec.Builder builder = TypeSpec.interfaceBuilder(typeName)
					.addAnnotation(JSFunctor.class)
					.addAnnotation(FunctionalInterface.class)
					.addModifiers(Modifier.PUBLIC)
					.addJavadoc("$L", javaDoc)
					.addSuperinterface(Any.class);

			while (!genericSignature.isEmpty()) {
				String part = extract(genericSignature, ",", ">");
				genericSignature = skip(genericSignature, part, ",", ">");
				String typeIdentifier = extract(part, "=");
				part = skip(part, typeIdentifier, "=");

				builder.addTypeVariable(TypeVariableName.get(typeIdentifier, Any.class));
			}


			MethodSpec.Builder method = MethodSpec.methodBuilder("apply")
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.returns(returnTypeNames.size() == 1 ? returnTypeNames.iterator().next() :
							ClassName.get(Unknown.class));

			for (Parameter parameter : parameters) {
				method.addParameter(parameter.types.size() == 1 ? parameter.types.iterator().next() :
						ClassName.get(Unknown.class), parameter.name);
			}
			builder.addMethod(method.build());
			if (enclosing != null) {
				enclosing.addType(builder.addModifiers(Modifier.STATIC).build());
			} else {
				JavaFile file = JavaFile.builder(rootPackage, builder.build())
						.build();
				file.writeTo(Paths.get(targetPath, "src", "main", "java"));
			}
			return ClassName.bestGuess(typeName);
		} else if (line.startsWith("\"") || line.startsWith("'")) {
			// string enum
			TypeSpec.Builder builder = TypeSpec.classBuilder(typeName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addJavadoc("$L", javaDoc)
					.superclass(JsEnum.class);

			while (!line.isEmpty()) {
				line = skip(line, "|");
				String value = extract(line, "|");
				line = skip(line, value);
				String rawValue = StringUtils.substringBetween(value, "\"");
				if (rawValue == null) {
					rawValue = StringUtils.substringBetween(value, "'");
				}
				if (rawValue != null) {
					FieldSpec field = FieldSpec.builder(ClassName.bestGuess(typeName),
							rawValue.toUpperCase().replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_"),
							Modifier.PUBLIC,
							Modifier.STATIC,
							Modifier.FINAL)
							.initializer("JsEnum.of($S)", rawValue)
							.build();
					builder.addField(field);
				}
			}

			if (enclosing != null) {
				enclosing.addType(builder.addModifiers(Modifier.STATIC).build());
			} else {
				JavaFile file = JavaFile.builder(rootPackage, builder.build())
						.build();
				file.writeTo(Paths.get(targetPath, "src", "main", "java"));
			}
			return ClassName.bestGuess(typeName);
		} else if (StringUtils.isNumeric(line.substring(0, 1))) {
			// int enum
			TypeSpec.Builder builder = TypeSpec.classBuilder(typeName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addJavadoc("$L", javaDoc)
					.superclass(JsEnum.class);

			while (!line.isEmpty()) {
				line = skip(line, "|");
				String value = extract(line, "|");
				line = skip(line, value);
				FieldSpec field = FieldSpec.builder(ClassName.bestGuess(typeName),
						"VALUE_" + value.replaceAll("[.]", "_"),
						Modifier.PUBLIC,
						Modifier.STATIC,
						Modifier.FINAL)
						.initializer("JsEnum.of($L)", value)
						.build();
				builder.addField(field);
			}
			if (enclosing != null) {
				enclosing.addType(builder.addModifiers(Modifier.STATIC).build());
			} else {
				JavaFile file = JavaFile.builder(rootPackage, builder.build())
						.build();
				file.writeTo(Paths.get(targetPath, "src", "main", "java"));
			}
			return ClassName.bestGuess(typeName);
		} else {
			typeAlias.put(typeName, rawType);
		}
		return null;
	}

	private static Set<TypeName> processUnionType(String line, String context) throws IOException {
		line = removeOuterBrackets(line);
		line = StringUtils.remove(line, "|null");
		line = StringUtils.remove(line, "| null");
		line = StringUtils.remove(line, "|undefined");
		line = StringUtils.remove(line, "| undefined");

		String rawType = line;

		if ((line.indexOf('|') < line.indexOf('<') || line.indexOf('<') < 0)) {
			Set<TypeName> aliases = new HashSet<>();
			while (!line.isEmpty()) {
				String value = extract(line, "|");
				line = skip(line, value, "|");
				try {
					value = resolveAlias(value);
					aliases.add(resolveType(value, context));
				} catch (Exception e) {
					// ignore
				}
			}
			return aliases;
		}
		return Collections.emptySet();
	}


	private static TypeName processClass(String line, ListIterator<String> stringListIterator) throws IOException {
		String class_ = skip(line, "class", "interface");
		String className = extract(class_, "extends", "implements", "{");
		String heritage = extract(skip(class_, className), "{");

		String genericSignature = "";

		if (className.contains("<")) {
			// generic
			genericSignature = className;
			className = extract(genericSignature, "<");
			genericSignature = skip(genericSignature, className, "<");
		}

		System.out.println("Processing class " + className);

		TypeSpec.Builder builder = TypeSpec.interfaceBuilder(className).addModifiers(Modifier.PUBLIC);

		while (!genericSignature.isEmpty()) {
			String part = extract(genericSignature, ",", ">");
			genericSignature = skip(genericSignature, part, ",", ">");
			String typeIdentifier = extract(part, "=");
			part = skip(part, typeIdentifier, "=");

			builder.addTypeVariable(TypeVariableName.get(typeIdentifier, Any.class));
		}


		boolean hasHeritage = false;
		while (!heritage.isEmpty()) {
			heritage = skip(heritage, "extends", "implements", "{", ",");
			String name = extract(heritage, "extends", "implements", "{", ",");
			heritage = skip(heritage, name);
			if (!name.isEmpty()) {
				hasHeritage = true;
				builder.addSuperinterface(resolveType(name, className));
			}
		}
		if (!hasHeritage) {
			builder.addSuperinterface(Any.class);
		}
		if (!commentsCollector.isEmpty()) {
			builder.addJavadoc("$L", renderMarkdown(String.join("\n", commentsCollector)));
			commentsCollector.clear();
		}

		while (stringListIterator.hasNext()) {
			String nextLine = stringListIterator.next().trim();
			String jsOverride = "";
			if (extractJsDoc(nextLine, stringListIterator)) {
				continue;
			}
			if (nextLine.startsWith("private")) {
				continue;
			}
			boolean readOnly = false;
			if (nextLine.startsWith("let ") || nextLine.startsWith("const ")) {
				nextLine = skip(nextLine, "let", "const");
				String identifier = extract(nextLine, ":");
				nextLine = "static get" + StringUtils.capitalize(identifier) + "()" + skip(nextLine, identifier);
				jsOverride = "return " + className + "." + identifier;
			}
			if (nextLine.startsWith("function ")) {
				nextLine = "static " + skip(nextLine, "function");
			}
			if (nextLine.startsWith("readonly ")) {
				readOnly = true;
				nextLine = skip(nextLine, "readonly");
			}
			if (nextLine.startsWith("}")) {
				JavaFile file = JavaFile.builder(rootPackage, builder.build())
						.build();
				file.writeTo(Paths.get(targetPath, "src", "main", "java"));
				return ClassName.get(rootPackage, className);
			} else if (nextLine.startsWith("[")) {
				commentsCollector.add("@implspec " + nextLine);
				String javaDoc = renderMarkdown(String.join("\n", commentsCollector));
				commentsCollector.clear();
				// indexer
				nextLine = skip(StringUtils.removeEnd(nextLine, ";"), "[");
				String indexer = StringUtils.substringBefore(nextLine, "]:");
				nextLine = skip(nextLine, indexer, "]:");
				String key = extract(indexer, ":", " in ");
				indexer = skip(indexer, key, ":", " in ");

				indexer = resolveAlias(indexer);

				Set<TypeName> typeNames = new HashSet<>();
				typeNames.addAll(processUnionType(indexer, className + "Key"));
				if (typeNames.isEmpty()) {
					String fakeIndexKey = "IndexKey";
					String fakeType = "type " + fakeIndexKey + " = " + indexer + ";";
					TypeName newType = processType(fakeType, new ArrayList<String>().listIterator(), builder);

					if (newType != null) {
						typeNames.add(newType);
					} else {
						typeNames.add(resolveType(indexer, className));
					}
				}
				Set<TypeName> valueTypeNames = new HashSet<>();

				nextLine = resolveAlias(nextLine);

				valueTypeNames.addAll(processUnionType(nextLine, className + "Value"));
				if (valueTypeNames.isEmpty()) {
					String fakeValue = "Value";
					String fakeValueType = "type " + fakeValue + " = " + nextLine + ";";
					TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(), builder);

					if (newType != null) {
						valueTypeNames.add(newType);
					} else {
						valueTypeNames.add(resolveType(nextLine, className));
					}
				}

				for (TypeName alias : typeNames) {
					builder.addMethod(MethodSpec.methodBuilder("get")
							.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
							.addAnnotation(JSIndexer.class)
							.addParameter(alias, key)
							.addJavadoc("$L", javaDoc)
							.returns(valueTypeNames.size() == 1 ? valueTypeNames.iterator().next() :
									ClassName.get(Unknown.class))
							.build());

					if (!readOnly) {
						for (TypeName valueTypeName : valueTypeNames) {
							builder.addMethod(MethodSpec.methodBuilder("set")
									.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
									.addAnnotation(JSIndexer.class)
									.addParameter(alias, key)
									.addJavadoc("$L", javaDoc)
									.addParameter(valueTypeName, "value")
									.build());
						}

					}
				}
			} else if (nextLine.indexOf(':') < nextLine.indexOf('(') || (nextLine.indexOf(':') >= 0 && nextLine.indexOf('(') == -1)) {
				// property
				commentsCollector.add("@implspec " + nextLine);
				String javaDoc = renderMarkdown(String.join("\n", commentsCollector));
				commentsCollector.clear();
				nextLine = StringUtils.removeEnd(nextLine, ";");
				String identifier = extract(nextLine, ":");
				nextLine = skip(nextLine, identifier, ":");
				boolean nullable = false;
				if (identifier.endsWith("?")) {
					nullable = true;
					identifier = StringUtils.removeEnd(identifier, "?");
				}

				nextLine = resolveAlias(nextLine);

				Set<TypeName> valueTypeNames = new HashSet<>();
				valueTypeNames.addAll(processUnionType(nextLine, className + StringUtils.capitalize(identifier) +
						"Value"));

				if (valueTypeNames.isEmpty()) {
					String fakeValue = StringUtils.capitalize(identifier);
					String fakeValueType = "type " + fakeValue + " = " + nextLine + ";";
					TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(), builder);

					if (newType != null) {
						valueTypeNames.add(newType);
					} else {
						valueTypeNames.add(resolveType(nextLine, className + StringUtils.capitalize(identifier) +
								"Value"));
					}
				}

				MethodSpec.Builder getter = MethodSpec.methodBuilder("get" + StringUtils.capitalize(identifier))
						.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
						.addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S", identifier).build())
						.addJavadoc("$L", javaDoc)
						.returns(valueTypeNames.size() == 1 ? valueTypeNames.iterator().next() :
								ClassName.get(Unknown.class));

				if (valueTypeNames.size() == 1 && valueTypeNames.iterator().next().isPrimitive()) {
					nullable = false;
				}
				if (nullable) {
					getter.addAnnotation(Nullable.class);
				}
				builder.addMethod(getter.build());

				if (!readOnly) {
					for (TypeName valueTypeName : valueTypeNames) {
						if (valueTypeName != null) {
							builder.addMethod(MethodSpec.methodBuilder("set" + StringUtils.capitalize(identifier))
									.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
									.addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
											identifier).build())
									.addParameter(valueTypeName, "value")
									.addJavadoc("$L", javaDoc)
									.build());
						}
					}
				}
			} else if (nextLine.indexOf(':') > nextLine.indexOf('(')) {
				commentsCollector.add("@implspec " + nextLine);
				String javaDoc = renderMarkdown(String.join("\n", commentsCollector));
				commentsCollector.clear();
				// method
				nextLine = StringUtils.removeEnd(nextLine, ";");
				String identifier = extract(nextLine, "(");
				nextLine = skip(nextLine, identifier, "(");
				String signature = extract(nextLine, ")");
				nextLine = skip(nextLine, signature, ")", ":");

				boolean isStatic = false;
				String jsMethod = "";
				if (identifier.startsWith("static ")) {
					identifier = StringUtils.removeStart(identifier, "static ");
					jsMethod = className + "." + identifier;
					isStatic = true;
				} else if (identifier.equals("constructor") || identifier.equals("new")) {
					identifier = "create";
					jsMethod = "new " + className;
					nextLine = className;
					isStatic = true;
				}

				String genericMethodSignature = "";

				if (identifier.contains("<")) {
					// generic
					genericMethodSignature = identifier;
					identifier = extract(genericMethodSignature, "<");
					genericMethodSignature = skip(genericMethodSignature, identifier, "<");
				}

				Set<TypeName> returnTypeNames = new HashSet<>();

				nextLine = resolveAlias(nextLine);

				returnTypeNames.addAll(processUnionType(nextLine, className + StringUtils.capitalize(identifier) +
						"Result"));

				if (nextLine.equals(className)) {
					returnTypeNames.add(ClassName.bestGuess(className));
				} else if (returnTypeNames.isEmpty()) {
					String fakeValue = StringUtils.capitalize(identifier) + "Result";
					String fakeValueType = "type " + fakeValue + " = " + nextLine + ";";
					TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(), builder);

					if (newType != null) {
						returnTypeNames.add(newType);
					} else {
						returnTypeNames.add(resolveType(nextLine, className + StringUtils.capitalize(identifier) +
								"Result"));
					}
				}

				List<Parameter> parameters = new ArrayList<>();
				while (!signature.isEmpty()) {
					String part = extract(signature, ",");
					signature = skip(signature, part, ",");
					String paramIdentifier = extract(part, ":");
					part = skip(part, paramIdentifier, ":");
					Parameter parameter = new Parameter();

					if (paramIdentifier.endsWith("?")) {
						parameter.optional = true;
						paramIdentifier = StringUtils.removeEnd(paramIdentifier, "?");
					}

					if (paramIdentifier.equals("this")) {
						continue;
					}


					parameter.name = paramIdentifier;
					parameter.types = new HashSet<>();

					part = resolveAlias(part);

					parameter.types.addAll(processUnionType(part,
							className + StringUtils.capitalize(identifier) + StringUtils.capitalize(paramIdentifier)));

					if (parameter.types.isEmpty()) {
						String fakeValue =
								StringUtils.capitalize(identifier) + StringUtils.capitalize(paramIdentifier);
						String fakeValueType = "type " + fakeValue + " = " + part + ";";
						TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(),
								builder);

						if (newType != null) {
							parameter.types.add(newType);
						} else {
							parameter.types.add(resolveType(part, className + StringUtils.capitalize(identifier)));
						}
					}

					parameters.add(parameter);
				}

				if (identifier.isEmpty()) {
					builder
							.addAnnotation(JSFunctor.class)
							.addAnnotation(FunctionalInterface.class);
					identifier = "apply";
				}

				// Compute permutations of union-typed parameters
				boolean mutated = false;

				Set<List<Parameter>> paramList = new HashSet<>();
				paramList.add(parameters);

				do {
					mutated = false;
					List<List<Parameter>> toAdd = new ArrayList<>();
					List<List<Parameter>> toRemove = new ArrayList<>();
					for (List<Parameter> callSign : paramList) {
						int firstUnion = -1;
						Parameter union = null;
						for (int i = 0; i < callSign.size(); i++) {
							if (callSign.get(i).types.size() > 1) {
								firstUnion = i;
								union = callSign.get(i);
								break;
							}
						}
						if (firstUnion >= 0) {
							mutated = true;
							Iterator<TypeName> iterator = union.types.iterator();
							for (int j = 0; j < union.types.size(); j++) {
								TypeName next = iterator.next();
								if (next == null) {
									continue;
								}
								List<Parameter> newCallsign = new ArrayList<>();
								for (int i = 0; i < callSign.size(); i++) {
									if (i != firstUnion) {
										newCallsign.add(callSign.get(i));
									} else {
										Parameter p = new Parameter();
										p.name = union.name;
										p.optional = union.optional;
										p.types = Collections.singleton(next);
										newCallsign.add(p);
									}
								}
								toAdd.add(newCallsign);
							}
							toRemove.add(callSign);
							break;
						} else if (callSign.size() > 0 && callSign.get(callSign.size() - 1).optional) {
							mutated = true;
							callSign.get(callSign.size() - 1).optional = false;
							List<Parameter> newCallsign = new ArrayList<>();
							for (int i = 0; i < callSign.size() - 1; i++) {
								newCallsign.add(callSign.get(i));
							}
							toAdd.add(newCallsign);
						}
					}
					paramList.removeAll(toRemove);
					paramList.addAll(toAdd);
				} while (mutated);

				for (List<Parameter> parameterList : paramList) {
					MethodSpec.Builder method = MethodSpec.methodBuilder(StringUtils.defaultString(identifier,
							"apply"))
							.addModifiers(Modifier.PUBLIC)
							.addJavadoc("$L", javaDoc)
							.returns(returnTypeNames.size() == 1 ? returnTypeNames.iterator().next() :
									ClassName.get(Unknown.class));

					if (isStatic) {
						AnnotationSpec.Builder jsbodyBuilder = AnnotationSpec.builder(JSBody.class);
						method.addModifiers(Modifier.STATIC);

						if (!parameterList.isEmpty()) {
							jsbodyBuilder.addMember("params", "{$L}",
									parameterList.stream().map(s -> "\"" + s.name + "\"").collect(Collectors.joining(
											", ")));
						}

						StringBuilder jsBodyBuilder = new StringBuilder();

						if ((returnTypeNames.size() == 1 ? returnTypeNames.iterator().next() :
								ClassName.get(Unknown.class)) != TypeName.VOID) {
							jsBodyBuilder.append("return ");
						}
						jsBodyBuilder.append(jsMethod).append("(");

						boolean shouldAddComma = false;
						for (Parameter parameter : parameterList) {
							if (shouldAddComma) {
								jsBodyBuilder.append(", ");
							}
							jsBodyBuilder.append(parameter.name);

							shouldAddComma = true;
						}

						if (!jsOverride.isEmpty()) {
							jsbodyBuilder.addMember("script", "$S", jsOverride);
						} else {
							jsbodyBuilder.addMember("script", "$S", jsBodyBuilder.append(")").toString());
						}

						method.addAnnotation(jsbodyBuilder.build());

						method.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
								" " +
								"in " +
								"JavaScript");
					} else {
						method.addModifiers(Modifier.ABSTRACT);
					}

					for (Parameter parameter : parameterList) {
						if (parameter.name.startsWith("...")) {
							method.addJavadoc("FIXME VarArgs");
						}
						method.addParameter(parameter.types.size() == 1 ? parameter.types.iterator().next() :
								ClassName.get(Unknown.class), StringUtils.removeStart(parameter.name, "..."));
					}

					String localMethodSignature = genericMethodSignature;
					while (!localMethodSignature.isEmpty()) {
						String part = extract(localMethodSignature, ",", ">");
						localMethodSignature = skip(localMethodSignature, part, ",", ">");
						String typeIdentifier = extract(part, "=");
						part = skip(part, typeIdentifier, "=");

						method.addTypeVariable(TypeVariableName.get(typeIdentifier, Any.class));
					}

					builder.addMethod(method.build());
				}
			} else {
				System.out.println(nextLine);
			}
		}
		throw new UnsupportedOperationException();
	}

	private static TypeName resolveType(String name, String context) throws IOException {
		name = removeOuterBrackets(name);
		name = StringUtils.remove(name, "|null");
		name = StringUtils.remove(name, "| null");
		name = StringUtils.remove(name, "|undefined");
		name = StringUtils.remove(name, "| undefined");
		name = resolveAlias(name);
		if (name.contains("|") && (name.indexOf('|') < name.indexOf('<') || !name.contains("<")) && !name.startsWith(
				"[") && !name.startsWith("{")) {
			String fakeValue =
					context + "Type";
			String fakeValueType = "type " + fakeValue + " = " + name + ";";
			TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(), null);
			if (newType != null) {
				return newType;
			} else {
				return ClassName.get(Unknown.class);
			}
		}
		if (name.startsWith("[number,") && name.endsWith("]")) {
			String extract = StringUtils.removeEnd(skip(name, "[number,"), "]");
			if (extract.indexOf(',') < 0) {
				name = "DoubleKeyValue<" + extract + ">";
			}
		}
		if (name.startsWith("[string,") && name.endsWith("]")) {
			String extract = StringUtils.removeEnd(skip(name, "[string,"), "]");
			if (extract.indexOf(',') < 0) {
				name = "StringKeyValue<" + extract + ">";
			}
		}
		if (name.endsWith("[]")) {
			return ArrayTypeName.of(resolveType(StringUtils.removeEnd(name, "[]"), context));
		}
		switch (name) {
			case "Array<string>":
				return ArrayTypeName.of(String.class);
			case "Array<number>":
				return ArrayTypeName.of(TypeName.DOUBLE);
			case "Array<boolean>":
				return ArrayTypeName.of(TypeName.BOOLEAN);
			case "string":
				return ClassName.get(String.class);
			case "symbol":
				return ClassName.get(Symbol.class);
			case "false":
			case "true":
			case "boolean":
				return TypeName.BOOLEAN;
			case "void":
				return TypeName.VOID;
			case "number":
				return TypeName.DOUBLE;
			case "any":
			case "object":
				return ClassName.get(Any.class);
			case "never":
			case "unknown":
				return ClassName.get(Unknown.class);
			case "null":
			case "undefined":
				return null;
		}
		if (name.startsWith("{")) {
			// make a fake class
			String fakeClassSource = StringUtils.strip(name, "{}");
			StringBuilder fakeClass = new StringBuilder();
			while (!fakeClassSource.isEmpty()) {
				String part = extract(fakeClassSource, ",", "{", "}");
				fakeClassSource = skip(fakeClassSource, part, ",", "{", "}");
				fakeClass.append(part).append(";\n");
			}
			fakeClass.append("}\n");
			return processClass("class " + context + " {\n",
					Arrays.asList(fakeClass.toString().split("\n")).listIterator());
		}
		if (name.contains("<")) {
			// generic
			String typeName = extract(name, "<");
			String parameters = skip(name, typeName, "<");
			Set<TypeName> typeNameList = new HashSet<>();
			while (!parameters.isEmpty()) {
				String oneType = extract(parameters, ",", ">");
				parameters = skip(parameters, oneType, ",", ">");
				TypeName resolved = resolveType(oneType, context);
				if (typeName.equals("Array")) {
					if (resolved.equals(ClassName.get(String.class))) {
						return ArrayTypeName.of(String.class);
					} else if (resolved.isPrimitive()) {
						typeNameList.add(resolved.box());
					} else {
						typeNameList.add(resolved);
					}

				}
				if (resolved.isPrimitive()) {
					typeNameList.add(resolved.box());
				} else {
					typeNameList.add(resolved);
				}
			}
			return ParameterizedTypeName.get(guess(typeName), typeNameList.toArray(new TypeName[]{}));
		} else {
			// plain
			return guess(name);
		}
	}

	private static String removeOuterBrackets(String name) {
		if (name.startsWith("(") && name.endsWith(")")) {
			int roundCount = 0;
			for (int i = 1; i < name.length() - 1; i++) {
				if (name.charAt(i) == '(') {
					roundCount++;
				} else if (name.charAt(i) == ')') {
					roundCount--;
					if (roundCount < 0) {
						return name;
					}
				}
			}
			return name.substring(1, name.length() - 1);
		}
		return name;
	}

	private static ClassName guess(String name) {
		switch (name) {
			case "Array":
				return ClassName.get(Array.class);
		}
		try {
			Class<?> aClass = Class.forName("js.web.dom." + name);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		try {
			Class<?> aClass = Class.forName("js.web.webcomponents." + name);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		try {
			Class<?> aClass = Class.forName("js.web.cssom." + name);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		if (name.contains("|")) {
			return ClassName.get(Unknown.class);
		} else {
			return ClassName.bestGuess(name);
		}
	}

	private static String skip(String line, String... separators) {
		for (String separator : separators) {
			line = StringUtils.removeStart(StringUtils.stripStart(line, " "), separator.trim());
		}
		return line.trim();
	}

	private static String extract(String line, String... separators) {
		int braceAngular = 0;
		int braceSquare = 0;
		int braceFigure = 0;
		int braceRound = 0;

		StringBuilder result = new StringBuilder();
		outer:
		for (int i = 0; i < line.length(); i++) {
			if (braceAngular + braceSquare + braceFigure + braceRound == 0) {
				for (String separator : separators) {
					if (line.substring(i).startsWith(separator)) {
						break outer;
					}
				}
			}
			char c = line.charAt(i);
			if (c == '<') {
				braceAngular++;
			} else if (c == '>' && braceAngular > 0) {
				braceAngular--;
			} else if (c == '[') {
				braceSquare++;
			} else if (c == ']' && braceSquare > 0) {
				braceSquare--;
			} else if (c == '(') {
				braceRound++;
			} else if (c == ')' && braceRound > 0) {
				braceRound--;
			} else if (c == '{') {
				braceFigure++;
			} else if (c == '}' && braceFigure > 0) {
				braceFigure--;
			}
			result.append(c);
		}
		return result.toString().trim();
	}

	private static boolean extractJsDoc(String line, ListIterator<String> stringListIterator) {
		if (line.startsWith("//")) {
			return true;
		} else if (line.startsWith("/**")) {
			// collect jsdoc
			commentsCollector.add(line.substring(3));
			while (!line.endsWith("*/") && stringListIterator.hasNext()) {
				line = stringListIterator.next().trim();
				commentsCollector.add(StringUtils.stripStart(line, "*/").trim());
			}
			return true;
		} else if (line.startsWith("/*")) {
			// collect jsdoc
			while (!line.endsWith("*/") && stringListIterator.hasNext()) {
				line = stringListIterator.next().trim();
			}
			return true;
		} else {
			return line.isEmpty();
		}
	}


	private static void processWCA(String jsonFile) throws IOException {
		String[] packageParts = rootPackage.split("\\.");
		String commonPackageClassName = StringUtils.capitalize(packageParts[packageParts.length - 1]);

		String json = String.join("\n", Files.readAllLines(Paths.get(jsonFile)));

		JSONArray analysis = new JSONArray(new JSONTokener(json));

		TypeSpec.Builder packageBuilder = TypeSpec.classBuilder(commonPackageClassName)
				.addModifiers(Modifier.PUBLIC, Modifier.FINAL)
				.addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build());

		FieldSpec.Builder npmPackageNameField = FieldSpec.builder(String.class, "PACKAGE", Modifier.PUBLIC,
				Modifier.STATIC, Modifier.FINAL)
				.initializer("$S", npmPackage);
		FieldSpec.Builder npmPackageVersion = FieldSpec.builder(String.class, "VERSION", Modifier.PUBLIC,
				Modifier.STATIC, Modifier.FINAL)
				.initializer("$S", npmVersion);

		packageBuilder.addField(npmPackageNameField.build());
		packageBuilder.addField(npmPackageVersion.build());

		for (Object o : analysis) {
			JSONObject element = (JSONObject) o;
			String tagName = element.getString("tagName");
			String className = StringUtils.removeStart(StringUtils.capitalize(toCamelCase(tagName)),
					commonPackageClassName);
			String interfaceName = className + "Element";

			AnnotationSpec.Builder packageAnnotation = AnnotationSpec.builder(NpmPackage.class)
					.addMember("name", commonPackageClassName + ".PACKAGE")
					.addMember("version", commonPackageClassName + ".VERSION");

			AnnotationSpec.Builder importAnnotation = AnnotationSpec.builder(Import.class)
					.addMember("module", tagName);

			TypeSpec.Builder interfaceBuilder = TypeSpec.interfaceBuilder(interfaceName)
					.addModifiers(Modifier.PUBLIC)
					.addSuperinterface(Element.class);

			TypeSpec.Builder classBuilder = TypeSpec.classBuilder(className)
					.addModifiers(Modifier.PUBLIC)
					.superclass(ParameterizedTypeName.get(ClassName.get(AbstractComponent.class),
							ClassName.get(rootPackage + ".elements", interfaceName)))
					.addAnnotation(packageAnnotation.build())
					.addAnnotation(importAnnotation.build());

			MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
					.addModifiers(Modifier.PUBLIC)
					.addStatement("super($S)", tagName);
			classBuilder.addMethod(constructor.build());

			JSONObject declaration = element.getJSONObject("declaration");
			String jsDocText = getJsDoc(declaration);

			if (!jsDocText.isEmpty()) {
				interfaceBuilder.addJavadoc("$L", renderMarkdown(jsDocText));
				classBuilder.addJavadoc("$L", renderMarkdown(jsDocText));
			}

			JSONArray members = declaration.optJSONArray("members");
			if (members != null) {
				for (Object oMember : members) {
					JSONObject member = (JSONObject) oMember;
					if (!"public".equals(member.optString("visibility", "public"))) {
						continue;
					}

					switch (member.getString("kind")) {
						case "property":
							processProperty(member, interfaceBuilder, classBuilder, interfaceName, className);
							break;
						default:
							System.err.println(member.toString(4));
							throw new UnsupportedOperationException();
					}
				}
			}

			JSONArray events = declaration.optJSONArray("events");
			if (events != null) {
				for (Object oEvent : events) {
					JSONObject event = (JSONObject) oEvent;
					processEvent(event, interfaceBuilder, classBuilder, interfaceName, className);
				}
			}

			JSONArray methods = declaration.optJSONArray("methods");
			if (methods != null) {
				for (Object oMethod : methods) {
					JSONObject method = (JSONObject) oMethod;
					if (!"public".equals(method.optString("visibility", "public"))) {
						continue;
					}

					processMethod(method, interfaceBuilder, classBuilder, interfaceName, className);
				}
			}

			JavaFile interfaceFile = JavaFile.builder(rootPackage + ".elements", interfaceBuilder.build())
					.build();
			JavaFile classFile = JavaFile.builder(rootPackage, classBuilder.build())
					.build();
			JavaFile packageFile = JavaFile.builder(rootPackage, packageBuilder.build())
					.build();

			interfaceFile.writeTo(Paths.get(targetPath, "src", "main", "java"));
			classFile.writeTo(Paths.get(targetPath, "src", "main", "java"));
			packageFile.writeTo(Paths.get(targetPath, "src", "main", "java"));
		}
	}

	private static void processPolymer(String rootPath) throws IOException {
		String[] packageParts = rootPackage.split("\\.");
		String commonPackageClassName = StringUtils.capitalize(packageParts[packageParts.length - 1]);

		String json = String.join("\n", Files.readAllLines(Paths.get(rootPath, "polymer-analysis.json")));

		JSONObject analysis = new JSONObject(new JSONTokener(json));

		TypeSpec.Builder packageBuilder = TypeSpec.classBuilder(commonPackageClassName)
				.addModifiers(Modifier.PUBLIC, Modifier.FINAL);

		packageBuilder.addField(FieldSpec.builder(String.class, "VERSION")
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
				.initializer("$S", npmVersion)
				.build());

		packageBuilder.addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build());

		addNpmImport(commonPackageClassName, packageBuilder);

		processPolymerAnalysis(rootPath, commonPackageClassName, analysis, packageBuilder);

		JavaFile.builder(rootPackage, packageBuilder.build())
				.build()
				.writeTo(Paths.get(targetPath, "src", "main", "java"));
	}

	private static void addNpmImport(String commonPackageClassName, TypeSpec.Builder packageBuilder) {
		AnnotationSpec npmModule = AnnotationSpec.builder(NpmPackage.class)
				.addMember("name", "$S", npmPackage)
				.addMember("version", "$T.VERSION", ClassName.get(rootPackage, commonPackageClassName))
				.build();

		packageBuilder.addAnnotation(npmModule);
	}

	private static void processPolymerAnalysis(String rootPath, String commonPackageClassName, JSONObject analysis,
											   TypeSpec.Builder packageBuilder) throws
																				IOException {
		if (analysis.has("namespaces")) {
			for (Object oNs : analysis.getJSONArray("namespaces")) {
				JSONObject ns = (JSONObject) oNs;

				processPolymerAnalysis(rootPath, commonPackageClassName, ns, packageBuilder);
			}
		}

//        if (analysis.has("classes")) {
//            for (Object oClass : analysis.getJSONArray("classes")) {
//                JSONObject clazz = (JSONObject) oClass;
//
//                processPolymerElement(rootPath, commonPackageClassName, clazz, false);
//            }
//        }

		if (analysis.has("functions")) {
			Map<String, List<JSONObject>> functions = new HashMap<>();
			for (Object oFunction : analysis.optJSONArray("functions")) {
				JSONObject function = (JSONObject) oFunction;
				String methodName = function.getString("name");
				if (methodName.contains(".")) {
					String className = StringUtils.capitalize(toCamelCase(StringUtils.substringBefore(methodName,
							".")));
					functions.computeIfAbsent(className, key -> new ArrayList<>()).add(function);
				} else {
					String importFile = function.getJSONObject("sourceRange").getString("file");
					String importFileName = StringUtils.substringAfterLast(importFile, "/");
					if (StringUtils.isNotEmpty(importFileName)) {
						String className =
								StringUtils.capitalize(toCamelCase(StringUtils.substringBefore(importFileName, ".")));
						functions.computeIfAbsent(className, key -> new ArrayList<>()).add(function);
					}
				}
			}
			for (Map.Entry<String, List<JSONObject>> stringListEntry : functions.entrySet()) {
				TypeSpec.Builder utilBuilder = TypeSpec.interfaceBuilder(stringListEntry.getKey())
						.addSuperinterface(ClassName.get(Any.class))
						.addModifiers(Modifier.PUBLIC);
				Map<String, Set<String>> importNames = new HashMap<>();
				stringListEntry.getValue().forEach(function -> processPolymerFunctions(rootPath,
						commonPackageClassName, utilBuilder, function, importNames));

				addNpmImport(commonPackageClassName, utilBuilder);
				importNames.forEach((file, names) -> {
					AnnotationSpec importAnnotation = AnnotationSpec.builder(Import.class)
							.addMember("symbols", "{$L}",
									names.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")))
							.addMember("module", "$S", importRoot + "/" + file)
							.build();

					utilBuilder.addAnnotation(importAnnotation);
				});

				JavaFile.builder(rootPackage + ".utils", utilBuilder.build())
						.build()
						.writeTo(Paths.get(targetPath, "src", "main", "java"));
			}
		}

		if (analysis.has("mixins")) {
			for (Object oMixin : analysis.getJSONArray("mixins")) {
				JSONObject mixin = (JSONObject) oMixin;

				processPolymerMixin(rootPath, commonPackageClassName, mixin);
			}
		}

		if (analysis.has("elements")) {
			for (Object oElement : analysis.getJSONArray("elements")) {
				JSONObject element = (JSONObject) oElement;

				processPolymerElement(rootPath, commonPackageClassName, element, true);
			}
		}
	}

	private static void processPolymerFunctions(String rootPath, String commonPackageClassName,
												TypeSpec.Builder functionBuilder, JSONObject function, Map<String,
			Set<String>> imports) {
		String methodName = function.getString("name");
		String visibility = function.getString("privacy");
		String description = function.optString("description");
		String importFile = function.getJSONObject("sourceRange").getString("file");
		if (importFile.contains("/demo/")) {
			return;
		}

		if (!"public".equals(visibility) || StringUtils.isEmpty(methodName)) {
			return;
		}

		String importName = StringUtils.substringBefore(methodName, ".");
		imports.computeIfAbsent(importFile, file -> new HashSet<>())
				.add(importName);

		MethodSpec.Builder javaMethod =
				MethodSpec.methodBuilder(StringUtils.defaultIfEmpty(StringUtils.substringAfterLast(methodName, "."),
						methodName))
						.addModifiers(Modifier.PUBLIC, Modifier.STATIC);

		if (StringUtils.isNotEmpty(description)) {
			javaMethod.addJavadoc("$L", renderMarkdown(description));
		}

		JSONObject returnObject = function.optJSONObject("return");
		String returnTypeRaw = returnObject == null ? "<unspecified>" : returnObject.optString("type", "<unspecified" +
				">");
		TypeName returnType = parsePolymerType(returnTypeRaw);

		if (returnType == null) {
			returnType = TypeName.get(Unknown.class);
			javaMethod.addJavadoc("\nFIXME return $L\n", returnTypeRaw);
		}

		if ((returnTypeRaw.endsWith("| undefined") || returnTypeRaw.endsWith("| null")) && !returnType.isPrimitive()) {
			javaMethod.addAnnotation(Nullable.class);
		}

		javaMethod.returns(augmentForReturn(returnType));

		StringBuilder jsBodyBuilder = new StringBuilder();
		List<String> parameterNames = new ArrayList<>();
		if (returnType != TypeName.VOID) {
			jsBodyBuilder.append("return ");
		}
		jsBodyBuilder.append(methodName).append("(");

		JSONArray params = function.getJSONArray("params");
		boolean shouldAddComma = false;
		for (Object oParam : params) {
			JSONObject param = (JSONObject) oParam;
			String paramName = param.getString("name");
			String paramRawType = param.optString("type", "<unspecified>");
			String paramDescription = param.optString("description", param.optString("desc", ""));
			TypeName paramType = parsePolymerType(paramRawType);
			if (paramType == null) {
				paramType = TypeName.get(Unknown.class);
				javaMethod.addJavadoc("\nFIXME param $L: $L", paramName, paramRawType);
			}
			javaMethod.addParameter(paramType, paramName);
			parameterNames.add(paramName);
			if (shouldAddComma) {
				jsBodyBuilder.append(", ");
			}
			jsBodyBuilder.append(paramName);

			javaMethod.addJavadoc("\n@param $L $L", paramName, renderMarkdown(paramDescription));

			shouldAddComma = true;
		}

		jsBodyBuilder.append(")");

		AnnotationSpec.Builder jsBodyAnnotation = AnnotationSpec.builder(JSBody.class);
		if (!parameterNames.isEmpty()) {
			jsBodyAnnotation.addMember("params", "{$L}",
					parameterNames.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")));
		}
		jsBodyAnnotation.addMember("script", "$S", jsBodyBuilder.toString());

		javaMethod.addAnnotation(jsBodyAnnotation.build());

		javaMethod.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only in " +
				"JavaScript");

		if (returnType != TypeName.VOID && returnObject != null) {
			String returnTypeDescription = returnObject.optString("description", returnObject.optString("desc", ""));

			javaMethod.addJavadoc("\n@return $L", renderMarkdown(returnTypeDescription));
		}

		functionBuilder.addMethod(javaMethod.build());
	}

	private static void processPolymerElement(String rootPath, String commonPackageClassName, JSONObject element,
											  boolean isElement) throws
																 IOException {
		String visibility = element.getString("privacy");
		String tagName = element.optString("tagname", "");
		String elementName = element.optString("name", StringUtils.capitalize(toCamelCase(tagName)));
		if (!"public".equals(visibility) || StringUtils.isEmpty(elementName)) {
			return;
		}

		String importPath = element.getString("path");
		if (importPath.contains("/demo/")) {
			return;
		}
		String superClass = element.optString("superclass", "js.lang.Any");
		String description = element.optString("description");

		String shortElementName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast(elementName, "."),
				elementName);
		String shortComponentName = StringUtils.defaultIfBlank(StringUtils.capitalize(toCamelCase(tagName)),
				"Abstract" + shortElementName);

		TypeName jsElementClass = ClassName.get(rootPackage + (isElement ? ".elements" : ".classes"),
				shortElementName);
		TypeName javaElementClass = ClassName.get(rootPackage, shortComponentName);

		TypeSpec.Builder jsElement = TypeSpec.interfaceBuilder(shortElementName)
				.addModifiers(Modifier.PUBLIC)
				.addSuperinterface(ClassName.get(Any.class))
				.addSuperinterface(safePolymerType(superClass));

		TypeSpec.Builder javaElement = TypeSpec.classBuilder(shortComponentName)
				.superclass(ParameterizedTypeName.get(ClassName.get(AbstractComponent.class), jsElementClass))
				.addModifiers(Modifier.PUBLIC);

		if (StringUtils.isNotBlank(tagName)) {
			javaElement.addMethod(MethodSpec.constructorBuilder().addStatement("super($T.TAGNAME())", jsElementClass).addModifiers(Modifier.PUBLIC).build());
			jsElement.addMethod(MethodSpec
					.methodBuilder("TAGNAME")
					.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
					.returns(String.class)
					.addStatement("return $S", tagName).build());
		} else {
			javaElement.addModifiers(Modifier.ABSTRACT);
			javaElement.addMethod(MethodSpec.constructorBuilder().addParameter(String.class, "tagName").addStatement(
					"super(tagName)").addModifiers(Modifier.PROTECTED).build());
		}

		JSONArray mixins = element.optJSONArray("mixins");
		if (mixins != null) {
			for (Object mixin : mixins) {
				String shortMixinName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast((String) mixin,
						"."), (String) mixin);
				String shortJavaMixinName = "Has" + shortMixinName;
				jsElement.addSuperinterface(ClassName.get(rootPackage + ".elements.mixins", shortMixinName));
				javaElement.addSuperinterface(ParameterizedTypeName.get(ClassName.get(rootPackage + ".mixins",
						shortJavaMixinName), jsElementClass, javaElementClass));
			}
		}

		if (StringUtils.isNotEmpty(description)) {
			jsElement.addJavadoc("$L", renderMarkdown(description));
			javaElement.addJavadoc("$L", renderMarkdown(description));
		}

		addNpmImport(commonPackageClassName, jsElement);
		AnnotationSpec.Builder importAnnotation = AnnotationSpec.builder(Import.class)
				.addMember("module", "$S", importRoot + "/" + importPath);

		if (element.has("staticMethods") && !element.getJSONArray("staticMethods").isEmpty()) {
			importAnnotation.addMember("symbols", "$S", shortElementName);
		}
		jsElement.addAnnotation(importAnnotation.build());

		if (element.has("staticMethods")) {
			processPolymerMethods(element.getJSONArray("staticMethods"), jsElementClass, jsElement, javaElement,
					elementName, shortElementName, true, javaElementClass);
		}
		if (element.has("properties")) {
			processPolymerProperties(element.getJSONArray("properties"), jsElementClass, javaElementClass, jsElement,
					javaElement, elementName, shortElementName, javaElementClass);
		}
		if (element.has("methods")) {
			processPolymerMethods(element.getJSONArray("methods"), jsElementClass, jsElement, javaElement,
					elementName, shortElementName, false, javaElementClass);
		}
		if (element.has("events")) {
			processPolymerEventsMethods(element.getJSONArray("events"), jsElement, javaElement, elementName,
					shortElementName, javaElementClass, jsElementClass);
		}
		if (element.has("slots")) {
			processPolymerSlotsMethods(rootPath, importPath, element.getJSONArray("slots"), jsElementClass,
					javaElementClass, jsElement, javaElement, elementName, shortElementName, javaElementClass);
		}

		JavaFile.builder(rootPackage + (isElement ? ".elements" : ".classes"), jsElement.build())
				.indent("\t")
				.build()
				.writeTo(Paths.get(targetPath, "src", "main", "java"));

		if (isElement) {
			JavaFile.builder(rootPackage, javaElement.build())
					.indent("\t")
					.build()
					.writeTo(Paths.get(targetPath, "src", "main", "java"));
		}
	}

	private static void processPolymerMixin(String rootPath, String commonPackageClassName, JSONObject mixin) throws
																											  IOException {
		String visibility = mixin.getString("privacy");
		String mixinName = mixin.getString("name");
		if (!"public".equals(visibility) || StringUtils.isEmpty(mixinName)) {
			return;
		}

		String importPath = mixin.getString("path");
		String description = mixin.optString("description");
		if (importPath.contains("/demo/")) {
			return;
		}

		String shortMixinName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast(mixinName, "."), mixinName);
		String shortJavaMixinName = "Has" + shortMixinName;

		TypeName jsMixinClass = ClassName.get(rootPackage + ".elements.mixins", shortMixinName);
		TypeName javaMixinClass = ClassName.get(rootPackage + ".mixins", shortJavaMixinName);
		TypeName javaReturnType = TypeVariableName.get("T");

		TypeSpec.Builder jsMixin = TypeSpec.interfaceBuilder(mixinName)
				.addModifiers(Modifier.PUBLIC)
				.addSuperinterface(Element.class);

		TypeSpec.Builder javaMixin = TypeSpec.interfaceBuilder(shortJavaMixinName)
				.addTypeVariable(TypeVariableName.get("E", jsMixinClass))
				.addTypeVariable(TypeVariableName.get("T", ParameterizedTypeName.get(ClassName.get(HasElement.class),
						TypeVariableName.get("E"))))
				.addSuperinterface(ParameterizedTypeName.get(ClassName.get(HasElement.class), TypeVariableName.get("E"
				)))
				.addModifiers(Modifier.PUBLIC);

		JSONArray mixins = mixin.optJSONArray("mixins");
		if (mixins != null) {
			for (Object xmixin : mixins) {
				String shortXMixinName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast((String) xmixin,
						"."), (String) xmixin);
				String shortXJavaMixinName = "Has" + shortXMixinName;
				jsMixin.addSuperinterface(ClassName.get(rootPackage + ".elements.mixins", shortXMixinName));
				javaMixin.addSuperinterface(ParameterizedTypeName.get(ClassName.get(rootPackage + ".mixins",
						shortXJavaMixinName), TypeVariableName.get("E"), TypeVariableName.get("T")));
			}
		}

		if (StringUtils.isNotEmpty(description)) {
			jsMixin.addJavadoc("$L", renderMarkdown(description));
			javaMixin.addJavadoc("$L", renderMarkdown(description));
		}

		if (mixin.has("staticMethods") && !mixin.getJSONArray("staticMethods").isEmpty()) {
			addNpmImport(commonPackageClassName, jsMixin);

			AnnotationSpec importAnnotation = AnnotationSpec.builder(Import.class)
					.addMember("symbols", "$S", shortMixinName)
					.addMember("module", "$S", importRoot + "/" + importPath)
					.build();
			jsMixin.addAnnotation(importAnnotation);
		}

		processPolymerMethods(mixin.getJSONArray("staticMethods"), jsMixinClass, jsMixin, javaMixin, mixinName,
				shortMixinName, true, javaReturnType);
		processPolymerProperties(mixin.getJSONArray("properties"), jsMixinClass, javaMixinClass, jsMixin, javaMixin,
				mixinName, shortMixinName, javaReturnType);
		processPolymerMethods(mixin.getJSONArray("methods"), jsMixinClass, jsMixin, javaMixin, mixinName,
				shortMixinName, false, javaReturnType);
		processPolymerEventsMethods(mixin.getJSONArray("events"), jsMixin, javaMixin, mixinName, shortMixinName,
				javaReturnType, jsMixinClass);
		processPolymerSlotsMethods(rootPath, importPath, mixin.getJSONArray("slots"), jsMixinClass, javaMixinClass,
				jsMixin, javaMixin, mixinName, shortMixinName, javaReturnType);

		JavaFile.builder(rootPackage + ".elements.mixins", jsMixin.build())
				.indent("\t")
				.build()
				.writeTo(Paths.get(targetPath, "src", "main", "java"));

		JavaFile.builder(rootPackage + ".mixins", javaMixin.build())
				.indent("\t")
				.build()
				.writeTo(Paths.get(targetPath, "src", "main", "java"));
	}

	private static void processPolymerSlotsMethods(String rootPath, String importPath, JSONArray slots,
												   TypeName jsMixinClass, TypeName javaMixinClass,
												   TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin,
												   String mixinName, String shortMixinName, TypeName javaReturnType) throws
																													 IOException {
		if (slots.isEmpty()) {
			// try to empirically find slots
			Document kindaDocument = Jsoup.parse(Paths.get(rootPath, importPath).toFile(), "UTF-8");
			kindaDocument.select("slot[name]").forEach(slot -> {
				JSONObject kindaSlot = new JSONObject();
				kindaSlot.put("name", slot.attr("name"));
				slots.put(kindaSlot);
			});
		}

		if (!slots.isEmpty()) {
			javaMixin.addSuperinterface(ParameterizedTypeName.get(ClassName.get(HasSlots.class), jsMixinClass));
		} else if (!(javaReturnType instanceof TypeVariableName)) {
			javaMixin.addSuperinterface(ParameterizedTypeName.get(ClassName.get(HasComponents.class),
					jsMixinClass, javaReturnType, ParameterizedTypeName.get(ClassName.get(HasElement.class),
							WildcardTypeName.subtypeOf(Object.class))
			));
		}

		for (Object oSlot : slots) {
			JSONObject slot = (JSONObject) oSlot;
			String slotName = slot.getString("name");
			String slotMethodNameBase = toCamelCase(slotName);
			String description = slot.optString("description");

			MethodSpec.Builder slotted = MethodSpec.methodBuilder(slotMethodNameBase + "Slot")
					.addModifiers(Modifier.PUBLIC)
					.returns(HasSlots.Container.class)
					.addStatement("return slotted($S)", slotName);

			if (!description.isEmpty()) {
				slotted.addJavadoc("$L", renderMarkdown(description));
			}

			if (javaReturnType instanceof TypeVariableName) {
				slotted.addModifiers(Modifier.DEFAULT);
			}

			javaMixin.addMethod(slotted.build());
		}
	}

	private static void processPolymerEventsMethods(JSONArray events, TypeSpec.Builder jsMixin,
													TypeSpec.Builder javaMixin, String mixinName,
													String shortMixinName, TypeName javaClass, TypeName jsClass) {
		for (Object oEvent : events) {
			JSONObject event = (JSONObject) oEvent;

			if (event.has("inheritedFrom")) {
				continue;
			}

			String eventName = event.getString("name");
			String eventMethodName = toCamelCase(eventName) + "Event";
			String typeRaw = event.optString("type", "CustomEvent");
			TypeName type = parsePolymerType(typeRaw);
			String description = event.optString("description");

			MethodSpec.Builder javaEvent = MethodSpec.methodBuilder(eventMethodName)
					.addModifiers(Modifier.PUBLIC);
			if (javaClass instanceof TypeVariableName) {
				javaEvent.addModifiers(Modifier.DEFAULT);
			}

			if (type == null) {
				type = TypeName.get(Unknown.class);
				javaEvent.addJavadoc("\nFIXME event type $L\n", type);
			}

			javaEvent.returns(ParameterizedTypeName.get(ClassName.get(ObservableEvent.class), type));
			javaEvent.addStatement("return createEvent($S)", eventName);
			if (StringUtils.isNotEmpty(description)) {
				javaEvent.addJavadoc("$L", renderMarkdown(description));
			}

			javaMixin.addMethod(javaEvent.build());
		}
	}

	private static void processPolymerProperties(JSONArray properties, TypeName jsMixinClass, TypeName javaMixinClass
			, TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin, String mixinName, String shortMixinName,
												 TypeName javaReturnType) {
		for (Object oProperty : properties) {
			JSONObject property = (JSONObject) oProperty;
			String propertyName = property.getString("name");
			String visibility = property.getString("privacy");
			if (!"public".equals(visibility)
					|| property.has("inheritedFrom")) {
				continue;
			}
			String description = property.optString("description");

			boolean readonly = false;

			JSONObject metadata = property.optJSONObject("metadata");
			if (metadata != null) {
				JSONObject polymer = metadata.optJSONObject("polymer");
				if (polymer != null) {
					readonly = polymer.optBoolean("readOnly", false);
				}
			}

			String typeRaw = property.optString("type", "<unspecified>");
			TypeName type = parsePolymerType(typeRaw);

			String setterName = "set" + StringUtils.capitalize(propertyName);
			String getterName = "get" + StringUtils.capitalize(propertyName);

			if (type == TypeName.BOOLEAN) {
				getterName = "is" + StringUtils.capitalize(propertyName);
			}

			MethodSpec.Builder jsGetterMethod = MethodSpec.methodBuilder(getterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
			MethodSpec.Builder jsSetterMethod = MethodSpec.methodBuilder(setterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
			MethodSpec.Builder javaSetterMethod = MethodSpec.methodBuilder(SourceVersion.isKeyword(propertyName) ?
					setterName : propertyName)
					.addModifiers(Modifier.PUBLIC);
			MethodSpec.Builder javaGetterMethod = MethodSpec.methodBuilder(SourceVersion.isKeyword(propertyName) ?
					getterName : propertyName)
					.addModifiers(Modifier.PUBLIC);

			if (javaReturnType instanceof TypeVariableName) {
				javaGetterMethod.addModifiers(Modifier.DEFAULT);
				javaSetterMethod.addModifiers(Modifier.DEFAULT);
			}

			if (type == null) {
				type = TypeName.get(Unknown.class);
				jsGetterMethod.addJavadoc("\nFIXME type $L\n", typeRaw);
				jsSetterMethod.addJavadoc("\nFIXME type $L\n", typeRaw);
				javaGetterMethod.addJavadoc("\nFIXME type $L\n", typeRaw);
				javaSetterMethod.addJavadoc("\nFIXME type $L\n", typeRaw);
			}

			jsGetterMethod.returns(augmentForReturn(type));
			jsSetterMethod.returns(void.class);
			javaGetterMethod.returns(augmentForReturn(type));
			javaSetterMethod.returns(javaReturnType);

			TypeName argType = type;
			if (type instanceof ArrayTypeName) {
				ArrayTypeName arrayType = (ArrayTypeName) type;
				argType =
						ArrayTypeName.of(arrayType.componentType.annotated(AnnotationSpec.builder(JSByRef.class).build()));
			}

			jsSetterMethod.addParameter(argType, SourceVersion.isKeyword(propertyName) ? "value" : propertyName);
			javaSetterMethod.addParameter(type, SourceVersion.isKeyword(propertyName) ? "value" : propertyName);

			if (type instanceof ArrayTypeName) {
				jsSetterMethod.varargs();
				javaSetterMethod.varargs();
			}

			if ((typeRaw.endsWith("| undefined") || typeRaw.endsWith("| null")) && !type.isPrimitive()) {
				jsGetterMethod.addAnnotation(Nullable.class);
				javaGetterMethod.addAnnotation(Nullable.class);
			}

			jsGetterMethod.addAnnotation(JSProperty.class);
			jsSetterMethod.addAnnotation(JSProperty.class);

			if (StringUtils.isNotEmpty(description)) {
				jsGetterMethod.addJavadoc("$L", renderMarkdown(description));
				jsSetterMethod.addJavadoc("$L", renderMarkdown(description));
				javaGetterMethod.addJavadoc("$L", renderMarkdown(description));
				javaSetterMethod.addJavadoc("$L", renderMarkdown(description));
			}

			javaGetterMethod.addStatement("return getNode().$L()", getterName);
			javaSetterMethod.addStatement("getNode().$L($L)", setterName, SourceVersion.isKeyword(propertyName) ?
					"value" : propertyName);

			if (javaReturnType instanceof TypeVariableName) {
				javaSetterMethod.addStatement("return ($T)this", javaReturnType);
			} else {
				javaSetterMethod.addStatement("return this");
			}

			jsMixin.addMethod(jsGetterMethod.build());
			javaMixin.addMethod(javaGetterMethod.build());
			if (!readonly) {
				jsMixin.addMethod(jsSetterMethod.build());
				javaMixin.addMethod(javaSetterMethod.build());
			}
		}
	}

	private static void processPolymerMethods(JSONArray methods, TypeName jsMixinClass, TypeSpec.Builder jsMixin,
											  TypeSpec.Builder javaMixin, String mixinName, String shortMixinName,
											  boolean isStatic, TypeName javaElementClass) {
		for (Object oMethod : methods) {
			JSONObject method = (JSONObject) oMethod;
			String methodName = method.getString("name");
			String visibility = method.getString("privacy");
			if (!"public".equals(visibility)
					|| method.has("inheritedFrom")
					|| "connectedCallback".equals(methodName)
					|| "disconnectedCallback".equals(methodName)
					|| "attributeChangedCallback".equals(methodName)
					|| "finalize".equals(methodName)
					|| "getNode".equals(methodName)
					|| "ready".equals(methodName)) {
				continue;
			}
			String description = method.optString("description");

			String originalMethodName = methodName;
			if (SourceVersion.isKeyword(methodName)) {
				methodName = "do" + StringUtils.capitalize(methodName);
			}

			MethodSpec.Builder jsMethod = MethodSpec.methodBuilder(methodName)
					.addModifiers(Modifier.PUBLIC);
			MethodSpec.Builder javaMethod = MethodSpec.methodBuilder(methodName)
					.addModifiers(Modifier.PUBLIC);

			if (!methodName.equals(originalMethodName) && !isStatic) {
				jsMethod.addAnnotation(AnnotationSpec.builder(JSMethod.class).addMember("name", "$S",
						originalMethodName).build());
			}

			if (StringUtils.isNotEmpty(description)) {
				jsMethod.addJavadoc("$L", renderMarkdown(description));
				javaMethod.addJavadoc("$L", renderMarkdown(description));
			}

			if (isStatic) {
				jsMethod.addModifiers(Modifier.STATIC);
				javaMethod.addModifiers(Modifier.STATIC);
			} else {
				if (javaElementClass instanceof TypeVariableName) {
					javaMethod.addModifiers(Modifier.DEFAULT);
				}
				jsMethod.addModifiers(Modifier.ABSTRACT);
			}

			JSONObject returnObject = method.optJSONObject("return");
			String returnTypeRaw = returnObject == null ? "<unspecified>" : returnObject.optString("type",
					"<unspecified>");
			TypeName returnType = parsePolymerType(returnTypeRaw);

			if (returnType == null) {
				returnType = TypeName.get(Unknown.class);
				jsMethod.addJavadoc("\nFIXME return $L\n", returnTypeRaw);
				javaMethod.addJavadoc("\nFIXME return $L\n", returnTypeRaw);
			}

			if ((returnTypeRaw.endsWith("| undefined") || returnTypeRaw.endsWith("| null")) && !returnType.isPrimitive()) {
				jsMethod.addAnnotation(Nullable.class);
				javaMethod.addAnnotation(Nullable.class);
			}

			jsMethod.returns(augmentForReturn(returnType));
			javaMethod.returns(augmentForReturn(returnType));

			StringBuilder jsBodyBuilder = new StringBuilder();
			StringBuilder javaBodyBuilder = new StringBuilder();
			List<String> parameterNames = new ArrayList<>();
			if (returnType != TypeName.VOID) {
				jsBodyBuilder.append("return ");
				javaBodyBuilder.append("return ");
			}
			jsBodyBuilder.append(isStatic ? shortMixinName : "this").append('.').append(originalMethodName).append(
					"(");
			if (isStatic) {
				javaBodyBuilder.append("$T.").append(methodName).append("(");
			} else {
				javaBodyBuilder.append("getNode().").append(methodName).append("(");
			}

			JSONArray params = method.getJSONArray("params");
			boolean shouldAddComma = false;
			for (Object oParam : params) {
				JSONObject param = (JSONObject) oParam;
				String paramName = param.getString("name");
				String paramRawType = param.optString("type", "<unspecified>");
				String paramDescription = param.optString("description", param.optString("desc", ""));
				TypeName paramType = parsePolymerType(paramRawType);
				if (paramType == null) {
					paramType = TypeName.get(Unknown.class);
					jsMethod.addJavadoc("\nFIXME param $L: $L\n", paramName, paramRawType);
					javaMethod.addJavadoc("\nFIXME param $L: $L\n", paramName, paramRawType);
				}
				jsMethod.addParameter(paramType, paramName);
				javaMethod.addParameter(paramType, paramName);
				parameterNames.add(paramName);
				if (shouldAddComma) {
					jsBodyBuilder.append(", ");
					javaBodyBuilder.append(", ");
				}
				jsBodyBuilder.append(paramName);
				javaBodyBuilder.append(paramName);

				jsMethod.addJavadoc("\n@param $L $L", paramName, renderMarkdown(paramDescription));
				javaMethod.addJavadoc("\n@param $L $L", paramName, renderMarkdown(paramDescription));

				shouldAddComma = true;
			}

			jsBodyBuilder.append(")");
			javaBodyBuilder.append(")");

			if (isStatic) {
				javaMethod.addStatement(javaBodyBuilder.toString(), jsMixinClass);

				AnnotationSpec.Builder jsBodyAnnotation = AnnotationSpec.builder(JSBody.class);
				if (!parameterNames.isEmpty()) {
					jsBodyAnnotation.addMember("params", "{$L}",
							parameterNames.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")));
				}
				jsBodyAnnotation.addMember("script", "$S", jsBodyBuilder.toString());

				jsMethod.addAnnotation(jsBodyAnnotation.build());

				jsMethod.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only in " +
						"JavaScript");
			} else {
				javaMethod.addStatement(javaBodyBuilder.toString());
			}

			if (returnType != TypeName.VOID && returnObject != null) {
				String returnTypeDescription = returnObject.optString("desc", "");

				jsMethod.addJavadoc("\n@return $L", renderMarkdown(returnTypeDescription));
				javaMethod.addJavadoc("\n@return $L", renderMarkdown(returnTypeDescription));
			}

			jsMixin.addMethod(jsMethod.build());
			javaMixin.addMethod(javaMethod.build());
		}
	}

	private static TypeName augmentForReturn(TypeName type) {
		if (type.toString().equals(Any.class.toString())) {
			return ClassName.get(Unknown.class);
		}
		if (!(type instanceof ArrayTypeName)) {
			return type;
		}

		ArrayTypeName arrayType = (ArrayTypeName) type;
		if (!arrayType.componentType.isPrimitive() && !"java.lang.String".equals(arrayType.componentType.toString())) {
			return ParameterizedTypeName.get(ClassName.get(Array.class), arrayType.componentType);
		}
		return type;
	}

	private static TypeName safePolymerType(String type) {
		if ("Polymer.Element".equals(type)) {
			type = "PolymerElement";
		}
		TypeName typeName = parsePolymerType(type);
		return typeName == null ? ClassName.bestGuess(type) : typeName;
	}

	private static TypeName parsePolymerType(String type) {
		type = StringUtils.removeStart(type, "!").trim();
		if (type.length() > 1) {
			type = StringUtils.removeStart(type, "?").trim();
		}
		type = StringUtils.removeEnd(type, "=").trim();
		if (type.startsWith("Array.")) {
			return ArrayTypeName.of(safePolymerType(StringUtils.strip(StringUtils.removeStart(type, "Array."), "<>")));
		}
		type = StringUtils.removeEnd(type, "| undefined").trim();
		type = StringUtils.removeEnd(type, "| null").trim();
		switch (type) {
			case "void":
				return TypeName.VOID;
			case "number":
				return TypeName.DOUBLE;
			case "boolean":
				return TypeName.BOOLEAN;
			case "String":
			case "string":
				return ClassName.get(String.class);
			case "Function":
				return ClassName.get(JsFunction.class);
			case "*":
				return ClassName.get(Any.class);
			case "Array":
				return ArrayTypeName.of(Unknown.class);
		}
		try {
			Class<?> aClass = Class.forName("js.web.dom." + type);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		try {
			Class<?> aClass = Class.forName("js.web.webcomponents." + type);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		try {
			Class<?> aClass = Class.forName("js.web.cssom." + type);
			return ClassName.get(aClass);
		} catch (ClassNotFoundException e) {
			// ignore
		}
		System.err.println(type);
		return null;
	}

	private static TypeName buildPolymerDataObjects(String owner, String rawType) throws IOException {
		String className = StringUtils.capitalize(owner);
		//{ credits: { enabled: boolean; }; exporting: { enabled: boolean; }; title: { text: null; }; series:
		// never[]; xAxis: {}; yAxis: { axisGenerated: boolean; }; }
		String definition = StringUtils.removeEnd(StringUtils.removeStart(rawType, "{"), "}").trim();
		String tail = definition;

		TypeSpec.Builder builder = TypeSpec.interfaceBuilder(className)
				.addSuperinterface(Any.class)
				.addModifiers(Modifier.PUBLIC);

		while (!tail.isEmpty()) {
			// 1. Get property name (up to ':')
			String propertyName = StringUtils.substringBefore(tail, ":").trim();
			tail = StringUtils.substringAfter(tail, ":").trim();
			// 3. Get property type
			int pos = 0;
			int depth = 0;
			while (pos < tail.length()) {
				if (tail.charAt(pos) == '{') {
					depth++;
				} else if (tail.charAt(pos) == '}') {
					depth--;
				} else if (depth == 0 && (tail.charAt(pos) == ';' || tail.charAt(pos) == ',')) {
					break;
				}
				pos++;
			}
			String propertyType = tail.substring(0, pos);
			tail = tail.substring(pos + 1).trim();

			TypeName type = computeType(owner + StringUtils.capitalize(propertyName), propertyType);
			// 4. Write getters/setters
			String getterName = "get" + StringUtils.capitalize(propertyName);
			String setterName = "set" + StringUtils.capitalize(propertyName);

			if ("boolean".equals(rawType)) {
				getterName = "is" + StringUtils.capitalize(propertyName);
			}

			MethodSpec.Builder getter = MethodSpec.methodBuilder(getterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addAnnotation(JSProperty.class)
					.returns(type);

			MethodSpec.Builder setter = MethodSpec.methodBuilder(setterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addAnnotation(JSProperty.class)
					.addParameter(type, propertyName)
					.returns(void.class);

			if (type.toString().startsWith("js.lang.Unknown")) {
				getter.addJavadoc("FIXME $L\n\n", rawType);
				setter.addJavadoc("FIXME $L\n\n", rawType);
			}

			builder.addMethod(getter.build());
			builder.addMethod(setter.build());
		}

		JavaFile javaFile = JavaFile.builder(rootPackage, builder.build())
				.build();
		javaFile.writeTo(Paths.get(targetPath, "src", "main", "java"));

		return ClassName.get(rootPackage, className);
	}

	private static void processMethod(JSONObject method, TypeSpec.Builder interfaceBuilder,
									  TypeSpec.Builder classBuilder, String interfaceName, String className) throws
																											 IOException {
		String methodName = method.getString("name");

		if ("ready".equals(methodName) || "connectedCallback".equals(methodName) || "disconnectedCallback".equals(methodName)) {
			return;
		}
		String rawType = StringUtils.removeEnd(StringUtils.removeStart(method.getString("type"), "{TYPE:"), "}");
		rawType = method.optString("typeHint", rawType);

		String[] parts = StringUtils.splitByWholeSeparator(rawType, " => ", 2);
		if (parts.length != 2) {
			System.err.println(method.toString(4));
			throw new UnsupportedOperationException();
		}
		String arguments = StringUtils.removeEnd(StringUtils.removeStart(parts[0], "("), ")");
		String result = parts[1];
		TypeName returnType = computeType(className + StringUtils.capitalize(methodName), result);

		MethodSpec.Builder jsMethod = MethodSpec.methodBuilder(methodName)
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.returns(returnType);

		MethodSpec.Builder javaMethod = MethodSpec.methodBuilder(methodName)
				.addModifiers(Modifier.PUBLIC)
				.returns(returnType);

		boolean fixme = false;

		StringBuilder callStatementParams = new StringBuilder();
		for (String argument : arguments.split(",")) {
			if (argument.isEmpty()) continue;
			if (callStatementParams.length() > 0) {
				callStatementParams.append(", ");
			}
			String[] argumentParts = StringUtils.split(argument, ": ", 2);
			if (argumentParts.length != 2) {
				System.err.println(method.toString(4));
				throw new UnsupportedOperationException();
			}
			String argumentName = argumentParts[0];
			if (argumentName.startsWith("...")) {
				fixme = true;
				argumentName = StringUtils.removeStart(argumentName, "...");
			}
			if (argumentName.endsWith("?")) {
				fixme = true;
				argumentName = StringUtils.removeEnd(argumentName, "?");
			}
			callStatementParams.append(argumentName);
			TypeName type =
					computeType(className + StringUtils.capitalize(methodName) + StringUtils.capitalize(argumentName)
							, argumentParts[1]);

			if ("js.lang.Unknown".equals(type.toString())) {
				fixme = true;
			}
			jsMethod.addParameter(type, argumentName);
			javaMethod.addParameter(type.withoutAnnotations(), argumentName);

			if (fixme) {
				jsMethod.addJavadoc("FIXME $L\n\n", rawType);
				javaMethod.addJavadoc("FIXME $L\n\n", rawType);
			}
		}

		if (returnType == TypeName.VOID) {
			javaMethod.addStatement("getNode().$L($L)", methodName, callStatementParams);
		} else {
			javaMethod.addStatement("return getNode().$L($L)", methodName, callStatementParams);
		}

		String jsDocText = getJsDoc(method);

		if (!jsDocText.isEmpty()) {
			jsMethod.addJavadoc("$L", renderMarkdown(jsDocText));
			javaMethod.addJavadoc("$L", renderMarkdown(jsDocText));
		}

		interfaceBuilder.addMethod(jsMethod.build());
		classBuilder.addMethod(javaMethod.build());
	}

	private static String getJsDoc(JSONObject method) {
		JSONObject jsDoc = method.optJSONObject("jsDoc");
		String jsDocText = "";
		if (jsDoc != null) {
			jsDocText = jsDoc.optString("description", "");

			JSONArray tags = jsDoc.optJSONArray("tags");
			if (tags != null) {
				if (!jsDocText.isEmpty()) {
					jsDocText = jsDocText + "\n";
				}
				for (Object oTag : tags) {
					JSONObject tag = (JSONObject) oTag;
					jsDocText = jsDocText + "\n@implSpec " + tag.getString("tag") + " " + tag.optString("comment", "");
				}
			}
			if (!jsDocText.isEmpty()) {
				jsDocText = jsDocText + "\n";
			}
		}
		return jsDocText;
	}


	private static void processEvent(JSONObject event, TypeSpec.Builder interfaceBuilder,
									 TypeSpec.Builder classBuilder, String interfaceName, String className) throws
																											IOException {
		String eventName = event.getString("name");
		String rawType = removeTypeTags(event.optString("type", "{TYPE:any}"));
		rawType = event.optString("typeHint", rawType);
		String eventNameCamelCase = toCamelCase(eventName);

		TypeName eventDetailsType = computeType(className + StringUtils.capitalize(eventNameCamelCase), rawType);
		TypeName eventType = ParameterizedTypeName.get(ClassName.get(CustomEvent.class), eventDetailsType);
		TypeName observableEventType = ParameterizedTypeName.get(ClassName.get(ObservableEvent.class), eventType);

		MethodSpec.Builder method = MethodSpec.methodBuilder(eventNameCamelCase + "Event")
				.addModifiers(Modifier.PUBLIC)
				.returns(observableEventType)
				.addStatement("return createEvent($S)", eventName);

		classBuilder.addMethod(method.build());
	}

	private static void processProperty(JSONObject member, TypeSpec.Builder interfaceBuilder,
										TypeSpec.Builder classBuilder, String interfaceName, String className) throws
																											   IOException {
		String propName = member.getString("propName");
		String rawType = removeTypeTags(member.optString("type", "{TYPE:any}"));
		rawType = member.optString("typeHint", rawType);

		String getterName;
		String setterName;

		getterName = "get" + StringUtils.capitalize(propName);
		setterName = "set" + StringUtils.capitalize(propName);

		if ("boolean".equals(rawType)) {
			getterName = "is" + StringUtils.capitalize(propName);
		}

		boolean readonly = false;

		JSONArray modifiers = member.optJSONArray("modifiers");
		if (modifiers != null && modifiers.toList().contains("readonly")) {
			readonly = true;
		}

		TypeName type = computeType(className + StringUtils.capitalize(propName), rawType);

		MethodSpec.Builder jsGetter = MethodSpec.methodBuilder(getterName)
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.addAnnotation(JSProperty.class)
				.returns(type);

		MethodSpec.Builder jsSetter = MethodSpec.methodBuilder(setterName)
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.addAnnotation(JSProperty.class)
				.addParameter(type, propName)
				.returns(void.class);

		MethodSpec.Builder javaGetter = MethodSpec.methodBuilder(propName)
				.addModifiers(Modifier.PUBLIC)
				.returns(type)
				.addStatement("return getNode().$L()", getterName);

		MethodSpec.Builder javaSetter = MethodSpec.methodBuilder(propName)
				.addModifiers(Modifier.PUBLIC)
				.returns(ClassName.get(rootPackage, className))
				.addParameter(type, propName)
				.addStatement("getNode().$L($L)", setterName, propName)
				.addStatement("return this");

		if (type.toString().startsWith("js.lang.Unknown")) {
			jsGetter.addJavadoc("FIXME $L\n\n", rawType);
			jsSetter.addJavadoc("FIXME $L\n\n", rawType);
			javaGetter.addJavadoc("FIXME $L\n\n", rawType);
			javaSetter.addJavadoc("FIXME $L\n\n", rawType);
		}


		JSONObject jsDoc = member.optJSONObject("jsDoc");
		String jsDocText = getJsDoc(member);

		if (!jsDocText.isEmpty()) {
			jsGetter.addJavadoc("$L", renderMarkdown(jsDocText));
			javaGetter.addJavadoc("$L", renderMarkdown(jsDocText));
			if (!readonly) {
				jsSetter.addJavadoc("$L", renderMarkdown(jsDocText));
				javaSetter.addJavadoc("$L", renderMarkdown(jsDocText));
			}
		}
		interfaceBuilder.addMethod(jsGetter.build());
		classBuilder.addMethod(javaGetter.build());
		if (!readonly) {
			interfaceBuilder.addMethod(jsSetter.build());
			classBuilder.addMethod(javaSetter.build());
		}
	}

	private static String removeTypeTags(String rawType) {
		return StringUtils.removeEnd(StringUtils.removeStart(StringUtils.removeStart(rawType, "{TYPE:"),
				"{SIMPLE_TYPE:"), "}");
	}

	private static TypeName computeType(String owner, String rawType) throws IOException {
		if (rawType.endsWith("[]")) {
			return ArrayTypeName.of(computeType(owner, StringUtils.removeEnd(rawType, "[]")));
		}

		if ("number".equals(rawType) || "Number".equals(rawType)) {
			return TypeName.DOUBLE;
		} else if ("HTMLElement".equals(rawType)) {
			return ClassName.get(HTMLElement.class);
		} else if ("Event".equals(rawType)) {
			return ClassName.get(Event.class);
		} else if ("void".equals(rawType)) {
			return TypeName.VOID;
		} else if ("any".equals(rawType) || "null".equals(rawType) || "never".equals(rawType)) {
			return ClassName.get(Unknown.class);
		} else if ("boolean".equals(rawType) || "Boolean".equals(rawType)) {
			return TypeName.BOOLEAN;
		} else if ("string".equals(rawType) || "String".equals(rawType)) {
			return ClassName.get(String.class);
		} else if ("{}".equals(rawType) || "Object".equals(rawType)) {
			return ClassName.get(Unknown.class);
		} else if (rawType.startsWith("{")) {
			return buildDataObjects(owner, rawType);
		}

		System.err.println(rawType);
		//throw new UnsupportedOperationException();
		return ClassName.get(rootPackage, rawType);
	}

	private static TypeName buildDataObjects(String owner, String rawType) throws IOException {
		String className = StringUtils.capitalize(owner);
		//{ credits: { enabled: boolean; }; exporting: { enabled: boolean; }; title: { text: null; }; series:
		// never[]; xAxis: {}; yAxis: { axisGenerated: boolean; }; }
		String definition = StringUtils.removeEnd(StringUtils.removeStart(rawType, "{"), "}").trim();
		String tail = definition;

		TypeSpec.Builder builder = TypeSpec.interfaceBuilder(className)
				.addSuperinterface(Any.class)
				.addModifiers(Modifier.PUBLIC);

		while (!tail.isEmpty()) {
			// 1. Get property name (up to ':')
			String propertyName = StringUtils.substringBefore(tail, ":").trim();
			tail = StringUtils.substringAfter(tail, ":").trim();
			// 3. Get property type
			int pos = 0;
			int depth = 0;
			while (pos < tail.length()) {
				if (tail.charAt(pos) == '{') {
					depth++;
				} else if (tail.charAt(pos) == '}') {
					depth--;
				} else if (depth == 0 && (tail.charAt(pos) == ';' || tail.charAt(pos) == ',')) {
					break;
				}
				pos++;
			}
			String propertyType = tail.substring(0, pos);
			tail = tail.substring(pos + 1).trim();

			TypeName type = computeType(owner + StringUtils.capitalize(propertyName), propertyType);
			// 4. Write getters/setters
			String getterName = "get" + StringUtils.capitalize(propertyName);
			String setterName = "set" + StringUtils.capitalize(propertyName);

			if ("boolean".equals(rawType)) {
				getterName = "is" + StringUtils.capitalize(propertyName);
			}

			MethodSpec.Builder getter = MethodSpec.methodBuilder(getterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addAnnotation(JSProperty.class)
					.returns(type);

			MethodSpec.Builder setter = MethodSpec.methodBuilder(setterName)
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
					.addAnnotation(JSProperty.class)
					.addParameter(type, propertyName)
					.returns(void.class);

			if (type.toString().startsWith("js.lang.Unknown")) {
				getter.addJavadoc("FIXME $L\n\n", rawType);
				setter.addJavadoc("FIXME $L\n\n", rawType);
			}

			builder.addMethod(getter.build());
			builder.addMethod(setter.build());
		}

		JavaFile javaFile = JavaFile.builder(rootPackage, builder.build())
				.build();
		javaFile.writeTo(Paths.get(targetPath, "src", "main", "java"));

		return ClassName.get(rootPackage, className);
	}

}
