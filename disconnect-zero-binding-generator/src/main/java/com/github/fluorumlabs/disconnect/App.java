package com.github.fluorumlabs.disconnect;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.zero.component.*;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import com.squareup.javapoet.*;
import js.lang.Any;
import js.lang.JsFunction;
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
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

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
public class App {
    public static String rootPackage = "com.github.fluorumlabs.disconnect.vaadin";
    //public static String rootPackage = "com.github.fluorumlabs.disconnect.polymer";

    public static String sourcePath = "C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit2\\zzz\\@vaadin\\";
    //public static String sourcePath = "C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit\\zzz\\@polymer\\";

    public static String targetPath = "C:\\Users\\arigy\\Documents\\Marketing\\disconnect-project\\disconnect-vaadin";
    //public static String targetPath = "C:\\Users\\arigy\\Documents\\Marketing\\disconnect-project\\disconnect-polymer";

    public static String npmPackage = "@vaadin/vaadin";
    //public static String npmPackage = "@polymer/polymer";

    public static String importRoot = "@vaadin";
    //public static String importRoot = "@polymer";

    public static String npmVersion = "15.0.0-alpha15";
    //public static String npmVersion = "3.3.1";

    private static final Pattern KEBAB_SPLIT = Pattern.compile("-");

    private static String toCamelCase(String kebabCase) {
        return StringUtils.uncapitalize(Stream.of(KEBAB_SPLIT.split(kebabCase))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining()));
    }

    /**
     * @param args
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
//        processWCA("C:\\Users\\arigy\\Documents\\Marketing\\zzz\\shit\\zzz\\@vaadin\\vaadin.json");
        processPolymer(sourcePath);
    }

    private static void processWCA(String jsonFile) throws IOException {
        String[] packageParts = rootPackage.split("\\.");
        String commonPackageClassName = StringUtils.capitalize(packageParts[packageParts.length - 1]);

        String json = String.join("\n", Files.readAllLines(Paths.get(jsonFile)));

        JSONArray analysis = new JSONArray(new JSONTokener(json));

        TypeSpec.Builder packageBuilder = TypeSpec.classBuilder(commonPackageClassName)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build());

        FieldSpec.Builder npmPackageNameField = FieldSpec.builder(String.class, "PACKAGE", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .initializer("$S", npmPackage);
        FieldSpec.Builder npmPackageVersion = FieldSpec.builder(String.class, "VERSION", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .initializer("$S", npmVersion);

        packageBuilder.addField(npmPackageNameField.build());
        packageBuilder.addField(npmPackageVersion.build());

        for (Object o : analysis) {
            JSONObject element = (JSONObject) o;
            String tagName = element.getString("tagName");
            String className = StringUtils.removeStart(StringUtils.capitalize(toCamelCase(tagName)), commonPackageClassName);
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
                    .superclass(ParameterizedTypeName.get(ClassName.get(AbstractComponent.class), ClassName.get(rootPackage + ".elements", interfaceName)))
                    .addAnnotation(packageAnnotation.build())
                    .addAnnotation(importAnnotation.build());

            MethodSpec.Builder constructor = MethodSpec.constructorBuilder()
                    .addModifiers(Modifier.PUBLIC)
                    .addStatement("super($S)", tagName);
            classBuilder.addMethod(constructor.build());

            JSONObject declaration = element.getJSONObject("declaration");
            String jsDocText = getJsDoc(declaration);

            if (!jsDocText.isEmpty()) {
                interfaceBuilder.addJavadoc("$L", jsDocText);
                classBuilder.addJavadoc("$L", jsDocText);
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

    private static void processPolymerAnalysis(String rootPath, String commonPackageClassName, JSONObject analysis, TypeSpec.Builder packageBuilder) throws IOException {
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
                    String className = StringUtils.capitalize(toCamelCase(StringUtils.substringBefore(methodName, ".")));
                    functions.computeIfAbsent(className, key -> new ArrayList<>()).add(function);
                } else {
                    String importFile = function.getJSONObject("sourceRange").getString("file");
                    String importFileName = StringUtils.substringAfterLast(importFile, "/");
                    if (StringUtils.isNotEmpty(importFileName)) {
                        String className = StringUtils.capitalize(toCamelCase(StringUtils.substringBefore(importFileName, ".")));
                        functions.computeIfAbsent(className, key -> new ArrayList<>()).add(function);
                    }
                }
            }
            for (Map.Entry<String, List<JSONObject>> stringListEntry : functions.entrySet()) {
                TypeSpec.Builder utilBuilder = TypeSpec.interfaceBuilder(stringListEntry.getKey())
                        .addSuperinterface(ClassName.get(Any.class))
                        .addModifiers(Modifier.PUBLIC);
                Map<String, Set<String>> importNames = new HashMap<>();
                stringListEntry.getValue().forEach(function -> processPolymerFunctions(rootPath, commonPackageClassName, utilBuilder, function, importNames));

                addNpmImport(commonPackageClassName, utilBuilder);
                importNames.forEach((file, names) -> {
                    AnnotationSpec importAnnotation = AnnotationSpec.builder(Import.class)
                            .addMember("symbols", "{$L}", names.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")))
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

    private static void processPolymerFunctions(String rootPath, String commonPackageClassName, TypeSpec.Builder functionBuilder, JSONObject function, Map<String, Set<String>> imports) {
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

        MethodSpec.Builder javaMethod = MethodSpec.methodBuilder(StringUtils.defaultIfEmpty(StringUtils.substringAfterLast(methodName, "."), methodName))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);

        if (StringUtils.isNotEmpty(description)) {
            javaMethod.addJavadoc("$L", description);
        }

        JSONObject returnObject = function.optJSONObject("return");
        String returnTypeRaw = returnObject == null ? "<unspecified>" : returnObject.optString("type", "<unspecified>");
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

            javaMethod.addJavadoc("\n@param $L $L", paramName, paramDescription);

            shouldAddComma = true;
        }

        jsBodyBuilder.append(")");

        AnnotationSpec.Builder jsBodyAnnotation = AnnotationSpec.builder(JSBody.class);
        if (!parameterNames.isEmpty()) {
            jsBodyAnnotation.addMember("params", "{$L}", parameterNames.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")));
        }
        jsBodyAnnotation.addMember("script", "$S", jsBodyBuilder.toString());

        javaMethod.addAnnotation(jsBodyAnnotation.build());

        javaMethod.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only in JavaScript");

        if (returnType != TypeName.VOID && returnObject != null) {
            String returnTypeDescription = returnObject.optString("description", returnObject.optString("desc", ""));

            javaMethod.addJavadoc("\n@return $L", returnTypeDescription);
        }

        functionBuilder.addMethod(javaMethod.build());
    }

    private static void processPolymerElement(String rootPath, String commonPackageClassName, JSONObject element, boolean isElement) throws IOException {
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

        String shortElementName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast(elementName, "."), elementName);
        String shortComponentName = StringUtils.defaultIfBlank(StringUtils.capitalize(toCamelCase(tagName)), "Abstract" + shortElementName);

        TypeName jsElementClass = ClassName.get(rootPackage + (isElement ? ".elements" : ".classes"), shortElementName);
        TypeName javaElementClass = ClassName.get(rootPackage, shortComponentName);

        TypeSpec.Builder jsElement = TypeSpec.interfaceBuilder(shortElementName)
                .addModifiers(Modifier.PUBLIC)
                .addSuperinterface(ClassName.get(Any.class))
                .addSuperinterface(safePolymerType(superClass));

        TypeSpec.Builder javaElement = TypeSpec.classBuilder(shortComponentName)
                .superclass(ParameterizedTypeName.get(ClassName.get(AbstractComponent.class), jsElementClass))
                .addModifiers(Modifier.PUBLIC);

        if (StringUtils.isNotBlank(tagName)) {
            javaElement.addMethod(MethodSpec.constructorBuilder().addStatement("super($S)", tagName).addModifiers(Modifier.PUBLIC).build());
        } else {
            javaElement.addModifiers(Modifier.ABSTRACT);
            javaElement.addMethod(MethodSpec.constructorBuilder().addParameter(String.class, "tagName").addStatement("super(tagName)").addModifiers(Modifier.PROTECTED).build());
        }

        JSONArray mixins = element.optJSONArray("mixins");
        if (mixins != null) {
            for (Object mixin : mixins) {
                String shortMixinName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast((String) mixin, "."), (String) mixin);
                String shortJavaMixinName = "Has" + shortMixinName;
                jsElement.addSuperinterface(ClassName.get(rootPackage + ".elements.mixins", shortMixinName));
                javaElement.addSuperinterface(ParameterizedTypeName.get(ClassName.get(rootPackage + ".mixins", shortJavaMixinName), jsElementClass, javaElementClass));
            }
        }

        if (StringUtils.isNotEmpty(description)) {
            jsElement.addJavadoc("$L", description);
            javaElement.addJavadoc("$L", description);
        }

        addNpmImport(commonPackageClassName, jsElement);
        if (importPath != null) {
            AnnotationSpec importAnnotation = AnnotationSpec.builder(Import.class)
                    .addMember("symbols", "$S", shortElementName)
                    .addMember("module", "$S", importRoot + "/" + importPath)
                    .build();
            jsElement.addAnnotation(importAnnotation);
        }

        if (element.has("staticMethods")) {
            processPolymerMethods(element.getJSONArray("staticMethods"), jsElementClass, jsElement, javaElement, elementName, shortElementName, true, javaElementClass);
        }
        if (element.has("properties")) {
            processPolymerProperties(element.getJSONArray("properties"), jsElementClass, javaElementClass, jsElement, javaElement, elementName, shortElementName, javaElementClass);
        }
        if (element.has("methods")) {
            processPolymerMethods(element.getJSONArray("methods"), jsElementClass, jsElement, javaElement, elementName, shortElementName, false, javaElementClass);
        }
        if (element.has("events")) {
            processPolymerEventsMethods(element.getJSONArray("events"), jsElement, javaElement, elementName, shortElementName, javaElementClass, jsElementClass);
        }
        if (element.has("slots")) {
            processPolymerSlotsMethods(rootPath, importPath, element.getJSONArray("slots"), jsElementClass, javaElementClass, jsElement, javaElement, elementName, shortElementName, javaElementClass);
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

    private static void processPolymerMixin(String rootPath, String commonPackageClassName, JSONObject mixin) throws IOException {
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
                .addTypeVariable(TypeVariableName.get("T", ParameterizedTypeName.get(ClassName.get(Component.class), TypeVariableName.get("E"))))
                .addSuperinterface(ParameterizedTypeName.get(ClassName.get(Component.class), TypeVariableName.get("E")))
                .addModifiers(Modifier.PUBLIC);

        JSONArray mixins = mixin.optJSONArray("mixins");
        if (mixins != null) {
            for (Object xmixin : mixins) {
                String shortXMixinName = StringUtils.defaultIfBlank(StringUtils.substringAfterLast((String) xmixin, "."), (String) xmixin);
                String shortXJavaMixinName = "Has" + shortXMixinName;
                jsMixin.addSuperinterface(ClassName.get(rootPackage + ".elements.mixins", shortXMixinName));
                javaMixin.addSuperinterface(ParameterizedTypeName.get(ClassName.get(rootPackage + ".mixins", shortXJavaMixinName), TypeVariableName.get("E"), TypeVariableName.get("T")));
            }
        }

        if (StringUtils.isNotEmpty(description)) {
            jsMixin.addJavadoc("$L", description);
            javaMixin.addJavadoc("$L", description);
        }

        addNpmImport(commonPackageClassName, jsMixin);
        if (importPath != null) {
            AnnotationSpec importAnnotation = AnnotationSpec.builder(Import.class)
                    .addMember("symbols", "$S", shortMixinName)
                    .addMember("module", "$S", importRoot + "/" + importPath)
                    .build();
            jsMixin.addAnnotation(importAnnotation);
        }

        processPolymerMethods(mixin.getJSONArray("staticMethods"), jsMixinClass, jsMixin, javaMixin, mixinName, shortMixinName, true, javaReturnType);
        processPolymerProperties(mixin.getJSONArray("properties"), jsMixinClass, javaMixinClass, jsMixin, javaMixin, mixinName, shortMixinName, javaReturnType);
        processPolymerMethods(mixin.getJSONArray("methods"), jsMixinClass, jsMixin, javaMixin, mixinName, shortMixinName, false, javaReturnType);
        processPolymerEventsMethods(mixin.getJSONArray("events"), jsMixin, javaMixin, mixinName, shortMixinName, javaReturnType, jsMixinClass);
        processPolymerSlotsMethods(rootPath, importPath, mixin.getJSONArray("slots"), jsMixinClass, javaMixinClass, jsMixin, javaMixin, mixinName, shortMixinName, javaReturnType);

        JavaFile.builder(rootPackage + ".elements.mixins", jsMixin.build())
                .indent("\t")
                .build()
                .writeTo(Paths.get(targetPath, "src", "main", "java"));

        JavaFile.builder(rootPackage + ".mixins", javaMixin.build())
                .indent("\t")
                .build()
                .writeTo(Paths.get(targetPath, "src", "main", "java"));
    }

    private static void processPolymerSlotsMethods(String rootPath, String importPath, JSONArray slots, TypeName jsMixinClass, TypeName javaMixinClass, TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin, String mixinName, String shortMixinName, TypeName javaReturnType) throws IOException {
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
            javaMixin.addSuperinterface(ClassName.get(HasSlots.class));
        } else if (!(javaReturnType instanceof TypeVariableName)) {
            javaMixin.addSuperinterface(ParameterizedTypeName.get(ClassName.get(HasComponents.class),
                    jsMixinClass, javaReturnType, ParameterizedTypeName.get(ClassName.get(Component.class), WildcardTypeName.subtypeOf(Object.class))
            ));
        }

        for (Object oSlot : slots) {
            JSONObject slot = (JSONObject) oSlot;
            String slotName = slot.getString("name");
            String slotMethodNameBase = toCamelCase(slotName);
            String description = slot.optString("description");

            MethodSpec.Builder slotted = MethodSpec.methodBuilder(slotMethodNameBase)
                    .addModifiers(Modifier.PUBLIC)
                    .returns(HasSlots.Container.class)
                    .addStatement("return slotted($S)", slotName);

            if (!description.isEmpty()) {
                slotted.addJavadoc("$L", description);
            }

            if (javaReturnType instanceof TypeVariableName) {
                slotted.addModifiers(Modifier.DEFAULT);
            }

            javaMixin.addMethod(slotted.build());
        }
    }

    private static void processPolymerEventsMethods(JSONArray events, TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin, String mixinName, String shortMixinName, TypeName javaClass, TypeName jsClass) {
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
                javaEvent.addJavadoc("$L", description);
            }

            javaMixin.addMethod(javaEvent.build());
        }
    }

    private static void processPolymerProperties(JSONArray properties, TypeName jsMixinClass, TypeName javaMixinClass, TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin, String mixinName, String shortMixinName, TypeName javaReturnType) {
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
            MethodSpec.Builder javaSetterMethod = MethodSpec.methodBuilder(SourceVersion.isKeyword(propertyName) ? setterName : propertyName)
                    .addModifiers(Modifier.PUBLIC);
            MethodSpec.Builder javaGetterMethod = MethodSpec.methodBuilder(SourceVersion.isKeyword(propertyName) ? getterName : propertyName)
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
                argType = ArrayTypeName.of(arrayType.componentType.annotated(AnnotationSpec.builder(JSByRef.class).build()));
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
                jsGetterMethod.addJavadoc("$L", description);
                jsSetterMethod.addJavadoc("$L", description);
                javaGetterMethod.addJavadoc("$L", description);
                javaSetterMethod.addJavadoc("$L", description);
            }

            javaGetterMethod.addStatement("return getNode().$L()", getterName);
            javaSetterMethod.addStatement("getNode().$L($L)", setterName, SourceVersion.isKeyword(propertyName) ? "value" : propertyName);

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

    private static void processPolymerMethods(JSONArray methods, TypeName jsMixinClass, TypeSpec.Builder jsMixin, TypeSpec.Builder javaMixin, String mixinName, String shortMixinName, boolean isStatic, TypeName javaElementClass) {
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
                jsMethod.addAnnotation(AnnotationSpec.builder(JSMethod.class).addMember("name", "$S", originalMethodName).build());
            }

            if (StringUtils.isNotEmpty(description)) {
                jsMethod.addJavadoc("$L", description);
                javaMethod.addJavadoc("$L", description);
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
            String returnTypeRaw = returnObject == null ? "<unspecified>" : returnObject.optString("type", "<unspecified>");
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
            jsBodyBuilder.append(shortMixinName).append('.').append(originalMethodName).append("(");
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
                    jsMethod.addJavadoc("\nFIXME param $L: $L", paramName, paramRawType);
                    javaMethod.addJavadoc("\nFIXME param $L: $L", paramName, paramRawType);
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

                jsMethod.addJavadoc("\n@param $L $L", paramName, paramDescription);
                javaMethod.addJavadoc("\n@param $L $L", paramName, paramDescription);

                shouldAddComma = true;
            }

            jsBodyBuilder.append(")");
            javaBodyBuilder.append(")");

            if (isStatic) {
                javaMethod.addStatement(javaBodyBuilder.toString(), jsMixinClass);

                AnnotationSpec.Builder jsBodyAnnotation = AnnotationSpec.builder(JSBody.class);
                if (!parameterNames.isEmpty()) {
                    jsBodyAnnotation.addMember("params", "{$L}", parameterNames.stream().map(s -> "\"" + s + "\"").collect(Collectors.joining(", ")));
                }
                jsBodyAnnotation.addMember("script", "$S", jsBodyBuilder.toString());

                jsMethod.addAnnotation(jsBodyAnnotation.build());

                jsMethod.addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only in JavaScript");
            } else {
                javaMethod.addStatement(javaBodyBuilder.toString());
            }

            if (returnType != TypeName.VOID && returnObject != null) {
                String returnTypeDescription = returnObject.optString("desc", "");

                jsMethod.addJavadoc("\n@return $L", returnTypeDescription);
                javaMethod.addJavadoc("\n@return $L", returnTypeDescription);
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
        //{ credits: { enabled: boolean; }; exporting: { enabled: boolean; }; title: { text: null; }; series: never[]; xAxis: {}; yAxis: { axisGenerated: boolean; }; }
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

    private static void processMethod(JSONObject method, TypeSpec.Builder interfaceBuilder, TypeSpec.Builder classBuilder, String interfaceName, String className) throws IOException {
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
            TypeName type = computeType(className + StringUtils.capitalize(methodName) + StringUtils.capitalize(argumentName), argumentParts[1]);

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
            jsMethod.addJavadoc("$L", jsDocText);
            javaMethod.addJavadoc("$L", jsDocText);
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


    private static void processEvent(JSONObject event, TypeSpec.Builder interfaceBuilder, TypeSpec.Builder classBuilder, String interfaceName, String className) throws IOException {
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

    private static void processProperty(JSONObject member, TypeSpec.Builder interfaceBuilder, TypeSpec.Builder classBuilder, String interfaceName, String className) throws IOException {
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
            jsGetter.addJavadoc("$L", jsDocText);
            javaGetter.addJavadoc("$L", jsDocText);
            if (!readonly) {
                jsSetter.addJavadoc("$L", jsDocText);
                javaSetter.addJavadoc("$L", jsDocText);
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
        return StringUtils.removeEnd(StringUtils.removeStart(StringUtils.removeStart(rawType, "{TYPE:"), "{SIMPLE_TYPE:"), "}");
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
        //{ credits: { enabled: boolean; }; exporting: { enabled: boolean; }; title: { text: null; }; series: never[]; xAxis: {}; yAxis: { axisGenerated: boolean; }; }
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
