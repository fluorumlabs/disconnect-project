package com.github.fluorumlabs.disconnect;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.SlotComponentList;
import com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils;
import com.github.fluorumlabs.disconnect.core.observables.Observable;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.*;
import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.ext.autolink.AutolinkExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension;
import com.vladsch.flexmark.ext.ins.InsExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.formatter.internal.Formatter;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;
import javax.lang.model.SourceVersion;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.StringUtils.*;

/**
 * Hello world!
 */
@SuppressWarnings("ALL")
@Slf4j
public class App {
    private static final Set<String> POLYMER_IGNORED_PROPERTIES = new HashSet<>(
            Arrays.asList(
                    "$",
                    "PROPERTY_EFFECT_TYPES",
                    "importPath",
                    "root",
                    "rootPath",

                    "domHost",
                    "is",
                    "isAttached"
            ));

    private static final Set<String> IGNORED_PROPERTIES = new HashSet<>(
            Arrays.asList(
                    "dir"
            ));

    private static final Set<String> POLYMER_IGNORED_METHODS = new HashSet<>(
            Arrays.asList(
                    "create(tag, props)",
                    "finalize()",
                    "created()",
                    "ready()",

                    "addPropertyEffect(property, type, effect)",
                    "attributeNameForProperty(property)",
                    "bindTemplate(template)",
                    "createComputedProperty(property, expression, dynamicFn)",
                    "createMethodObserver(expression, dynamicFn)",
                    "createNotifyingProperty(property)",
                    "createObservers(observers, dynamicFns)",
                    "createProperties(props)",
                    "createPropertiesForAttributes()",
                    "createPropertyObserver(property, method)",
                    "createReadOnlyProperty(property, protectedSetter)",
                    "createReflectedProperty(property)",

                    "get(path, root)",
                    "linkPaths(to, from)",
                    "notifyPath(path, value)",
                    "notifySplices(path, splices)",
                    "pop(path)",
                    "push(path, items)",
                    "set(path, value, root)",
                    "shift(path)",
                    "splice(path, start, deleteCount, items)",
                    "unshift(path, items)",

                    "resolveUrl(url, base)",
                    "setProperties(props, setReadOnly)",
                    "typeForProperty(name)",
                    "unlinkPaths(path)",
                    "updateStyles(properties)",

                    "$$(slctr)",
                    "arrayDelete(arrayOrPath, item)",
                    "async(callback, waitTime)",
                    "cancelAsync(handle)",
                    "cancelDebouncer(jobName)",
                    "chainObject(object, prototype)",
                    "debounce(jobName, callback)",
                    "attached()",
                    "attributeChanged(name, old, value)",
                    "deserialize(value, type)",
                    "detached()",
                    "distributeContent()",
                    "elementMatches(selector, node)",
                    "extend(prototype, api)",
                    "fire(type, detail, options)",
                    "flushDebouncer(jobName)",
                    "getComputedStyleValue(property)",
                    "getContentChildNodes(slctr)",
                    "getContentChildren(slctr)",
                    "getEffectiveChildNodes()",
                    "getEffectiveChildren()",
                    "getEffectiveTextContent()",
                    "instanceTemplate(template)",
                    "isDebouncerActive(jobName)",
                    "isLightDescendant(node)",
                    "isLocalDescendant(node)",
                    "listen(node, eventName, methodName)",
                    "mixin(target, source)",
                    "queryAllEffectiveChildren(selector)",
                    "queryDistributedElements(selector)",
                    "queryEffectiveChildren(selector)",
                    "reflectPropertyToAttribute(property, attribute, value)",
                    "removeAttribute(name)",
                    "scopeSubtree(container, shouldObserve)",
                    "serialize(value)",
                    "serializeValueToAttribute(value, attribute, node)",
                    "setAttribute(name, value)",
                    "setScrollDirection(direction, node)",
                    "toggleAttribute(name, bool)",
                    "toggleClass(name, bool, node)",
                    "transform(transformText, node)",
                    "translate3d(x, y, z, node)",
                    "unlisten(node, eventName, methodName)"
                    ));

    private static final Set<String> IGNORED_METHODS = new HashSet<>(
            Arrays.asList(
            ));

    private static final MutableDataSet flexmarkOptions = new MutableDataSet();
    private static final Parser parser;
    private static final HtmlRenderer htmlRenderer;
    private static final com.vladsch.flexmark.formatter.internal.Formatter formatter;
    private static final List<Extension> extensionList = Arrays.asList(TablesExtension.create(),
            StrikethroughExtension.create(),
            AutolinkExtension.create(),
            InsExtension.create());
    private final static String NPM = isWindows() ? "npm.cmd" : "npm";
    private final static String NPX = isWindows() ? "npx.cmd" : "npx";
    private final static String WCA = isWindows() ? "wca.cmd" : "wca";

    static {
        flexmarkOptions.set(FlexmarkHtmlParserPatched.BR_AS_EXTRA_BLANK_LINES, false);

        parser = Parser.builder(flexmarkOptions).extensions(extensionList).build();
        htmlRenderer = HtmlRenderer.builder(flexmarkOptions).extensions(extensionList).build();
        formatter = Formatter.builder(flexmarkOptions).extensions(extensionList).build();
    }

    private final String javaPackage;
    private final String jsPackage;
    private final String npmPackageToInstall;
    private final Path root;
    private final Path out;
    private final Path tempDirectory;
    private final boolean quiet;

