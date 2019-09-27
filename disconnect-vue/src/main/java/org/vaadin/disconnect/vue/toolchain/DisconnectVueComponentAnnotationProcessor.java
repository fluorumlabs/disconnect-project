package org.vaadin.disconnect.vue.toolchain;

import com.google.auto.service.AutoService;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;
import org.vaadin.disconnect.vue.client.internals.ComponentInstance;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Set;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@SupportedAnnotationTypes(
        "org.vaadin.disconnect.vue.annotations.VueComponent")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectVueComponentAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends TypeElement> annotatedElements
                        = (Set<? extends TypeElement>) roundEnv.getElementsAnnotatedWith(annotation);

                for (TypeElement annotatedElement : annotatedElements) {
                    processVueComponent(annotatedElement, roundEnv);
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private void processVueComponent(TypeElement typedElement, RoundEnvironment roundEnv) throws IOException {
        String packageName = getPackage(typedElement);
        String generatedClassName = typedElement.getSimpleName().toString() + "$$Generated";

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName + "." + generatedClassName);

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            formatLine(out, "package %s;", packageName);
            formatLine(out, "public abstract class %s implements %s {", generatedClassName, JSObject.class.getName());

            formatComponentDefinition(out, typedElement, roundEnv);
            formatInstantiator(out, typedElement, roundEnv);

            formatLine(out, "}");
        }
    }

    private void formatInstantiator(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        formatLine(out, "public static void instantiate(org.vaadin.disconnect.vue.client.internals.ComponentInstance instance) {");
        formatLine(out, "new %s().linkInstance(instance);", typedElement.getQualifiedName().toString());
        formatLine(out, "}");
    }

    private void formatComponentDefinition(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        format(out, "@%s(script=\"return {", JSBody.class.getName());

        formatName(out, typedElement, roundEnv);
        formatData(out, typedElement, roundEnv);
        formatBeforeCreateMethod(out, typedElement, roundEnv);
        formatCallbackMethod(out, "created", typedElement, roundEnv);
        formatCallbackMethod(out, "beforeMount", typedElement, roundEnv);
        formatCallbackMethod(out, "mounted", typedElement, roundEnv);
        formatCallbackMethod(out, "beforeUpdate", typedElement, roundEnv);
        formatCallbackMethod(out, "updated", typedElement, roundEnv);
        formatCallbackMethod(out, "activated", typedElement, roundEnv);
        formatCallbackMethod(out, "deactivated", typedElement, roundEnv);
        formatCallbackMethod(out, "beforeDestroy", typedElement, roundEnv);
        formatCallbackMethod(out, "destroyed", typedElement, roundEnv);

        formatLine(out, "}\")");
        formatLine(out, "public static native %s getComponentDefinition();", ComponentDefinition.class.getName());
    }

    private void formatBeforeCreateMethod(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        //TODO REMOVE format(out,", created: function() {");
        format(out, ", beforeCreate: function() {");
        format(out, "javaMethods.get('%s').invoke(this)", getMethodSignature(typedElement.getQualifiedName().toString() + "$$Generated", "instantiate", void.class, ComponentInstance.class));
        format(out, "}");
    }

    private void formatCallbackMethod(PrintWriter out, String callback, TypeElement typedElement, RoundEnvironment roundEnv) {
        format(out, ", %s: function() {", callback);
        format(out, "this.__%s()", callback);
        format(out, "}");
    }

    private void formatName(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        format(out, "name: '%s'", typedElement.getSimpleName().toString());
    }

    private void formatData(PrintWriter out, TypeElement typedElement, RoundEnvironment roundEnv) {
        format(out, ", data: function() { return {");

        //TODO REMOVE format(out, "%s", ElementFilter.fieldsIn(typedElement.getEnclosedElements()).stream()
        //        .filter(variableElement -> !variableElement.getModifiers().contains(Modifier.STATIC))
        //        .map(variableElement -> variableElement.getSimpleName().toString() + ": null")
        //        .collect(Collectors.joining(",")));

        format(out, "}}");
    }

    private String getMethodSignature(String qualifiedName, String methodName, Class<?> returnType, Class<?>... argumentTypes) {
        StringBuilder signature = new StringBuilder();

        signature.append(qualifiedName.toString());
        signature.append(".");
        signature.append(methodName);
        signature.append("(");

        for (Class<?> c : argumentTypes) {
            String sig = Array.newInstance(c, 0).toString();
            signature.append(sig.replace('.', '/'), 1, sig.indexOf('@'));
        }

        signature.append(")");

        if (returnType == void.class) {
            signature.append("V");
        } else {
            String sig = Array.newInstance(returnType, 0).toString();
            signature.append(sig.replace('.', '/'), 1, sig.indexOf('@'));
        }

        return signature.toString();
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