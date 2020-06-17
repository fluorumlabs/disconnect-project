package com.github.fluorumlabs.disconnect;

import com.squareup.javapoet.*;
import js.extras.JsEnum;
import js.lang.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import static com.github.fluorumlabs.disconnect.GlobalContext.*;

/**
 * Created by Artem Godin on 6/2/2020.
 */
@Getter
@Slf4j
public class Module {
    private final GlobalContext context;
    private final String npmPackage;
    private final String npmVersion;
    private final String npmImport;
    private final Path path;
    private final Path definition;
    private final Path npmRoot;
    private final String javaPackage;
    private final String rootClassName;
    private final List<String> exportedSymbols = new ArrayList<>();
    private String content;
    private String javaDoc = "";

    public Module(GlobalContext context, String npmPackage, String npmVersion, Path npmRoot, Path definition, Path module, String content) {
        this.context = context;
        this.npmPackage = npmPackage;
        this.npmVersion = npmVersion;
        this.path = module;
        this.definition = definition;
        this.npmRoot = npmRoot;

        String rootAsString = npmRoot.toString();
        String npmImportAsString = StringUtils.replace(module.toString(), ".d.ts", ".js");
        String npmParentAsString = module.getParent().toString();
        npmImport = StringUtils.replaceChars(StringUtils.removeStart(npmImportAsString, rootAsString), "/\\", "//");

        String npmParent = StringUtils.replaceChars(StringUtils.removeStart(npmParentAsString, rootAsString), "/\\", "//");
        String[] split = StringUtils.split(npmPackage + npmParent, "@/");
        for (int i = 0; i < split.length; i++) {
            split[i] = StringUtils.replaceChars(split[i].toLowerCase(), "-", "_");
        }

        List<String> packageParts = new ArrayList<>(Arrays.asList(StringUtils.split(context.getGlobalPackage(), ".")));
        for (String s : split) {
            if (!packageParts.contains(s) && !"src".equals(s) && !"dist".equals(s) && !"lib".equals(s)) {
                packageParts.add(s);
            }
        }

        javaPackage = String.join(".", packageParts);

        String fileName = StringUtils.split(module.getFileName().toString(), ".")[0];
        rootClassName = StringUtils.capitalize(toCamelCase(fileName));

        this.content = context.reduce(content);
    }