    public App(String javaPackage, String jsPackage, String npmPackageToInstall, Path root, Path out, Path tempDirectory, boolean quiet) {
        this.javaPackage = javaPackage;
        this.jsPackage = jsPackage;
        this.npmPackageToInstall = npmPackageToInstall;
        this.root = root;
        this.out = out;
        this.tempDirectory = tempDirectory;
        this.quiet = quiet;
    }

    /**
     *
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        ArgumentParser parser = ArgumentParsers.newFor("Disconnect WCA Binding Generator").build()
                .defaultHelp(true)
                .description("Generate Disconnect custom components from Web Component Analyzer markdown files.");

        parser.addArgument("-jp", "--javapackage")
                .required(true)
                .help("Java package for generated files");

        parser.addArgument("-jsp", "--jspackage")
                .required(true)
                .help("Java package for generated files for elements");

        parser.addArgument("-i", "--install")
                .required(true)
                .help("NPM package to install");

        parser.addArgument("-r", "--root")
                .required(false)
                .help("Where to start looking for components (relative to node_modules)");

        parser.addArgument("-o", "--out")
                .required(true)
                .help("Target location for created Java files");

        parser.addArgument("-q", "--quiet")
                .action(Arguments.storeTrue())
                .help("Suppress NPM output");

        Namespace ns = null;
        try {
            ns = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        Path tempDirectory = Files.createTempDirectory("wca");

        App app = new App(ns.getString("javapackage"),
                ns.getString("jspackage"),
                ns.getString("install"),
                Paths.get(defaultString(ns.getString("root"), ".")),
                Paths.get(ns.getString("out")),
                tempDirectory,
                ns.getBoolean("quiet")
                );

        try {
            app.run();
        } catch (Exception e) {
            log.error("Operation failed", e);
        }
    }

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
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

    private void runCommand(String commandLine, Path root) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder(split(commandLine))
                .directory(root.toFile())
                .redirectErrorStream(true);

        if (!quiet) {
            builder.inheritIO();
        }

        Process process = builder.start();

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new IllegalStateException(String.format("Error running `npm %s`: exited with code %d", commandLine, exitCode));
        }
    }

    private void runNpm(String commandLine, Path root) throws IOException, InterruptedException {
        runCommand(NPM + " " + commandLine, root);
    }

    private void runNpx(String commandLine, Path root) throws IOException, InterruptedException {
        runCommand(NPX + " " + commandLine, root);
    }

    private void runWca(String commandLine, Path root) throws IOException, InterruptedException {
        runCommand(WCA + " " + commandLine, root);
    }

    private void run() throws IOException, InterruptedException {
        log.info("Disconnect WCA Binding Generator");
        log.info("Initializing NPM...");
        runNpm("init -y", tempDirectory);

        log.info("Installing {}...", npmPackageToInstall);
        runNpm("install " + npmPackageToInstall, tempDirectory);
        tempDirectory.resolve("node_modules").toFile().renameTo(tempDirectory.resolve("modules").toFile());

        List<NpmModule> npmModules = discoverNpmModules();
        log.info("Discovered {} modules", npmModules.size());

        for (NpmModule npmModule : npmModules) {
            processModule(npmModule);
        }
    }

    private void processModule(NpmModule npmModule) throws IOException, InterruptedException {
        List<String> javaPackageParts = new ArrayList<>(Arrays.asList(split(javaPackage, '.')));
        List<String> jsPackageParts = new ArrayList<>(Arrays.asList(split(jsPackage, '.')));

        List<String> subPackage = new ArrayList<>(Arrays.asList(split(remove(replaceChars(npmModule.getName(), "-", "_"), '@'), "/\\")));
        if (subPackage.size() == 2) {
            if (subPackage.get(0).equals(subPackage.get(1))) {
                subPackage.remove(1);
            } else {
                subPackage.set(1, replace(removeStart(subPackage.get(1), subPackage.get(0)), "_", ""));
            }
        }

        javaPackageParts.addAll(subPackage);
        jsPackageParts.addAll(subPackage);

        log.info("{}@{} -> {}", npmModule.getName(), npmModule.getVersion(), String.join(".", javaPackageParts));

        Map<String, Path> jsFiles = new HashMap<>();
        for (File jsFile : FileUtils.listFiles(npmModule.getPath().toFile(), new String[]{("js")}, true)) {
            Path jsFilePath = npmModule.getPath().relativize(jsFile.toPath());
            String jsFileName = substringBeforeLast(jsFilePath.getFileName().toString(), ".");
            jsFiles.put(jsFileName, jsFilePath);
        }

        runNpm("update", npmModule.getPath());
        runWca("analyze **/*.js -f md --outFiles {filename}.jwca", npmModule.getPath());
        runWca("analyze **/*.d.ts -f md --outFiles {filename}.twca", npmModule.getPath());

        Path javaRoot = out.resolve(Paths.get("src", "main", "java"));
        Path javaPackageRoot = javaRoot.resolve(String.join(File.separator, javaPackageParts));
        Path jsPackageRoot = javaRoot.resolve(String.join(File.separator, jsPackageParts));

        Set<String> visited = new HashSet<>();

