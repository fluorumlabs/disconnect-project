package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.annotations.ErrorView;
import com.github.fluorumlabs.disconnect.core.annotations.Route;
import com.github.fluorumlabs.disconnect.core.internals.RouteRegistration;
import com.github.fluorumlabs.disconnect.core.router.RouterOutlet;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.*;
import org.apache.commons.text.StringEscapeUtils;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;


@SupportedAnnotationTypes(
        {"com.github.fluorumlabs.disconnect.core.annotations.Route", "com.github.fluorumlabs.disconnect.core.annotations.ErrorView"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class DisconnectViewAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        try {
            for (TypeElement annotation : annotations) {
                Set<? extends Element> annotatedElements
                        = roundEnv.getElementsAnnotatedWith(annotation);

                for (Element annotatedElement : annotatedElements) {
                    TypeElement routeTarget = (TypeElement) annotatedElement;

                    List<String> routes = new ArrayList<>();
                    List<TypeName> exceptions = new ArrayList<>();

                    String targetPackage = getPackage(routeTarget);
                    TypeName outletClass;
                    TypeName parentClass;

                    Route mainView = routeTarget.getAnnotation(Route.class);
                    ErrorView mainErrorView = routeTarget.getAnnotation(ErrorView.class);

                    if (mainView != null) {
                        outletClass = getAnnotationClassValue(mainView::outlet, RouterOutlet.class);
                        parentClass = getAnnotationClassValue(mainView::parent, RouterOutlet.class);

                        routes.add(mainView.value());

                        for (Route.Alternative route : routeTarget.getAnnotationsByType(Route.Alternative.class)) {
                            if (route != null) {
                                routes.add(route.value());
                            }
                        }
                    } else {
                        outletClass = getAnnotationClassValue(mainErrorView::outlet, RouterOutlet.class);
                        parentClass = ClassName.get(RouterOutlet.class);

                        exceptions.add(getAnnotationClassValue(mainErrorView::value, UnsupportedOperationException.class));

                        for (ErrorView.Alternative route : routeTarget.getAnnotationsByType(ErrorView.Alternative.class)) {
                            if (route != null) {
                                exceptions.add(getAnnotationClassValue(route::value, UnsupportedOperationException.class));
                            }
                        }
                    }

                    MethodSpec getTarget = MethodSpec.methodBuilder("getTarget")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(ParameterizedTypeName.get(ClassName.get(Class.class),
                                    WildcardTypeName.subtypeOf(Object.class)))
                            .addStatement("return $T.class", ClassName.get(routeTarget))
                            .build();

                    MethodSpec getOutlet = MethodSpec.methodBuilder("getOutlet")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(ParameterizedTypeName.get(ClassName.get(Class.class),
                                    WildcardTypeName.subtypeOf(Object.class)))
                            .addStatement("return $T.class", outletClass)
                            .build();

                    MethodSpec getParent = MethodSpec.methodBuilder("getParent")
                            .addModifiers(Modifier.PUBLIC)
                            .returns(ParameterizedTypeName.get(ClassName.get(Class.class),
                                    WildcardTypeName.subtypeOf(Object.class)))
                            .addStatement("return $T.class", parentClass)
                            .build();

                    MethodSpec getExceptions;
                    MethodSpec getRoutes;

                    if (exceptions.isEmpty()) {
                        getExceptions = MethodSpec.methodBuilder("getExceptions")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(ParameterizedTypeName.get(ClassName.get(List.class),
                                        ParameterizedTypeName.get(ClassName.get(Class.class),
                                                WildcardTypeName.subtypeOf(Exception.class))))
                                .addStatement("return $T.emptyList()", Collections.class)
                                .build();
                    } else {
                        MethodSpec.Builder getExceptionsBuilder = MethodSpec.methodBuilder("getExceptions")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(ParameterizedTypeName.get(ClassName.get(List.class),
                                        ParameterizedTypeName.get(ClassName.get(Class.class),
                                                WildcardTypeName.subtypeOf(Exception.class))));

                        getExceptionsBuilder.addCode("$[return $T.asList(", Arrays.class);
                        int i = exceptions.size();
                        for (TypeName exception : exceptions) {
                            getExceptionsBuilder.addCode("$T.class", exception);
                            i--;
                            if (i > 0) {
                                getExceptionsBuilder.addCode(",$W");
                            }
                        }
                        getExceptionsBuilder.addCode(");\n$]");

                        getExceptions = getExceptionsBuilder.build();
                    }

                    if (routes.isEmpty()) {
                        getRoutes = MethodSpec.methodBuilder("getRoutes")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(ParameterizedTypeName.get(ClassName.get(List.class),
                                        ClassName.get(String.class)))
                                .addStatement("return $T.emptyList()", Collections.class)
                                .build();


                    } else {
                        String routesAsString = routes.stream()
                                .map(s -> "\"" + StringEscapeUtils.escapeJava(s) + "\"")
                                .collect(Collectors.joining(", "));


                        getRoutes = MethodSpec.methodBuilder("getRoutes")
                                .addModifiers(Modifier.PUBLIC)
                                .returns(ParameterizedTypeName.get(ClassName.get(List.class),
                                        ClassName.get(String.class)))
                                .addStatement("return $T.asList($L)", Arrays.class, routesAsString)
                                .build();

                    }

                    TypeSpec routeRegistration =
                            TypeSpec.classBuilder(routeTarget.getSimpleName() + "RouteRegistration")
                                    .addModifiers(Modifier.PUBLIC)
                                    .addSuperinterface(RouteRegistration.class)
                                    .addMethod(getTarget)
                                    .addMethod(getOutlet)
                                    .addMethod(getParent)
                                    .addMethod(getRoutes)
                                    .addMethod(getExceptions)
                                    .addAnnotation(AnnotationSpec.builder(AutoService.class).addMember("value", "$T.class", RouteRegistration.class).build())
                                    .build();

                    JavaFile javaFile = JavaFile.builder(targetPackage, routeRegistration).build();
                    javaFile.writeTo(processingEnv.getFiler());
                }
            }
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Cannot create generated source: " + e.getMessage());
        }
        return true;
    }

    private TypeName getAnnotationClassValue(Supplier<Class<?>> supplier, Class<?> defaultValue) {
        TypeMirror routeOutlet = null;
        try {
            supplier.get();
        } catch (MirroredTypeException mte) {
            routeOutlet = mte.getTypeMirror();
        }

        TypeName outletClass;
        if (routeOutlet != null) {
            outletClass = ClassName.get(routeOutlet);
        } else {
            outletClass = ClassName.get(defaultValue);
        }
        return outletClass;
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