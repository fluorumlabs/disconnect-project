package org.vaadin.disconnect.vue.toolchain;

import com.google.auto.service.AutoService;
import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.PersistToLocalStorage;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@SupportedAnnotationTypes(
        "org.vaadin.disconnect.vue.annotations.VuexState")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectVueStateAnnotationProcessor extends AbstractProcessor {

    private Set<String> stores = new HashSet<>();

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends TypeElement> annotatedElements
                        = (Set<? extends TypeElement>) roundEnv.getElementsAnnotatedWith(annotation);

                for (TypeElement annotatedElement : annotatedElements) {
                    processVueState(annotatedElement, roundEnv);
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private void processVueState(TypeElement typedElement, RoundEnvironment roundEnv) throws IOException {
        String packageName = getPackage(typedElement);
        String generatedClassName = typedElement.getSimpleName().toString() + "$$Store";
        String mirrorName = typedElement.getQualifiedName().toString().replace(".","_");

        stores.add(typedElement.getQualifiedName().toString() + "$$Store");

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName + "." + generatedClassName);

        boolean hasLocalStorage = typedElement.getAnnotation(PersistToLocalStorage.class) != null;

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            formatLine(out, "package %s;", packageName);
            formatLine(out, "import org.teavm.jso.JSBody;");
            formatLine(out, "import org.teavm.jso.JSObject;");
            formatLine(out, "import org.teavm.jso.core.JSArray;");
            formatLine(out, "import org.teavm.jso.core.JSObjects;");
            formatLine(out, "import org.teavm.platform.Platform;");
            formatLine(out, "import org.teavm.platform.PlatformObject;");
            formatLine(out, "import org.vaadin.disconnect.core.client.internals.DisconnectUtils;");
            formatLine(out, "import org.vaadin.disconnect.vue.client.state.Vuex;");
            formatLine(out, "import org.vaadin.disconnect.vue.client.state.VuexPersist;");
            formatLine(out, "import org.vaadin.disconnect.vue.client.internals.StatePersistence;");
            formatLine(out, "import org.vaadin.disconnect.vue.client.internals.StoreDefinition;");
            formatLine(out, "import org.vaadin.disconnect.vue.client.internals.StoreInstance;");
            formatLine(out, "public class %s {", generatedClassName);
            formatLine(out, "static {");
            if (hasLocalStorage) {
                formatLine(out, "%s instance = StatePersistence.read(%s.class, \"%s\");", typedElement.getSimpleName().toString(), typedElement.getSimpleName().toString(), typedElement.getSimpleName().toString());
                formatLine(out, "if (instance == null) {");
                formatLine(out, "instance = new %s();", typedElement.getSimpleName().toString());
                formatLine(out, "}");
            } else {
                formatLine(out, "%s instance = new %s();", typedElement.getSimpleName().toString(), typedElement.getSimpleName().toString());
            }
            formatLine(out, "StoreDefinition definition = JSObjects.create();");
            formatLine(out, "definition.setState(DisconnectUtils.asJsObject(instance));");
            formatLine(out, "definition.setMutations(JSObjects.create());");

            formatMutatorRegistrations(out, typedElement, roundEnv);

            formatLine(out, "Vuex.registerModule(\"%s\", definition);", typedElement.getSimpleName());
            formatLine(out, "}");

            formatLine(out, "public static %s getInstance() { return DisconnectUtils.asJavaObject(Vuex.getState(\"%s\")); }", typedElement.getSimpleName(), typedElement.getSimpleName());

            formatMethods(out, typedElement, roundEnv, hasLocalStorage);

            formatLine(out, "}");
        }
    }

    private void formatMethods(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv, boolean hasLocalStorage) {
        formatMethods(out, typedElement, roundEnv, Mutation.class, "commit", hasLocalStorage);
        formatNormalMethods(out, typedElement, roundEnv);
    }

    private void formatMethods(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv, Class<? extends Annotation> annotation, String method, boolean hasLocalStorage) {
        ElementFilter.methodsIn(typedElement.getEnclosedElements()).stream()
                .filter(ee -> ee.getAnnotation(annotation) != null)
                .forEach(ee -> {
                    format(out, "public static void %s(", ee.getSimpleName());

                    format(out, ee.getParameters().stream()
                            .map(ve -> ve.asType().toString() + " " + ve.getSimpleName())
                            .collect(Collectors.joining(", ")));

                    formatLine(out, ") {");

                    format(out, "Vuex.%s(\"%s_%s\", Vuex.convertPayload(", method, typedElement.getSimpleName().toString(), ee.getSimpleName());
                    format(out, ee.getParameters().stream()
                            .map(VariableElement::getSimpleName)
                            .collect(Collectors.joining(", ")));

                    formatLine(out, "));");
                    formatLine(out, "}");

                    formatLine(out, "public static void _%s(JSObject state, JSArray<JSObject> args) {", ee.getSimpleName());
                    formatLine(out, "%s instance = DisconnectUtils.asJavaObject(state);", typedElement.getSimpleName().toString());

                    if (!ee.getParameters().isEmpty()) {
                        formatLine(out, "Object[] arguments = Vuex.convertPayload(args);");

                        for (int i = 0; i < ee.getParameters().size(); i++) {
                            String type = ee.getParameters().get(i).asType().toString();
                            String name = ee.getParameters().get(i).getSimpleName().toString();
                            formatLine(out, "%s %s = (%s)arguments[%d];", type, name, type, i);
                        }

                    }

                    format(out, "instance.%s(", ee.getSimpleName());

                    for (int i = 0; i < ee.getParameters().size(); i++) {
                        if (i > 0) {
                            format(out, ",");
                        }
                        format(out, "%s", ee.getParameters().get(i).getSimpleName());
                    }

                    formatLine(out, ");");
                    if (hasLocalStorage) {
                        formatLine(out, "StatePersistence.write(%s.class, \"%s\", instance);", typedElement.getSimpleName().toString(), typedElement.getSimpleName().toString());
                    }
                    formatLine(out, "}");
                });

    }

    private void formatNormalMethods(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        ElementFilter.methodsIn(typedElement.getEnclosedElements()).stream()
                .filter(ee -> ee.getAnnotation(Mutation.class) == null)
                .forEach(ee -> {
                    format(out, "public static %s %s(", ee.getReturnType().toString(), ee.getSimpleName());

                    format(out, ee.getParameters().stream()
                            .map(ve -> ve.asType().toString() + " " + ve.getSimpleName())
                            .collect(Collectors.joining(", ")));

                    formatLine(out, ") {");

                    formatLine(out, "return getInstance().%s(", ee.getSimpleName());

                    format(out, ee.getParameters().stream()
                            .map(VariableElement::getSimpleName)
                            .collect(Collectors.joining(", ")));

                    formatLine(out, ");");
                    formatLine(out, "}");
                });

    }

    private void formatMutatorRegistrations(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        ElementFilter.methodsIn(typedElement.getEnclosedElements()).stream()
                .filter(ee -> ee.getAnnotation(Mutation.class) != null)
                .forEach(ee -> {
                    formatLine(out, "definition.registerMutation(\"%s_%s\", (state, payload) -> _%s(state, payload));", typedElement.getSimpleName(), ee.getSimpleName(), ee.getSimpleName());
                });
    }

    public static void formatLine(PrintWriter writer, String format, Object... args) {
        writer.println(String.format(format, args));
    }

    public static void format(PrintWriter writer, String format, Object... args) {
        writer.print(String.format(format, args));
    }

    private String getPackage(Element element) {
        Element currentElement = element;
        while (currentElement != null && currentElement.getKind() != ElementKind.PACKAGE) {
            currentElement = currentElement.getEnclosingElement();
        }
        if (currentElement == null) return "";
        return ((PackageElement) currentElement).getQualifiedName().toString();
    }

}