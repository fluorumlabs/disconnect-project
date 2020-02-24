package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.ImportStyleModule;
import com.google.auto.service.AutoService;
import com.helger.css.ECSSVersion;
import com.helger.css.decl.CSSSelectorSimpleMember;
import com.helger.css.decl.CascadingStyleSheet;
import com.helger.css.reader.CSSReader;
import com.squareup.javapoet.*;
import js.lang.Any;
import org.apache.commons.lang3.StringUtils;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;


@SupportedAnnotationTypes(
		"com.github.fluorumlabs.disconnect.core.annotations.ImportStyleModule")
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
					if (moduleName.startsWith("./")) {
						writeStyle(packageName, className, moduleName);
					}
				}
			}
		} catch (IOException e) {
			processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
					"Cannot create generated source: " + e.getMessage());
		}
		return true;
	}

	private void writeStyle(
			String packageName,
			String className,
			String styleName)
			throws IOException {

		TypeSpec.Builder builder = TypeSpec.classBuilder(className + "Styles")
				.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
				.addSuperinterface(Any.class);

		MethodSpec.Builder indexer = MethodSpec.methodBuilder("getDef")
				.addModifiers(Modifier.PRIVATE, Modifier.NATIVE)
				.addAnnotation(JSIndexer.class)
				.returns(String.class)
				.addParameter(String.class, "className");

		MethodSpec.Builder imports = MethodSpec.methodBuilder("imports")
				.addModifiers(Modifier.PRIVATE, Modifier.NATIVE, Modifier.STATIC)
				.addAnnotation(AnnotationSpec.builder(JSBody.class).addMember("script", "$S",
						"return " + className + "_style").build())
				.returns(ClassName.bestGuess(className + "Styles"));

		MethodSpec.Builder getter = MethodSpec.methodBuilder("get")
				.addModifiers(Modifier.PRIVATE, Modifier.STATIC)
				.returns(String.class)
				.addParameter(String.class, "className")
				.addCode("$L\n", "return imports().getDef(className);");

		FileObject styles = processingEnv.getFiler().getResource(StandardLocation.CLASS_OUTPUT, "",
				"frontend/"+StringUtils.removeStart(styleName, "./"));

		String css = styles.getCharContent(true).toString();

		CascadingStyleSheet cascadingStyleSheet = CSSReader.readFromString(css, ECSSVersion.CSS30);
		if (cascadingStyleSheet == null) {
			processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Invalid css style sheet from " +
					"resources: " + styles.getName());
		} else {
			cascadingStyleSheet.getAllStyleRules().stream().flatMap(cssStyleRule -> cssStyleRule.getAllSelectors().stream())
					.flatMap(cssSelector -> cssSelector.getAllMembers().stream())
					.filter(CSSSelectorSimpleMember.class::isInstance)
					.map(CSSSelectorSimpleMember.class::cast)
					.filter(CSSSelectorSimpleMember::isClass)
					.map(CSSSelectorSimpleMember::getValue)
					.distinct()
					.sorted()
					.forEach(cssClass -> {
						String identifier =
								StringUtils.removeStart(cssClass, ".").toUpperCase(Locale.ENGLISH).replace('-',
										'_');
						FieldSpec.Builder field = FieldSpec.builder(String.class, identifier)
								.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
								.initializer("get($S)", StringUtils.removeStart(cssClass, "."));
						builder.addField(field.build());
					});
		}

		builder.addJavadoc("$L", css);

		AnnotationSpec.Builder importSpec = AnnotationSpec.builder(Import.class)
				.addMember("symbols", "$S", className + "_style")
				.addMember("defaultExport", "true")
				.addMember("module", "$S", styleName);

		builder.addAnnotation(importSpec.build());

		builder.addMethod(getter.build());
		builder.addMethod(imports.build());
		builder.addMethod(indexer.build());

		TypeSpec build = builder.build();

		JavaFile javaFile = JavaFile.builder(packageName, build).build();
		javaFile.writeTo(processingEnv.getFiler());
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