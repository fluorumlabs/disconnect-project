package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectInitializer;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.util.Set;


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
                            .noneMatch(iface -> Runnable.class.getName().equals(iface.toString())
                            )) {
                        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Application entry point does not implement Runnable");
                    } else {
                        TypeSpec generatedEntryPoint = TypeSpec.classBuilder("GeneratedEntryPoint")
                                .addModifiers(Modifier.PUBLIC)
                                .addMethod(MethodSpec.methodBuilder("main")
                                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                                        .addParameter(String[].class, "args")
                                        .addStatement("$T.init()", DisconnectInitializer.class)
                                        .addStatement("$T entryPoint = new $T()", entryPoint, entryPoint)
                                        .addStatement("entryPoint.run()")
                                        .build()).build();

                        JavaFile javaFile = JavaFile.builder("com.github.fluorumlabs.disconnect.client", generatedEntryPoint).build();
                        javaFile.writeTo(processingEnv.getFiler());
                    }
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

}