package com.github.fluorumlabs.disconnect.vue.toolchain;

import com.google.auto.service.AutoService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@SupportedAnnotationTypes(
        "com.github.fluorumlabs.disconnect.core.annotations.EntryPoint")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectEntryPointAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends Element> annotatedElements
                        = roundEnv.getElementsAnnotatedWith(annotation);

                if (annotatedElements.isEmpty()) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Application entry point not found (Runnable with @EntryPoint annotation)");
                } else if (annotatedElements.size() > 1) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "More than one entry point found (Runnable with @EntryPoint annotation)");
                } else {
                    TypeElement entryPoint = (TypeElement) annotatedElements.toArray()[0];

                    if (entryPoint.getInterfaces().stream()
                            .noneMatch(iface -> Runnable.class.getName().equals(((TypeMirror) iface).toString())
                            )) {
                        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Application entry point does not implement Runnable");
                    } else {
                        String className = entryPoint.getQualifiedName().toString();
                        writeMain(className);
                    }
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private void writeMain(
            String className)
            throws IOException {

        String packageName = "com.github.fluorumlabs.disconnect.client";

        String simpleClassName = "GeneratedEntryPoint";

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName + "." + simpleClassName);

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            out.println(StringUtils.replace("package com.github.fluorumlabs.disconnect.client;\n" +
                    "\n" +
                    "class GeneratedEntryPoint {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        CLASS entryPoint = new CLASS();\n" +
                    "        entryPoint.run();\n" +
                    "    }\n" +
                    "}", "CLASS", className));
        }
    }
}