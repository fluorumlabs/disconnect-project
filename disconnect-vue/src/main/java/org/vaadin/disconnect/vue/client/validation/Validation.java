package org.vaadin.disconnect.vue.client.validation;

import org.apache.commons.lang3.StringUtils;
import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;
import org.teavm.platform.Platform;
import org.vaadin.disconnect.vue.client.internals.ValidationException;
import org.vaadin.disconnect.vue.client.internals.ValidatorRegistry;

import javax.validation.*;
import javax.validation.constraints.Pattern;
import javax.validation.metadata.ConstraintDescriptor;
import javax.validation.metadata.ValidateUnwrappedValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.time.Clock;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 10/3/2019.
 */
@SuppressWarnings("unchecked")
@CompileTime
public class Validation {

    public static ValidationResult runValidation(Runnable runnable) {
        try {
            Internals.VALIDATION_ENABLED = true;
            Internals.VALIDATION_RESULT = new ValidationResult();
            runnable.run();
            return Internals.VALIDATION_RESULT;
        } finally {
            Internals.VALIDATION_ENABLED = false;
            Internals.VALIDATION_RESULT = new ValidationResult();
        }
    }

    public static <T> ValidationResult validate(T x) {
        try {
            Internals.VALIDATION_ENABLED = true;
            Internals.VALIDATION_RESULT = new ValidationResult();
            validate((Class<T>)x.getClass(), x, null);
            return Internals.VALIDATION_RESULT;
        } finally {
            Internals.VALIDATION_ENABLED = false;
            Internals.VALIDATION_RESULT = new ValidationResult();
        }
    }

    private static <T> void validate(Class<T> cls, T instance, String fieldName) {
        if (Internals.VALIDATION_ENABLED) {
            validate_(cls, instance, fieldName);
        }
    }

    @Meta
    private static native <T> void validate_(Class<T> cls, T instance, String fieldName) throws ValidationException;

    @SuppressWarnings("unchecked")
    private static <T> void validate_(ReflectClass<T> cls, Value<T> instance, Value<String> fieldName) throws ClassNotFoundException {
        Map<String, List<AnnotationDescriptor>> annotations = new HashMap<>();

        Class<T> tClass = (Class<T>) Metaprogramming.getClassLoader().loadClass(cls.getName());

        for (Field field : tClass.getDeclaredFields()) {
            List<AnnotationDescriptor> annotationList = new ArrayList<>();
            for (Annotation annotation : field.getAnnotations()) {
                collectAnnotations(annotation, annotationList::add);
            }
            if (annotationList.stream().anyMatch(a -> a.getAnnotation().annotationType() == Constraint.class)) {
                annotations.put(field.getName(), annotationList);
            }
        }

        for (ReflectField field : cls.getDeclaredFields()) {
            String currentFieldName = field.getName();
            List<AnnotationDescriptor> annotationList = annotations.get(field.getName());

            ReflectClass<T> type = (ReflectClass<T>) field.getType();
            Class<?> fieldClass = Object.class;

            if (type.isPrimitive()) {
                switch (type.getName()) {
                    case "boolean":
                        fieldClass = Boolean.class;
                        break;
                    case "byte":
                        fieldClass = Byte.class;
                        break;
                    case "short":
                        fieldClass = Short.class;
                        break;
                    case "char":
                        fieldClass = Character.class;
                        break;
                    case "int":
                        fieldClass = Integer.class;
                        break;
                    case "long":
                        fieldClass = Long.class;
                        break;
                    case "float":
                        fieldClass = Float.class;
                        break;
                    case "double":
                        fieldClass = Double.class;
                        break;
                }
            } else {
                fieldClass = getClassLoader().loadClass(field.getType().getName());
            }

            if (annotationList != null) {
                Value<Boolean> shouldEmit = emit(() -> fieldName.get() == null || currentFieldName.equals(fieldName.get()));
                for (AnnotationDescriptor annotation : annotationList) {
                    emitValidator(fieldClass, emit(() -> field.get(instance.get())), shouldEmit, annotation);
                }
            }
        }

        List<AnnotationDescriptor> classAnnotationList = new ArrayList<>();
        for (Annotation annotation : tClass.getAnnotations()) {
            collectAnnotations(annotation, classAnnotationList::add);
        }
        if (classAnnotationList.stream().anyMatch(a -> a.getAnnotation().annotationType() == Constraint.class)) {
            Value<Boolean> shouldEmit = emit(() -> fieldName.get() == null);

            for (AnnotationDescriptor annotation : classAnnotationList) {
                emitValidator(tClass, (Value<Object>) instance, shouldEmit, annotation);
            }
        }
    }

