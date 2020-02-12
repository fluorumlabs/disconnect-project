package com.github.fluorumlabs.disconnect.core.toolchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fluorumlabs.disconnect.core.RPCResult;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import java.io.Serializable;
import java.util.Set;


@SupportedAnnotationTypes(
		"com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectAllowClientCallsAnnotationProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
						   RoundEnvironment roundEnv) {
		try {
			for (TypeElement annotation : annotations) {
				Set<? extends ExecutableElement> annotatedElements
						= (Set<? extends ExecutableElement>) roundEnv.getElementsAnnotatedWith(annotation);

				for (ExecutableElement annotatedElement : annotatedElements) {
					String packageName = getPackage(annotatedElement);

					Element owner = annotatedElement.getEnclosingElement();
					String methodName = annotatedElement.getSimpleName().toString();

					String baseClassName =
							owner.getSimpleName().toString() + StringUtils.capitalize(methodName);

					TypeSpec.Builder argumentsBuilder = TypeSpec.classBuilder(baseClassName + "Arguments")
							.addModifiers(Modifier.PUBLIC)
							.addSuperinterface(Serializable.class);

					int index = 0;

					for (VariableElement parameter : annotatedElement.getParameters()) {
						argumentsBuilder.addField(FieldSpec.builder(TypeName.get(parameter.asType()),
								"arg" + index, Modifier.PUBLIC)
								.addAnnotation(AnnotationSpec.builder(JsonProperty.class).addMember("value", "$S",
										index).build()).build());
						index++;
					}

					TypeSpec.Builder resultBuilder = TypeSpec.classBuilder(baseClassName + "Result")
							.addModifiers(Modifier.PUBLIC)
							.superclass(RPCResult.class)
							.addSuperinterface(Serializable.class);

					if (!annotatedElement.getReturnType().toString().equals("void")) {
						resultBuilder.addField(FieldSpec.builder(TypeName.get(annotatedElement.getReturnType()),
								"result", Modifier.PUBLIC).build());
					}

					JavaFile argsJBuilder =
							JavaFile.builder(packageName, argumentsBuilder.build()).indent("\t").build();
					JavaFile resultJBuilder =
							JavaFile.builder(packageName, resultBuilder.build()).indent("\t").build();

					argsJBuilder.writeTo(processingEnv.getFiler());
					resultJBuilder.writeTo(processingEnv.getFiler());
				}
			}
		} catch (Exception e) {
			processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
					"Cannot create generated source: " + e.getMessage());
		}
		return true;
	}

    /*private void writeStyle(
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
                    "import js.lang.Any;\n" +
                    "import org.vaadin.disconnect.core.annotations.Import;\n" +
                    "\n" +
                    "@Import(symbols = \"CLASS_style\", module = \"MODULE\")\n" +
                    "abstract class CLASS$Style implements Any {\n" +
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
    }*/

	private String getPackage(Element element) {
		Element currentElement = element;
		while (currentElement != null && currentElement.getKind() != ElementKind.PACKAGE) {
			currentElement = currentElement.getEnclosingElement();
		}
		if (currentElement == null) return "";
		return ((PackageElement) currentElement).getQualifiedName().toString();
	}
}