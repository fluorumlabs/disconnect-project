package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.IPCHandler;
import com.github.fluorumlabs.disconnect.core.annotations.CompilationUnit;
import com.github.fluorumlabs.disconnect.core.internals.CompilationUnitDescriptor;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectInitializer;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.Set;
import java.util.regex.Pattern;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;


@SupportedAnnotationTypes(
		"com.github.fluorumlabs.disconnect.core.annotations.CompilationUnit")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectCompilationUnitAnnotationProcessor extends AbstractProcessor {

	private static final Pattern CAMELCASE_CONVERT_STAGE1 = Pattern.compile("([a-z0-9])([A-Z])");

	private static final Pattern CAMELCASE_CONVERT_STAGE2 = Pattern.compile("([A-Z])([A-Z])(?=[a-z])");

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
						   RoundEnvironment roundEnv) {
		try {
			for (TypeElement annotation : annotations) {
				Set<? extends Element> annotatedElements
						= roundEnv.getElementsAnnotatedWith(annotation);

				for (Element annotatedElement : annotatedElements) {
					TypeElement compilationUnit = (TypeElement) annotatedElement;

					boolean needsStraping = compilationUnit.getInterfaces().stream()
							.noneMatch(iface -> Runnable.class.getName().equals(iface.toString()));

					String cuName = compilationUnit.getAnnotation(CompilationUnit.class).value();

					if (cuName.isEmpty()) {
						cuName = toKebabCase(StringUtils.uncapitalize(compilationUnit.getSimpleName().toString()));
					}

					MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("main")
							.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
							.addParameter(String[].class, "args")
							.addStatement("$T.init()", DisconnectInitializer.class)
							.addStatement("$T entryPoint = new $T()", compilationUnit, compilationUnit);

					if (needsStraping) {
						methodBuilder.addStatement("$T.setupIPC($T.class, entryPoint)", IPCHandler.class,
								compilationUnit);
					} else {
						methodBuilder.addStatement("entryPoint.run()");
					}

					TypeSpec generatedEntryPoint =
							TypeSpec.classBuilder("Generated" + compilationUnit.getSimpleName() + "EntryPoint")
									.addModifiers(Modifier.PUBLIC)
									.addAnnotation(AnnotationSpec.builder(CompilationUnitDescriptor.class)
											.addMember("value", "$S", cuName).build())
									.addMethod(methodBuilder.build()).build();

					JavaFile javaFile = JavaFile.builder(getPackage(compilationUnit), generatedEntryPoint).build();
					javaFile.writeTo(processingEnv.getFiler());

					FileObject resource = processingEnv.getFiler().createResource(StandardLocation.CLASS_OUTPUT, "",
							cuName + ".compilation-unit");
					try (Writer writer = resource.openWriter()) {
						writer.append(getPackage(compilationUnit)).append(".").append("Generated").append(String.valueOf(compilationUnit.getSimpleName())).append("EntryPoint");
					}

				}
			}
		} catch (IOException e) {
			processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
					"Cannot create generated source: " + e.getMessage());
		}
		return true;
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