    private static <T> void emitValidator(Class<T> fieldClass, Value<Object> o, Value<Boolean> shouldEmit, AnnotationDescriptor annotation) {
        Map<Class<?>, Class<? extends ConstraintValidator>> classClassMap = ValidatorRegistry.getValidators(annotation.getAnnotation().annotationType());

        if (classClassMap == null) {
            Constraint constraint = annotation.getAnnotation().annotationType().getAnnotation(Constraint.class);
            if (constraint == null) {
                return;
            }

            for (Class<? extends ConstraintValidator<?, ?>> aClass : constraint.validatedBy()) {
                Type[] genericInterfaces = aClass.getGenericInterfaces();

                for (Type genericInterface : genericInterfaces) {
                    if (genericInterface instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                        Class<?> interfaceType = (Class<?>) parameterizedType.getRawType();

                        if (ConstraintValidator.class.isAssignableFrom(interfaceType)) {
                            Type itemType = parameterizedType.getActualTypeArguments()[1];
                            if (itemType instanceof Class && ((Class<?>) itemType).isAssignableFrom(fieldClass)) {
                                emitValidator(annotation, aClass, o, shouldEmit);
                                return;
                            }
                        }
                    }
                }
            }

            return;
        }

        classClassMap.entrySet().stream()
                .filter(e -> e.getKey().isAssignableFrom(fieldClass))
                .findFirst()
                .ifPresent(e -> emitValidator(annotation, e.getValue(), o, shouldEmit));
    }

    private static <T, A extends Annotation> void emitValidator(AnnotationDescriptor annotation, Class<?> validatorClass, Value<T> o, Value<Boolean> shouldEmit) {
        Value<A> annotationProxy = makeAnnotationProxy(annotation);
        ReflectClass<?> validatorReflectClass = findClass(validatorClass);
        ReflectMethod method = validatorReflectClass.getMethod("<init>");

        MessageInterpolator defaultMessageInterpolator = javax.validation.Validation.byDefaultProvider().configure().getDefaultMessageInterpolator();
        InternalContext internalContext = new InternalContext(annotation, (Class<? extends ConstraintValidator<A, ?>>) validatorClass);
        String message = defaultMessageInterpolator.interpolate(internalContext.getConstraintDescriptor().getMessageTemplate(), internalContext);

        int key = annotation.hashCode();

        emit(() -> {
            ConstraintValidator<A, T> validator = Internals.VALIDATORS.get(key);

            if (validator == null) {
                validator = (ConstraintValidator<A, T>) method.construct();
                validator.initialize(annotationProxy.get());

                Internals.VALIDATORS.put(key, validator);
            }

            if (shouldEmit.get() && !validator.isValid(o.get(), Internals.CONSTRAINT_VALIDATOR_CONTEXT)) {
                Internals.VALIDATION_RESULT.addError(message);
            }
        });
    }

    private static <T extends Annotation> Value<T> makeAnnotationProxy(AnnotationDescriptor annotation) {
        Class<T> aClass = (Class<T>) annotation.getAnnotation().annotationType();

        return proxy(aClass, (proxy, method, args) -> {
            String name = method.getName();
            if (method.getReturnType().isArray() && method.getReturnType().getComponentType().isEnum()) {
                Enum[] result = (Enum[]) annotation.get(name);
                String collectedEnumValues = Arrays.stream(result).map(Enum::name).collect(Collectors.joining(","));

                String enumName = method.getReturnType().getComponentType().getName();

                Value<Enum[]> patternFlags = lazy(Pattern.Flag::values);
                Value<Enum[]> randomEnums = lazy(() -> Platform.getEnumConstants(Platform.lookupClass(enumName)));

                Value<Enum[]> enums;

                if (enumName.equals(Pattern.Flag.class.getName())) {
                    enums = patternFlags;
                } else {
                    enums = randomEnums;
                }

                exit(() -> {
                    String[] split = StringUtils.split(collectedEnumValues, ',');
                    Enum[] actualEnums = new Enum[split.length];
                    Enum[] allEnums = enums.get();

                    for (int i = 0; i < split.length; i++) {
                        String key = split[i];
                        for (Enum allEnum : allEnums) {
                            if (allEnum.name().equals(key)) {
                                actualEnums[i] = allEnum;
                                break;
                            }
                        }
                    }

                    return actualEnums;
                });
            } else if (method.getReturnType().isArray() && method.getReturnType().getComponentType().isAssignableFrom(Class.class)) {
                exit(() -> null);
            } else {
                Object result = annotation.get(name);
                exit(() -> result);
            }
        });
    }

    private static void collectAnnotations(Annotation annotation, Consumer<AnnotationDescriptor> consumer) {
        collectAnnotations(null, annotation, consumer);
    }

