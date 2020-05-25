package com.github.fluorumlabs.disconnect.zero.toolchain;

import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.zero.component.CustomElementComponent;
import com.github.fluorumlabs.disconnect.zero.internals.CustomElementRegistration;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;


@SupportedAnnotationTypes(
		"com.github.fluorumlabs.disconnect.zero.annotations.CustomElement")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectCustomElementAnnotationProcessor extends AbstractProcessor {
	private static final Pattern PACKAGE_PART = Pattern.compile("([a-z])([a-z0-9_-]*\\.?)");

	private static final Pattern CAMELCASE_CONVERT_STAGE1 = Pattern.compile("([a-z0-9])([A-Z])");

	private static final Pattern CAMELCASE_CONVERT_STAGE2 = Pattern.compile("([A-Z])([A-Z])(?=[a-z])");

	private static final Set<String> CUSTOM_ELEMENT_COMPONENTS = new HashSet<>();

	private static final String SERVICE_PATH = "META-INF/services/com.github.fluorumlabs.disconnect.zero.internals" +
			".CustomElementRegistration";

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
						   RoundEnvironment roundEnv) {
		try {
			if (roundEnv.processingOver()) {
				Filer filer = processingEnv.getFiler();
				FileObject fileObject = filer.createResource(StandardLocation.CLASS_OUTPUT, "",
						SERVICE_PATH);
				try (Writer writer = fileObject.openWriter()) {
					for (String customElementComponent : CUSTOM_ELEMENT_COMPONENTS) {
						writer.append(customElementComponent).append('\n');
					}
				}
			} else {
				for (TypeElement annotation : annotations) {
					Set<? extends Element> annotatedElements
							= roundEnv.getElementsAnnotatedWith(annotation);

					for (Element annotatedElement : annotatedElements) {
						TypeElement customElement = (TypeElement) annotatedElement;

						CustomElement customElementAnnotation = customElement.getAnnotation(CustomElement.class);

						String customElementPackage = getPackage(customElement);
						String customElementClass = customElement.getSimpleName().toString();
						String tagName = StringUtils.defaultIfEmpty(customElementAnnotation.tagName(),
								PACKAGE_PART.matcher(customElementPackage).replaceAll("$1") + "-" + toKebabCase(StringUtils.uncapitalize(customElementClass)));

						MethodSpec getTagNameMethod = MethodSpec.methodBuilder("getTagName")
								.addModifiers(Modifier.PUBLIC)
								.returns(String.class)
								.addStatement("return $S", tagName)
								.build();

						MethodSpec getComponentClassMethod = MethodSpec.methodBuilder("getComponentClass")
								.addModifiers(Modifier.PUBLIC)
								.returns(ParameterizedTypeName.get(ClassName.get(Class.class),
										WildcardTypeName.subtypeOf(CustomElementComponent.class)))
								.addStatement("return $T.class", customElement)
								.build();

						TypeSpec customElementRegistration =
								TypeSpec.classBuilder(customElement.getSimpleName() + "Registration")
										.addModifiers(Modifier.PUBLIC)
										.addSuperinterface(CustomElementRegistration.class)
										.addMethod(getTagNameMethod)
										.addMethod(getComponentClassMethod)
										.build();

						JavaFile javaFile = JavaFile.builder(customElementPackage, customElementRegistration).build();
						javaFile.writeTo(processingEnv.getFiler());

						CUSTOM_ELEMENT_COMPONENTS.add(customElementPackage + "." + customElement.getSimpleName() +
								"Registration");
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