    public void registerSubmodules() {
        List<String> tokens = Arrays.asList(StringUtils.split(content, " "));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "declare", "module", GlobalContext.STRING_TOKEN, null, FIGURE_TOKEN, null)) {
                // We're at string constant
                String moduleName = context.resolve(itr.next()) + ".js";
                itr.next(); // skip {
                String content = context.resolve(itr.next());

                context.registerModule(new Module(context, npmPackage, npmVersion, npmRoot, definition, definition.getParent().resolve(moduleName).normalize(), content));
            } else {
                itr.next();
            }
        }
    }

    public void registerExports() {
        List<String> tokens = Arrays.asList(StringUtils.split(content, " "));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "export", FIGURE_TOKEN, null)) {
                // We're at string constant
                for (String value : StringUtils.split(context.resolve(itr.next()), ",")) {
                    context.getExports().put(value.trim(), this);
                }
            } if (is(itr, "export", "default")) {
                String symbol = itr.next();
                context.getExports().put("?" + symbol, this);
            } else if (is(itr, "export", "declare", "function", null)
            || is(itr, "export", "declare", "class", null)
            || is(itr, "export", "declare", "interface", null)
            || is(itr, "export", "declare", "const", null)
            || is(itr, "export", "function", null)
            || is(itr, "export", "class", null)
            || is(itr, "export", "interface", null)
            || is(itr,"export","const",null)) {
                context.getExports().put(itr.next(), this);
            } else {
                itr.next();
            }
        }

    }

    private void preprocessScope(String scope) {
        List<String> tokens = new ArrayList<>(Arrays.asList(StringUtils.split(scope, " ")));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "class") || is(itr, "interface") || is(itr, "namespace")) {
                preprocessScopeDefinition(itr);
            } else if (is(itr, "type")) {
                preprocessTypeDefinition(itr);
            } else {
                itr.next();
            }
        }
    }

    private void preprocessTypeDefinition(ListIterator<String> itr) {
        String typeName = itr.next();
        while (itr.hasNext()) {
            String next = itr.next();
            if ("=".equals(next)) {
                StringBuilder sb = new StringBuilder();
                while (itr.hasNext()) {
                    String next2 = itr.next();
                    if (";".equals(next2)) {
                        String trim = sb.toString().trim();

                        List<String> variants = Arrays.asList(StringUtils.split(trim, "|"));
                        boolean hasNumbers = false;
                        boolean hasStrings = false;
                        boolean hasOthers = false;

                        for (String variant : variants) {
                            if (StringUtils.isNumeric(variant.trim())) {
                                hasNumbers = true;
                            } else if (variant.trim().startsWith(STRING_TOKEN)) {
                                hasStrings = true;
                            } else if (!"string".equals(variant.trim()) && !"number".equals(variant.trim())
                                    && !"boolean".equals(variant.trim())
                                    && !"null".equals(variant.trim()) && !"undefined".equals(variant.trim())) {
                                hasOthers = true;
                            }

                        }

                        if (hasStrings || hasNumbers && !hasOthers) {
                            processEnum(null, typeName, variants);
                        } else {
                            context.getUnions().put(typeName, variants);
                        }
                        return;
                    } else {
                        sb.append(next2).append(" ");
                    }
                }

                return;
            }
        }
    }

    private TypeName processEnum(Interface parent, String typeName, List<String> variants) {
        Interface enumClass = new Interface();
        enumClass.setParentModule(this);
        enumClass.setClassName(parent == null ? ClassName.get(javaPackage, typeName) : parent.getClassName().nestedClass(typeName));
        enumClass.setRequiresConstructor(false);
        enumClass.setBuildable(false);

        TypeSpec.Builder builder = TypeSpec.classBuilder(enumClass.getClassName());
        enumClass.setBuilder(builder);

        builder.addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.ABSTRACT);
        builder.superclass(JsEnum.class);
        enumClass.setSuperInterfaces(Collections.singleton("*"));

        for (String variant : variants) {
            String value = variant.trim();
            if (StringUtils.isNumeric(value)) {
                String rawValue = value.startsWith("-") ? "MINUS_" + value.substring(1) : value;
                builder.addField(FieldSpec.builder(enumClass.getClassName(), "VALUE_" + rawValue.toUpperCase().replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.of($L)", JsEnum.class, value)
                        .build());
            } else if (value.startsWith(STRING_TOKEN)) {
                String rawValue = context.resolve(value.substring(2));
                builder.addField(FieldSpec.builder(enumClass.getClassName(), rawValue.toUpperCase().replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.of($S)", JsEnum.class, rawValue)
                        .build());
            } else if ("string".equals(value)) {
                builder.addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(String.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            } else if ("number".equals(value)) {
                builder.addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(int.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            } else if ("boolean".equals(value)) {
                builder.addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(boolean.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            }
        }

        if (parent == null) {
            context.getInterfaces().put(typeName, enumClass);
        } else {
            parent.getInnerInterfaces().add(enumClass);
        }

        return enumClass.getClassName();
    }

    private void preprocessScopeDefinition(ListIterator<String> itr) {
        String className = itr.next();
        Interface iface = context.getInterfaces().computeIfAbsent(className, cn -> {
            Interface anInterface = new Interface();
            anInterface.setParentModule(this);
            return anInterface;
        });
        context.getInterfaces().put(className, iface);
        if (iface.getClassName() == null) {
            iface.setJsClassName(className);
            iface.setClassName(ClassName.get(javaPackage, StringUtils.capitalize(className)));
        }

        upto(itr, "extends", "implements", FIGURE_TOKEN);
        while (itr.hasNext()) {
            String superIface = upto(itr, "extends", "implements", ",", ROUND_TOKEN, FIGURE_TOKEN);
            if (!superIface.isEmpty()) {
                iface.getSuperInterfaces().add(superIface);
            }

            if (is(itr, ROUND_TOKEN)) {
                injectTokenContent(itr);
                continue;
            } else if (is(itr, "extends") || is(itr, "implements") || is(itr, ",")) {
                continue;
            } else if (is(itr, FIGURE_TOKEN)) {
                itr.previous();
                break;
            }
        }
    }

    public void preprocessModule() {
        preprocessScope(content);
    }

    public void processModule() {
        // Extract known classnames and type aliases
        List<String> tokens = Arrays.asList(StringUtils.split(content, " "));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (skipToken(itr, ";")
                    || skipToken(itr, "declare", "global", FIGURE_TOKEN, null)
                    || skipToken(itr, "declare", "module", STRING_TOKEN, null, FIGURE_TOKEN, null)
                    || skipToken(itr, "export", FIGURE_TOKEN, null, "from", STRING_TOKEN, null)
                    || skipToken(itr, "export", FIGURE_TOKEN, null)
                    || skipToken(itr, "import", FIGURE_TOKEN, null, "from", STRING_TOKEN, null)
                    || skipToken(itr, "import", "*", "as", null, "from", STRING_TOKEN, null)) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "declare", "class")
                    || is(itr, "export", "declare", "class")
                    || is(itr, "export", "class")
                    || is(itr, "class")
                    || is(itr, "export", "declare", "interface")
                    || is(itr, "declare", "interface")
                    || is(itr, "export", "interface")
                    || is(itr, "interface")) {
                processClass(itr);
            } else if (is(itr, "declare", "type")
                    || is(itr, "export", "type")
                    || is(itr, "export", "declare", "type")
                    || is(itr, "export", "default")
                    || is(itr, "import")
                    || is(itr, "type")) {
                upto(itr, ";");
            } else if (is(itr, "declare", "namespace")
                    || is(itr, "export", "namespace")
                    || is(itr, "namespace")) {
                Interface iface = context.getInterfaces().computeIfAbsent(rootClassName, cn -> {
                    Interface anInterface = new Interface();
                    anInterface.setParentModule(this);
                    return anInterface;
                });
                context.getInterfaces().put(rootClassName, iface);
                if (iface.getClassName() == null) {
                    iface.setClassName(ClassName.get(javaPackage, StringUtils.capitalize(rootClassName)));
                }

                TypeSpec.Builder builder = iface.getBuilder();
                if (builder == null) {
                    builder = TypeSpec.interfaceBuilder(iface.getClassName());
                    iface.setBuilder(builder);

                    builder.addModifiers(Modifier.PUBLIC);
                }

                iface.setBuildable(false);
                iface.setRequiresConstructor(false);

                processNamespace(itr, iface);
            } else if (is(itr, "declare", "function")
                    || is(itr, "export", "declare", "function")
                    || is(itr, "export", "function")
                    || is(itr, "function")) {
                processStaticFunction(itr, false, null);
            } else if (is(itr, "declare", "const")) {
                processStaticConst(itr, false, null);
            } else {
                fail(itr);
            }
        }
    }

    private void processStaticConst(ListIterator<String> itr, boolean ignoreExport, Interface parent) {
        Interface iface = parent == null ? context.getInterfaces().computeIfAbsent(rootClassName, cn -> {
            Interface anInterface = new Interface();
            anInterface.setParentModule(this);
            return anInterface;
        }) : parent;
        if ( parent == null ) {
            context.getInterfaces().put(rootClassName, iface);
            if (iface.getClassName() == null) {
                iface.setClassName(ClassName.get(javaPackage, StringUtils.capitalize(rootClassName)));
            }
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        TypeSpec.Builder builder = iface.getBuilder();
        if (builder == null) {
            builder = TypeSpec.interfaceBuilder(iface.getClassName());
            iface.setBuilder(builder);

            builder.addModifiers(Modifier.PUBLIC);
        }

        iface.setBuildable(false);
        iface.setRequiresConstructor(false);

        String propertyName = itr.next();
        skipToken(itr, ":");
        String type = upto(itr, ";");

        if (propertyName.startsWith("_")) {
            return;
        }

        List<String> expandedTypes = expandTypes(type);

        TypeName getterType = ClassName.get(Unknown.class);
        if (expandedTypes.size() == 1) {
            getterType = resolve(expandedTypes.get(0), StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), iface);
        }

        if (context.getExports().containsKey(propertyName)) {
            // Ok to import
            iface.getSymbols().add(propertyName);

            String jsMethodName = iface.getClassName().simpleName() + "_" + propertyName;

            MethodSpec.Builder getter = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + jsMethodName).build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);

            if (!savedJavaDoc.isEmpty()) {
                getter.addJavadoc("$L", savedJavaDoc);
            }

            iface.getBuilder().addMethod(getter.build());
        } else if (context.getExports().containsKey("?"+propertyName)) {
            // Ok to import
            iface.getSymbols().add("?"+propertyName);

            String jsMethodName = iface.getClassName().simpleName() + "_" + propertyName;

            MethodSpec.Builder getter = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + jsMethodName).build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);

            if (!savedJavaDoc.isEmpty()) {
                getter.addJavadoc("$L", savedJavaDoc);
            }

            iface.getBuilder().addMethod(getter.build());
        } else if (ignoreExport) {
            // Ok to import
            String jsMethodName = "this." + propertyName;

            MethodSpec.Builder getter = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + jsMethodName).build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);

            if (!savedJavaDoc.isEmpty()) {
                getter.addJavadoc("$L", savedJavaDoc);
            }


            iface.getBuilder().addMethod(getter.build());
        }

        javaDoc = "";

    }

    private void processClass(ListIterator<String> itr) {
        String className = itr.next();
        Interface anInterface = context.getInterfaces().get(className);
        TypeSpec.Builder builder = anInterface.getBuilder();
        if (builder == null) {
            builder = TypeSpec.interfaceBuilder(anInterface.getClassName());
            anInterface.setBuilder(builder);

            builder.addModifiers(Modifier.PUBLIC);

            TypeSpec.Builder builderBuilder;

            if (is(itr, ANGLE_TOKEN)) {
                builderBuilder = createBuilderBuilder(anInterface);
                String genericSignature = context.resolve(itr.next());
                processClassGenericSignature(anInterface.getBuilder(), genericSignature);
                processClassGenericSignature(anInterface.getBuilderBuilder(), genericSignature);
                anInterface.setBuilderClassName(getBuilderType(anInterface.getClassName().nestedClass("Builder"), genericSignature));
                populateBuilderBuilder(anInterface, genericSignature);
            } else {
                builderBuilder = createBuilderBuilder(anInterface);
                populateBuilderBuilder(anInterface, "");
            }

            if (!javaDoc.isEmpty()) {
                builder.addJavadoc("$L", javaDoc);
                builderBuilder.addJavadoc("$L", javaDoc);
                javaDoc = "";
            }
        }
        upto(itr, FIGURE_TOKEN);
        if (is(itr, FIGURE_TOKEN)) {
            processClassBody(anInterface, context.resolve(itr.next()));
        }

        javaDoc = "";
    }

    private TypeSpec.Builder createBuilderBuilder(Interface anInterface) {
        anInterface.setBuilderClassName(anInterface.getClassName().nestedClass("Builder"));
        TypeSpec.Builder builderBuilder = TypeSpec.classBuilder(anInterface.getClassName().nestedClass("Builder"))
                .addModifiers(Modifier.STATIC, Modifier.PUBLIC);

        anInterface.setBuilderBuilder(builderBuilder);

        return builderBuilder;
    }

    private void populateBuilderBuilder(Interface anInterface, String genericSignature) {
        TypeName objectType = getBuilderType(anInterface.getClassName(), genericSignature);

        anInterface.getBuilderBuilder().addField(FieldSpec.builder(objectType, "object", Modifier.PRIVATE, Modifier.FINAL)
                .initializer("$T.empty()", Any.class).build());

        anInterface.getBuilderBuilder().addMethod(MethodSpec.methodBuilder("build")
                .addModifiers(Modifier.PUBLIC)
                .returns(objectType)
                .addStatement("return object")
                .build());
    }

    private TypeName processAnonymousClass(Interface parent, String className, String body) {
        Interface anonymous = new Interface();
        anonymous.setParentModule(this);
        anonymous.setClassName(parent.getClassName().nestedClass(className));
        anonymous.setRequiresConstructor(true);
        anonymous.setBuildable(true);
        anonymous.setJsClassName(className);

        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(anonymous.getClassName());
        anonymous.setBuilder(builder);

        builder.addModifiers(Modifier.PUBLIC);

        createBuilderBuilder(anonymous);
        populateBuilderBuilder(anonymous, "");

        parent.getInnerInterfaces().add(anonymous);

        processClassBody(anonymous, body);

        return anonymous.getClassName();
    }

    private TypeName processLambda(Interface parent, String className, String type) {
        Interface anonymous = new Interface();
        anonymous.setParentModule(this);
        anonymous.setClassName(parent.getClassName().nestedClass(className));
        anonymous.setRequiresConstructor(false);
        anonymous.setBuildable(false);
        anonymous.setJsClassName(className);

        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(anonymous.getClassName());
        anonymous.setBuilder(builder);

        builder.addModifiers(Modifier.PUBLIC);
        builder.addAnnotation(FunctionalInterface.class);
        builder.addAnnotation(JSFunctor.class);

        parent.getInnerInterfaces().add(anonymous);

        List<String> tokens = Arrays.asList(StringUtils.split("apply " + StringUtils.replace(type, ARROW_TOKEN, ":"), " "));
        ListIterator<String> itr = tokens.listIterator();

        processMethod(itr, anonymous, true);

        return anonymous.getClassName();
    }

    private void processNamespace(ListIterator<String> itr, Interface parent) {
        String namespaceName = itr.next();

/*        Interface anInterface = context.getInterfaces().get(namespaceName);
        anInterface.setClassName(parent.getClassName().nestedClass(StringUtils.capitalize(namespaceName)));
        parent.getInnerInterfaces().add(anInterface);

        TypeSpec.Builder builder = anInterface.getBuilder();
        if (builder == null) {
            builder = TypeSpec.interfaceBuilder(anInterface.getClassName());
            anInterface.setBuilder(builder);
            anInterface.setBuildable(false);
            anInterface.setRequiresConstructor(false);

            builder.addModifiers(Modifier.PUBLIC);

            if (context.getExports().containsKey(namespaceName) && parent.getClassName().simpleName().equals(rootClassName)) {
                // Ok to import
                parent.getSymbols().add(namespaceName);

                String jsMethodName = parent.getClassName().simpleName() + "_" + namespaceName;

                MethodSpec.Builder getter = MethodSpec.methodBuilder(StringUtils.replaceChars(namespaceName, "-\"'", "_"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + jsMethodName).build())
                        .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                                " " +
                                "in " +
                                "JavaScript")
                        .returns(anInterface.getClassName());
                parent.getBuilder().addMethod(getter.build());
            } else {
                String jsMethodName = "this." + namespaceName;

                MethodSpec.Builder getter = MethodSpec.methodBuilder(StringUtils.replaceChars(namespaceName, "-\"'", "_"))
                        .addModifiers(Modifier.PUBLIC)
                        .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + jsMethodName).build())
                        .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                                " " +
                                "in " +
                                "JavaScript")
                        .returns(anInterface.getClassName());
                parent.getBuilder().addMethod(getter.build());
            }
        }*/
        upto(itr, FIGURE_TOKEN);
        if (is(itr, FIGURE_TOKEN)) {
            processNamespaceBody(parent, context.resolve(itr.next()));
        }
    }

    private void processClassGenericSignature(TypeSpec.Builder builder, String genericSignature) {
        for (String arg : StringUtils.split(genericSignature, ",")) {
            String[] split = StringUtils.splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);
            if (split.length > 1) {
                List<String> strings = expandTypes(split[1].trim());
                if (strings.size() > 1) {
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
                } else {
                    TypeName resolve = resolve(strings.get(0), null, null);
                    if (resolve.equals(ClassName.get(Unknown.class))) {
                        resolve = ClassName.get(Any.class);
                    }
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), resolve));
                }
            } else {
                builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
            }
        }
    }

    private TypeName getBuilderType(ClassName builder, String genericSignature) {
        List<TypeName> typeParameters = new ArrayList<>();

        for (String arg : StringUtils.split(genericSignature, ",")) {
            String[] split = StringUtils.splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);
            typeParameters.add(TypeVariableName.get(split[0].trim()));
        }

        if (typeParameters.isEmpty()) {
            return builder;
        } else {
            return ParameterizedTypeName.get(builder, typeParameters.toArray(new TypeName[]{}));
        }
    }

    private void processMethodGenericSignature(MethodSpec.Builder builder, String genericSignature) {
        for (String arg : StringUtils.split(genericSignature, ",")) {
            String[] split = StringUtils.splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);

            if (split.length > 1) {
                List<String> strings = expandTypes(split[1].trim());
                if (strings.size() > 1) {
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
                } else {
                    TypeName resolve = resolve(strings.get(0), null, null);
                    if (resolve.equals(ClassName.get(Unknown.class))) {
                        resolve = ClassName.get(Any.class);
                    }
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), resolve));
                }
            } else {
                builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
            }
        }
    }

    private void processClassBody(Interface anInterface, String resolve) {
        List<String> tokens = Arrays.asList(StringUtils.split(resolve, " "));
        ListIterator<String> itr = tokens.listIterator();

        while (itr.hasNext()) {
            if (skipToken(itr, ";") || skipToken(itr, ",")) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "private")) {
                upto(itr, ";");
            } else if (is(itr, "readonly", SQUARE_TOKEN, null, ":")) {
                processIndexer(itr, anInterface, true);
            } else if (is(itr, SQUARE_TOKEN, null, ":")) {
                processIndexer(itr, anInterface, false);
            } else if (is(itr, "readonly", null, ":") || is(itr, "readonly", null, "?", ":")) {
                processProperty(itr, anInterface, true);
            } else if (is(itr, null, ":") || is(itr, null, "?", ":")) {
                processProperty(itr, anInterface, false);
            } else if (is(itr, "constructor")) {
                processConstructor(itr, anInterface);
            } else if (is(itr, "new")) {
                processNew(itr, anInterface);
            } else if (is(itr, ROUND_TOKEN, null, ":")) {
                itr.previous();
                processMethod(itr, anInterface, false);
            } else if (is(itr, null, ROUND_TOKEN, null, ":")
                    || is(itr, null, "?", ROUND_TOKEN, null, ":")
                    || is(itr, null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")
                    || is(itr, null, "?", ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processMethod(itr, anInterface, false);
            } else if (is(itr, "static", null, ROUND_TOKEN, null, ":") || is(itr, "static", null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processStaticMethod(itr, anInterface);
            } else {
                fail(itr);
                return;
            }
        }

    }

    private void processNamespaceBody(Interface anInterface, String resolve) {
        List<String> tokens = Arrays.asList(StringUtils.split(resolve, " "));
        ListIterator<String> itr = tokens.listIterator();

        while (itr.hasNext()) {
            if (skipToken(itr, ";") || skipToken(itr, "export")) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "type")) {
                upto(itr, ";",",");
            } else if (is(itr, "declare", "class") || is(itr, "class") || is(itr, "declare", "interface") || is(itr, "interface")) {
                processClass(itr);
            } else if (is(itr, "declare", "namespace") || is(itr, "namespace")) {
                processNamespace(itr, anInterface);
            } else if (is(itr, "declare", "function") || is(itr, "function")) {
                processStaticFunction(itr, true, anInterface);
            } else if (is(itr, "declare", "const") || is(itr, "const")) {
                processStaticConst(itr, false, anInterface);
            } else if (is(itr, "readonly", null, ":") || is(itr, "readonly", null, "?", ":")) {
                processProperty(itr, anInterface, true);
            } else if (is(itr, null, ":") || is(itr, null, "?", ":")) {
                processProperty(itr, anInterface, false);
            } else if (is(itr, null, ROUND_TOKEN, null, ":") || is(itr, null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processMethod(itr, anInterface, false);
            } else {
                fail(itr);
                return;
            }
        }

    }

    private void processStaticMethod(ListIterator<String> itr, Interface anInterface) {
        anInterface.setBuildable(false);

        String functionName = itr.next();
        String genericSignature = "";
        if (is(itr, ANGLE_TOKEN)) {
            genericSignature = context.resolve(itr.next());
        }

        upto(itr, ROUND_TOKEN); // skip rest

        is(itr, ROUND_TOKEN, null);

        String index = itr.next();
        String arguments = context.resolve(index);

        is(itr, ":");

        String returnType = upto(itr, ";");

        if (context.getExports().containsKey(anInterface.getJsClassName())) {
            // Ok to import
            anInterface.getSymbols().add(anInterface.getJsClassName());

            String jsMethodName = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName() + "." + functionName;

            if (SourceVersion.isKeyword(functionName)) {
                functionName = "do" + StringUtils.capitalize(functionName);
            }

            processMethod(anInterface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, true, false, false);
        } else if (context.getExports().containsKey("?" + anInterface.getJsClassName())) {
            // Ok to import
            anInterface.getSymbols().add("?" + anInterface.getJsClassName());

            String jsMethodName = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName() + "." + functionName;

            if (SourceVersion.isKeyword(functionName)) {
                functionName = "do" + StringUtils.capitalize(functionName);
            }

            processMethod(anInterface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, true, false, false);
        }
    }

    private void processConstructor(ListIterator<String> itr, Interface anInterface) {
        if (is(itr, ROUND_TOKEN)) {
            anInterface.setBuildable(false);
            anInterface.setRequiresConstructor(false);
            if (context.getExports().containsKey(anInterface.getJsClassName())) {
                // Ok to import
                anInterface.getSymbols().add(anInterface.getJsClassName());

                String jsMethodName = "new " + anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();
                String jsMethodNameVarg = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();

                String arguments = context.resolve(itr.next());

                processMethod(anInterface, "create", "", arguments, anInterface.getJsClassName(), jsMethodName, jsMethodNameVarg, true, false, false);
            } else if (context.getExports().containsKey("?" + anInterface.getJsClassName())) {
                // Ok to import
                anInterface.getSymbols().add("?" + anInterface.getJsClassName());

                String jsMethodName = "new " + anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();
                String jsMethodNameVarg = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();

                String arguments = context.resolve(itr.next());

                processMethod(anInterface, "create", "", arguments, anInterface.getJsClassName(), jsMethodName, jsMethodNameVarg, true, false, false);
            } else {
                upto(itr, ";");
            }
        } else {
            fail(itr);
        }
    }

    private void processNew(ListIterator<String> itr, Interface anInterface) {
        String signature = "";
        if (is(itr, ANGLE_TOKEN)) {
            signature = context.resolve(itr.next());
        }
        if (is(itr, ROUND_TOKEN)) {
            anInterface.setBuildable(false);
            anInterface.setRequiresConstructor(false);
            if (context.getExports().containsKey(anInterface.getJsClassName())) {
                // Ok to import
                anInterface.getSymbols().add(anInterface.getJsClassName());

                String jsMethodName = "new " + anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();
                String jsMethodNameVarg = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();

                String arguments = context.resolve(itr.next());

                skipToken(itr, ":");
                String returnType = upto(itr, ";");

                processMethod(anInterface, "create", signature, arguments, returnType, jsMethodName, jsMethodNameVarg, true, false, false);
            } else if (context.getExports().containsKey("?" + anInterface.getJsClassName())) {
                // Ok to import
                anInterface.getSymbols().add("?" + anInterface.getJsClassName());

                String jsMethodName = "new " + anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();
                String jsMethodNameVarg = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName();

                String arguments = context.resolve(itr.next());

                skipToken(itr, ":");
                String returnType = upto(itr, ";");

                processMethod(anInterface, "create", signature, arguments, returnType, jsMethodName, jsMethodNameVarg, true, false, false);
            } else {
                upto(itr, ";");
            }
        } else {
            fail(itr);
        }
    }

    private void processMethod(ListIterator<String> itr, Interface anInterface, boolean noVariants) {
        String methodName = itr.next();
        if (methodName.equals(ROUND_TOKEN)) {
            itr.previous();
            methodName = "apply";
        }
        is(itr, "?"); // IGNORE
        String signature = "";
        if (is(itr, ANGLE_TOKEN)) {
            signature = context.resolve(itr.next());
        }
        if (is(itr, ROUND_TOKEN)) {
            anInterface.setBuildable(false);

            String jsMethodName = "this." + methodName;

            String arguments = context.resolve(itr.next());

            skipToken(itr, ":");
            String returnType = upto(itr, ";");

            if (SourceVersion.isKeyword(methodName)) {
                methodName = "do" + StringUtils.capitalize(methodName);
            }

            processMethod(anInterface, methodName, signature, arguments, returnType, jsMethodName, jsMethodName, false, false, noVariants);
        } else {
            fail(itr);
        }
    }

    private void processStaticFunction(ListIterator<String> itr, boolean ignoreExport, Interface parent) {
        Interface iface = parent == null ? context.getInterfaces().computeIfAbsent(rootClassName, cn -> {
            Interface anInterface = new Interface();
            anInterface.setParentModule(this);
            return anInterface;
        }) : parent;
        if (parent == null) {
            context.getInterfaces().put(rootClassName, iface);
            if (iface.getClassName() == null) {
                iface.setClassName(ClassName.get(javaPackage, StringUtils.capitalize(rootClassName)));
            }
        }

        TypeSpec.Builder builder = iface.getBuilder();
        if (builder == null) {
            builder = TypeSpec.interfaceBuilder(iface.getClassName());
            iface.setBuilder(builder);

            builder.addModifiers(Modifier.PUBLIC);
        }

        iface.setBuildable(false);

        String functionName = itr.next();
        String genericSignature = "";
        if (is(itr, ANGLE_TOKEN)) {
            genericSignature = context.resolve(itr.next());
        }

        upto(itr, ROUND_TOKEN); // skip rest

        is(itr, ROUND_TOKEN, null);

        String index = itr.next();
        String arguments = context.resolve(index);

        is(itr, ":");

        String returnType = upto(itr, ";");

        if (context.getExports().containsKey(functionName)) {
            // Ok to import
            iface.getSymbols().add(functionName);

            String jsMethodName = iface.getClassName().simpleName() + "_" + functionName;

            processMethod(iface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, true, false, false);
        } else if (context.getExports().containsKey("?" + functionName)) {
            // Ok to import
            iface.getSymbols().add("?" + functionName);

            String jsMethodName = iface.getClassName().simpleName() + "_" + functionName;

            processMethod(iface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, true, false, false);
        } else if (ignoreExport) {
            String jsMethodName = "this." + functionName;

            processMethod(iface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, false, false, false);
        }
    }

    private void processMethod(Interface anInterface, String methodName, String genericSignature, String args, String returnType, String jsMethodName, String jsMethodNameVarg, boolean isStatic, boolean isPrivate, boolean noVariants) {
        if (methodName.startsWith("_")) {
            return;
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> expandedTypes = expandTypes(returnType);
        boolean optional = expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        List<String> names = new ArrayList<>();
        List<String> realNames = new ArrayList<>();
        List<List<String>> types = new ArrayList<>();

        boolean hasVarArgs = false;

        TypeName returns = expandedTypes.size() == 1 ? resolve(expandedTypes.get(0), StringUtils.capitalize(methodName) + "Result", anInterface) : ClassName.get(Unknown.class);

        for (String arg : StringUtils.split(args, ",")) {
            String[] split = StringUtils.split(arg.trim(), ":", 2);
            if (split[0].contains("...")) {
                hasVarArgs = true;
            }
            realNames.add(StringUtils.remove(StringUtils.remove(split[0], "?"), "...").trim());
            List<String> argTypes = expandTypes(split[1].trim());

            if (argTypes.contains("null") || argTypes.contains("undefined") && !split[0].contains("?")) {
                names.add(split[0] + " ?");
            } else {
                names.add(split[0]);
            }

            argTypes.remove("null");
            argTypes.remove("undefined");

            if (argTypes.size() != 1 && noVariants) {
                types.add(Collections.singletonList("any"));
            } else {
                types.add(argTypes);
            }
        }

        if (!names.isEmpty()) {

            do {
                List<List<String>> result = new ArrayList<>();

                Deque<List<List<String>>> expansionQueue = new ArrayDeque<>();
                expansionQueue.push(types);

                outer: while (!expansionQueue.isEmpty()) {
                    List<List<String>> variant = expansionQueue.pop();
                    boolean exploded = false;
                    for (int i = 0; i < variant.size(); i++) {
                        List<String> options = variant.get(i);
                        if (options.size() > 1) {
                            exploded = true;
                            for (String option : options) {
                                List<List<String>> newVariant = new ArrayList<>();
                                for (int i1 = 0; i1 < variant.size(); i1++) {
                                    if (i == i1) {
                                        newVariant.add(Collections.singletonList(option));
                                    } else {
                                        newVariant.add(new ArrayList<>(variant.get(i1)));
                                    }
                                }
                                expansionQueue.push(newVariant);
                            }
                            continue outer;
                        }
                    }
                    if (!exploded) {
                        result.add(variant.stream()
                                .map(x -> x.get(0))
                                .collect(Collectors.toList()));
                    }
                }

                for (List<String> argumentTypes : result) {
                    MethodSpec.Builder method = MethodSpec.methodBuilder(StringUtils.defaultString(methodName,
                            "apply"))
                            .addModifiers(isPrivate ? Modifier.PRIVATE : Modifier.PUBLIC)
                            .returns(returns);

                    if (!savedJavaDoc.isEmpty()) {
                        method.addJavadoc("$L", savedJavaDoc);
                    }


                    method.varargs(hasVarArgs);

                    processMethodGenericSignature(method, genericSignature);

                    if (isStatic || hasVarArgs) {
                        AnnotationSpec.Builder jsbodyBuilder = AnnotationSpec.builder(JSBody.class);
                        if (isStatic) {
                            method.addModifiers(Modifier.STATIC);
                        } else {
                            method.addModifiers(Modifier.ABSTRACT);
                        }

                        jsbodyBuilder.addMember("params", "{$L}",
                                realNames.stream().map(s -> "\"" + StringUtils.removeStart(s, "...") + "\"").collect(Collectors.joining(
                                        ", ")));

                        StringBuilder jsBodyBuilder = new StringBuilder();

                        if (returns != TypeName.VOID) {
                            jsBodyBuilder.append("return ");
                        }

                        if (hasVarArgs) {
                            if (argumentTypes.size() > 1) {
                                jsBodyBuilder.append(jsMethodNameVarg).append(".apply(").append(isStatic ? "null" : "this").append(", [");
                            } else {
                                jsBodyBuilder.append(jsMethodNameVarg).append(".apply(").append(isStatic ? "null" : "this").append(", ");
                            }
                        } else {
                            jsBodyBuilder.append(jsMethodName).append("(");
                        }

                        boolean shouldAddComma = false;
                        String lastParameter = argumentTypes.isEmpty() ? null : realNames.get(argumentTypes.size() - 1);
                        for (String parameter : realNames) {
                            if (shouldAddComma) {
                                if (hasVarArgs && parameter.equals(lastParameter)) {
                                    jsBodyBuilder.append("].concat(");
                                } else {
                                    jsBodyBuilder.append(", ");
                                }
                            }
                            jsBodyBuilder.append(StringUtils.removeStart(parameter, "...").trim());

                            shouldAddComma = true;
                        }

                        if (!hasVarArgs || argumentTypes.size() == 1) {
                            jsBodyBuilder.append(")");
                        } else {
                            jsBodyBuilder.append("))");
                        }

                        jsbodyBuilder.addMember("script", "$S", jsBodyBuilder.toString());

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

                    for (int i = 0; i < argumentTypes.size(); i++) {
                        TypeName resolve = resolve(argumentTypes.get(i), StringUtils.capitalize(methodName) + StringUtils.capitalize(realNames.get(i)), anInterface);
                        if (names.get(i).contains("?") && !(resolve instanceof ArrayTypeName) && !(resolve.isPrimitive())) {
                            method.addParameter(resolve.annotated(AnnotationSpec.builder(Nullable.class).build()), StringUtils.removeStart(realNames.get(i), "..."));
                        } else {
                            method.addParameter(resolve, StringUtils.removeStart(realNames.get(i), "..."));
                        }
                    }

                    if (optional && !returns.isPrimitive()) {
                        method.addAnnotation(Nullable.class);
                    }

                    anInterface.getBuilder().addMethod(method.build());

                }
                if (types.isEmpty() || noVariants) {
                    break;
                }

                String paramToRemove = realNames.get(types.size()-1);

                List<String> newJavaDoc = new ArrayList<>();
                for (String partial : savedJavaDoc.split("@")) {
                    String[] split = StringUtils.split(partial);
                    if (split.length<2 || !"param".equals(split[0]) || !split[1].equals(paramToRemove)) {
                        newJavaDoc.add(partial);
                    }
                }
                savedJavaDoc = String.join("@", newJavaDoc);
                if (!savedJavaDoc.endsWith("\n")) {
                    savedJavaDoc += "\n";
                }

                types.remove(types.size() - 1);
            } while (names.get(types.size()).contains("?") && !names.get(types.size()).contains("..."));
        } else {
            MethodSpec.Builder method = MethodSpec.methodBuilder(StringUtils.defaultString(methodName,
                    "apply"))
                    .addModifiers(isPrivate ? Modifier.PRIVATE : Modifier.PUBLIC)
                    .returns(returns);

            if (!savedJavaDoc.isEmpty()) {
                method.addJavadoc("$L", savedJavaDoc);
            }


            processMethodGenericSignature(method, genericSignature);

            if (isStatic) {
                AnnotationSpec.Builder jsbodyBuilder = AnnotationSpec.builder(JSBody.class);
                method.addModifiers(Modifier.STATIC);

                StringBuilder jsBodyBuilder = new StringBuilder();

                if (returns != TypeName.VOID) {
                    jsBodyBuilder.append("return ");
                }

                jsBodyBuilder.append(jsMethodName).append("()");
                jsbodyBuilder.addMember("script", "$S", jsBodyBuilder.toString());

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

            if (optional && !returns.isPrimitive()) {
                method.addAnnotation(Nullable.class);
            }

            anInterface.getBuilder().addMethod(method.build());
        }

        javaDoc = "";
    }

    private void fail(ListIterator<String> itr) {
        List<String> rest = new ArrayList<>();
        itr.forEachRemaining(rest::add);
        String diagnostics = StringEscapeUtils.escapeJava(String.join(" ", rest.subList(0, Math.min(10, rest.size()))));
        IllegalStateException illegalStateException = new IllegalStateException("Unknown token in " + definition.getFileName() + " of " + npmPackage + "\n\n" + diagnostics + "\n");
        log.error("Oopsie", illegalStateException);
        throw illegalStateException;
    }

    private void processProperty(ListIterator<String> itr, Interface anInterface, boolean isReadonly) {
        if (anInterface.getBuilderBuilder() == null ) {
            createBuilderBuilder(anInterface);
            populateBuilderBuilder(anInterface, "");
        }

        String propertyName = itr.next();
        String jsPropertyName = propertyName;

        if (SourceVersion.isKeyword(propertyName)) {
            propertyName = propertyName + "Value";
        }

        boolean optional = is(itr, "?");
        skipToken(itr, ":");
        String type = upto(itr, ";", ",");

        if (propertyName.startsWith("_")) {
            return;
        }

        if (type.startsWith(ROUND_TOKEN) && type.contains(ARROW_TOKEN)) {
            String[] split = StringUtils.split(type, ARROW_TOKEN, 2);
            String args = context.resolve(split[0].substring(2).trim());
            String returnType = split[1].trim();
            processMethod(anInterface, propertyName, "", args, returnType, propertyName, propertyName, false, false, false);
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> expandedTypes = expandTypes(type);
        optional |= expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        List<TypeName> resolvedTypes = new ArrayList<>();
        for (String expandedType : expandedTypes) {
            resolvedTypes.add(resolve(expandedType, StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), anInterface));
        }


        TypeName getterType = ClassName.get(Unknown.class);
        if (resolvedTypes.size() == 1) {
            getterType = resolvedTypes.get(0);
        }

        MethodSpec.Builder getter = MethodSpec.methodBuilder("get" + StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S", jsPropertyName).build())
                .returns(getterType);

        if (!savedJavaDoc.isEmpty()) {
            getter.addJavadoc("$L", savedJavaDoc);
        }

        if (optional && !getterType.isPrimitive()) {
            getter.addAnnotation(Nullable.class);
        }

        anInterface.getBuilder().addMethod(getter.build());

        if (!isReadonly) {
            for (TypeName resolvedType : resolvedTypes) {
                if (optional && !(resolvedType instanceof ArrayTypeName) && (!resolvedType.isPrimitive())) {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
                                    jsPropertyName).build())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
                            .addStatement("object.set$L(value)", StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addStatement("return this");
                    if (!savedJavaDoc.isEmpty()) {
                        setter.addJavadoc("$L", savedJavaDoc);
                        builder.addJavadoc("$L", savedJavaDoc);
                    }
                    anInterface.getBuilder().addMethod(setter.build());
                    anInterface.getBuilderBuilder().addMethod(builder.build());
                } else {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
                                    jsPropertyName).build())
                            .addParameter(resolvedType, "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType, "value")
                            .addStatement("object.set$L(value)", StringUtils.replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addStatement("return this");

                    if (!savedJavaDoc.isEmpty()) {
                        setter.addJavadoc("$L", savedJavaDoc);
                        builder.addJavadoc("$L", savedJavaDoc);
                    }

                    anInterface.getBuilder().addMethod(setter.build());
                    anInterface.getBuilderBuilder().addMethod(builder.build());
                }
            }
        }

        javaDoc = "";
    }

    private void processIndexer(ListIterator<String> itr, Interface anInterface, boolean isReadonly) {
        String indexer = context.resolve(itr.next());

        String[] indexerParts = StringUtils.split(StringUtils.replace(indexer, " in ", " : "), ":");
        String indexerName = indexerParts[0].trim();

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> keyTypes = expandTypes(indexerParts[1].trim());
        skipToken(itr, ":");
        String type = upto(itr, ";", ",");

        for (String keyType : keyTypes) {
            TypeName indexerType = resolve(keyType, StringUtils.capitalize(indexerName), anInterface);

            List<String> expandedTypes = expandTypes(type);
            boolean optional = expandedTypes.contains("null") || expandedTypes.contains("undefined");
            expandedTypes.remove("null");
            expandedTypes.remove("undefined");

            TypeName getterType = ClassName.get(Unknown.class);
            if (expandedTypes.size() == 1) {
                getterType = resolve(expandedTypes.get(0), "Value", anInterface);
            }

            MethodSpec.Builder getter = MethodSpec.methodBuilder("get")
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addAnnotation(AnnotationSpec.builder(JSIndexer.class).build())
                    .addParameter(indexerType, indexerName)
                    .returns(getterType);

            if (!savedJavaDoc.isEmpty()) {
                getter.addJavadoc("$L", savedJavaDoc);
            }


            if (optional && !getterType.isPrimitive()) {
                getter.addAnnotation(Nullable.class);
            }

            anInterface.getBuilder().addMethod(getter.build());

            if (!isReadonly) {
                for (String expandedType : expandedTypes) {
                    TypeName resolve = resolve(expandedType, "Value", anInterface);
                    if (optional && !(resolve instanceof ArrayTypeName) &&(!resolve.isPrimitive())) {
                        MethodSpec.Builder setter = MethodSpec.methodBuilder("set")
                                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                                .addAnnotation(AnnotationSpec.builder(JSIndexer.class).build())
                                .addParameter(indexerType, indexerName)
                                .addParameter(resolve.annotated(AnnotationSpec.builder(Nullable.class).build()), "value");
                        MethodSpec.Builder builder = MethodSpec.methodBuilder("set")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(anInterface.getClassName().nestedClass("Builder"))
                                .addParameter(indexerType, indexerName)
                                .addParameter(resolve.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
                                .addStatement("object.set($L, value)", indexerName)
                                .addStatement("return this");

                        if (!savedJavaDoc.isEmpty()) {
                            setter.addJavadoc("$L", savedJavaDoc);
                            builder.addJavadoc("$L", savedJavaDoc);
                        }

                        anInterface.getBuilder().addMethod(setter
                                .build());
                        anInterface.getBuilderBuilder().addMethod(builder
                                .build());
                    } else {
                        MethodSpec.Builder setter = MethodSpec.methodBuilder("set")
                                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                                .addAnnotation(AnnotationSpec.builder(JSIndexer.class).build())
                                .addParameter(indexerType, indexerName)
                                .addParameter(resolve, "value");
                        MethodSpec.Builder builder = MethodSpec.methodBuilder("set")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(anInterface.getBuilderClassName())
                                .addParameter(indexerType, indexerName)
                                .addParameter(resolve, "value")
                                .addStatement("object.set($L, value)", indexerName)
                                .addStatement("return this");

                        if (!savedJavaDoc.isEmpty()) {
                            setter.addJavadoc("$L", savedJavaDoc);
                            builder.addJavadoc("$L", savedJavaDoc);
                        }

                        anInterface.getBuilder().addMethod(setter
                                .build());
                        anInterface.getBuilderBuilder().addMethod(builder
                                .build());
                    }
                }
            }

        }

        javaDoc = "";
    }

    private List<String> expandTypes(String type) {
        List<String> intermediate = new ArrayList<>();

        List<String> tokens = new ArrayList<>(Arrays.asList(StringUtils.split(type, " ")));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "Array", ANGLE_TOKEN, null)) {
                for (String expandType : expandTypes(context.resolve(itr.next()))) {
                    if ("null".equals(expandType) || "undefined".equals(expandType)) {
                        // skip intermediate.add(expandType);
                    } else {
                        intermediate.add(expandType + " " + SQUARE_TOKEN + " " + context.emptyToken());
                    }
                }
                upto(itr,"|");
                skipToken(itr, "|");
            } else if (is(itr, ROUND_TOKEN, null, ARROW_TOKEN, null)) {
                itr.previous();
                intermediate.add(upto(itr, "|").trim());
                skipToken(itr, "|");
                continue;
            } else if (is(itr, ROUND_TOKEN)) {
                injectTokenContent(itr);
            } else if (is(itr, STRING_TOKEN, null)) {
                // string
                intermediate.add(STRING_TOKEN + " " + itr.next());
            } else {
                String rawType = itr.next();
                if (!context.getInterfaces().containsKey(rawType) && context.getUnions().containsKey(rawType)) {
                    List<String> rest = Arrays.asList(StringUtils.split(upto(itr, "|"), " "));
                    // expand the type
                    upto(itr, "|");
                    List<String> replacement = new ArrayList<>();
                    for (String single : context.getUnions().get(rawType)) {
                        replacement.addAll(Arrays.asList(StringUtils.split(single, " ")));
                        //if (!replacement.isEmpty() && !"null".equals(single.trim()) && !"undefined".equals(single.trim())) {
                            replacement.addAll(rest);
                        //}
                        replacement.add("|");
                    }
                    if (!replacement.isEmpty()) {
                        replacement.remove(replacement.size() - 1);
                    }
                    for (int i = replacement.size() - 1; i >= 0; i--) {
                        itr.add(replacement.get(i));
                        itr.previous();
                    }
                    continue;
                }

                intermediate.add((rawType + " " + upto(itr, "|")).trim());
                skipToken(itr, "|");
            }
        }

        List<String> result = new ArrayList<>();

        for (String someType : intermediate) {
            if (someType.contains(ANGLE_TOKEN)) {
                List<String> typeTokens = Arrays.asList(StringUtils.split(someType, " "));
                ListIterator<String> itr2 = typeTokens.listIterator();

                upto(itr2, ANGLE_TOKEN);
                skipToken(itr2, ANGLE_TOKEN);
                String index = itr2.next();
                String genericSignature = context.resolve(index);

                List<String> signatureParts = Arrays.asList(StringUtils.split(genericSignature, ","));
                List<List<String>> types = signatureParts.stream()
                        .map(t -> expandTypes(t.trim()).stream().filter(s -> !s.equals("null") && !s.equals("undefined")).collect(Collectors.toList()))
                        .collect(Collectors.toList());
                Deque<List<List<String>>> expansionQueue = new ArrayDeque<>();
                expansionQueue.push(types);

                while (!expansionQueue.isEmpty()) {
                    List<List<String>> variant = expansionQueue.pop();
                    boolean exploded = false;
                    for (int i = 0; i < variant.size(); i++) {
                        List<String> options = variant.get(i);
                        if (options.size() > 1) {
                            exploded = true;
                            for (String option : options) {
                                List<List<String>> newVariant = new ArrayList<>();
                                for (int i1 = 0; i1 < variant.size(); i1++) {
                                    if (i == i1) {
                                        newVariant.add(Collections.singletonList(option));
                                    } else {
                                        newVariant.add(new ArrayList<>(variant.get(i1)));
                                    }
                                }
                                expansionQueue.push(newVariant);
                            }
                        }
                    }
                    if (!exploded) {
                        String singleSignature = variant.stream()
                                .map(strings -> strings.get(0))
                                .collect(Collectors.joining(" , "));

                        String newType = StringUtils.replace(someType, ANGLE_TOKEN + " " + index, " < " + singleSignature + " > ");
                        result.add(String.join(" ", StringUtils.split(newType, " ")));
                    }
                }
            } else {
                result.add(someType);
            }
        }

        return result;
    }

    @Nullable
    private TypeName resolve(String type, String suggestedName, Interface parent) {
        type = type.trim();

        if (type.startsWith(FIGURE_TOKEN)) {
            return processAnonymousClass(parent, suggestedName, context.resolve(StringUtils.split(type, " ")[1]));
        }

        if (type.startsWith(STRING_TOKEN)) {
            return processEnum(parent, suggestedName, Collections.singletonList(type));
        }

        if (StringUtils.isNumeric(type)) {
            return processEnum(parent, suggestedName, Collections.singletonList(type));
        }

        if (type.contains(ARROW_TOKEN)) {
            if (type.startsWith("new ")) {
                return ClassName.get(JsFunction.class);
            }
            return processLambda(parent, suggestedName+"Fn", type);
        }

        if (type.contains(SQUARE_TOKEN)) {
            return ArrayTypeName.of(resolve(StringUtils.split(type, SQUARE_TOKEN)[0], suggestedName, parent));
        }

        if (context.getInterfaces().containsKey(type)) {
            return context.getInterfaces().get(type).getClassName();
        }

        if (type.contains("&") || type.startsWith("new ")) {
            log.warn("Unknown type: '"+type +"' for "+suggestedName+" in "+parent.getClassName().simpleName());
            return ClassName.get(Any.class);
        }

        try {
            Class<?> aClass = Class.forName("js.web.dom." + type);
            return ClassName.get(aClass);
        } catch (ClassNotFoundException e) {
            // ignore
        }
        try {
            Class<?> aClass = Class.forName("js.lang." + type);
            return ClassName.get(aClass);
        } catch (ClassNotFoundException e) {
            // ignore
        }
        try {
            Class<?> aClass = Class.forName("js.util." + type);
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


        switch (type) {
            case "Array < string >":
                return ArrayTypeName.of(String.class);
            case "Array < number >":
                return ArrayTypeName.of(TypeName.INT);
            case "Array < boolean >":
                return ArrayTypeName.of(TypeName.BOOLEAN);
            case "string":
                return ClassName.get(String.class);
            case "symbol":
                return ClassName.get(Symbol.class);
            case "false":
            case "true":
            case "boolean":
            case "Boolean":
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
                return ClassName.get(JsFunction.class);
            case "never":
            case "unknown":
                return ClassName.get(Unknown.class);
            case "null":
            case "undefined":
                return null;

        }
        try {
            return ClassName.bestGuess(type);
        } catch (IllegalArgumentException e) {
            log.warn("Unknown type: '"+type +"' for "+suggestedName+" in "+parent.getClassName().simpleName());
            return ClassName.get(Unknown.class);
        }
    }

    private void injectTokenContent(ListIterator<String> itr) {
        String index = itr.next();
        List<String> rest = Arrays.asList(StringUtils.split(upto(itr, "|"), " "));

        List<String> replacement = new ArrayList<>();
        for (String single : StringUtils.split(context.resolve(index), "|")) {
            replacement.addAll(Arrays.asList(StringUtils.split(single, " ")));
            //if (!replacement.isEmpty() && !"null".equals(single.trim()) && !"undefined".equals(single.trim())) {
            replacement.addAll(rest);
            //}
            replacement.add("|");
        }
        if (!replacement.isEmpty()) {
            replacement.remove(replacement.size() - 1);
        }
        for (int i = replacement.size() - 1; i >= 0; i--) {
            itr.add(replacement.get(i));
            itr.previous();
        }
    }
}
