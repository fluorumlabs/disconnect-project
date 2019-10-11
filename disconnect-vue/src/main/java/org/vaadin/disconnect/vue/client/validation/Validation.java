package org.vaadin.disconnect.vue.client.validation;

import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;
import org.vaadin.disconnect.vue.client.internals.ValidationException;
import org.vaadin.disconnect.vue.client.internals.ValidatorRegistry;

import javax.validation.*;
import javax.validation.metadata.ConstraintDescriptor;
import javax.validation.metadata.ValidateUnwrappedValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.Consumer;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 10/3/2019.
 */
@SuppressWarnings("unchecked")
@CompileTime
public class Validation {

    public static ValidationResult runValidation(Runnable runnable) {
        try {
            Internal.VALIDATION_ENABLED = true;
            Internal.VALIDATION_RESULT = new ValidationResult();
            runnable.run();
            return Internal.VALIDATION_RESULT;
        } finally {
            Internal.VALIDATION_ENABLED = false;
            Internal.VALIDATION_RESULT = new ValidationResult();
        }
    }

    public static <T> ValidationResult validate(T x) {
        try {
            Internal.VALIDATION_ENABLED = true;
            Internal.VALIDATION_RESULT = new ValidationResult();
            validate((Class<T>)x.getClass(), x, null);
            return Internal.VALIDATION_RESULT;
        } finally {
            Internal.VALIDATION_ENABLED = false;
            Internal.VALIDATION_RESULT = new ValidationResult();
        }
    }

    private static <T> void validate(Class<T> cls, T instance, String fieldName) {
        if (Internal.VALIDATION_ENABLED) {
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
            ConstraintValidator<A, T> validator = Internal.VALIDATORS.get(key);

            if (validator == null) {
                validator = (ConstraintValidator<A, T>) method.construct();
                validator.initialize(annotationProxy.get());

                Internal.VALIDATORS.put(key, validator);
            }

            if (shouldEmit.get() && !validator.isValid(o.get(), null)) {
                Internal.VALIDATION_RESULT.addError(message);
            }
        });
    }

    private static <T extends Annotation> Value<T> makeAnnotationProxy(AnnotationDescriptor annotation) {
        Class<T> aClass = (Class<T>) annotation.getAnnotation().annotationType();

        return proxy(aClass, (proxy, method, args) -> {
            String name = method.getName();
            if (method.getReturnType().isArray() && method.getReturnType().getComponentType().isAssignableFrom(Class.class)) {
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

    private static class Internal {
        static Boolean VALIDATION_ENABLED = false;
        static ValidationResult VALIDATION_RESULT = new ValidationResult();

        static Map<Integer, ConstraintValidator> VALIDATORS = new HashMap<>();
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
        private Map<String, Object> attributes = new HashMap<>();
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
