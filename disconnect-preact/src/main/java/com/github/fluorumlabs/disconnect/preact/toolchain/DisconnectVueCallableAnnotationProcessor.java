package com.github.fluorumlabs.disconnect.preact.toolchain;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ExecutableType;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

/**
 * Created by Artem Godin on 8/15/2019.
 */
@SupportedAnnotationTypes(
        "com.github.fluorumlabs.disconnect.vue.annotations.Callable")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectVueCallableAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends Element> annotatedElements
                        = roundEnv.getElementsAnnotatedWith(annotation);

                Element firstElement = (Element)annotatedElements.toArray()[0];
                String className = firstElement.getEnclosingElement().asType().toString();

                writeBuilderFile(className, annotatedElements);
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: "+e.getMessage());
        }
        return true;
    }

    private void writeBuilderFile(
            String className, Set<? extends Element> annotatedElements)
            throws IOException {

        String packageName = null;
        int lastDot = className.lastIndexOf('.');
        if (lastDot > 0) {
            packageName = className.substring(0, lastDot);
        }

        String simpleClassName = className.substring(lastDot + 1);
        String actionsClassName = className + "$MethodRegistration";
        String actionsSimpleClassName = actionsClassName
                .substring(lastDot + 1);

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(actionsClassName);

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {

            if (packageName != null) {
                out.print("package ");
                out.print(packageName);
                out.println(";");
                out.println();
            }

            out.print("public class ");
            out.print(actionsSimpleClassName);
            out.println(" {");
            out.println();

            out.print("    public static void apply(");

            out.print(simpleClassName);
            out.print(" ");
            out.print("instance");

            out.println(") {");
            annotatedElements.forEach(element -> {
                String methodName = element.getSimpleName().toString();

                out.print("        ");
                out.print("instance.getJsInstance().registerMethod(\"");

                out.print(methodName);

                out.print("\", (args) -> new Thread(() -> instance.");

                out.print(methodName);

                out.print("(");

                int index = 0;
                List<? extends TypeMirror> parameters = ((ExecutableType)element.asType()).getParameterTypes();
                for (TypeMirror parameter : parameters) {
                    out.print("(");
                    out.print(parameter.toString());
                    out.print(") ");

                    out.print("args[");
                    out.print(index);
                    out.print("]");

                    index++;
                    if (index < parameters.size()) {
                        out.print(", ");
                    }
                }
                //...

                out.println(")).start());");

                out.println("    }");
                out.println();
            });

            out.println("}");
        }
    }
}