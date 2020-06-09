package com.github.fluorumlabs.disconnect.core.toolchain;

import com.github.fluorumlabs.disconnect.core.annotations.ImportStyle;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;
import com.github.fluorumlabs.disconnect.core.annotations.Attribute;
import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.CustomElementComponent;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.teavm.model.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.fluorumlabs.disconnect.core.internals.CamelCaseUtils.toKebabCase;

/**
 * Created by Artem Godin on 5/13/2020.
 */
public class ComponentData {
    private static final Map<String, ComponentData> COMPONENT_DATA_MAP = new HashMap<>();
    private static final Pattern PACKAGE_PART = Pattern.compile("([a-z])([a-z0-9_-]*\\.?)");

    private static final Set<String> DOCUMENT_STYLES = new HashSet<>();
    private static final Set<String> GLOBAL_STYLES = new HashSet<>();
    private static final Map<String, Set<String>> COMPONENT_STYLES = new HashMap<>();
    private static final Map<String, String> TEMPLATES = new HashMap<>();
    private static File root;
    private static String artifactId;

    private final String className;
    private final String ownTagName;
    private final String inheritedTagName;
    private final boolean isCustomElement;
    private final List<String> observedAttributes;
    private Class<?> componentClass;

    private ComponentData(String className, String ownTagName, String inheritedTagName, boolean isCustomElement, List<String> observedAttributes, ClassLoader classLoader) {
        this.className = className;
        this.ownTagName = ownTagName;
        this.inheritedTagName = inheritedTagName;
        this.isCustomElement = isCustomElement;
        this.observedAttributes = observedAttributes;

        try {
            this.componentClass = Class.forName(className, false, classLoader);
        } catch (ClassNotFoundException e) {
            // ignore
        }
    }

    public static boolean descendsFrom(ClassReader clazz, ClassReaderSource classReaderSource, String className) {
        return classReaderSource.getAncestors(clazz.getName()).anyMatch(cz -> className.equals(cz.getName()));
    }

    public static void clear() {
        COMPONENT_DATA_MAP.clear();
        DOCUMENT_STYLES.clear();
        GLOBAL_STYLES.clear();
        COMPONENT_STYLES.clear();
        TEMPLATES.clear();
    }

    private static void add(ComponentData data) {
        if (data.isValid()) {
            COMPONENT_DATA_MAP.put(data.className, data);
        }
    }

    public static Stream<String> documentStyles() {
        return DOCUMENT_STYLES.stream();
    }

    public static Stream<String> globalStyles() {
        return GLOBAL_STYLES.stream();
    }

    public static Stream<Map.Entry<String, Set<String>>> componentStyles() {
        return COMPONENT_STYLES.entrySet().stream();
    }

    public static Stream<Map.Entry<String, String>> templates() {
        return TEMPLATES.entrySet().stream();
    }

    public static Stream<ComponentData> stream() {
        return COMPONENT_DATA_MAP.values().stream();
    }

    public static Set<String> add(ClassReader classHolder, ClassHolderTransformerContext context, ClassLoader classLoader) {
        ClassReaderSource classSource = context.getHierarchy().getClassSource();

        collectStyles(classHolder, classSource);
        Set<String> dependents = collectTemplates(classHolder, classSource);

        ClassReader hay = classHolder;
        while (!hay.getName().equals(Object.class.getName())) {
            AnnotationContainerReader annotations = hay.getAnnotations();
            AnnotationReader tagReader = annotations.get(Tag.class.getName());
            if (tagReader != null) {
                String tagName = tagReader.getValue("value").getString();
                if (hay.getName().equals(classHolder.getName())) {
                    add(immediate(classHolder.getName(), tagName, classLoader));
                } else {
                    add(inherited(classHolder.getName(), tagName, classLoader));
                }
                return dependents;
            }
            AnnotationReader customElementReader = annotations.get(CustomElement.class.getName());
            if (customElementReader != null) {
                String tagName = getCustomElementTagName(classHolder, customElementReader);
                if (customElementReader.getValue("external") != null && customElementReader.getValue("external").getBoolean()) {
                    if (hay.getName().equals(classHolder.getName())) {
                        add(immediate(classHolder.getName(), tagName, classLoader));
                    } else {
                        add(inherited(classHolder.getName(), tagName, classLoader));
                    }
                } else {
                    List<String> attributes = getAllAttributeNames(classHolder, classSource);
                    add(customElement(classHolder.getName(), tagName, attributes, classLoader));
                }
            }
            //...
            hay = classSource.get(hay.getParent());
        }

        return dependents;
    }

