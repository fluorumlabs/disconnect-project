package com.github.fluorumlabs.disconnect;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
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
import js.lang.Symbol;
import js.lang.Unknown;
import js.util.collections.Array;
import js.util.function.JsRunnable;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
@SuppressWarnings("ALL")
@Slf4j
public class App {
	public static String rootPackage = null;

	public static String targetPath = null;

	private static final MutableDataSet flexmarkOptions = new MutableDataSet();

	private static final Parser parser;

	private static final HtmlRenderer htmlRenderer;

	private static final com.vladsch.flexmark.formatter.internal.Formatter formatter;

	private static final List<Extension> extensionList = Arrays.asList(TablesExtension.create(),
			StrikethroughExtension.create(),
			AutolinkExtension.create(),
			InsExtension.create());
	private static String sourcePath;
	private static String npmPackage;
	private static String npmVersion;
	private static String npmImportPath;
	private static String javaPackage;
	private static boolean global;
	private static boolean dryRun;

	private static Map<String,TypeSpec.Builder> CLASSES = new HashMap<>();
	private static Map<String,ClassName> CLASSNAMES = new HashMap<>();
	private static Set<String> VALID_IMPORTS = new HashSet<>();

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
		String render = htmlRenderer.render(parser.parse(StringUtils.replace(markdown,"@returns", "@return")));
		return StringUtils.replaceEach(render, new String[]{"<p>", "</p>"}, new String[]{"", "\n"});
	}

	/**
	 *
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		ArgumentParser parser = ArgumentParsers.newFor("Disconnect JS Binding Generator").build()
				.defaultHelp(true)
				.description("Generate Disconnect JS bindings from TypeScript definition files.");

		parser.addArgument("-p", "--package")
				.required(true)
				.help("Java package for generated files");

		parser.addArgument("-i", "--in")
				.required(true)
				.help("Source location of TypeScript definitions");

		parser.addArgument("-o", "--out")
				.required(true)
				.help("Target location for created Java files");

		Namespace ns = null;
		try {
			ns = parser.parseArgs(args);
		} catch (ArgumentParserException e) {
			parser.handleError(e);
			System.exit(1);
		}

		String rootPackage = ns.getString("package");
		targetPath = ns.getString("out");
		sourcePath = ns.getString("in");

		log.info("Initial pass");
		dryRun = true;
		process(ns, rootPackage);

		CLASSES.clear();

		log.info("Final pass");
		dryRun = false;
		process(ns, rootPackage);
	}

	private static void process(Namespace ns, String rootPackage) throws IOException {
		for (File in : FileUtils.listFiles(new File(ns.getString("in")), new String[]{"json"}, true)) {
			if (in.toPath().getFileName().toString().equals("package.json")) {
				JSONObject jsonObject = new JSONObject(new JSONTokener(FileUtils.openInputStream(in)));
				npmPackage = jsonObject.getString("name");
				npmVersion = "^"+jsonObject.getString("version");
				javaPackage = StringUtils.replace(StringUtils.substringAfter(npmPackage, "/"), "-",".");

				String packageStart = StringUtils.substringBefore(javaPackage, ".");
				if (rootPackage.endsWith(packageStart)) {
					javaPackage = StringUtils.substringAfter(javaPackage, ".");
				}

				if (javaPackage.isEmpty()) {
					App.rootPackage = rootPackage;
				} else {
					App.rootPackage = rootPackage + "." + javaPackage;
				}
				sourcePath = in.toPath().getParent().toString();
				log.info("Processing "+npmPackage);
				processDTs(FileUtils.listFiles(in.getParentFile(), new String[]{"d.ts"}, true));
			}
		}
	}

	private static final List<String> commentsCollector = new ArrayList<>();

	private static final Map<String, String> typeAlias = new HashMap<>();

	private static String resolveAlias(String type) {
		return typeAlias.getOrDefault(type, type);
	}

	private static void processDTs(Collection<File> dtsPath) throws IOException {
		String root = Paths.get(sourcePath).toString();
		String rootPackage = App.rootPackage;

		for (File file : dtsPath) {
			List<String> globalStrings = new ArrayList<>();

			Path path = file.toPath();
			String importFile = StringUtils.substringBefore(path.getFileName().toString(), ".");
			String pathAsString = path.getParent().toString();
			String relative = StringUtils.removeStart(pathAsString, root);

			if (npmPackage != null) {
				if("interfaces.d.ts".equals(path.getFileName().toString())) {
					npmImportPath = null;
				} else {
					npmImportPath = npmPackage + StringUtils.replaceChars(relative, "/\\", "//") + "/" + importFile + ".js";
				}
			}

			App.rootPackage = rootPackage + (relative.isEmpty()?"":StringUtils.replaceChars(relative, "/\\", ".."));

			global = false;

			List<String> strings = Files.readAllLines(path);

			ListIterator<String> stringListIterator = strings.listIterator();

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
					if (line.startsWith("{")) {
						for (String symbol : StringUtils.split(StringUtils.substringBetween(line, "{", "}"), ", ")) {
							VALID_IMPORTS.add(npmImportPath+"::"+symbol);
						}
					} else if (line.startsWith("class ")) {
						String aClass = StringUtils.removeStart(line, "class ").trim();
						VALID_IMPORTS.add(npmImportPath+"::"+extract(aClass, ";"," "));
					} else if (line.startsWith("namespace ")) {
						String aClass = StringUtils.removeStart(line, "namespace ").trim();
						VALID_IMPORTS.add(npmImportPath+"::"+extract(aClass, ";"," "));
					} else if (line.startsWith("let ") || line.startsWith("function ") || line.startsWith("const ")) {
						String aClass = skip(line, "let","function","const").trim();
						VALID_IMPORTS.add(npmImportPath+"::"+extract(aClass, ";"," "));
					}
				}
				if (line.startsWith("class ") || line.startsWith("interface ") || line.startsWith("namespace ")) {
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
				} else if (line.endsWith("}")) {
					continue;
				} else if (line.startsWith("import ")) {
					continue;
				} else if (line.startsWith("{") && (line.endsWith("};") || line.contains("} from "))){
					continue;
				} else if (line.startsWith("global ")){
					continue;
				} else if (line.startsWith("module ")){
					continue;
				} else {
					log.warn("Unknown syntax: {}",line);
				}

				imports.clear();
			}

			global = true;

			if ( !globalStrings.isEmpty()) {
				globalStrings.add("}");
				processClass("class " + StringUtils.capitalize(toCamelCase(importFile)) + " {", globalStrings.listIterator());
			}

			imports.clear();
		}
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

			TypeSpec.Builder builder = TypeSpec.interfaceBuilder(typeName+"Fn")
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
				TypeName parameterType = parameter.types.size() == 1 ? parameter.types.iterator().next() :
						ClassName.get(Unknown.class);
				method.addParameter(parameterType, StringUtils.removeStart(parameter.name, "..."));
			}
			builder.addMethod(method.build());
			if (enclosing != null) {
				enclosing.addType(builder.addModifiers(Modifier.STATIC).build());
				return ClassName.bestGuess(typeName+"Fn");
			} else {
				if (!dryRun) {
					JavaFile file = JavaFile.builder(rootPackage, builder.build())
							.build();
					file.writeTo(Paths.get(targetPath, "src", "main", "java"));
				}
				return ClassName.get(rootPackage, typeName+"Fn");
			}
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
				return ClassName.bestGuess(typeName);
			} else {
				if (!dryRun) {
					JavaFile file = JavaFile.builder(rootPackage, builder.build())
							.build();
					file.writeTo(Paths.get(targetPath, "src", "main", "java"));
				}
				return ClassName.get(rootPackage, typeName);
			}
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
				return ClassName.bestGuess(typeName);
			} else {
				if (!dryRun) {
					JavaFile file = JavaFile.builder(rootPackage, builder.build())
							.build();
					file.writeTo(Paths.get(targetPath, "src", "main", "java"));
				}
				return ClassName.get(rootPackage, typeName);
			}
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

	private static final Set<String> imports = new HashSet<>();

	private static void addNpmImports(TypeSpec.Builder builder) {

		if (npmPackage != null && npmVersion != null && npmImportPath != null && !imports.isEmpty()) {
			builder.addAnnotation(AnnotationSpec.builder(NpmPackage.class)
					.addMember("name", "$S", npmPackage)
					.addMember("version", "$S", npmVersion)
					.build());

			String importedSymbols = imports.stream().map(s -> "\"" + s + "\"")
					.collect(Collectors.joining(", "));
			builder.addAnnotation(AnnotationSpec.builder(Import.class)
					.addMember("symbols", "{$L}", importedSymbols)
					.addMember("module", "$S", npmImportPath)
					.build());
		}
	}

	private static TypeName processClass(String line, ListIterator<String> stringListIterator) throws IOException {
		boolean constructorAdded = false;

		while (!line.contains("{") && stringListIterator.hasNext()) {
			line = line +" " + stringListIterator.next();
		}
		String class_ = skip(line, "class", "interface","namespace");
		String className = extract(class_, "extends", "implements", "{");
		String heritage = extract(skip(class_, className), "{");

		boolean isNamespace = line.trim().startsWith("namespace");
		boolean isClass = line.trim().startsWith("class") || className.endsWith("Constructor") || className.endsWith("Element");

		if ((isClass || isNamespace) && npmImportPath != null && !global && VALID_IMPORTS.contains(npmImportPath+"::"+className)) {
			imports.add(className);
		}

		String genericSignature = "";

		if (className.contains("<")) {
			// generic
			genericSignature = className;
			className = extract(genericSignature, "<");
			genericSignature = skip(genericSignature, className, "<");
		}

		log.trace("Processing class " + className);

		boolean classExists = CLASSES.containsKey(className);

		TypeSpec.Builder builder = CLASSES.computeIfAbsent(className, cn -> TypeSpec.interfaceBuilder(cn).addModifiers(Modifier.PUBLIC));

		while (!genericSignature.isEmpty()) {
			String part = extract(genericSignature, ",", ">");
			genericSignature = skip(genericSignature, part, ",", ">");
			String typeIdentifier = extract(part, "=");
			part = skip(part, typeIdentifier, "=");

			builder.addTypeVariable(TypeVariableName.get(typeIdentifier, Any.class));
		}


		boolean hasHeritage = false;
		while (!heritage.isEmpty()) {
			heritage = skip(heritage, "extends", "implements", "{", ",", "(", ")");
			String name = extract(heritage, "extends", "implements", "{", ",", "(", ")");
			heritage = skip(heritage, name);
			if (!name.isEmpty()) {
				hasHeritage = true;
				builder.addSuperinterface(resolveType(name, className));
			}
		}
		if (!hasHeritage && !classExists) {
			builder.addSuperinterface(Any.class);
		}
		if (!commentsCollector.isEmpty()) {
			builder.addJavadoc("$L", renderMarkdown(String.join("\n", commentsCollector)));
			commentsCollector.clear();
		}

		while (stringListIterator.hasNext()) {
			String nextLine = stringListIterator.next().trim();

			if (nextLine.startsWith("constructor(") && nextLine.endsWith(");")) {
				String s = StringUtils.substringBetween(nextLine, "constructor(", ");");
				nextLine = "new("+s+"):"+className+";";
			}
			String jsOverride = "";
			if (extractJsDoc(nextLine, stringListIterator)) {
				continue;
			}

			if (nextLine.startsWith("private")) {
				continue;
			}
			if (nextLine.contains("extends new (")) {
				continue;
			}
			boolean readOnly = false;
			if (nextLine.startsWith("let ") || nextLine.startsWith("const ")) {
				nextLine = skip(nextLine, "let", "const");
				String identifier = extract(nextLine, ":");
				nextLine = "static " + identifier + "()" + skip(nextLine, identifier);
				jsOverride = "return " + className + "_" + identifier;
				if (!VALID_IMPORTS.contains(npmImportPath+"::"+(global?identifier:className))) {
					continue;
				}
				imports.add((global?identifier:className) + " as " + className + "_" + identifier);
			}
			if (nextLine.startsWith("function ")) {
				nextLine = "static " + skip(nextLine, "function");
			}
			if (nextLine.startsWith("readonly ")) {
				readOnly = true;
				nextLine = skip(nextLine, "readonly");
			}
			if (nextLine.startsWith("}")) {
				if (!"HTMLElementTagNameMap".equals(className) && (!builder.build().toString().contains("{\n}") || !global)) {
					if ((isClass || isNamespace || constructorAdded) && npmImportPath != null && !dryRun) {
						if (!isNamespace && !constructorAdded && !global && VALID_IMPORTS.contains(npmImportPath+"::"+className)) {
							imports.add(className);

							AnnotationSpec script = AnnotationSpec.builder(JSBody.class)
									.addMember("script", "$S", "return new " + className + "()")
									.build();

							builder.addMethod(MethodSpec.methodBuilder("create")
									.addModifiers(Modifier.STATIC, Modifier.PUBLIC)
									.returns(ClassName.get(rootPackage, className))
									.addAnnotation(script)
									.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
											" " +
											"in " +
											"JavaScript")
									.build());
						}

						addNpmImports(builder);
					}
					if (!dryRun) {
						JavaFile file = JavaFile.builder(rootPackage, builder.build())
								.build();
						file.writeTo(Paths.get(targetPath, "src", "main", "java"));
					} else {
						CLASSNAMES.put(className, ClassName.get(rootPackage, className));
					}
					return ClassName.get(rootPackage, className);
				} else {
					return ClassName.bestGuess(className);
				}
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
				if (identifier.startsWith("_")) {
					continue;
				}
				if (nextLine.endsWith("|null") || nextLine.endsWith("| null")) {
				    nullable = true;
                }

				nextLine = resolveAlias(nextLine);

				Set<TypeName> valueTypeNames = new HashSet<>();
				valueTypeNames.addAll(processUnionType(nextLine, className + StringUtils.capitalize(identifier) +
						"Value"));

				if (valueTypeNames.isEmpty()) {
					String fakeValue = StringUtils.replaceChars(StringUtils.capitalize(identifier),"-\"'","_");
					String fakeValueType = "type " + fakeValue + " = " + nextLine + ";";
					TypeName newType = processType(fakeValueType, new ArrayList<String>().listIterator(), builder);

					if (newType != null) {
						valueTypeNames.add(newType);
					} else {
						valueTypeNames.add(resolveType(nextLine, className + StringUtils.replaceChars(StringUtils.capitalize(identifier),"-\"'","_") +
								"Value"));
					}
				}

				MethodSpec.Builder getter = MethodSpec.methodBuilder("get" + StringUtils.replaceChars(StringUtils.capitalize(identifier),"-\"'","_"))
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
							if (!nullable) {
								builder.addMethod(MethodSpec.methodBuilder("set" + StringUtils.replaceChars(StringUtils.capitalize(identifier),"-\"'","_"))
										.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
										.addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
												identifier).build())
										.addParameter(valueTypeName, "value")
										.addJavadoc("$L", javaDoc)
										.build());
							} else {
								builder.addMethod(MethodSpec.methodBuilder("set" + StringUtils.replaceChars(StringUtils.capitalize(identifier),"-\"'","_"))
										.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
										.addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
												identifier).build())
										.addParameter(valueTypeName.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
										.addJavadoc("$L", javaDoc)
										.build());
							}
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

				if (identifier.endsWith("?")) {
					identifier = StringUtils.stripEnd(identifier, "?");
				}

				boolean isStatic = false;
				String jsMethod = "";
				if (identifier.startsWith("static ")) {
					identifier = StringUtils.removeStart(identifier, "static ");
					if (jsOverride.isEmpty()) {
						if (global) {
							if (!VALID_IMPORTS.contains(npmImportPath+"::"+identifier)) {
								continue;
							}
							imports.add(identifier + " as " + className + "_" + identifier);
							jsMethod = className + "_" + identifier;
						} else {
							if (!VALID_IMPORTS.contains(npmImportPath+"::"+className)) {
								continue;
							}
							imports.add(className);
							jsMethod = className + "." + identifier;
						}
					}
					isStatic = true;
				} else if (identifier.equals("new")) {
					identifier = "create";
					jsMethod = "new " + className;
					constructorAdded = true;
					isStatic = true;
					if (!VALID_IMPORTS.contains(npmImportPath+"::"+className)) {
						continue;
					}
					imports.add(className);
				}

				String genericMethodSignature = "";

				if (identifier.startsWith("_")) {
					continue;
				}

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
					returnTypeNames.add(CLASSNAMES.getOrDefault(className,ClassName.bestGuess(className)));
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

				if (SourceVersion.isKeyword(identifier)) {
					identifier = "do"+StringUtils.capitalize(identifier);
				}

				for (List<Parameter> parameterList : paramList) {
					boolean hasVarArgs = false;
					Parameter lastParameter = null;
					if (!parameterList.isEmpty()) {
						lastParameter = parameterList.get(parameterList.size() - 1);
						hasVarArgs = lastParameter.name.startsWith("...");
					}

					if (isStatic && jsMethod.startsWith("new ") && hasVarArgs) {
						jsMethod = StringUtils.removeStart(jsMethod, "new ");
					}

					MethodSpec.Builder method = MethodSpec.methodBuilder(StringUtils.defaultString(identifier,
							"apply"))
							.addModifiers(Modifier.PUBLIC)
							.addJavadoc("$L", javaDoc)
							.returns(returnTypeNames.size() == 1 ? returnTypeNames.iterator().next() :
									ClassName.get(Unknown.class));

					method.varargs(hasVarArgs && !parameterList.isEmpty());

					if (isStatic || hasVarArgs) {
						AnnotationSpec.Builder jsbodyBuilder = AnnotationSpec.builder(JSBody.class);
						if (isStatic) {
							method.addModifiers(Modifier.STATIC);
						} else {
							method.addModifiers(Modifier.ABSTRACT);
						}

						if (!parameterList.isEmpty()) {
							jsbodyBuilder.addMember("params", "{$L}",
									parameterList.stream().map(s -> "\"" + StringUtils.removeStart(s.name, "...") + "\"").collect(Collectors.joining(
											", ")));
						}

						StringBuilder jsBodyBuilder = new StringBuilder();

						if ((returnTypeNames.size() == 1 ? returnTypeNames.iterator().next() :
								ClassName.get(Unknown.class)) != TypeName.VOID) {
							jsBodyBuilder.append("return ");
							if (!isStatic) {
								jsBodyBuilder.append("this.");
							}
						}

						if (hasVarArgs) {
							if (parameterList.size() > 1) {
								jsBodyBuilder.append(jsMethod).append(".apply(").append(isStatic?"null":"this").append(", [");
							} else {
								jsBodyBuilder.append(jsMethod).append(".apply(").append(isStatic?"null":"this").append(", ");
							}
						} else {
							jsBodyBuilder.append(jsMethod).append("(");
						}

						boolean shouldAddComma = false;
						for (Parameter parameter : parameterList) {
							if (shouldAddComma) {
								if (hasVarArgs && parameter.name.equals(lastParameter.name)) {
									jsBodyBuilder.append("].concat(");
								} else {
									jsBodyBuilder.append(", ");
								}
							}
							jsBodyBuilder.append(StringUtils.removeStart(parameter.name, "..."));

							shouldAddComma = true;
						}

						if (!hasVarArgs || parameterList.size()==1) {
							jsBodyBuilder.append(")");
						} else {
							jsBodyBuilder.append("))");
						}

						if (!jsOverride.isEmpty()) {
							jsbodyBuilder.addMember("script", "$S", jsOverride);
						} else {
							jsbodyBuilder.addMember("script", "$S", jsBodyBuilder.toString());
						}

						method.addAnnotation(jsbodyBuilder.build());

						if (isStatic) {
							method.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
									" " +
									"in " +
									"JavaScript");

						}
					} else {
						method.addModifiers(Modifier.ABSTRACT);
					}

					for (Parameter parameter : parameterList) {
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
				log.warn("Unknown syntax: {}",nextLine);
			}
		}
		throw new UnsupportedOperationException();
	}

	private static TypeName resolveType(String name, String context) throws IOException {
		if (CLASSNAMES.containsKey(name)) {
			return CLASSNAMES.get(name);
		}

		name = removeOuterBrackets(name);
		name = StringUtils.remove(name, "|null");
		name = StringUtils.remove(name, "| null");
		name = StringUtils.remove(name, "|undefined");
		name = StringUtils.remove(name, "| undefined");
		name = resolveAlias(name);
		if (StringUtils.startsWithAny(name,"'","\"") || ((name.contains("|") || name.contains("=>")) && (name.indexOf('|') < name.indexOf('<') || !name.contains("<")) && !name.startsWith(
				"[") && !name.startsWith("{"))) {
			String fakeValue =
					StringUtils.removeEnd(context + "Type", "ValueType");
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
				return TypeName.INT;
			case "any":
			case "Object":
			case "object":
				return ClassName.get(Any.class);
			case "Function":
				return ClassName.get(JsRunnable.class);
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
			return processClass("interface " + context + " {\n",
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


}
