package com.github.fluorumlabs.disconnect.preact.toolchain;

import com.google.auto.service.AutoService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * Created by Artem Godin on 8/15/2019.
 */
@SupportedAnnotationTypes(
        "com.github.fluorumlabs.disconnect.vue.annotations.VueModel")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectVueModelAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {
                    writeBuilderFile(element);
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: "+e.getMessage());
        }
        return true;
    }

    private void writeBuilderFile(
            Element modelInterface)
            throws IOException {

        String className = modelInterface.asType().toString();

        String packageName = getPackage(modelInterface);

        String actionsClassName = StringUtils.replace(StringUtils.removeStart(className, packageName+".") + "$Instance", ".", "$");

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName+"."+actionsClassName);

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            if (packageName != null) {
                out.print("package ");
                out.print(packageName);
                out.println(";");
                out.println();
            }

            out.print("public abstract class ");
            out.print(actionsClassName);
            out.print(" implements ");
            out.print(className);
            out.println(" {");
            out.println("    private com.github.fluorumlabs.disconnect.vue.client.VueComponent instance;");
            out.println();
            out.println("    public com.github.fluorumlabs.disconnect.vue.client.VueComponent getInstance() { return instance; }");
            out.println();
            out.println("    public void setInstance(com.github.fluorumlabs.disconnect.vue.client.VueComponent instance) { this.instance = instance; }");
            out.println("}");
        }
    }

    private String getPackage(Element x) {
        Element current = x;
        while ( current != null && current.getKind() != ElementKind.PACKAGE) {
            current = current.getEnclosingElement();
        }
        return current != null ? current.asType().toString() : null;
    }
}