    private static Set<String> collectTemplates(ClassReader classHolder, ClassReaderSource classSource) {
        ClassReader hay = classHolder;
        while (!hay.getName().equals(Object.class.getName())) {
            AnnotationContainerReader annotations = hay.getAnnotations();
            AnnotationReader templateReader = annotations.get(ImportTemplate.class.getName());
            if (templateReader != null) {
                String templateSymbol = templateReader.getValue("value").getString();
                TEMPLATES.put(classHolder.getName(), "tpl"+DigestUtils.md5Hex(templateSymbol));
                return getDependents(templateSymbol);
            }
            //...
            hay = classSource.get(hay.getParent());
        }

        return Collections.emptySet();
    }

    private static Set<String> getDependents(String templatePath) {
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
            Document doc = Jsoup.parse(templateFile, "UTF-8");
            return doc.getAllElements().stream()
                    .map(Element::tagName)
                    .filter(tag -> tag.contains("-"))
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            return Collections.emptySet();
        }
    }

    private static void collectStyles(ClassReader classHolder, ClassReaderSource classSource) {
        Set<String> classes = new HashSet<>(classHolder.getInterfaces());

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

                                String symbol = "css"+DigestUtils.md5Hex(module);
                                String scopeName = scope.getFieldName();

                                if (ImportStyle.Scope.DEFAULT.name().equals(scopeName)) {
                                    if (classSource.isSuperType(CustomElementComponent.class.getName(), classHolder.getName()).orElse(false)) {
                                        scopeName = "COMPONENT";
                                    } else {
                                        scopeName = "DOCUMENT";
                                    }
                                }

                                switch (scopeName) {
                                    case "DOCUMENT":
                                        DOCUMENT_STYLES.add(symbol);
                                        break;
                                    case "GLOBAL":
                                        GLOBAL_STYLES.add(symbol);
                                        break;
                                    case "COMPONENT":
                                        COMPONENT_STYLES.computeIfAbsent(classHolder.getName(), cn -> new HashSet<>())
                                                .add(symbol);
                                        break;
                                }
                            });
                });

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

    public static ComponentData immediate(String className, String ownTagName, ClassLoader context) {
        return new ComponentData(className, ownTagName.toUpperCase(), null, false, null, context);
    }

    public static ComponentData inherited(String className, String inheritedTagName, ClassLoader context) {
        return new ComponentData(className, null, inheritedTagName.toUpperCase(), false, null, context);
    }

    public static ComponentData customElement(String className, String ownTagName, List<String> observedAttributes, ClassLoader context) {
        return new ComponentData(className, ownTagName.toUpperCase(), null, true, observedAttributes, context);
    }

    public static void setRoot(File root) {
        ComponentData.root = root;
    }

    public static void setArtifactId(String artifactId) {
        ComponentData.artifactId = artifactId;
    }

    public boolean isValid() {
        return componentClass != null;
    }

    public boolean isImmediate() {
        return ownTagName != null && !isCustomElement;
    }

    public boolean isInherited() {
        return inheritedTagName != null && !isCustomElement;
    }

    public Optional<String> getOwnTagName() {
        return Optional.ofNullable(ownTagName);
    }

    public Optional<String> getInheritedTagName() {
        return Optional.ofNullable(inheritedTagName);
    }

    public String getClassName() {
        return className;
    }

    public boolean isCustomElement() {
        return isCustomElement;
    }

    public List<String> getObservedAttributes() {
        return observedAttributes;
    }


    public Class<?> getComponentClass() {
        return componentClass;
    }
}
