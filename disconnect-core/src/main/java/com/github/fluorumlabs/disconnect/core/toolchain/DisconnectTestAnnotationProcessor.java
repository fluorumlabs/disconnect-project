package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.internals.CompilationUnitDescriptor;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectInitializer;
import com.github.fluorumlabs.disconnect.core.internals.DisconnectTestUtils;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import org.apache.commons.lang3.StringUtils;
import org.junit.*;
import org.junit.runner.RunWith;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.util.regex.Pattern;


@SupportedAnnotationTypes(
		"org.junit.runner.RunWith")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectTestAnnotationProcessor extends AbstractProcessor {

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

					RunWith runWithAnnotation = compilationUnit.getAnnotation(RunWith.class);
					TypeMirror runWithValue = null;
					if (runWithAnnotation != null) {
						try {
							runWithAnnotation.value();
						} catch (MirroredTypeException mte) {
							runWithValue = mte.getTypeMirror();
						}
					}

					if (runWithValue == null || !runWithValue.toString().equals(DisconnectTestRunner.class.getName())) {
						continue; // Skip non-disconnect tests
					}

					String cuNameBase = compilationUnit.getSimpleName().toString();

					MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("main")
							.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
							.addParameter(String[].class, "args")
							.addStatement("$T.init()", DisconnectInitializer.class)
							.addStatement("$T entryPoint = new $T()", compilationUnit, compilationUnit);

					methodBuilder.addStatement("$T<String> methods = $T.getMethodsToTest()", Set.class, DisconnectTestUtils.class);

					methodBuilder.beginControlFlow("try");
					callAnnotatedMethods(methodBuilder, compilationUnit, BeforeClass.class);

					for (ExecutableElement executableElement :
							ElementFilter.methodsIn(compilationUnit.getEnclosedElements())) {
						String methodName = executableElement.getSimpleName().toString();

						if (executableElement.getAnnotation(Test.class) == null && (!methodName.startsWith("test") || methodName.length() <= 4 || methodName.charAt(4) < 'A' || methodName.charAt(4) > 'Z')) {
							continue;
						}

						methodBuilder.beginControlFlow("if (methods.contains($S))", methodName);

						methodBuilder.beginControlFlow("try");
						callAnnotatedMethods(methodBuilder, compilationUnit, Before.class);
						methodBuilder.addStatement("entryPoint.$L()", methodName);
						callAnnotatedMethods(methodBuilder, compilationUnit, After.class);
						methodBuilder.addStatement("$T.ok($S)", DisconnectTestUtils.class, methodName);

						methodBuilder.nextControlFlow("catch ($T e)", Throwable.class);
						methodBuilder.addStatement("$T.fail($S, e)", DisconnectTestUtils.class, methodName);
						methodBuilder.endControlFlow();

						methodBuilder.endControlFlow();
					}

					callAnnotatedMethods(methodBuilder, compilationUnit, AfterClass.class);
					methodBuilder.addStatement("$T.epicOk()", DisconnectTestUtils.class);

					methodBuilder.nextControlFlow("catch ($T e)", Throwable.class);
					methodBuilder.addStatement("$T.epicFail(e)", DisconnectTestUtils.class);
					methodBuilder.endControlFlow();

					String jsName = StringUtils.replaceChars(getPackage(compilationUnit) + "." + cuNameBase, '.', '_');

					TypeSpec generatedEntryPoint =
							TypeSpec.classBuilder("Generated" + cuNameBase + "EntryPoint")
									.addModifiers(Modifier.PUBLIC)
									.addAnnotation(AnnotationSpec.builder(CompilationUnitDescriptor.class)
											.addMember("value", "$S", jsName).build())
									.addMethod(methodBuilder.build()).build();

					JavaFile javaFile = JavaFile.builder(getPackage(compilationUnit), generatedEntryPoint).build();
					javaFile.writeTo(processingEnv.getFiler());

					FileObject resource = processingEnv.getFiler().createResource(StandardLocation.CLASS_OUTPUT,
							"",
							jsName + ".test-unit");
					try (Writer writer = resource.openWriter()) {
						writer.append(getPackage(compilationUnit)).append(".").append("Generated").append(cuNameBase).append("EntryPoint");
					}
				}
			}
		} catch (Exception e) {
			processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, e.getMessage());
		}
		return true;
	}

	private void callAnnotatedMethods(MethodSpec.Builder methodBuilder, TypeElement compilationUnit, Class<?
			extends Annotation> annotation) {
		for (ExecutableElement executableElement : ElementFilter.methodsIn(compilationUnit.getEnclosedElements())) {
			if (executableElement.getAnnotation(annotation) != null) {
				methodBuilder.addStatement("entryPoint.$L()", executableElement.getSimpleName().toString());
			}
		}
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