    private static void collectAnnotations(Annotation superAnnotation, Annotation annotation, Consumer<AnnotationDescriptor> consumer) {
        if (annotation.annotationType().getName().startsWith("java.lang.annotation")) {
            return;
        }

        consumer.accept(AnnotationDescriptor.of(annotation, superAnnotation));

        for (Annotation nestedAnnotation : annotation.annotationType().getAnnotations()) {
            collectAnnotations(annotation, nestedAnnotation, consumer);
        }
    }

    private static class Internals {
        static Boolean VALIDATION_ENABLED = false;
        static ValidationResult VALIDATION_RESULT = new ValidationResult();

        static Map<Integer, ConstraintValidator> VALIDATORS = new HashMap<>();

        private final static ConstraintValidatorContext CONSTRAINT_VALIDATOR_CONTEXT = new InternalConstraintValidatorContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder CONSTRAINT_VIOLATION_BUILDER = new InternalConstraintViolationBuilder();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderDefinedContext NODE_BUILDER_DEFINED_CONTEXT = new InternalNodeBuilderDefinedContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext NODE_BUILDER_CUSTOMIZABLE_CONTEXT = new InternalNodeBuilderCustomizableContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT = new InternalLeafNodeBuilderCustomizableContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT = new InternalContainerElementNodeBuilderCustomizableContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.NodeContextBuilder NODE_CONTEXT_BUILDER = new InternalNodeContextBuilder();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeContextBuilder LEAF_NODE_CONTEXT_BUILDER = new InternalLeafNodeContextBuilder();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeContextBuilder CONTAINER_ELEMENT_NODE_CONTEXT_BUILDER = new InternalContainerElementNodeContextBuilder();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderDefinedContext LEAF_NODE_BUILDER_DEFINED_CONTEXT = new InternalLeafNodeBuilderDefinedContext();
        private final static ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderDefinedContext CONTAINER_ELEMENT_NODE_BUILDER_DEFINED_CONTEXT = new InternalContainerElementNodeBuilderDefinedContext();

        private static final class InternalConstraintValidatorContext implements ConstraintValidatorContext {
            @Override
            public void disableDefaultConstraintViolation() {
            }

            /**
             * @return the current un-interpolated default message
             */
            @Override
            public String getDefaultConstraintMessageTemplate() {
                return "";
            }

            @Override
            public ClockProvider getClockProvider() {
                return null;
            }

            @Override
            public ConstraintViolationBuilder buildConstraintViolationWithTemplate(String messageTemplate) {
                return Internals.CONSTRAINT_VIOLATION_BUILDER;
            }

            @Override
            public <T> T unwrap(Class<T> type) {
                return (T) type;
            }
        }

