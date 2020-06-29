package com.github.fluorumlabs.disconnect;

import com.squareup.javapoet.*;
import js.extras.JsEnum;
import js.lang.*;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
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
import static org.apache.commons.lang3.StringUtils.*;

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
    private final String moduleName;
    private final String rootClassName;
    private final List<String> exportedSymbols = new ArrayList<>();
    private String content;
    private String javaDoc = "";

    public Module(GlobalContext context, String npmPackage, String npmVersion, Path npmRoot, Path definition, Path module, Path realModule, String content) {
        this.context = context;
        this.npmPackage = npmPackage;
        this.npmVersion = npmVersion;
        this.path = module;
        this.definition = definition;
        this.npmRoot = npmRoot;

        String rootAsString = npmRoot.toString();
        String npmImportAsString = replace(module.toString(), ".d.ts", ".js");
        String npmParentAsString = module.getParent().toString();
        npmImport = replaceChars(removeStart(npmImportAsString, rootAsString), "/\\", "//");

        String npmParent = replaceChars(removeStart(realModule.getParent().toString(), rootAsString), "/\\", "//");
        String[] split = split(npmPackage + npmParent, "@/");
        for (int i = 0; i < split.length; i++) {
            split[i] = replaceChars(split[i].toLowerCase(), "-", "_");
        }

        List<String> packageParts = new ArrayList<>(Arrays.asList(split(context.getGlobalPackage(), ".")));
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (!packageParts.contains(s) && !"src".equals(s) && !"dist".equals(s) && !"lib".equals(s)) {
                packageParts.add(s);
            }
        }

        javaPackage = String.join(".", packageParts);
        moduleName = capitalize(toCamelCase(split(definition.getFileName().toString(), ".")[0]));
        
        String fileName = split(module.getFileName().toString(), ".")[0];
        rootClassName = capitalize(toCamelCase(fileName));

        this.content = context.reduce(content);
    }

    public void registerSubmodules() {
        List<String> tokens = Arrays.asList(split(content));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "declare", "module", GlobalContext.STRING_TOKEN, null, FIGURE_TOKEN, null)) {
                // We're at string constant
                String moduleName = context.resolve(itr.next()) + ".js";
                itr.next(); // skip {
                String content = context.resolve(itr.next());

                this.content = this.content + " " + content;
                //context.registerModule(new Module(context, npmPackage, npmVersion, npmRoot, definition, definition.getParent().resolve(moduleName).normalize(), content));
            } else {
                itr.next();
            }
        }
    }

    public void registerExports() {
        List<String> tokens = Arrays.asList(split(content));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (is(itr, "export", FIGURE_TOKEN, null)) {
                // We're at string constant
                for (String value : split(context.resolve(itr.next()), ",")) {
                    context.getExports().put(value.trim(), this);
                }
            } if (is(itr, "export", "default") || is(itr, "export", "=")) {
                String symbol = itr.next();
                context.getExports().put("?" + symbol, this);
            } else if (is(itr, "export", "declare", "function", null)
            || is(itr, "export", "declare", "class", null)
            || is(itr, "export", "as", "namespace", null)
            || is(itr, "export", "declare", "abstract", "class", null)
            || is(itr, "export", "declare", "interface", null)
            || is(itr, "export", "declare", "const", null)
            || is(itr, "export", "declare", "var", null)
            || is(itr, "export", "function", null)
            || is(itr, "export", "abstract", "class", null)
            || is(itr, "export", "class", null)
            || is(itr, "export", "interface", null)
            || is(itr, "export", "const", null)
            || is(itr,"export","var",null)
            || is(itr,"export","let",null)) {
                context.getExports().put(itr.next(), this);
            } else {
                itr.next();
            }
        }

    }

    private void preprocessScope(String scope) {
        if (content.contains("export as namespace ")) {
            String nameSpaceName = split(substringAfter(content, "export as namespace "), " ;")[0];
            context.getTokens().add(content);
            content = "export namespace "+nameSpaceName+" "+FIGURE_TOKEN+" "+ (context.getTokens().size() - 1);
        }
            List<String> tokens = new ArrayList<>(Arrays.asList(split(scope)));
            ListIterator<String> itr = tokens.listIterator();
            while (itr.hasNext()) {
                if (is(itr, "class") || is(itr, "interface") || is(itr, "namespace")) {
                    preprocessScopeDefinition(itr);
                } else if (is(itr, "type", null, "=", ROUND_TOKEN, null, ARROW_TOKEN) || is(itr, "type", null, ANGLE_TOKEN, null, "=", ROUND_TOKEN, null, ARROW_TOKEN)) {
                    String typeName = upto(itr, "=");
                    skipToken(itr, "=");
                    String methodSignature = upto(itr, ARROW_TOKEN);
                    skipToken(itr, ARROW_TOKEN);
                    String returnType = upto(itr, ";");
                    String classBody = "// apply "+methodSignature+" : "+returnType+" ;";
                    context.getTokens().add(classBody);
                    String id = Integer.toString(context.getTokens().size()-1);

                    String classDef = typeName+" "+FIGURE_TOKEN+" "+id;
                    List<String> fakeClass = new ArrayList<>(Arrays.asList(split(classDef)));
                    preprocessScopeDefinition(fakeClass.listIterator());
                    processClass(fakeClass.listIterator());
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

                        List<String> variants = Arrays.asList(split(trim, "|"));
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
        Interface enumClass = null;

        if (parent != null) {
            for (Interface innerInterface : parent.getInnerInterfaces()) {
                if (innerInterface.getJsClassName().equals(typeName)) {
                    enumClass = innerInterface;
                    break;
                }
            }
        }

        if (enumClass == null) {
            enumClass = new Interface();
            enumClass.setParentModule(this);
            enumClass.setClassName(ClassName.get("", typeName));
            enumClass.setJsClassName(typeName);
            enumClass.setRequiresConstructor(false);
            enumClass.setBuildable(false);

            TypeSpec.Builder builder = TypeSpec.classBuilder(enumClass.getClassName());
            enumClass.setBuilder(builder);

            builder.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
            builder.superclass(JsEnum.class);
            enumClass.setSuperInterfaces(Collections.singleton(ClassName.get("","*")));
        }

        for (String variant : variants) {
            String value = variant.trim();
            if (StringUtils.isNumeric(value)) {
                String rawValue = value.startsWith("-") ? "MINUS_" + value.substring(1) : value;
                enumClass.getBuilder().addField(FieldSpec.builder(enumClass.getClassName(), "VALUE_" + rawValue.toUpperCase().replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.of($L)", JsEnum.class, value)
                        .build());
            } else if (value.startsWith(STRING_TOKEN)) {
                String rawValue = context.resolve(split(value)[1]);
                enumClass.getBuilder().addField(FieldSpec.builder(enumClass.getClassName(), defaultIfEmpty(rawValue.toUpperCase().replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_"), "EMPTY_VALUE"))
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.of($S)", JsEnum.class, rawValue)
                        .build());
            } else if ("string".equals(value)) {
                enumClass.getBuilder().addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(String.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            } else if ("number".equals(value)) {
                enumClass.getBuilder().addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(int.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            } else if ("boolean".equals(value)) {
                enumClass.getBuilder().addMethod(MethodSpec.methodBuilder("of")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(enumClass.getClassName())
                        .addParameter(boolean.class, "value")
                        .addStatement("return $T.of(value)", JsEnum.class)
                        .build());
            }
        }

        if (parent == null) {
            context.getInterfaces().put(typeName.toUpperCase(), enumClass);
        } else {
            enumClass.setParent(parent);
            parent.getInnerInterfaces().add(enumClass);
        }

        return enumClass.getClassName();
    }

    private void preprocessScopeDefinition(ListIterator<String> itr) {
        String className = itr.next();

        Interface iface = context.getInterfaces().get((moduleName + className).toUpperCase());
        if (iface == null) {
            iface = context.getInterfaces().get(className.toUpperCase());
            if (iface == null) {
                iface = new Interface();
                iface.setParentModule(this);
                iface.setJsClassName(className);
                iface.setClassName(ClassName.get(javaPackage, capitalize(className)));
                iface.setExtendedClassName(null);
                context.getInterfaces().put(className.toUpperCase(), iface);
            } else if (!iface.getParentModule().moduleName.equals(moduleName)){
                Interface newIface = new Interface();
                newIface.setParentModule(this);
                newIface.setJsClassName(className);
                newIface.setClassName(ClassName.get(javaPackage, moduleName+StringUtils.capitalize(className)));
                newIface.setExtendedClassName(iface.getClassName());
                newIface.setBuildable(false);
                iface = newIface;
                context.getInterfaces().put((moduleName+className).toUpperCase(), iface);
            }
        }

        upto(itr, "extends", "implements", FIGURE_TOKEN);
        while (itr.hasNext()) {
            String superIface = upto(itr, "extends", "implements", ",", ROUND_TOKEN, FIGURE_TOKEN);
            if (!superIface.isEmpty()) {
                List<String> expandedTypes = expandTypes(superIface);

                if (!expandedTypes.isEmpty()) {
                    TypeName resolvedType = resolve(expandedTypes.get(0), null, null);
                    if (resolvedType.isPrimitive() || resolvedType.toString().equals(String.class.getName())) {
                        resolvedType = unknown(expandedTypes.get(0));
                    } else if (resolvedType instanceof ArrayTypeName) {
                        try {
                            resolvedType = ParameterizedTypeName.get(ClassName.get(Array.class), ((ArrayTypeName) resolvedType).componentType);
                        } catch (IllegalArgumentException e) {
                            resolvedType = ParameterizedTypeName.get(ClassName.get(Array.class), unknown(((ArrayTypeName) resolvedType).componentType.toString()));
                        }
                    }

                    iface.getSuperInterfaces().add(resolvedType);
                }
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
        List<String> tokens = new ArrayList<>(Arrays.asList(split(content)));
        ListIterator<String> itr = tokens.listIterator();
        while (itr.hasNext()) {
            if (skipToken(itr, ";")
                    || skipToken(itr, "declare", "global", FIGURE_TOKEN, null)
                    || skipToken(itr, "declare", "module", STRING_TOKEN, null, FIGURE_TOKEN, null)
                    || skipToken(itr, "export", FIGURE_TOKEN, null, "from", STRING_TOKEN, null)
                    || skipToken(itr, "export", FIGURE_TOKEN, null)
                    || skipToken(itr, "export", "*", "from", STRING_TOKEN, null)
                    || skipToken(itr, "import", FIGURE_TOKEN, null, "from", STRING_TOKEN, null)
                    || skipToken(itr, "import", "*", "as", null, "from", STRING_TOKEN, null)) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "declare", "class")
                    || is(itr, "export", "declare", "class")
                    || is(itr, "export", "class")
                    || is(itr, "class")
                    || is(itr, "declare", "abstract", "class")
                    || is(itr, "export", "declare", "abstract", "class")
                    || is(itr, "export", "abstract", "class")
                    || is(itr, "abstract", "class")
                    || is(itr, "export", "declare", "interface")
                    || is(itr, "declare", "interface")
                    || is(itr, "export", "interface")
                    || is(itr, "interface")) {
                processClass(itr);
            } else if (is(itr, "declare", "namespace")
                    || is(itr, "export", "namespace")
                    || is(itr, "namespace")) {
                Interface iface = context.getInterfaces().computeIfAbsent(rootClassName.toUpperCase(), cn -> {
                    Interface anInterface = new Interface();
                    anInterface.setParentModule(this);
                    return anInterface;
                });
                context.getInterfaces().put(rootClassName.toUpperCase(), iface);
                if (iface.getClassName() == null) {
                    iface.setClassName(ClassName.get(javaPackage, capitalize(rootClassName)));
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
            } else if (is(itr, "declare", "const")
                    || is(itr, "export", "declare", "const")
                    || is(itr, "export", "const")
                    || is(itr, "const")
                    || is(itr, "declare", "var")
                    || is(itr, "export", "declare", "var")
                    || is(itr, "export", "var")
                    || is(itr, "var")
                    || is(itr, "export", "let")
                    || is(itr, "let")) {
                processStaticConst(itr, false, null);
            } else if (is(itr, "declare", "type")
                    || is(itr, "export", "type")
                    || is(itr, "export", "declare", "type")
                    || is(itr, "export", "default")
                    || is(itr, "export", "=")
                    || is(itr, "export", "as", "namespace")
                    || is(itr, "import")
                    || is(itr, "type")) {
                upto(itr, ";");
            } else {
                fail(itr);
            }
        }
    }

    private void processStaticConst(ListIterator<String> itr, boolean ignoreExport, Interface parent) {
        Interface iface = parent == null ? context.getInterfaces().computeIfAbsent(rootClassName.toUpperCase(), cn -> {
            Interface anInterface = new Interface();
            anInterface.setParentModule(this);
            return anInterface;
        }) : parent;
        if ( parent == null ) {
            context.getInterfaces().put(rootClassName.toUpperCase(), iface);
            if (iface.getClassName() == null) {
                iface.setClassName(ClassName.get(javaPackage, capitalize(rootClassName)));
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
        skipToken(itr, "=");
        String type = upto(itr, ";");

        // Check if it's a method and mutate
        if (type.contains(ARROW_TOKEN)) {
            String[] replacement = split(type);
            for (int i = replacement.length - 1; i >= 0; i--) {
                itr.add(replacement[i]);
                itr.previous();
            }
            itr.add(propertyName);
            itr.previous();
            javaDoc = savedJavaDoc;
            processStaticFunction(itr, ignoreExport, parent);
            return;
        }

        if (propertyName.startsWith("_")) {
            return;
        }

        List<String> expandedTypes = expandTypes(type);

        TypeName getterType = unknown(type);
        if (expandedTypes.size() == 1) {
            getterType = resolve(expandedTypes.get(0), replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), iface);
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

    private boolean has(String className) {
        return get(className) != null;
    }

    private Interface get(String className) {
        Interface anInterface = context.getInterfaces().get((moduleName + className).toUpperCase());
        if (anInterface == null) {
            anInterface = context.getInterfaces().get(className.toUpperCase());
        }
        return anInterface;
    }

    private void processClass(ListIterator<String> itr) {
        String className = itr.next();

        Interface anInterface = get(className);

        TypeSpec.Builder builder = anInterface.getBuilder();
        if (builder == null) {
            builder = TypeSpec.interfaceBuilder(anInterface.getClassName());
            anInterface.setBuilder(builder);

            builder.addModifiers(Modifier.PUBLIC);

            TypeSpec.Builder builderBuilder;

            if (is(itr, ANGLE_TOKEN)) {
                builderBuilder = createBuilderBuilder(anInterface);
                String genericSignature = context.resolve(itr.next());
                processClassGenericSignature(anInterface.getBuilder(), genericSignature, anInterface);
                processClassGenericSignature(anInterface.getBuilderBuilder(), genericSignature, anInterface);
                anInterface.setBuilderClassName(getBuilderType(anInterface.getClassName().nestedClass("Builder"), genericSignature));
                populateBuilderBuilder(anInterface, genericSignature);
            } else {
                builderBuilder = createBuilderBuilder(anInterface);
                populateBuilderBuilder(anInterface, "");
            }

            if (!javaDoc.isEmpty()) {
                builder.addJavadoc("$L", javaDoc);
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

        builderBuilder.addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build());

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
        anonymous.setClassName(ClassName.get("",className));
        anonymous.setRequiresConstructor(true);
        anonymous.setBuildable(true);
        anonymous.setJsClassName(className);

        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(anonymous.getClassName());
        anonymous.setBuilder(builder);

        builder.addModifiers(Modifier.PUBLIC);

        createBuilderBuilder(anonymous);
        populateBuilderBuilder(anonymous, "");

        anonymous.setParent(parent);
        parent.getInnerInterfaces().add(anonymous);

        processClassBody(anonymous, body);

        return anonymous.getClassName();
    }

    private TypeName processLambda(Interface parent, String className, String type) {
        for (Interface innerInterface : parent.getInnerInterfaces()) {
            if (innerInterface.getClassName().simpleName().equals(className)) {
                return innerInterface.getClassName();
            }
        }

        Interface anonymous = new Interface();
        anonymous.setParentModule(this);
        anonymous.setClassName(ClassName.get("",className));
        anonymous.setRequiresConstructor(false);
        anonymous.setBuildable(false);
        anonymous.setJsClassName(className);

        TypeSpec.Builder builder = TypeSpec.interfaceBuilder(anonymous.getClassName());
        anonymous.setBuilder(builder);

        builder.addModifiers(Modifier.PUBLIC);
        builder.addAnnotation(FunctionalInterface.class);
        builder.addAnnotation(JSFunctor.class);

        anonymous.setParent(parent);
        parent.getInnerInterfaces().add(anonymous);

        String reducedType = context.reduce(type);

        List<String> tokens = Arrays.asList(split("apply " + replace(reducedType, ARROW_TOKEN, ":")));
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
            processClassBody(parent, context.resolve(itr.next()) + " ; export as namespace "+namespaceName+" ;");
        }
    }

    private TypeName unknown(String type) {
        return commented("Unknown", type);
    }

    private TypeName any(String type) {
        return commented("Any", type);
    }

    private TypeName commented(String clazz, String type) {
        String intermediate = type;
        boolean shouldContinue;
        do {
            List<String> newIntermediate = new ArrayList<>();
            Iterator<String> itr = Arrays.asList(split(intermediate)).iterator();
            while (itr.hasNext()) {
                String token = itr.next();
                switch (token) {
                    case ANGLE_TOKEN:
                        newIntermediate.add("<");
                        newIntermediate.add(context.resolve(itr.next()));
                        newIntermediate.add(">");
                        break;
                    case STRING_TOKEN:
                        newIntermediate.add("'" + context.resolve(itr.next()) + "'");
                        break;
                    case SQUARE_TOKEN:
                        newIntermediate.add("[");
                        newIntermediate.add(context.resolve(itr.next()));
                        newIntermediate.add("]");
                        break;
                    case FIGURE_TOKEN:
                        newIntermediate.add("{");
                        newIntermediate.add(context.resolve(itr.next()));
                        newIntermediate.add("}");
                        break;
                    case ROUND_TOKEN:
                        newIntermediate.add("(");
                        newIntermediate.add(context.resolve(itr.next()));
                        newIntermediate.add(")");
                        break;
                    case ARROW_TOKEN:
                        newIntermediate.add("=>");
                        break;
                    default:
                        newIntermediate.add(token);
                }
            }

            String newIntermediateResult = String.join(" ",newIntermediate);
            shouldContinue = !newIntermediateResult.equals(intermediate);
                intermediate = newIntermediateResult;
        } while (shouldContinue);


        return ClassName.get("js.lang", clazz + " /* " + intermediate + " */");
    }

    private void processClassGenericSignature(TypeSpec.Builder builder, String genericSignature, Interface anInterface) {
        for (String arg : split(genericSignature, ",")) {
            String[] split = splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);
            if (split.length > 1) {
                List<String> strings = expandTypes(split[1].trim());
                if (strings.size() > 1) {
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
                } else {
                    TypeName resolve = resolve(strings.get(0), "AnonymousClass", anInterface);
                    if (resolve.toString().contains("js.lang.Unknown")) {
                        resolve = any(strings.get(0));
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

        for (String arg : split(genericSignature, ",")) {
            String[] split = splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);
            typeParameters.add(TypeVariableName.get(split[0].trim()));
        }

        if (typeParameters.isEmpty()) {
            return builder;
        } else {
            return ParameterizedTypeName.get(builder, typeParameters.toArray(new TypeName[]{}));
        }
    }

    private void processMethodGenericSignature(MethodSpec.Builder builder, String genericSignature, Interface anInterface) {
        for (String arg : split(genericSignature, ",")) {
            String[] split = splitByWholeSeparator(StringUtils.substringBefore(arg,"=").trim(), "extends", 2);

            if (split.length > 1) {
                List<String> strings = expandTypes(split[1].trim());
                if (strings.size() > 1) {
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
                } else {
                    TypeName resolve = resolve(strings.get(0), "Parameter", anInterface);
                    if (resolve.toString().contains("js.lang.Unknown")) {
                        resolve = any(strings.get(0));
                    }
                    builder.addTypeVariable(TypeVariableName.get(split[0].trim(), resolve));
                }
            } else {
                builder.addTypeVariable(TypeVariableName.get(split[0].trim(), ClassName.get(Any.class)));
            }
        }
    }

    private void processClassBody(Interface anInterface, String resolve) {
        List<String> tokens = Arrays.asList(split(resolve));
        ListIterator<String> itr = tokens.listIterator();

        while (itr.hasNext()) {
            if (is(itr,"export","as","namespace",null)) {
                processNamespaceExport(itr, anInterface);
            } else if (is(itr,"declare","global",FIGURE_TOKEN,null)) {
                itr.next();
            } else if (skipToken(itr, ";") || skipToken(itr, ",")|| skipToken(itr, "export")|| skipToken(itr, "declare")) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "class") || is(itr, "interface")) {
                processClass(itr);
            } else if (is(itr, "namespace")) {
                processNamespace(itr, anInterface);
            } else if (is(itr, "private") || is(itr, "protected") || is(itr,"import")) {
                upto(itr, ";");
            } else if (is(itr, "readonly", SQUARE_TOKEN, null, ":")) {
                processIndexer(itr, anInterface, true);
            } else if (is(itr, SQUARE_TOKEN, null, ":")) {
                processIndexer(itr, anInterface, false);
            } else if (is(itr, "get", null, ROUND_TOKEN, null, ":")) {
                processProperty(itr, anInterface, true, false);
            } else if (is(itr, "readonly", null, ":") || is(itr, "readonly", null, "?", ":") || is(itr,"const") || is(itr,"var") || is(itr,"let")) {
                processProperty(itr, anInterface, true, false);
            } else if (is(itr, null, ":") || is(itr, null, "?", ":")) {
                processProperty(itr, anInterface, false, false);
            } else if (is(itr, "static", "get", null, ROUND_TOKEN, null, ":")) {
                processProperty(itr, anInterface, true, true);
            } else if (is(itr, "static", "readonly", null, ":") || is(itr, "static", "readonly", null, "?", ":")) {
                processProperty(itr, anInterface, true, true);
            } else if (is(itr, "static", null, ":") || is(itr, "static", null, "?", ":")) {
                processProperty(itr, anInterface, false, true);
            } else if (is(itr, "get", STRING_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processStringKeyedProperty(itr, anInterface, true, false);
            } else if (is(itr, "readonly", STRING_TOKEN, null, ":") || is(itr, "readonly", STRING_TOKEN, null, "?", ":")) {
                processStringKeyedProperty(itr, anInterface, true, false);
            } else if (is(itr, STRING_TOKEN, null, ":") || is(itr, STRING_TOKEN, null, "?", ":")) {
                processStringKeyedProperty(itr, anInterface, false, false);
            } else if (is(itr, "static", "get", STRING_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processStringKeyedProperty(itr, anInterface, true, true);
            } else if (is(itr, "static", "readonly", STRING_TOKEN, null, ":") || is(itr, "static", "readonly", STRING_TOKEN, null, "?", ":")) {
                processStringKeyedProperty(itr, anInterface, true, true);
            } else if (is(itr, "static", STRING_TOKEN, null, ":") || is(itr, "static", STRING_TOKEN, null, "?", ":")) {
                processStringKeyedProperty(itr, anInterface, false, true);
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
            } else if (is(itr, "//", null, ROUND_TOKEN, null, ":")
                    || is(itr, "//", null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processMethod(itr, anInterface, true);
                anInterface.getBuilder()
                        .addAnnotation(FunctionalInterface.class)
                        .addAnnotation(JSFunctor.class);
            } else if (is(itr, "static", null, ROUND_TOKEN, null, ":") || is(itr, "static", null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processStaticMethod(itr, anInterface);
            } else if (is(itr, "function", null, ROUND_TOKEN, null, ":") || is(itr, "function", null, ANGLE_TOKEN, null, ROUND_TOKEN, null, ":")) {
                processMethod(itr, anInterface, false);
            } else if (is(itr, "type") || is(itr,"import")) {
                upto(itr, ";",",");
            } else {
                fail(itr);
                return;
            }
        }

    }

    private void processNamespaceExport(ListIterator<String> itr, Interface anInterface) {
        itr.next();

        if (anInterface.getJsClassName() != null && !anInterface.getSymbols().contains(anInterface.getJsClassName())) {
            anInterface.getSymbols().add(anInterface.getJsClassName());
            MethodSpec instance = MethodSpec.methodBuilder("INSTANCE")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName()).build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(anInterface.getClassName())
                    .build();

            anInterface.getBuilder().addMethod(instance);
        }
    }

    private void processNamespaceBody(Interface anInterface, String resolve) {
        List<String> tokens = Arrays.asList(split(resolve));
        ListIterator<String> itr = tokens.listIterator();

        while (itr.hasNext()) {
            if (is(itr,"export","as","namespace")) {
                upto(itr, ";");
            } else if (skipToken(itr, ";") || skipToken(itr, "export")) {
                continue;
            } else if (is(itr, JSDOC_TOKEN, null)) {
                javaDoc = renderMarkdown(context.resolveJsdoc(itr.next()));
            } else if (is(itr, "type") || is(itr,"import")) {
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
                processProperty(itr, anInterface, true, false);
            } else if (is(itr, null, ":") || is(itr, null, "?", ":")) {
                processProperty(itr, anInterface, false, false);
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
                functionName = "do" + capitalize(functionName);
            }

            processMethod(anInterface, functionName, genericSignature, arguments, returnType, jsMethodName, jsMethodName, true, false, false);
        } else if (context.getExports().containsKey("?" + anInterface.getJsClassName())) {
            // Ok to import
            anInterface.getSymbols().add("?" + anInterface.getJsClassName());

            String jsMethodName = anInterface.getClassName().simpleName() + "_" + anInterface.getJsClassName() + "." + functionName;

            if (SourceVersion.isKeyword(functionName)) {
                functionName = "do" + capitalize(functionName);
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
                methodName = "do" + capitalize(methodName);
            }

            processMethod(anInterface, methodName, signature, arguments, returnType, jsMethodName, jsMethodName, false, false, noVariants);
        } else {
            fail(itr);
        }
    }

    private void processStaticFunction(ListIterator<String> itr, boolean ignoreExport, Interface parent) {
        Interface iface = parent == null ? context.getInterfaces().computeIfAbsent(rootClassName.toUpperCase(), cn -> {
            Interface anInterface = new Interface();
            anInterface.setParentModule(this);
            return anInterface;
        }) : parent;
        if (parent == null) {
            context.getInterfaces().put(rootClassName.toUpperCase(), iface);
            if (iface.getClassName() == null) {
                iface.setClassName(ClassName.get(javaPackage, capitalize(rootClassName)));
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

        if (!is(itr, ":")) {
            is(itr, ARROW_TOKEN);
        };

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
        String savedJavaDoc = javaDoc;
        javaDoc = "";

        if (methodName.startsWith("_")) {
            return;
        }
        if ("constructor".equals(methodName) || "connectedCallback".equals(methodName) || "disconnectedCallback".equals(methodName) || "attributeChangedCallback".equals(methodName)
                || "adoptedCallback".equals(methodName)) {
            return;
        }


        List<String> expandedTypes = expandTypes(returnType);
        boolean optional = expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        List<String> names = new ArrayList<>();
        List<String> realNames = new ArrayList<>();
        List<List<String>> types = new ArrayList<>();

        boolean hasVarArgs = false;

        Set<TypeName> resolvedTypes = new HashSet<>();
        for (String expandedType : expandedTypes) {
            resolvedTypes.add(resolve(expandedType, capitalize(methodName) + "Result", anInterface));
        }

        TypeName returns = unknown(returnType);
        if (resolvedTypes.size() == 1) {
            returns = resolvedTypes.iterator().next();
        }

        for (String arg : split(args, ",")) {
            String[] split = split(arg.trim(), ":", 2);
            if (split[0].trim().equals("this")) {
                continue;
            }
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

                Set<String> visited = new HashSet<>();

                for (List<String> argumentTypes : result) {
                    List<String> realNamesLocal = realNames.subList(0, argumentTypes.size());

                    MethodSpec.Builder method = MethodSpec.methodBuilder(StringUtils.defaultString(methodName,
                            "apply"))
                            .addModifiers(isPrivate ? Modifier.PRIVATE : Modifier.PUBLIC)
                            .returns(returns);

                    if (!savedJavaDoc.isEmpty()) {
                        method.addJavadoc("$L", savedJavaDoc);
                    }


                    method.varargs(hasVarArgs);

                    processMethodGenericSignature(method, genericSignature, anInterface);

                    if (isStatic || hasVarArgs) {
                        AnnotationSpec.Builder jsbodyBuilder = AnnotationSpec.builder(JSBody.class);
                        if (isStatic) {
                            method.addModifiers(Modifier.STATIC);
                        } else {
                            method.addModifiers(Modifier.ABSTRACT);
                        }

                        jsbodyBuilder.addMember("params", "{$L}",
                                realNamesLocal.stream().map(s -> "\"" + removeStart(s, "...") + "\"").collect(Collectors.joining(
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
                        for (String parameter : realNamesLocal) {
                            if (shouldAddComma) {
                                if (hasVarArgs && parameter.equals(lastParameter)) {
                                    jsBodyBuilder.append("].concat(");
                                } else {
                                    jsBodyBuilder.append(", ");
                                }
                            }
                            jsBodyBuilder.append(removeStart(parameter, "...").trim());

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

                    StringBuilder signature = new StringBuilder();

                    for (int i = 0; i < argumentTypes.size(); i++) {
                        TypeName resolve = resolve(argumentTypes.get(i), capitalize(methodName) + capitalize(realNames.get(i)), anInterface);

                        if (resolve instanceof ParameterizedTypeName) {
                            signature.append(((ParameterizedTypeName)resolve).rawType).append("::");
                        } else {
                            signature.append(resolve).append("::");
                        }

                        if (names.get(i).contains("?") && !(resolve instanceof ArrayTypeName) && !(resolve.isPrimitive())) {
                            method.addParameter(resolve.annotated(AnnotationSpec.builder(Nullable.class).build()), removeStart(realNames.get(i), "..."));
                        } else {
                            method.addParameter(resolve, removeStart(realNames.get(i), "..."));
                        }
                    }

                    if (optional && !returns.isPrimitive()) {
                        method.addAnnotation(Nullable.class);
                    }

                    if (visited.add(signature.toString())) {
                        anInterface.getBuilder().addMethod(method.build());
                    }

                }
                if (types.isEmpty() || noVariants) {
                    break;
                }

                String paramToRemove = realNames.get(types.size()-1);

                List<String> newJavaDoc = new ArrayList<>();
                for (String partial : savedJavaDoc.split("@")) {
                    String[] split = split(partial);
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


            processMethodGenericSignature(method, genericSignature, anInterface);

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

    private void processProperty(ListIterator<String> itr, Interface anInterface, boolean isReadonly, boolean isStatic) {
        if (anInterface.getBuilderBuilder() == null ) {
            createBuilderBuilder(anInterface);
            populateBuilderBuilder(anInterface, "");
        }

        String propertyName = itr.next();

        if (StringUtils.isNumeric(propertyName)) {
            itr.previous();
            processNumberKeyedProperty(itr, anInterface, isReadonly, isStatic);
            return;
        }

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

        if ((type.startsWith(ROUND_TOKEN) || type.startsWith(ANGLE_TOKEN)) && type.contains(ARROW_TOKEN)) {
            String[] split = split(type, ARROW_TOKEN, 2);

            List<String> lhs = Arrays.asList(split(split[0]));
            String genericSignature = "";

            if (lhs.get(0).equals(ANGLE_TOKEN)) {
                genericSignature = context.resolve(lhs.get(1));
                lhs = lhs.subList(2, lhs.size());
            }
            String args = context.resolve(lhs.get(1));
            String returnType = split[1].trim();
            processMethod(anInterface, propertyName, genericSignature, args, returnType, propertyName, propertyName, isStatic, false, false);

            if (isReadonly || !optional) {
                javaDoc = "";
                return; // do not create properties if that was a readonly or non-optional
            }
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> expandedTypes = expandTypes(type);
        optional |= expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        Set<TypeName> resolvedTypes = new HashSet<>();
        for (String expandedType : expandedTypes) {
            resolvedTypes.add(resolve(expandedType, replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), anInterface));
        }

        TypeName getterType = unknown(type);
        if (resolvedTypes.size() == 1) {
            getterType = resolvedTypes.iterator().next();
        }

        MethodSpec.Builder getter;
        if (isStatic) {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + anInterface.getJsClassName()+"."+jsPropertyName).build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);
        } else {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S", jsPropertyName).build())
                    .returns(getterType);
        }

        if (!savedJavaDoc.isEmpty()) {
            getter.addJavadoc("$L", savedJavaDoc);
        }

        if (optional && !getterType.isPrimitive()) {
            getter.addAnnotation(Nullable.class);
        }

        anInterface.getBuilder().addMethod(getter.build());

        if (!isReadonly && !isStatic) {
            for (TypeName resolvedType : resolvedTypes) {
                if (optional && !(resolvedType instanceof ArrayTypeName) && (!resolvedType.isPrimitive())) {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
                                    jsPropertyName).build())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addStatement("return this");
                    if (!savedJavaDoc.isEmpty()) {
                        setter.addJavadoc("$L", savedJavaDoc);
                        builder.addJavadoc("$L", savedJavaDoc);
                    }
                    anInterface.getBuilder().addMethod(setter.build());
                    anInterface.getBuilderBuilder().addMethod(builder.build());
                } else {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSProperty.class).addMember("value", "$S",
                                    jsPropertyName).build())
                            .varargs(resolvedType instanceof ArrayTypeName)
                            .addParameter(resolvedType, "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .varargs(resolvedType instanceof ArrayTypeName)
                            .addParameter(resolvedType, "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
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

    private void processStringKeyedProperty(ListIterator<String> itr, Interface anInterface, boolean isReadonly, boolean isStatic) {
        if (anInterface.getBuilderBuilder() == null ) {
            createBuilderBuilder(anInterface);
            populateBuilderBuilder(anInterface, "");
        }

        String propertyName = context.resolve(itr.next());
        String jsPropertyName = propertyName;
        propertyName = toCamelCase(propertyName).replaceAll("[-/:*%!@#^&+()<>\\[\\]={},.?\"';|\\\\]", "_");

        if (SourceVersion.isKeyword(propertyName)) {
            propertyName = propertyName + "Value";
        }

        boolean optional = is(itr, "?");
        skipToken(itr, ":");
        String type = upto(itr, ";", ",");

        if (propertyName.startsWith("_")) {
            return;
        }

        if ((type.startsWith(ROUND_TOKEN) || type.startsWith(ANGLE_TOKEN)) && type.contains(ARROW_TOKEN)) {
            String[] split = split(type, ARROW_TOKEN, 2);

            List<String> lhs = Arrays.asList(split(split[0]));
            String genericSignature = "";

            if (lhs.get(0).equals(ANGLE_TOKEN)) {
                genericSignature = context.resolve(lhs.get(1));
                lhs = lhs.subList(2, lhs.size());
            }
            String args = context.resolve(lhs.get(1));
            String returnType = split[1].trim();
            processMethod(anInterface, propertyName, genericSignature, args, returnType, propertyName, propertyName, isStatic, false, false);

            if (isReadonly || !optional) {
                javaDoc = "";
                return; // do not create properties if that was a readonly or non-optional
            }
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> expandedTypes = expandTypes(type);
        optional |= expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        Set<TypeName> resolvedTypes = new HashSet<>();
        for (String expandedType : expandedTypes) {
            resolvedTypes.add(resolve(expandedType, replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), anInterface));
        }

        TypeName getterType = unknown(type);
        if (resolvedTypes.size() == 1) {
            getterType = resolvedTypes.iterator().next();
        }

        MethodSpec.Builder getter;
        if (isStatic) {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + anInterface.getJsClassName() + "['" + jsPropertyName + "']").build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);
        } else {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return this['"+jsPropertyName+"']").build())
                    .returns(getterType);
        }

        if (!savedJavaDoc.isEmpty()) {
            getter.addJavadoc("$L", savedJavaDoc);
        }

        if (optional && !getterType.isPrimitive()) {
            getter.addAnnotation(Nullable.class);
        }

        anInterface.getBuilder().addMethod(getter.build());

        if (!isReadonly && !isStatic) {
            for (TypeName resolvedType : resolvedTypes) {
                if (optional && !(resolvedType instanceof ArrayTypeName) && (!resolvedType.isPrimitive())) {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSBody.class)
                                    .addMember("params","$S","value")
                                    .addMember("script", "$S", "this['"+jsPropertyName+"'] = value").build())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addStatement("return this");
                    if (!savedJavaDoc.isEmpty()) {
                        setter.addJavadoc("$L", savedJavaDoc);
                        builder.addJavadoc("$L", savedJavaDoc);
                    }
                    anInterface.getBuilder().addMethod(setter.build());
                    anInterface.getBuilderBuilder().addMethod(builder.build());
                } else {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSBody.class)
                                    .addMember("params","$S","value")
                                    .addMember("script", "$S", "this['"+jsPropertyName+"'] = value").build())
                            .addParameter(resolvedType, "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType, "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
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

    private void processNumberKeyedProperty(ListIterator<String> itr, Interface anInterface, boolean isReadonly, boolean isStatic) {
        if (anInterface.getBuilderBuilder() == null ) {
            createBuilderBuilder(anInterface);
            populateBuilderBuilder(anInterface, "");
        }

        String propertyName = itr.next();
        String jsPropertyName = propertyName;
        propertyName = "value" + propertyName;

        if (SourceVersion.isKeyword(propertyName)) {
            propertyName = propertyName + "Value";
        }

        boolean optional = is(itr, "?");
        skipToken(itr, ":");
        String type = upto(itr, ";", ",");

        if (propertyName.startsWith("_")) {
            return;
        }

        if ((type.startsWith(ROUND_TOKEN) || type.startsWith(ANGLE_TOKEN)) && type.contains(ARROW_TOKEN)) {
            String[] split = split(type, ARROW_TOKEN, 2);

            List<String> lhs = Arrays.asList(split(split[0]));
            String genericSignature = "";

            if (lhs.get(0).equals(ANGLE_TOKEN)) {
                genericSignature = context.resolve(lhs.get(1));
                lhs = lhs.subList(2, lhs.size());
            }
            String args = context.resolve(lhs.get(1));
            String returnType = split[1].trim();
            processMethod(anInterface, propertyName, genericSignature, args, returnType, propertyName, propertyName, isStatic, false, false);

            if (isReadonly || !optional) {
                javaDoc = "";
                return; // do not create properties if that was a readonly or non-optional
            }
        }

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> expandedTypes = expandTypes(type);
        optional |= expandedTypes.contains("null") || expandedTypes.contains("undefined");
        expandedTypes.remove("null");
        expandedTypes.remove("undefined");

        Set<TypeName> resolvedTypes = new HashSet<>();
        for (String expandedType : expandedTypes) {
            resolvedTypes.add(resolve(expandedType, replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"), anInterface));
        }

        TypeName getterType = unknown(type);
        if (resolvedTypes.size() == 1) {
            getterType = resolvedTypes.iterator().next();
        }

        MethodSpec.Builder getter;
        if (isStatic) {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return " + anInterface.getJsClassName()+"["+jsPropertyName+"]").build())
                    .addStatement("throw new $T($S)", UnsupportedOperationException.class, "Available only" +
                            " " +
                            "in " +
                            "JavaScript")
                    .returns(getterType);
        } else {
            getter = MethodSpec.methodBuilder("get" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                    .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                    .addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S", "return this["+jsPropertyName+"]").build())
                    .returns(getterType);
        }

        if (!savedJavaDoc.isEmpty()) {
            getter.addJavadoc("$L", savedJavaDoc);
        }

        if (optional && !getterType.isPrimitive()) {
            getter.addAnnotation(Nullable.class);
        }

        anInterface.getBuilder().addMethod(getter.build());

        if (!isReadonly && !isStatic) {
            for (TypeName resolvedType : resolvedTypes) {
                if (optional && !(resolvedType instanceof ArrayTypeName) && (!resolvedType.isPrimitive())) {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSBody.class)
                                    .addMember("params","$S","value")
                                    .addMember("script", "$S", "this["+jsPropertyName+"] = value").build())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType.annotated(AnnotationSpec.builder(Nullable.class).build()), "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addStatement("return this");
                    if (!savedJavaDoc.isEmpty()) {
                        setter.addJavadoc("$L", savedJavaDoc);
                        builder.addJavadoc("$L", savedJavaDoc);
                    }
                    anInterface.getBuilder().addMethod(setter.build());
                    anInterface.getBuilderBuilder().addMethod(builder.build());
                } else {
                    MethodSpec.Builder setter = MethodSpec.methodBuilder("set" + replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                            .addAnnotation(AnnotationSpec.builder(JSBody.class)
                                    .addMember("params","$S","value")
                                    .addMember("script", "$S", "this["+jsPropertyName+"] = value").build())
                            .addParameter(resolvedType, "value");
                    MethodSpec.Builder builder = MethodSpec.methodBuilder(StringUtils.replaceChars(propertyName, "-\"'", "_"))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(anInterface.getBuilderClassName())
                            .addParameter(resolvedType, "value")
                            .addStatement("object.set$L(value)", replaceChars(StringUtils.capitalize(propertyName), "-\"'", "_"))
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

        String[] indexerParts = split(StringUtils.replace(indexer, " in ", " : "), ":");
        String indexerName = indexerParts[0].trim();

        String savedJavaDoc = javaDoc;
        javaDoc = "";

        List<String> keyTypes = expandTypes(indexerParts[1].trim());
        skipToken(itr, ":");
        String type = upto(itr, ";", ",");

        for (String keyType : keyTypes) {
            TypeName indexerType = resolve(keyType, capitalize(indexerName), anInterface);

            List<String> expandedTypes = expandTypes(type);
            boolean optional = expandedTypes.contains("null") || expandedTypes.contains("undefined");
            expandedTypes.remove("null");
            expandedTypes.remove("undefined");

            TypeName getterType = unknown(type);
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

        List<String> tokens = new ArrayList<>(Arrays.asList(split(type)));
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
                skipToken(itr, "|");
            } else if (is(itr, STRING_TOKEN, null)) {
                // string
                intermediate.add(STRING_TOKEN + " " + itr.next());
                skipToken(itr, "|");
            } else {
                String rawType = itr.next();
                if (!has(rawType) && context.getUnions().containsKey(rawType)) {
                    List<String> rest = Arrays.asList(split(upto(itr, "|")));
                    // expand the type
                    upto(itr, "|");
                    List<String> replacement = new ArrayList<>();
                    for (String single : context.getUnions().get(rawType)) {
                        replacement.addAll(Arrays.asList(split(single)));
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
                List<String> typeTokens = Arrays.asList(split(someType));
                ListIterator<String> itr2 = typeTokens.listIterator();

                upto(itr2, ANGLE_TOKEN);
                skipToken(itr2, ANGLE_TOKEN);
                String index = itr2.next();
                String genericSignature = context.resolve(index);

                List<String> signatureParts = Arrays.asList(split(genericSignature, ","));
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

                        String newType = replace(someType, ANGLE_TOKEN + " " + index, " < " + singleSignature + " > ");
                        result.add(String.join(" ", split(newType)));
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
        type = removeStart(type.trim(), "readonly ");
        type = removeStart(type.trim(), "typeof ");

        if ( type.contains("<") && !type.startsWith("<") && (!type.contains(ARROW_TOKEN) || type.indexOf(ARROW_TOKEN) > type.indexOf("<"))) {
            // this thing has generic type
            String signature = substringBeforeLast(substringAfter(type, "<"),">").trim();
            String typeWithoutSignature = substringBefore(type, "<").trim();

            switch (typeWithoutSignature) {
                case "Partial":
                case "Readonly":
                case "Required":
                    return resolve(signature, suggestedName, parent);
                case "ReadonlyArray": {
                    TypeName resolve = resolve(signature, suggestedName, parent);
                    if (resolve.isPrimitive() || resolve.toString().equals(String.class.getName())) {
                        return ArrayTypeName.of(resolve);
                    } else {
                        return ParameterizedTypeName.get(ClassName.get(Array.class), resolve(signature, suggestedName, parent));
                    }
                }
                case "Array": {
                    TypeName resolve = resolve(signature, suggestedName, parent);
                    if (resolve.isPrimitive() || resolve.toString().equals(String.class.getName())) {
                        return ArrayTypeName.of(resolve);
                    } else {
                        return ParameterizedTypeName.get(ClassName.get(ReadonlyArray.class), resolve(signature, suggestedName, parent));
                    }
                }
            }

            TypeName resolvedType = resolve(typeWithoutSignature, suggestedName, parent);

            if (resolvedType.isPrimitive() || resolvedType.isBoxedPrimitive() || resolvedType.toString().equals(String.class.getName()) || !(resolvedType instanceof ClassName)) {
                return resolvedType;
            }

            List<TypeName> parameters = new ArrayList<>();

            int index = 1;

            for (String param : split(signature, ",")) {
                TypeName parameterType = resolve(param.trim(), suggestedName + "Param" + (index > 1 ? index : ""), parent);
                if (parameterType.isPrimitive() || parameterType.toString().equals(String.class.getName()) || parameterType.toString().equals("void")) {
                    parameterType = unknown(param.trim());
                } else if (parameterType instanceof ArrayTypeName) {
                    try {
                        parameterType = ParameterizedTypeName.get(ClassName.get(Array.class), ((ArrayTypeName) parameterType).componentType);
                    } catch (IllegalArgumentException e) {
                        parameterType = ParameterizedTypeName.get(ClassName.get(Array.class), unknown(((ArrayTypeName) parameterType).componentType.toString()));
                    }
                }
                parameters.add(parameterType);
                index++;
            }
            return ParameterizedTypeName.get((ClassName) resolvedType, parameters.toArray(new TypeName[]{}));
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

        String[] typeParts = split(type);
        if (type.startsWith(SQUARE_TOKEN)) {
            String resolvedObject = context.resolve(typeParts[1]);
            if (resolvedObject.isEmpty()) {
                return unknown(type);
            }
            List<String> syntheticType = new ArrayList<>();
            int index = 0;
            for (String s : split(resolvedObject, ",")) {
                syntheticType.add(Integer.toString(index));
                syntheticType.add(":");
                syntheticType.addAll(Arrays.asList(split(context.reduce(s))));
                syntheticType.add(";");
                index++;
            }
            if (typeParts.length > 2 && typeParts[typeParts.length-2].equals(SQUARE_TOKEN)) {
                return ArrayTypeName.of(processAnonymousClass(parent, suggestedName + index, String.join(" ", syntheticType)));
            } else {
                return processAnonymousClass(parent, suggestedName + index, String.join(" ", syntheticType));
            }
        }

        if (type.contains(SQUARE_TOKEN)) {
            return ArrayTypeName.of(resolve(split(type, SQUARE_TOKEN)[0], suggestedName, parent));
        }

        if (type.startsWith(FIGURE_TOKEN)) {
            String resolvedObject = context.resolve(typeParts[1]);
            if (resolvedObject.isEmpty()) {
                return any(type);
            }
            return processAnonymousClass(parent, suggestedName, resolvedObject);
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
            return processLambda(parent, suggestedName+"Function", type);
        }

        if (has(type)) {
            return get(type).getClassName();
        }

        if (type.contains("&") || type.startsWith("new ")) {
            log.warn("Unknown type: '"+type +"' for "+suggestedName+" in "+parent.getClassName().simpleName());
            return ClassName.get(Any.class);
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
                return TypeName.DOUBLE;
            case "any":
            case "Object":
            case "object":
                return ClassName.get(Any.class);
            case "Date":
                return ClassName.get(JsDate.class);
            case "Function":
                return ClassName.get(JsFunction.class);
            case "never":
            case "unknown":
            case "null":
            case "undefined":
                return unknown(type);
        }
        try {
            return ClassName.bestGuess(type);
        } catch (IllegalArgumentException e) {
            log.warn("Unknown type: '"+type +"' for "+suggestedName+" in "+parent.getClassName().simpleName());
            return unknown(type);
        }
    }

    private void injectTokenContent(ListIterator<String> itr) {
        String index = itr.next();
        List<String> rest = Arrays.asList(split(upto(itr, "|")));

        List<String> replacement = new ArrayList<>();
        for (String single : split(context.resolve(index), "|")) {
            replacement.addAll(Arrays.asList(split(single)));
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
