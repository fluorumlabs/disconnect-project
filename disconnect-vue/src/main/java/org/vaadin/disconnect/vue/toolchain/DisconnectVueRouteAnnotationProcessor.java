package org.vaadin.disconnect.vue.toolchain;

import com.google.auto.service.AutoService;
import org.apache.commons.lang3.StringUtils;
import org.vaadin.disconnect.core.server.RPCHandler;
import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.RouteAlias;
import org.vaadin.disconnect.vue.client.ui.HasRouterView;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 8/19/2019.
 */
@SupportedAnnotationTypes(
        "org.vaadin.disconnect.vue.annotations.Route")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectVueRouteAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends TypeElement> annotatedElements
                        = (Set<? extends TypeElement>) roundEnv.getElementsAnnotatedWith(annotation);

                for (TypeElement annotatedElement : annotatedElements) {
                    processVueRoute(annotatedElement, roundEnv);
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private void processVueRoute(TypeElement typedElement, RoundEnvironment roundEnv) throws IOException {
        String packageName = getPackage(typedElement);
        String generatedClassName = typedElement.getSimpleName().toString() + "$$Route";

        JavaFileObject builderFile = processingEnv.getFiler()
                .createSourceFile(packageName + "." + generatedClassName);

        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
            formatLine(out, "package %s;", packageName);
            formatLine(out, "import org.vaadin.disconnect.vue.client.router.RouteConfiguration;");
            formatLine(out, "@com.google.auto.service.AutoService(RouteConfiguration.class)");
            formatLine(out, "public class %s implements RouteConfiguration {", generatedClassName);

            formatLine(out, "public Class<?> view() { return %s.class; }", typedElement.getQualifiedName());

            Route annotation = typedElement.getAnnotation(Route.class);
            String path = annotation.value();

            if (annotation.value().equals(Route.FROM_CLASS_NAME)) {
                String className = StringUtils.removeEnd(typedElement.getSimpleName().toString(), "View");
                path = RPCHandler.toKebabCase(className);
            }

            Class<?> parentClazz = null;
            TypeMirror parent = null;

            try {
                parentClazz = annotation.parent();
            } catch (MirroredTypeException mte) {
                parent = mte.getTypeMirror();
            }

            if (parentClazz != null && parentClazz != void.class) {
                formatLine(out, "public String path() { return \"%s\"; }", path);
                formatLine(out, "public Class<?> layout() { return %s.class; }", parentClazz.getName());
            } else if (parent != null && !parent.toString().equals(void.class.getName())) {
                formatLine(out, "public String path() { return \"%s\"; }", path);
                formatLine(out, "public Class<?> layout() { return %s.class; }", parent.toString());
            } else {
                formatLine(out, "public String path() { return \"%s\"; }", StringUtils.prependIfMissing(path,"/"));
                formatLine(out, "public Class<?> layout() { return null; }");
            }


            format(out, "public String[] aliases() { return new String[]{");
            format(out, "%s", Stream.of(typedElement.getAnnotationsByType(RouteAlias.class))
                    .map(RouteAlias::value)
                    .map(p -> "\"" + p + "\"")
                    .collect(Collectors.joining(", ")));
            formatLine(out, "}; }");
            formatLine(out, "}");
        }
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