        private final static class InternalConstraintViolationBuilder implements ConstraintValidatorContext.ConstraintViolationBuilder {
            @Override
            public NodeBuilderDefinedContext addNode(String name) {
                return NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public NodeBuilderDefinedContext addParameterNode(int index) {
                return NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalNodeBuilderDefinedContext implements ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderDefinedContext {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalNodeBuilderCustomizableContext implements ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeContextBuilder inIterable() {
                return NODE_CONTEXT_BUILDER;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext inContainer(Class<?> containerClass, Integer typeArgumentIndex) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalLeafNodeBuilderCustomizableContext implements ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeContextBuilder inIterable() {
                return LEAF_NODE_CONTEXT_BUILDER;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext inContainer(Class<?> containerClass, Integer typeArgumentIndex) {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalContainerElementNodeBuilderCustomizableContext implements ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeContextBuilder inIterable() {
                return CONTAINER_ELEMENT_NODE_CONTEXT_BUILDER;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalNodeContextBuilder implements ConstraintValidatorContext.ConstraintViolationBuilder.NodeContextBuilder {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderDefinedContext atKey(Object key) {
                return NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderDefinedContext atIndex(Integer index) {
                return NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }


        private static final class InternalLeafNodeContextBuilder implements ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeContextBuilder {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderDefinedContext atKey(Object key) {
                return LEAF_NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderDefinedContext atIndex(Integer index) {
                return LEAF_NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalContainerElementNodeContextBuilder implements ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeContextBuilder {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderDefinedContext atKey(Object key) {
                return CONTAINER_ELEMENT_NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderDefinedContext atIndex(Integer index) {
                return CONTAINER_ELEMENT_NODE_BUILDER_DEFINED_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalLeafNodeBuilderDefinedContext implements ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderDefinedContext {
            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

        private static final class InternalContainerElementNodeBuilderDefinedContext implements ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderDefinedContext {
            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode(String name) {
                return NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode() {
                return LEAF_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext.ConstraintViolationBuilder.ContainerElementNodeBuilderCustomizableContext addContainerElementNode(String name, Class<?> containerType, Integer typeArgumentIndex) {
                return CONTAINER_ELEMENT_NODE_BUILDER_CUSTOMIZABLE_CONTEXT;
            }

            @Override
            public ConstraintValidatorContext addConstraintViolation() {
                return CONSTRAINT_VALIDATOR_CONTEXT;
            }
        }

    }

    private static class InternalContext implements MessageInterpolator.Context {
        private ConstraintDescriptor<?> constraintDescriptor;

        private <T extends Annotation> InternalContext(AnnotationDescriptor annotationDescriptor, Class<? extends ConstraintValidator<T, ?>> validatorClass) {
            constraintDescriptor = new InternalConstraintDescriptor<>(annotationDescriptor, validatorClass);
        }

        @Override
        public ConstraintDescriptor<?> getConstraintDescriptor() {
            return constraintDescriptor;
        }

        @Override
        public Object getValidatedValue() {
            return null;
        }

        @Override
        public <T> T unwrap(Class<T> type) {
            return (T) this;
        }
    }

    private static class InternalConstraintDescriptor<T extends Annotation> implements ConstraintDescriptor<T> {
        private T annotation;
        private Map<String, Object> attributes;
        private Class<? extends ConstraintValidator<T, ?>> validatorClass;

        private InternalConstraintDescriptor(AnnotationDescriptor annotationDescriptor, Class<? extends ConstraintValidator<T, ?>> validatorClass) {
            Class<? extends Annotation> aClass = annotationDescriptor.getAnnotation().annotationType();

            this.annotation = (T) Proxy.newProxyInstance(aClass.getClassLoader(), new Class[]{aClass}, (p, method, args) -> annotationDescriptor.get(method.getName()));
            this.validatorClass = validatorClass;
            this.attributes = annotationDescriptor.getAttributes();
        }

        @Override
        public T getAnnotation() {
            return annotation;
        }

        @Override
        public String getMessageTemplate() {
            return (String) attributes.get("message");
        }

        @Override
        public Set<Class<?>> getGroups() {
            return Collections.emptySet();
        }

        @Override
        public Set<Class<? extends Payload>> getPayload() {
            return Collections.emptySet();
        }

        @Override
        public ConstraintTarget getValidationAppliesTo() {
            return null;
        }

        @Override
        public List<Class<? extends ConstraintValidator<T, ?>>> getConstraintValidatorClasses() {
            return Collections.singletonList(validatorClass);
        }

        @Override
        public Map<String, Object> getAttributes() {
            return attributes;
        }

        @Override
        public Set<ConstraintDescriptor<?>> getComposingConstraints() {
            return Collections.emptySet();
        }

        @Override
        public boolean isReportAsSingleViolation() {
            return false;
        }

        @Override
        public ValidateUnwrappedValue getValueUnwrapping() {
            return ValidateUnwrappedValue.DEFAULT;
        }

        @Override
        public <U> U unwrap(Class<U> type) {
            return (U) this;
        }
    }

    public static class AnnotationDescriptor {
        private Annotation value;

        private Map<String, Object> attributes = new HashMap<>();

        private AnnotationDescriptor(Annotation annotation, Annotation parent) {
            this.value = annotation;

            for (Method declaredMethod : annotation.annotationType().getDeclaredMethods()) {
                try {
                    attributes.put(declaredMethod.getName(), declaredMethod.invoke(annotation));
                } catch (IllegalAccessException | InvocationTargetException e) {
                }
            }

            if (parent != null) {
                for (Method declaredMethod : parent.annotationType().getDeclaredMethods()) {
                    OverridesAttribute override = declaredMethod.getAnnotation(OverridesAttribute.class);
                    if (override != null && override.constraint() == annotation.annotationType()) {
                        if (override.constraintIndex() >= 0) {
                            Annotation[] annotationsByType = parent.annotationType().getAnnotationsByType(override.constraint());
                            if (annotationsByType.length <= override.constraintIndex() || annotationsByType[override.constraintIndex()] != annotation) {
                                continue;
                            }
                        }
                        try {
                            attributes.put(override.name().isEmpty() ? declaredMethod.getName() : override.name(), declaredMethod.invoke(parent));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                        }
                    } else if (declaredMethod.getName().equals("message")) {
                        try {
                            attributes.put(declaredMethod.getName(), declaredMethod.invoke(parent));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                        }
                    }
                }
            }
        }

        public static AnnotationDescriptor of(Annotation annotation) {
            return new AnnotationDescriptor(annotation, null);
        }

        public static AnnotationDescriptor of(Annotation annotation, Annotation parent) {
            return new AnnotationDescriptor(annotation, parent);
        }

        public Annotation getAnnotation() {
            return value;
        }

        public Object get(String key) {
            return attributes.get(key);
        }

        public Map<String, Object> getAttributes() {
            return attributes;
        }
    }
}
