package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.annotations.*;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.CustomElementComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.SlotComponentList;
import com.github.fluorumlabs.disconnect.core.internals.CustomElementRegistration;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.router.Router;
import com.github.fluorumlabs.disconnect.core.utils.Styler;
import com.github.fluorumlabs.disconnect.core.utils.Templater;
import js.web.dom.Element;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.teavm.model.*;
import org.teavm.model.emit.ProgramEmitter;
import org.teavm.model.emit.ValueEmitter;
import org.teavm.model.instructions.ClassConstantInstruction;
import org.teavm.model.instructions.InvocationType;
import org.teavm.model.instructions.InvokeInstruction;
import org.teavm.model.instructions.PutFieldInstruction;
import org.teavm.vm.spi.TeaVMHost;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;


public class DisconnectZeroClassTransformer implements ClassHolderTransformer {
    private static final Pattern PACKAGE_PART = Pattern.compile("([a-z])([a-z0-9_-]*\\.?)");

    private final Map<String, Class<?>> CUSTOM_ELEMENTS;
    private final ClassLoader classLoader;

    private final File root;
    private final String artifactId;

    public DisconnectZeroClassTransformer(TeaVMHost host) {
        root = new File(host.getProperties().getProperty("frontend.directory"));
        artifactId = host.getProperties().getProperty("frontend.artifactId");

        classLoader = host.getClassLoader();

        CUSTOM_ELEMENTS = new HashMap<>();
        for (CustomElementRegistration registration : ServiceLoader.load(CustomElementRegistration.class, classLoader)) {
            CUSTOM_ELEMENTS.put(registration.getTagName(), registration.getComponentClass());
        }
    }

    static boolean descendsFrom(ClassReader clazz, ClassReaderSource classReaderSource, Class<?> target) {
        return classReaderSource.getAncestorClasses(clazz.getName()).anyMatch(cz -> target.getName().equals(cz.getName()));
    }

    static boolean descendsFromInterface(ClassReader clazz, ClassReaderSource classReaderSource, Class<?> target) {
        return classReaderSource.getAncestors(clazz.getName()).anyMatch(cz -> target.getName().equals(cz.getName()));
    }

    @Override
    public void transformClass(ClassHolder cls, ClassHolderTransformerContext context) {
        boolean isComponent = descendsFrom(cls, context.getHierarchy().getClassSource(), Component.class);
        if (!Component.class.getName().equals(cls.getName()) && isComponent) {
            addInitialization(cls, context);
        }
        if (!CustomElementComponent.class.getName().equals(cls.getName()) && isComponent) {
            addRegistration(cls, context);
        } else {
            addStyles(cls, context);
        }

    }

    // Signature: Unknown $$serialize$$()
    private void addSerializeMethod(ClassHolder cls, ClassHolderTransformerContext context) {

    }

    @Nullable
    private Class<?> getJavaClass(ClassHolder cls, ClassHolderTransformerContext context) {
        try {
            return Class.forName(cls.getName(), false, classLoader);
        } catch (ClassNotFoundException e) {
            // ignore
        }
        return null;
    }

