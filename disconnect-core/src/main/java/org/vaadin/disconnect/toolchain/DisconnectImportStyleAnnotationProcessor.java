package org.vaadin.disconnect.toolchain;

import com.google.auto.service.AutoService;
import org.apache.commons.lang3.StringUtils;
import org.vaadin.disconnect.core.annotations.ImportStyleModule;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@SupportedAnnotationTypes(
        "org.vaadin.disconnect.core.annotations.ImportStyleModule")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectImportStyleAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends TypeElement> annotatedElements
                        = (Set<? extends TypeElement>) roundEnv.getElementsAnnotatedWith(annotation);

                for (TypeElement annotatedElement : annotatedElements) {
                    String className = annotatedElement.getSimpleName().toString();
                    String packageName = getPackage(annotatedElement);
                    String moduleName = annotatedElement.getAnnotation(ImportStyleModule.class).module();
                    writeStyle(packageName, className, moduleName);
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private void writeStyle(
            String packageName,
            String className,
            String styleName)
            throws IOException {

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName + "." + className+"$Style");

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            out.println(StringUtils.replaceEach("package PACKAGE;\n" +
                    "\n" +
                    "import org.teavm.jso.JSBody;\n" +
                    "import org.teavm.jso.JSIndexer;\n" +
                    "import org.teavm.jso.JSObject;\n" +
                    "import org.vaadin.disconnect.core.annotations.Import;\n" +
                    "\n" +
                    "@Import(symbols = \"CLASS_style\", module = \"MODULE\")\n" +
                    "abstract class CLASS$Style implements JSObject {\n" +
                    "    public static String get(String className) {\n" +
                    "        return imports().getDef(className);\n" +
                    "    }\n" +
                    "    \n" +
                    "    @JSBody(script = \"return CLASS_style\")\n" +
                    "    private static native CLASS$Style imports();\n" +
                    "\n" +
                    "    @JSIndexer\n" +
                    "    private native String getDef(String className);\n" +
                    "}", new String[]{"PACKAGE","CLASS","MODULE"}, new String[]{packageName, className, styleName}));
        }
    }

    private String getPackage(Element element) {
        Element currentElement = element;
        while (currentElement != null && currentElement.getKind() != ElementKind.PACKAGE) {
            currentElement = currentElement.getEnclosingElement();
        }
        if (currentElement == null) return "";
        return ((PackageElement)currentElement).getQualifiedName().toString();
    }
}