        processWcaDefinitions(npmModule, javaPackageParts, javaPackageRoot, jsPackageParts, jsPackageRoot, jsFiles, visited, "jwca", ".jwca");
        processWcaDefinitions(npmModule, javaPackageParts, javaPackageRoot, jsPackageParts, jsPackageRoot, jsFiles, visited, "twca", ".d.twca");
    }

    private final static Pattern TAG = Pattern.compile("([a-z0-9]+-)+[a-z0-9]+");

    private void processWcaDefinitions(NpmModule npmModule, List<String> javaPackageParts, Path javaPackageRoot, List<String> jsPackageParts, Path jsPackageRoot, Map<String, Path> jsFiles, Set<String> visited, String twca, String s) throws IOException {
        for (File wcaFile : FileUtils.listFiles(npmModule.getPath().toFile(), new String[]{(twca)}, true)) {
            String jsFileName = removeEnd(wcaFile.toPath().getFileName().toString(), s);
            if (visited.add(jsFileName)) {
                Document wca = Jsoup.parse(htmlRenderer.render(parser.parse(FileUtils.readFileToString(wcaFile))));

                // Isolate components
                Map<String, Element> components = new HashMap<>();
                Element currentComponent = new Element("div");
                String currentTagName = "";

                for (Element child : wca.body().children()) {
                    if (child.tagName().equals("h1") && TAG.matcher(child.text()).matches()) {
                        currentTagName = child.text();
                        currentComponent = new Element("div");
                        components.put(currentTagName, currentComponent);
                    } else {
                        currentComponent.appendChild(child);
                    }
                }

                for (Map.Entry<String, Element> component : components.entrySet()) {
                    if (!component.getKey().isEmpty()) {
                        processComponent(npmModule, javaPackageParts, javaPackageRoot, jsPackageParts, jsPackageRoot, jsFiles.get(jsFileName), component.getKey(), component.getValue());
                    }
                }
            }
        }
    }

    private void processComponent(NpmModule npmModule, List<String> javaPackageParts, Path javaPackageRoot, List<String> jsPackageParts, Path jsPackageRoot, Path importPath, String tagName, Element content) throws IOException {
        log.info("... <{}>", tagName);
        boolean polymer = content.select("td code:contains($)").first() != null;

        javaPackageRoot.toFile().mkdirs();
        jsPackageRoot.toFile().mkdirs();

        List<String> subPackage = new ArrayList<>(Arrays.asList(split(remove(replaceChars(npmModule.getName(), "-", "_"), '@'), "/\\")));

        String strippedTagName;
        if (subPackage.contains(substringBefore(tagName, "-"))) {
            strippedTagName = substringAfter(tagName, "-");
        } else {
            strippedTagName = tagName;
        }
        String className = capitalize(CamelCaseUtils.toCamelCase(strippedTagName));

        Path elementClass = jsPackageRoot.resolve(className + "Element.java");
        Path componentClass = javaPackageRoot.resolve(className + ".java");

        CompilationUnit elementCU = null;
        CompilationUnit componentCU = null;
        ClassOrInterfaceDeclaration element = null;
        ClassOrInterfaceDeclaration component = null;

        if (elementClass.toFile().exists()) {
            try {
                elementCU = StaticJavaParser.parse(elementClass.toFile());
                element = elementCU.getInterfaceByName(className + "Element").orElse(null);
            } catch (ParseProblemException ignore) {
                log.warn("Error parsing {}: overwriting", String.join(".", jsPackageParts) + "." + className + "Element");
            }
        }
        if (componentClass.toFile().exists()) {
            try {
                componentCU = StaticJavaParser.parse(componentClass.toFile());
                component = componentCU.getClassByName(className).orElse(null);
            } catch (ParseProblemException ignore) {
                log.warn("Error parsing {}: overwriting", String.join(".", javaPackageParts) + "." + className);
            }
        }
        if (element == null) {
            elementCU = new CompilationUnit();
            elementCU.addImport(Nullable.class);
            elementCU.addImport(JSProperty.class);
            elementCU.addImport(JSMethod.class);
            elementCU.setPackageDeclaration(String.join(".", jsPackageParts));
            element = elementCU.addInterface(className + "Element", Modifier.Keyword.PUBLIC)
                    .addExtendedType(HTMLElement.class);
        }
        if (component == null) {
            ClassOrInterfaceType parent = StaticJavaParser.parseClassOrInterfaceType(HtmlComponent.class.getSimpleName());
            parent.setTypeArguments(StaticJavaParser.parseClassOrInterfaceType(className + "Element"));

            componentCU = new CompilationUnit();
            componentCU.setPackageDeclaration(String.join(".", javaPackageParts));
            componentCU.addImport(HtmlComponent.class);
            componentCU.addImport(Component.class);
            componentCU.addImport(ComponentList.class);
            componentCU.addImport(Nullable.class);
            componentCU.addImport(Observable.class);
            componentCU.addImport(ObservableValue.class);
            componentCU.addImport(ObservableEvent.class);
            componentCU.addImport(Event.class);
            componentCU.addImport(String.join(".", jsPackageParts) + "." + className + "Element");
            component = componentCU.addClass(className, Modifier.Keyword.PUBLIC).addExtendedType(parent);

            ClassOrInterfaceType componentsType = StaticJavaParser.parseClassOrInterfaceType(Component.class.getSimpleName());

            BlockStmt ctor1 = new BlockStmt();
            ctor1.addStatement(StaticJavaParser.parseExplicitConstructorInvocationStmt("super(textContent);"));

            BlockStmt ctor2 = new BlockStmt();
            ctor2.addStatement(StaticJavaParser.parseExplicitConstructorInvocationStmt("super(components);"));

            ClassOrInterfaceType anyComponent = StaticJavaParser.parseClassOrInterfaceType(Component.class.getSimpleName());
            anyComponent.setTypeArguments(new WildcardType());

            component.addConstructor(Modifier.Keyword.PUBLIC);
            component.addConstructor(Modifier.Keyword.PUBLIC)
                    .addParameter(String.class, "textContent")
                    .setBody(ctor1);
            ConstructorDeclaration varArgConstructor = component.addConstructor(Modifier.Keyword.PUBLIC);
            Parameter components = varArgConstructor.addAndGetParameter(anyComponent, "components");
            components.setVarArgs(true);
            varArgConstructor.setBody(ctor2);

            component.addAndGetAnnotation(CustomElement.class)
                    .addPair("tagName", new StringLiteralExpr(tagName))
                    .addPair("external", new BooleanLiteralExpr(true));

        }

        ClassOrInterfaceDeclaration elementFinal = element;
        ClassOrInterfaceDeclaration componentFinal = component;

        element.getAnnotationByClass(NpmPackage.class).ifPresent(annotationExpr -> annotationExpr.remove());
        element.addAndGetAnnotation(NpmPackage.class)
                .addPair("name", new StringLiteralExpr(npmModule.getName()))
                .addPair("version", new StringLiteralExpr("^" + npmModule.getVersion()));

        element.getAnnotationByClass(Import.class).ifPresent(annotationExpr -> annotationExpr.remove());
        element.addAndGetAnnotation(Import.class)
                .addPair("module", new StringLiteralExpr(npmModule.getName() + "/" + replaceChars(importPath.toString(),'\\','/')));

        Set<String> visitedAttributes = new HashSet<>();
        Set<String> visitedSetters = new HashSet<>();
        Set<String> visitedSignatures = new HashSet<>();

        if (!content.select("h2:contains(Methods)").isEmpty()) {
            extractMethods(content, element, component, visitedAttributes, visitedSetters, visitedSignatures, polymer);
        }

        if (!content.select("h2:contains(Properties)").isEmpty()) {
            extractProperties(content, element, component, visitedAttributes, visitedSetters, visitedSignatures, polymer);
        }

        if (!content.select("h2:contains(Attributes)").isEmpty()) {
            extractAttributes(content, element, component, visitedAttributes, visitedSetters, visitedSignatures, polymer);
        }

        if (!content.select("h2:contains(Events)").isEmpty()) {
            extractEvents(content, element, component, visitedAttributes, visitedSetters, visitedSignatures, polymer);
        }

        if (!content.select("h2:contains(Slots)").isEmpty()) {
            extractSlots(content, element, component, visitedAttributes, visitedSetters, visitedSignatures, polymer);
        }

        element.removeJavaDocComment();
        component.removeJavaDocComment();

        element.setJavadocComment(replaceEach(content.html(), new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));
        component.setJavadocComment(replaceEach(content.html(), new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));

        String elementClassText = elementCU.toString();
        String componentClassText = componentCU.toString();

        // Remove deleted API
        for (Comment orphanComment : element.getOrphanComments()) {
            String marker = orphanComment.getContent().trim();
            if (!visitedSignatures.contains(marker)) {
                elementClassText = markForDeprecation(elementClassText, marker);
            }
        }
        for (Comment orphanComment : component.getOrphanComments()) {
            String marker = orphanComment.getContent().trim();
            if (!visitedSignatures.contains(marker)) {
                componentClassText = markForDeprecation(componentClassText, marker);
            }
        }

        FileUtils.writeStringToFile(elementClass.toFile(), elementClassText, StandardCharsets.UTF_8);
        FileUtils.writeStringToFile(componentClass.toFile(), componentClassText, StandardCharsets.UTF_8);
    }

    private String markForDeprecation(String componentClassText, String marker) {
        String pattern = Pattern.quote("// "+marker)+"([\\s\\r\\n]*(\\/\\*\\*(.*?)\\*\\/))?";
        Pattern compiledPattern = Pattern.compile(pattern, Pattern.MULTILINE + Pattern.DOTALL);
        return compiledPattern.matcher(componentClassText).replaceAll("@Deprecated");
    }

    private void extractProperties(Element content, ClassOrInterfaceDeclaration element, ClassOrInterfaceDeclaration component, Set<String> visitedAttributes, Set<String> visitedSetters, Set<String> visitedSignatures, boolean polymer) {
        Map<String, Integer> columnPositions = new HashMap<>();

        Element table = content.select("h2:contains(Properties)").first().nextElementSibling();

        Elements headers = table.select("thead th");
        for (int i = 0; i < headers.size(); i++) {
            columnPositions.put(headers.get(i).text(), i);
        }

        for (Element row : table.select("tbody tr")) {
            Elements cells = row.select("td");
            String propertyName = cells.get(columnPositions.get("Property")).text();

            if (propertyName.startsWith("_") || (polymer && POLYMER_IGNORED_PROPERTIES.contains(propertyName)) || IGNORED_PROPERTIES.contains(propertyName)) {
                continue;
            }

            Optional<String> description = Optional.ofNullable(columnPositions.get("Description"))
                    .map(cells::get)
                    .map(Element::html)
                    .map(s -> replaceEach(s, new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));
            Optional<String> defaultValue = Optional.ofNullable(columnPositions.get("Default"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .filter(((Predicate<String>) String::isEmpty).negate());
            Optional<String> attribute = Optional.ofNullable(columnPositions.get("Attribute"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .filter(((Predicate<String>) String::isEmpty).negate());
            Optional<String> type = Optional.ofNullable(columnPositions.get("Type"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .map(s -> replace(s, "\\|", "|"))
                    .filter(((Predicate<String>) String::isEmpty).negate());
            Optional<String> modifiers = Optional.ofNullable(columnPositions.get("Modifiers"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .filter(((Predicate<String>) String::isEmpty).negate());

            attribute.ifPresent(visitedAttributes::add);

            Type actualType = type.map(this::parseType).orElse(StaticJavaParser.parseClassOrInterfaceType("unknown"));
            boolean isReadonly = modifiers.map(m -> m.contains("readonly")).orElse(false);
            boolean isBoolean = actualType.toPrimitiveType().filter(primitiveType -> primitiveType.getType() == PrimitiveType.Primitive.BOOLEAN).isPresent();

            String getterName = isBoolean ? "is" + capitalize(propertyName) : "get" + capitalize(propertyName);
            String setterName = "set" + capitalize(propertyName);

            MethodDeclaration elementGetter = new MethodDeclaration().setName(getterName);
            elementGetter.setType(actualType);
            elementGetter.setBody(null);
            description.ifPresent(elementGetter::setJavadocComment);
            elementGetter.addAnnotation(new SingleMemberAnnotationExpr(new Name("JSProperty"), new StringLiteralExpr(propertyName)));

            MethodDeclaration elementSetter = new MethodDeclaration().setName(setterName);
            elementSetter.setType(new VoidType());
            elementSetter.setBody(null);
            elementSetter.addParameter(actualType, "value");
            description.ifPresent(elementSetter::setJavadocComment);
            elementSetter.addAnnotation(new SingleMemberAnnotationExpr(new Name("JSProperty"), new StringLiteralExpr(propertyName)));

            String getterMarker = "!wca! get " + propertyName + ": " + type.orElse("?");
            String setterMarker = "!wca! set " + propertyName + ": " + type.orElse("?");
            String observeMarker = "!wca! observe " + propertyName + ": " + type.orElse("?");

            if (element.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(getterMarker))) {
                element.addOrphanComment(new LineComment(getterMarker));
                element.addMember(elementGetter);
                visitedSignatures.add(getterMarker);
            }

            if (!isReadonly && !visitedSetters.contains(setterName)) {
                if (element.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(setterMarker))) {
                    element.addOrphanComment(new LineComment(setterMarker));
                    element.addMember(elementSetter);
                    visitedSignatures.add(setterMarker);
                }
            }

            MethodDeclaration componentGetter = new MethodDeclaration().setName(getterName);
            componentGetter.setModifiers(Modifier.Keyword.PUBLIC);
            componentGetter.setType(actualType);
            componentGetter.setBody(StaticJavaParser.parseBlock("{ return getElement()." + getterName + "(); }"));
            description.ifPresent(componentGetter::setJavadocComment);

            MethodDeclaration componentSetter = new MethodDeclaration().setName(setterName);
            componentSetter.setModifiers(Modifier.Keyword.PUBLIC);
            componentSetter.setType(new VoidType());
            componentSetter.setBody(StaticJavaParser.parseBlock("{ getElement()." + setterName + "(value); }"));
            componentSetter.addParameter(actualType, "value");
            description.ifPresent(componentSetter::setJavadocComment);

            ClassOrInterfaceType observableValueType = StaticJavaParser.parseClassOrInterfaceType(ObservableValue.class.getSimpleName());
            observableValueType.setTypeArguments(getBoxedType(actualType));

            ClassOrInterfaceType observableType = StaticJavaParser.parseClassOrInterfaceType(Observable.class.getSimpleName());
            observableType.setTypeArguments(getBoxedType(actualType));

            String observableName = propertyName;
            if (SourceVersion.isKeyword(observableName)) {
                observableName = observableName + "Value";
            }

            MethodDeclaration observableValueGetter = new MethodDeclaration().setName(observableName);
            observableValueGetter.setModifiers(Modifier.Keyword.PUBLIC);
            observableValueGetter.setType(observableValueType);
            observableValueGetter.setBody(StaticJavaParser.parseBlock("{ return createObservableValue(this::" + getterName + ", this::" + setterName + ", \"" + CamelCaseUtils.toKebabCase(propertyName) + "-changed\"); }"));
            description.ifPresent(observableValueGetter::setJavadocComment);

            MethodDeclaration observableGetter = new MethodDeclaration().setName(observableName);
            observableGetter.setModifiers(Modifier.Keyword.PUBLIC);
            observableGetter.setType(observableType);
            observableGetter.setBody(StaticJavaParser.parseBlock("{ return createObservable(this::" + getterName + ", \"" + CamelCaseUtils.toKebabCase(propertyName) + "-changed\"); }"));
            description.ifPresent(observableGetter::setJavadocComment);

            if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(getterMarker))) {
                component.addOrphanComment(new LineComment(getterMarker));
                component.addMember(componentGetter);
            }
            visitedSignatures.add(getterMarker);

            if (!isReadonly && !visitedSetters.contains(setterName)) {
                if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(setterMarker))) {
                    component.addOrphanComment(new LineComment(setterMarker));
                    component.addMember(componentSetter);
                }
                visitedSignatures.add(setterMarker);
                visitedSetters.add(setterName);
            }

            if (polymer) {
                if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(observeMarker))) {
                    component.addOrphanComment(new LineComment(observeMarker));
                    if (isReadonly) {
                        component.addMember(observableGetter);
                    } else {
                        component.addMember(observableValueGetter);
                    }
                }
                visitedSignatures.add(observeMarker);
            }
        }

        table.previousElementSibling().remove();
        table.remove();
    }

    private void extractEvents(Element content, ClassOrInterfaceDeclaration element, ClassOrInterfaceDeclaration component, Set<String> visitedAttributes, Set<String> visitedSetters, Set<String> visitedSignatures, boolean polymer) {
        Map<String, Integer> columnPositions = new HashMap<>();
        Element table = content.select("h2:contains(Events)").first().nextElementSibling();
        Elements headers = table.select("thead th");
        for (int i = 0; i < headers.size(); i++) {
            columnPositions.put(headers.get(i).text(), i);
        }

        for (Element row : table.select("tbody tr")) {
            Elements cells = row.select("td");
            String eventName = cells.get(columnPositions.get("Event")).text();
            Optional<String> description = Optional.ofNullable(columnPositions.get("Description"))
                    .map(cells::get)
                    .map(Element::html)
                    .map(s -> replaceEach(s, new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));
            Optional<String> type = Optional.ofNullable(columnPositions.get("Detail"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .map(s -> replace(s, "\\|", "|"))
                    .filter(((Predicate<String>) String::isEmpty).negate());

            String javaEventName = CamelCaseUtils.toCamelCase(eventName) + "Event";
            String eventMarker = "!wca! event " + eventName + ": " + type.orElse("?");

            ClassOrInterfaceType observableType = StaticJavaParser.parseClassOrInterfaceType(ObservableEvent.class.getSimpleName());
            observableType.setTypeArguments(StaticJavaParser.parseClassOrInterfaceType(Event.class.getSimpleName()));

            MethodDeclaration observableEventGetter = new MethodDeclaration().setName(javaEventName);
            observableEventGetter.setModifiers(Modifier.Keyword.PUBLIC);
            observableEventGetter.setType(observableType);
            observableEventGetter.setBody(StaticJavaParser.parseBlock("{ return createEvent(\"" + eventName + "\"); }"));
            description.ifPresent(observableEventGetter::setJavadocComment);

            if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(eventMarker))) {
                component.addOrphanComment(new LineComment(eventMarker));
                component.addMember(observableEventGetter);
            }
            visitedSignatures.add(eventMarker);
        }

        table.previousElementSibling().remove();
        table.remove();
    }

    private void extractSlots(Element content, ClassOrInterfaceDeclaration element, ClassOrInterfaceDeclaration component, Set<String> visitedAttributes, Set<String> visitedSetters, Set<String> visitedSignatures, boolean polymer) {
        Map<String, Integer> columnPositions = new HashMap<>();
        Element table = content.select("h2:contains(Slots)").first().nextElementSibling();
        Elements headers = table.select("thead th");
        for (int i = 0; i < headers.size(); i++) {
            columnPositions.put(headers.get(i).text(), i);
        }

        for (Element row : table.select("tbody tr")) {
            Elements cells = row.select("td");
            String slotName = cells.get(columnPositions.get("Name")).text().trim();
            Optional<String> description = Optional.ofNullable(columnPositions.get("Description"))
                    .map(cells::get)
                    .map(Element::html)
                    .map(s -> replaceEach(s, new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));

            String javaSlotName = CamelCaseUtils.toCamelCase(defaultIfBlank(slotName, "default")) + "Slot";
            String slotMarker = "!wca! slot " + slotName;

            ClassOrInterfaceType slotType = StaticJavaParser.parseClassOrInterfaceType(ComponentList.class.getSimpleName());
            slotType.setTypeArguments(new WildcardType());

            VariableDeclarator slotVar = new VariableDeclarator(slotType, javaSlotName);
            ObjectCreationExpr expr = new ObjectCreationExpr();
            expr.setType(SlotComponentList.class);
            expr.setDiamondOperator();
            expr.addArgument(new MethodCallExpr("getElement"));
            expr.addArgument(new StringLiteralExpr(slotName));

            slotVar.setInitializer(expr);

            FieldDeclaration slotField = new FieldDeclaration();
            slotField.setModifiers(Modifier.Keyword.PRIVATE, Modifier.Keyword.FINAL);
            slotField.addVariable(slotVar);

            MethodDeclaration slotGetter = new MethodDeclaration().setName(javaSlotName);
            slotGetter.setModifiers(Modifier.Keyword.PUBLIC);
            slotGetter.setType(slotType);
            slotGetter.setBody(StaticJavaParser.parseBlock("{ return this." + javaSlotName + "; }"));
            description.ifPresent(slotGetter::setJavadocComment);

            if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(slotMarker))) {
                component.addOrphanComment(new LineComment(slotMarker));
                component.addMember(slotField);
                component.addMember(slotGetter);
            }
            visitedSignatures.add(slotMarker);
        }

        table.previousElementSibling().remove();
        table.remove();
    }

    private void extractAttributes(Element content, ClassOrInterfaceDeclaration element, ClassOrInterfaceDeclaration component, Set<String> visitedAttributes, Set<String> visitedSetters, Set<String> visitedSignatures, boolean polymer) {
        Map<String, Integer> columnPositions = new HashMap<>();
        Element table = content.select("h2:contains(Attributes)").first().nextElementSibling();
        Elements headers = table.select("thead th");
        for (int i = 0; i < headers.size(); i++) {
            columnPositions.put(headers.get(i).text(), i);
        }

        for (Element row : table.select("tbody tr")) {
            Elements cells = row.select("td");
            String attributeName = cells.get(columnPositions.get("Attribute")).text();
            String propertyName = CamelCaseUtils.toCamelCase(attributeName);
            Optional<String> description = Optional.ofNullable(columnPositions.get("Description"))
                    .map(cells::get)
                    .map(Element::html)
                    .map(s -> replaceEach(s, new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));
            Optional<String> defaultValue = Optional.ofNullable(columnPositions.get("Default"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .filter(((Predicate<String>) String::isEmpty).negate());
            Optional<String> type = Optional.ofNullable(columnPositions.get("Type"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .map(s -> replace(s, "\\|", "|"))
                    .filter(((Predicate<String>) String::isEmpty).negate());
            Optional<String> modifiers = Optional.ofNullable(columnPositions.get("Modifiers"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .filter(((Predicate<String>) String::isEmpty).negate());

            if ((polymer && POLYMER_IGNORED_PROPERTIES.contains(propertyName)) || IGNORED_PROPERTIES.contains(propertyName)) {
                continue;
            }

            boolean emitGetter = !visitedAttributes.contains(attributeName);
            boolean emitSetter = !visitedSetters.contains("set"+capitalize(propertyName));

            if (!emitGetter && !emitSetter) {
                continue;
            }

            Type actualType = type.map(this::parseType).orElse(StaticJavaParser.parseClassOrInterfaceType("unknown"));
            boolean isReadonly = modifiers.map(m -> m.contains("readonly")).orElse(false);
            boolean isBoolean = actualType.toPrimitiveType().filter(primitiveType -> primitiveType.getType() == PrimitiveType.Primitive.BOOLEAN).isPresent();

            String getterName = isBoolean ? "is" + capitalize(propertyName) : "get" + capitalize(propertyName);
            String setterName = "set" + capitalize(propertyName);

            String getterMarker = "!wca! get " + propertyName + ": " + type.orElse("?");
            String setterMarker = "!wca! set " + propertyName + ": " + type.orElse("?");

            MethodDeclaration componentGetter = new MethodDeclaration().setName(getterName);
            componentGetter.setModifiers(Modifier.Keyword.PUBLIC);
            componentGetter.setType(actualType);
            if (isBoolean) {
                componentGetter.setBody(StaticJavaParser.parseBlock("{ return getElement().getAttribute(\"" + attributeName + "\") != null; }"));
            } else {
                componentGetter.setBody(StaticJavaParser.parseBlock("{ return getElement().getAttribute(\"" + attributeName + "\"); }"));
            }
            description.ifPresent(componentGetter::setJavadocComment);

            MethodDeclaration componentSetter = new MethodDeclaration().setName(setterName);
            componentSetter.setModifiers(Modifier.Keyword.PUBLIC);
            componentSetter.setType(new VoidType());
            if (isBoolean) {
                componentSetter.setBody(StaticJavaParser.parseBlock("{ if (value) { getElement().setAttribute(\"" + attributeName + "\", \"\"); } else { getElement().removeAttribute(\"" + attributeName + "\"); } }"));
            } else {
                componentSetter.setBody(StaticJavaParser.parseBlock("{ getElement().setAttribute(\"" + attributeName + "\", value); }"));
            }
            componentSetter.addParameter(actualType, "value");
            description.ifPresent(componentSetter::setJavadocComment);

            if (emitGetter) {
                if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(getterMarker))) {
                    component.addOrphanComment(new LineComment(getterMarker));
                    component.addMember(componentGetter);
                }
                visitedSignatures.add(getterMarker);
            }

            if (!isReadonly && emitSetter) {
                if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(setterMarker))) {
                    component.addOrphanComment(new LineComment(setterMarker));
                    component.addMember(componentSetter);
                }
                visitedSignatures.add(setterMarker);
            }
        }

        table.previousElementSibling().remove();
        table.remove();
    }

    private void extractMethods(Element content, ClassOrInterfaceDeclaration element, ClassOrInterfaceDeclaration component, Set<String> visitedAttributes, Set<String> visitedSetters, Set<String> visitedSignatures, boolean polymer) {
        Map<String, Integer> columnPositions = new HashMap<>();
        Element table = content.select("h2:contains(Methods)").first().nextElementSibling();
        Elements headers = table.select("thead th");
        for (int i = 0; i < headers.size(); i++) {
            columnPositions.put(headers.get(i).text(), i);
        }

        for (Element row : table.select("tbody tr")) {
            Elements cells = row.select("td");
            String methodName = cells.get(columnPositions.get("Method")).text();
            Optional<String> description = Optional.ofNullable(columnPositions.get("Description"))
                    .map(cells::get)
                    .map(Element::html)
                    .map(s -> replaceEach(s, new String[]{"<p>", "</p>", "<br>"}, new String[]{"", "\n", "\n"}));
            Optional<String> type = Optional.ofNullable(columnPositions.get("Type"))
                    .map(cells::get)
                    .map(Element::text)
                    .map(String::trim)
                    .map(s -> replace(s, "\\|", "|"))
                    .filter(((Predicate<String>) String::isEmpty).negate());

            Type returnType = type.map(this::parseReturnType).orElse(StaticJavaParser.parseClassOrInterfaceType("unknown"));
            String methodMarker = "!wca! " + methodName + ": " + type.orElse("?");

            MethodDeclaration elementMethod = new MethodDeclaration().setName(methodName);
            MethodDeclaration componentMethod = new MethodDeclaration().setName(methodName);
            componentMethod.setModifiers(Modifier.Keyword.PUBLIC);
            elementMethod.setType(returnType);
            componentMethod.setType(returnType);

            StringBuilder bodyBuilder = new StringBuilder();
            StringBuilder signatureBuilder = new StringBuilder(methodName + "(");
            if (returnType.isVoidType()) {
                bodyBuilder.append("{ getElement()." + methodName + "(");
            } else {
                bodyBuilder.append("{ return getElement()." + methodName + "(");
            }

            int argCount = 0;

            if (type.filter(s -> s.startsWith("(")).isPresent()) {
                String args = substringBetween(type.get(), "(", "):");

                while (!args.isEmpty()) {
                    String arg = extract(args, ",");
                    String argName = substringBefore(arg, ":").trim();
                    String argType = substringAfter(arg, ":").trim();

                    argCount++;

                    argName = removeEnd(argName, "?");
                    argName = remove(argName, "...");

                    elementMethod.addParameter(parseType(argType), argName);
                    componentMethod.addParameter(parseType(argType), argName);

                    bodyBuilder.append(argName);
                    signatureBuilder.append(argName);

                    args = removeStart(removeStart(args, arg), ",").trim();

                    if (!args.isEmpty()) {
                        bodyBuilder.append(", ");
                        signatureBuilder.append(", ");
                    }
                }
            }

            bodyBuilder.append("); }");
            signatureBuilder.append(")");

            if (argCount == 1 && methodName.startsWith("set")) {
                visitedSetters.add(methodName);
            }

            if ((polymer && POLYMER_IGNORED_METHODS.contains(signatureBuilder.toString())) || (IGNORED_METHODS.contains(signatureBuilder.toString()))) {
                continue;
            }

            elementMethod.setBody(null);
            componentMethod.setBody(StaticJavaParser.parseBlock(bodyBuilder.toString()));

            description.ifPresent(elementMethod::setJavadocComment);
            description.ifPresent(componentMethod::setJavadocComment);
            elementMethod.addAnnotation(new SingleMemberAnnotationExpr(new Name("JSMethod"), new StringLiteralExpr(methodName)));

            if (component.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(methodMarker))) {
                component.addOrphanComment(new LineComment(methodMarker));
                component.addMember(componentMethod);
            }

            if (element.getOrphanComments().stream().noneMatch(c -> c.getContent().contains(methodMarker))) {
                element.addOrphanComment(new LineComment(methodMarker));
                element.addMember(elementMethod);
            }
            visitedSignatures.add(methodMarker);
        }

        table.previousElementSibling().remove();
        table.remove();
    }

    private Type getBoxedType(Type actualType) {
        Type clone = actualType.toPrimitiveType().<Type>map(PrimitiveType::toBoxedType).orElse(actualType).clone();
        for (AnnotationExpr annotationExpr : new ArrayList<>(clone.getAnnotations())) {
            annotationExpr.remove();
        }
        return clone;
    }

    private Type parseType(String s) {
        boolean isNullable = s.contains("| null") || s.contains("| undefined");
        s = remove(s, "| null");
        s = remove(s, "| undefined");
        s = removeStart(s, "!");
        isNullable = isNullable || s.endsWith("?");
        s = removeEnd(s, "?");
        s = s.trim();
        switch (s.toLowerCase()) {
            case "void":
                return new VoidType();
            case "number":
                return PrimitiveType.doubleType();
            case "string":
                return isNullable
                        ? StaticJavaParser.parseClassOrInterfaceType(String.class.getSimpleName()).addMarkerAnnotation("Nullable")
                        : StaticJavaParser.parseClassOrInterfaceType(String.class.getSimpleName());
            case "boolean":
                return PrimitiveType.booleanType();
            case "number[]":
                return isNullable
                        ? new ArrayType(PrimitiveType.doubleType()).addMarkerAnnotation("Nullable")
                        : new ArrayType(PrimitiveType.doubleType());
            case "string[]":
                return isNullable
                        ? new ArrayType(StaticJavaParser.parseClassOrInterfaceType(String.class.getSimpleName())).addMarkerAnnotation("Nullable")
                        : new ArrayType(StaticJavaParser.parseClassOrInterfaceType(String.class.getSimpleName()));
            case "boolean[]":
                return isNullable
                        ? new ArrayType(PrimitiveType.booleanType()).addMarkerAnnotation("Nullable")
                        : new ArrayType(PrimitiveType.booleanType());
        }

        ClassOrInterfaceType unknown = StaticJavaParser.parseClassOrInterfaceType("unknown");

        return isNullable
                ? unknown.addMarkerAnnotation("Nullable")
                : unknown;
    }

    private Type parseReturnType(String s) {
        return parseType(substringAfterLast(s, "):"));
    }

    private List<NpmModule> discoverNpmModules() throws IOException {
        List<NpmModule> npmModules = new ArrayList<>();

        for (File in : FileUtils.listFiles(tempDirectory.resolve("modules").resolve(root).normalize().toFile(), new String[]{"json"}, true)) {
            if (in.toPath().getFileName().toString().equals("package.json")) {
                JSONObject jsonObject = new JSONObject(new JSONTokener(FileUtils.openInputStream(in)));

                String npmPackage = jsonObject.getString("name");
                String npmVersion = jsonObject.getString("version");

                npmModules.add(new NpmModule(npmPackage, npmVersion, in.toPath().getParent()));
            }
        }

        return npmModules;
    }


}