    private void addRegistration(ClassHolder cls, ClassHolderTransformerContext context) {
        Class<?> javaClass = getJavaClass(cls, context);

        if (javaClass == null) {
            return;
        }

        ClassReaderSource classSource = context.getHierarchy().getClassSource();

        MethodHolder touch = new MethodHolder("$$touch$$", ValueType.VOID);
        touch.getModifiers().add(ElementModifier.STATIC);

        ProgramEmitter.create(touch, context.getHierarchy()).exit();
        cls.addMethod(touch);

        MethodHolder register = new MethodHolder("$$register$$", ValueType.VOID);
        register.getModifiers().add(ElementModifier.STATIC);

        ProgramEmitter $ = ProgramEmitter.create(register, context.getHierarchy());

        collectStyles(cls, javaClass, classSource, $);
        Set<String> dependents = collectTemplates(cls, javaClass, classSource, $);
        registerComponent(cls, javaClass, classSource, $);

        AnnotationContainer annotations = cls.getAnnotations();

        Stream.concat(
                Optional.ofNullable(annotations.get(Uses.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty()),
                Optional.ofNullable(annotations.get(Uses.Container.class.getName()))
                        .map(Stream::of)
                        .orElse(Stream.empty())
                        .flatMap(ah -> ah.getValue("value").getList().stream().map(AnnotationValue::getAnnotation)))
                .forEach(annotationReader -> {
                    dependents.add(annotationReader.getValue("value").getString().toLowerCase());
                });

        for (String dependent : dependents) {
            Class<?> aClass = CUSTOM_ELEMENTS.get(dependent);
            if (aClass != null) {
                $.invoke(aClass, "$$touch$$", void.class);
            }
        }

        $.exit();

        cls.addMethod(register);
        addClinitRegistration(cls, context);

        if (descendsFrom(cls, classSource, CustomElementComponent.class)) {
            // Initialize Attribute observers
            implementConstructor(javaClass, cls, context);
        }
    }

    private void addInitialization(ClassHolder cls, ClassHolderTransformerContext context) {
        Class<?> javaClass = getJavaClass(cls, context);

        if (javaClass == null) {
            return;
        }

        // Initialize Route parameters
        implementInitializer(javaClass, cls, context);
    }

    private void addStyles(ClassHolder cls, ClassHolderTransformerContext context) {
        ClassReaderSource classSource = context.getHierarchy().getClassSource();
        MethodHolder register = new MethodHolder("$$register$$", ValueType.VOID);
        register.getModifiers().add(ElementModifier.STATIC);

        ProgramEmitter $ = ProgramEmitter.create(register, context.getHierarchy());

        if (collectStyles(cls, null, classSource, $)) {
            $.exit();
            cls.addMethod(register);
            addClinitRegistration(cls, context);
        }
    }

    private void addClinitRegistration(ClassHolder cls, ClassHolderTransformerContext context) {
        Instruction first = getClinitFirstInstruction(cls, context);

        InvokeInstruction invokeInstruction = new InvokeInstruction();
        invokeInstruction.setType(InvocationType.SPECIAL);
        invokeInstruction.setInstance(null);
        invokeInstruction.setMethod(new MethodReference(cls.getName(), "$$register$$", ValueType.VOID));

        first.insertPrevious(invokeInstruction);
    }

    private Instruction getClinitFirstInstruction(ClassHolder cls, ClassHolderTransformerContext context) {
        MethodHolder clinit = cls.getMethod(new MethodDescriptor("<clinit>", ValueType.VOID));
        if (clinit == null) {
            clinit = new MethodHolder("<clinit>", ValueType.VOID);
            clinit.getModifiers().add(ElementModifier.STATIC);

            ProgramEmitter $ = ProgramEmitter.create(clinit, context.getHierarchy());
            $.exit();

            cls.addMethod(clinit);
        }

        Program clinitProgram = clinit.getProgram();
        BasicBlock basicBlock = clinitProgram.basicBlockAt(0);

        return basicBlock.getFirstInstruction();
    }

    private void registerComponent(ClassHolder cls, Class<?> javaClass, ClassReaderSource classSource, ProgramEmitter $) {
        ClassReader hay = cls;
        while (!hay.getName().equals(Object.class.getName())) {
            AnnotationContainerReader annotations = hay.getAnnotations();
            AnnotationReader tagReader = annotations.get(Tag.class.getName());
            if (tagReader != null) {
                String tagName = tagReader.getValue("value").getString();
                if (hay.getName().equals(cls.getName())) {
                    $.invoke(TagRegistry.class, "register", $.constant(tagName.toUpperCase()), $.constant(javaClass));
                } else {
                    $.invoke(TagRegistry.class, "registerInherited", $.constant(tagName.toUpperCase()), $.constant(javaClass));
                }
                return;
            }
            AnnotationReader customElementReader = annotations.get(CustomElement.class.getName());
            if (customElementReader != null) {
                String tagName = getCustomElementTagName(cls, customElementReader);
                if (customElementReader.getValue("external") != null && customElementReader.getValue("external").getBoolean()) {
                    if (hay.getName().equals(cls.getName())) {
                        $.invoke(TagRegistry.class, "register", $.constant(tagName.toUpperCase()), $.constant(javaClass));
                    } else {
                        $.invoke(TagRegistry.class, "registerInherited", $.constant(tagName.toUpperCase()), $.constant(javaClass));
                    }
                } else {
                    $.invoke(TagRegistry.class, "register", $.constant(tagName.toUpperCase()), $.constant(javaClass));
                    List<String> attributes = getAllAttributeNames(cls, classSource);
                    int attributeCount = attributes.size();
                    ValueEmitter attrArray = $.constructArray(String.class, attributeCount);
                    for (int i = 0; i < attributeCount; i++) {
                        attrArray.setElement(i, $.constant(attributes.get(i)));
                    }
                    $.invoke(CustomElementComponent.class, "register", $.constant(tagName.toLowerCase()), attrArray, $.constant(javaClass));
                }
                return;
            }
            //...
            hay = classSource.get(hay.getParent());
        }
    }

    private static void implementConstructor(Class<?> componentClass, ClassHolder cls, ClassHolderTransformerContext context) {
        MethodHolder constructor = new MethodHolder("constructor", ValueType.VOID);
        constructor.setLevel(AccessLevel.PUBLIC);

        ProgramEmitter $ = ProgramEmitter.create(constructor, context.getHierarchy());
        ValueEmitter that = $.var(0, componentClass);

        that.invokeSpecial(componentClass.getSuperclass(), "constructor");
        ValueEmitter root = that.invokeVirtual("getRoot", ComponentList.class);

        for (Field field : componentClass.getDeclaredFields()) {
            Attribute attribute = field.getAnnotation(Attribute.class);
            if (field.getType().equals(ObservableValue.class) && attribute != null) {
                String attributeName = StringUtils.defaultIfEmpty(attribute.name(), toKebabCase(field.getName()));
                String defaultValue = attribute.defaultValue();

                Type[] actualTypeArguments = ((ParameterizedType) (field.getGenericType())).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    if (actualTypeArguments[0].equals(String.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addStringAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Integer.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addIntegerAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Double.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addDoubleAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (actualTypeArguments[0].equals(Boolean.class)) {
                        that.setField(field.getName(), that.invokeSpecial(CustomElementComponent.class.getName(), "addBooleanAttribute", ValueType.object(ObservableValue.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    }
                }
            }

            Query query = field.getAnnotation(Query.class);
            if (query != null && HasElement.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentInstance = root.invokeVirtual("find", Optional.class, $.constant(query.value())).invokeVirtual("orElse", Object.class, $.constantNull(Object.class)).cast(componentClass);
                that.setField(field.getName(), componentInstance);
            }

            NamedSlot namedSlot = field.getAnnotation(NamedSlot.class);
            if (namedSlot != null && Collection.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentList = $.construct(SlotComponentList.class, that.invokeVirtual("getElement", Element.class), $.constant(namedSlot.value()));
                that.setField(field.getName(), componentList.cast(field.getType()));
            }

            DefaultSlot defaultSlot = field.getAnnotation(DefaultSlot.class);
            if (defaultSlot != null && Collection.class.isAssignableFrom(field.getType())) {
                ValueEmitter componentList = $.construct(SlotComponentList.class, that.invokeVirtual("getElement", Element.class), $.constant(""));
                that.setField(field.getName(), componentList.cast(field.getType()));
            }
        }

        $.exit();

        cls.addMethod(constructor);
    }

    private static void implementInitializer(Class<?> componentClass, ClassHolder cls, ClassHolderTransformerContext context) {
        MethodHolder initializer = new MethodHolder("initializer", ValueType.VOID);
        initializer.setLevel(AccessLevel.PUBLIC);

        ProgramEmitter $ = ProgramEmitter.create(initializer, context.getHierarchy());
        ValueEmitter that = $.var(0, componentClass);

        that.invokeSpecial(componentClass.getSuperclass(), "initializer");

        if (componentClass.getAnnotation(Route.class) != null) {
            for (Field field : componentClass.getDeclaredFields()) {
                RouteParameter attribute = field.getAnnotation(RouteParameter.class);
                if (attribute != null) {
                    String attributeName = StringUtils.defaultIfEmpty(attribute.name(), toKebabCase(field.getName()));
                    String defaultValue = attribute.defaultValue();

                    if (field.getType().equals(String.class)) {
                        that.setField(field.getName(), that.invokeSpecial(Router.class.getName(), "getStringParameter", ValueType.object(String.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                    } else if (field.getType().equals(int.class)) {
                        that.setField(field.getName(), that.invokeSpecial(Router.class.getName(), "getIntParameter", ValueType.INTEGER, $.constant(attributeName), $.constant(defaultValue)));
                    } else if (field.getType().equals(boolean.class)) {
                        that.setField(field.getName(), that.invokeSpecial(Router.class.getName(), "getBooleanParameter", ValueType.BOOLEAN, $.constant(attributeName), $.constant(defaultValue)));
                    } else if (field.getType().equals(List.class)) {
                        Type[] actualTypeArguments = ((ParameterizedType) (field.getGenericType())).getActualTypeArguments();
                        if (actualTypeArguments.length == 1) {
                            if (actualTypeArguments[0].equals(String.class)) {
                                that.setField(field.getName(), that.invokeSpecial(Router.class.getName(), "getStringArrayParameter", ValueType.object(List.class.getName()), $.constant(attributeName), $.constant(defaultValue)));
                            }
                        }
                    }
                }
            }
        }

        $.exit();

        cls.addMethod(initializer);
    }

    private Set<String> collectTemplates(ClassReader classHolder, Class<?> javaClass, ClassReaderSource classSource, ProgramEmitter $) {
        ClassReader hay = classHolder;
        while (!hay.getName().equals(Object.class.getName())) {
            AnnotationContainerReader annotations = hay.getAnnotations();
            AnnotationReader templateReader = annotations.get(ImportTemplate.class.getName());
            if (templateReader != null) {
                String templateModule = templateReader.getValue("value").getString();
                String symbol = "tpl"+DigestUtils.md5Hex(templateModule);

                $.invoke(Templater.class, "registerTemplate", $.constant(javaClass), $.constant(symbol));
                return getDependents(templateModule);
            }
            //...
            hay = classSource.get(hay.getParent());
        }

        return Collections.emptySet();
    }

    private Set<String> getDependents(String templatePath) {
        File templateFile;
        if (templatePath.startsWith("./")) {
            templateFile = new File(root, templatePath);
        } else if (templatePath.startsWith(artifactId+"-jar/frontend/")) {
            templateFile = new File(root, StringUtils.removeStart(templatePath, artifactId+"-jar/frontend/"));
        } else if (templatePath.contains("-jar/")) {
            templateFile = new File(root, "jar-modules/"+templatePath);
        } else {
            return Collections.emptySet();
        }
        try {
            String template = FileUtils.readFileToString(templateFile, StandardCharsets.UTF_8);
            Document doc = Jsoup.parseBodyFragment(template);
            return doc.getAllElements().stream()
                    .map(org.jsoup.nodes.Element::tagName)
                    .filter(tag -> tag.contains("-"))
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            return Collections.emptySet();
        }
    }

    private boolean collectStyles(ClassReader classHolder, Class<?> javaClass, ClassReaderSource classSource, ProgramEmitter $) {
        Set<String> classes = new HashSet<>(classHolder.getInterfaces());
        Mutable<Boolean> hasStyles = new MutableBoolean(false);

        ClassReader current = classHolder;
        while (!current.getName().equals(Object.class.getName())) {
            classes.add(current.getName());
            current = classSource.get(current.getParent());
        }

        classes.stream()
                .map(classSource::get)
                .filter(Objects::nonNull)
                .map(ClassReader::getAnnotations)
                .forEach(annotations -> {
                    Stream.concat(
                            Optional.ofNullable(annotations.get(ImportStyle.class.getName()))
                                    .map(Stream::of)
                                    .orElse(Stream.empty()),
                            Optional.ofNullable(annotations.get(ImportStyle.Container.class.getName()))
                                    .map(Stream::of)
                                    .orElse(Stream.empty())
                                    .flatMap(ah -> ah.getValue("value").getList().stream().map(AnnotationValue::getAnnotation)))
                            .forEach(annotationReader -> {
                                String module = annotationReader.getValue("value").getString();
                                FieldReference scope = Optional.ofNullable(annotationReader.getValue("scope"))
                                        .map(AnnotationValue::getEnumValue)
                                        .orElse(new FieldReference(ImportStyle.Scope.class.getName(), "DEFAULT"));

                                String symbol = "css"+ DigestUtils.md5Hex(module);
                                String scopeName = scope.getFieldName();

                                if (ImportStyle.Scope.DEFAULT.name().equals(scopeName)) {
                                    if (javaClass != null && classSource.isSuperType(CustomElementComponent.class.getName(), classHolder.getName()).orElse(false)) {
                                        scopeName = "COMPONENT";
                                    } else {
                                        scopeName = "DOCUMENT";
                                    }
                                }

                                hasStyles.setValue(true);

                                switch (scopeName) {
                                    case "DOCUMENT":
                                        $.invoke(Styler.class, "registerStyle", $.constantNull(Class.class), $.constant(symbol), $.constant("DOCUMENT"));
                                        break;
                                    case "GLOBAL":
                                        $.invoke(Styler.class, "registerStyle", $.constantNull(Class.class), $.constant(symbol), $.constant("GLOBAL"));
                                        break;
                                    case "COMPONENT":
                                        if (javaClass != null) {
                                            $.invoke(Styler.class, "registerStyle", $.constant(javaClass), $.constant(symbol), $.constant("COMPONENT"));
                                        }
                                        break;
                                }
                            });
                });

        return hasStyles.getValue();
    }

    private static String getCustomElementTagName(ClassReader classHolder, AnnotationReader customElementReader) {
        String name = classHolder.getName();
        String className = StringUtils.substringAfterLast(name, ".");
        String packageName = StringUtils.substringBeforeLast(name, ".");
        String computedTagName = PACKAGE_PART.matcher(packageName).replaceAll("$1") + "-" + toKebabCase(StringUtils.uncapitalize(className));
        AnnotationValue tagName = customElementReader.getValue("tagName");
        return tagName != null ? StringUtils.defaultIfBlank(tagName.getString(), computedTagName) : computedTagName;
    }

    private static List<String> getAllAttributeNames(ClassReader classHolder, ClassReaderSource classSource) {
        List<String> attributes = new ArrayList<>();

        ClassReader hay = classHolder;
        while (!hay.getName().equals(Object.class.getName())) {
            for (FieldReader field : hay.getFields()) {
                AnnotationReader attributeReader = field.getAnnotations().get(Attribute.class.getName());
                if (attributeReader != null) {
                    AnnotationValue name = attributeReader.getValue("name");
                    attributes.add(name != null ? StringUtils.defaultIfEmpty(name.getString(), toKebabCase(field.getName())) : toKebabCase(field.getName()));
                }
            }
            //...
            hay = classSource.get(hay.getParent());
        }

        return attributes;
    }


    private void addClinitInitializer(ClassHolder cls, FieldHolder fh, Class<?> value, ClassHolderTransformerContext context) {
        Instruction first = getClinitFirstInstruction(cls, context);

        Variable varValue = first.getProgram().createVariable();

        ClassConstantInstruction classConstantInstruction = new ClassConstantInstruction();
        classConstantInstruction.setConstant(ValueType.object(value.getName()));
        classConstantInstruction.setReceiver(varValue);

        first.insertPrevious(classConstantInstruction);

        PutFieldInstruction putFieldInstruction = new PutFieldInstruction();
        putFieldInstruction.setValue(varValue);
        putFieldInstruction.setField(fh.getReference());
        putFieldInstruction.setFieldType(fh.getType());

        first.insertPrevious(putFieldInstruction);
    }

}
