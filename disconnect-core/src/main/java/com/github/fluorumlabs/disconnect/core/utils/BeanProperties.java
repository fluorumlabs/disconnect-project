package com.github.fluorumlabs.disconnect.core.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.Value;
import org.teavm.metaprogramming.reflect.ReflectAnnotatedElement;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import javax.annotation.Nullable;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

import static com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils.optional;
import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/23/2020.
 */
@CompileTime
public final class BeanProperties {
    private static final Map<Class<?>, List<Descriptor>> CLASS_CACHE = new HashMap<>();
    private BeanProperties() {
    }

    public static List<Descriptor> getPropertyDescriptors(Class<?> clazz) {
        return CLASS_CACHE.computeIfAbsent(clazz, BeanProperties::getPropertyDescriptors_);
    }

    public static Optional<Descriptor> getProperty(Class<?> clazz, String fieldName) {
        return getPropertyDescriptors(clazz).stream()
                .filter(descriptor -> fieldName.equals(descriptor.name))
                .findAny();
    }

    @Meta
    public static native <T> T read(Class<?> clazz, Object instance, String fieldName);

    private static void read(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName) {
        String className = clazz.getName();
        List<CompileTimeDescriptor> compileTimePropertyDescriptors = getCompileTimePropertyDescriptors(clazz);

        Value<Object> result = lazy(() -> {
            throw new IllegalArgumentException("Unknown field " + className + "." + fieldName.get());
        });

        for (CompileTimeDescriptor descriptor : compileTimePropertyDescriptors) {
            String realFieldName = descriptor.name;
            ReflectField field = descriptor.field;
            ReflectMethod getter = descriptor.getter;
            Value<Object> currentResult = result;
            if (descriptor.readable) {
                if (getter != null) {
                    result = lazy(() -> fieldName.get().equals(realFieldName) ? getter.invoke(instance.get()) :
                            currentResult.get());
                } else if (field != null) {
                    result = lazy(() -> fieldName.get().equals(realFieldName) ? field.get(instance.get()) :
                            currentResult.get());
                }
            }
        }

        Value<Object> finalResult = result;
        exit(() -> optional(finalResult.get()).orElse(null));
    }

    @Meta
    public static native void write(Class<?> clazz, Object instance, String fieldName, Object value);

    private static void write(ReflectClass<?> clazz, Value<Object> instance, Value<String> fieldName,
                              Value<Object> value) {
        List<CompileTimeDescriptor> compileTimePropertyDescriptors = getCompileTimePropertyDescriptors(clazz);

        for (CompileTimeDescriptor descriptor : compileTimePropertyDescriptors) {
            String realFieldName = descriptor.name;
            ReflectField field = descriptor.field;
            ReflectMethod setter = descriptor.setter;
            if (descriptor.writable) {
                if (setter != null) {
                    emit(() -> {
                        if (fieldName.get().equals(realFieldName)) {
                            setter.invoke(instance.get(), value.get());
                        }
                    });
                } else if (field != null) {
                    emit(() -> {
                        if (fieldName.get().equals(realFieldName)) {
                            field.set(instance.get(), value.get());
                        }
                    });
                }
            }
        }
    }

    @Meta
    private static native List<Descriptor> getPropertyDescriptors_(Class<?> clazz);

    private static void getPropertyDescriptors_(ReflectClass<?> clazz) {
        List<CompileTimeDescriptor> compileTimePropertyDescriptors = getCompileTimePropertyDescriptors(clazz);

        Value<List<Descriptor>> result = emit(() -> new ArrayList<>());

        for (CompileTimeDescriptor descriptor : compileTimePropertyDescriptors) {
            String name = descriptor.name;
            String jsonName = descriptor.jsonName;
            boolean readable = descriptor.readable;
            boolean writable = descriptor.writable;
            boolean serializable = descriptor.serializable;
            ReflectClass<?> type = descriptor.type;
            ReflectClass<?>[] typeParametersCompile = descriptor.typeParameters;

            Value<Descriptor> newDescriptor = emit(() -> {
                Descriptor entry = new Descriptor();

                entry.name = name;
                entry.jsonName = jsonName;
                entry.readable = readable;
                entry.writable = writable;
                entry.serializable = serializable;
                entry.type = type.asJavaClass();

                return entry;
            });

            // Fill typeArray
            if (typeParametersCompile != null) {
                Value<Class<?>[]> typeParameters = emit(() -> new Class<?>[typeParametersCompile.length]);
                for (int i = 0; i < typeParametersCompile.length; i++) {
                    int iFinal = i;
                    ReflectClass<?> typeParameter = typeParametersCompile[i];
                    emit(() -> {
                        typeParameters.get()[iFinal] = typeParameter.asJavaClass();
                    });
                }
                emit(() -> {
                    newDescriptor.get().typeParameters = typeParameters.get();
                });
            }

            emit(() -> {
                result.get().add(newDescriptor.get());
            });
        }

        exit(() -> result.get());
    }

    public static List<CompileTimeDescriptor> getCompileTimePropertyDescriptors(ReflectClass<?> clazz) {
        if (clazz.getName().equals(Class.class.getName())) {
            return Collections.emptyList();
        }

        if (Internals.COMPILE_CLASS_CACHE.containsKey(clazz)) {
            return Internals.COMPILE_CLASS_CACHE.get(clazz);
        }

        Map<String, CompileTimeDescriptor> properties = new HashMap<>();

        for (ReflectField field : clazz.getFields()) {
            if (!Modifier.isStatic(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                // get property name
                String fieldName = field.getName();
                String jsonName = fieldName;

                CompileTimeDescriptor property = properties.computeIfAbsent(fieldName, CompileTimeDescriptor::new);

                property.serializable = property.serializable && !Modifier.isTransient(field.getModifiers());
                property.field = field;
                property.type = field.getType();

                try {
                    Class<?> realClass = Class.forName(clazz.getName(), false, getClassLoader());
                    Field realField = realClass.getField(field.getName());

                    Type genericType = realField.getGenericType();
                    extractTypeArguments(property, genericType);
                } catch (ClassNotFoundException | NoSuchFieldException ignore) {
                    // ignore
                }

                jsonName = parseJsonAnnotations(field, property, jsonName);

                // extra check:
                if (Modifier.isFinal(field.getModifiers())) {
                    property.writable = false;
                }

                property.jsonName = jsonName;
            }
        }

        for (ReflectMethod method : clazz.getMethods()) {
            if (!Modifier.isStatic(method.getModifiers()) && Modifier.isPublic(method.getModifiers()) && method.getParameterCount() == 0 && !"getClass".equals(method.getName())) {
                if (!StringUtils.startsWithAny(method.getName(), "get", "is")) {
                    continue;
                }
                String fieldName = method.getName();

                if (fieldName.startsWith("get")) {
                    fieldName = fieldName.substring(3);
                } else if (fieldName.startsWith("is") && method.getReturnType().getName().equals("boolean")) {
                    fieldName = fieldName.substring(2);
                } else {
                    continue;
                }
                if (fieldName.isEmpty() || fieldName.charAt(0) < 'A' || fieldName.charAt(0) > 'Z') {
                    continue;
                }

                fieldName = StringUtils.uncapitalize(fieldName);
                String jsonName = fieldName;

                CompileTimeDescriptor property = properties.computeIfAbsent(fieldName, CompileTimeDescriptor::new);

                property.getter = method;
                property.type = method.getReturnType();

                if (!property.type.isPrimitive() && !property.type.isArray()) {
                    try {
                        Class<?> parameter = Class.forName(property.type.getName(), false, getClassLoader());
                        Class<?> realClass = Class.forName(clazz.getName(), false, getClassLoader());
                        Method realMethod = realClass.getMethod(method.getName(), parameter);

                        Type genericType = realMethod.getGenericParameterTypes()[0];
                        extractTypeArguments(property, genericType);
                    } catch (ClassNotFoundException | NoSuchMethodException ignore) {
                        // ignore
                    }
                }

                jsonName = parseJsonAnnotations(method, property, jsonName);

                property.jsonName = jsonName;
            } else if (!Modifier.isStatic(method.getModifiers()) && Modifier.isPublic(method.getModifiers()) && method.getParameterCount() == 1 && method.getReturnType().getName().equals("void")) {
                if (!StringUtils.startsWithAny(method.getName(), "set")) {
                    continue;
                }
                String fieldName = method.getName();

                fieldName = fieldName.substring(3);
                if (fieldName.isEmpty() || fieldName.charAt(0) < 'A' || fieldName.charAt(0) > 'Z') {
                    continue;
                }

                fieldName = StringUtils.uncapitalize(fieldName);
                String jsonName = fieldName;

                CompileTimeDescriptor property = properties.computeIfAbsent(fieldName, CompileTimeDescriptor::new);

                property.setter = method;
                property.type = method.getParameterType(0);

                if (!property.type.isPrimitive() && !property.type.isArray()) {
                    try {
                        Class<?> parameter = Class.forName(property.type.getName(), false, getClassLoader());
                        Class<?> realClass = Class.forName(clazz.getName(), false, getClassLoader());
                        Method realMethod = realClass.getMethod(method.getName(), parameter);

                        Type genericType = realMethod.getGenericParameterTypes()[0];
                        extractTypeArguments(property, genericType);
                    } catch (ClassNotFoundException | NoSuchMethodException ignore) {
                        // ignore
                    }
                }

                jsonName = parseJsonAnnotations(method, property, jsonName);

                property.jsonName = jsonName;
            }
        }

        for (CompileTimeDescriptor value : properties.values()) {
            if (value.writable && value.setter == null && value.field == null) {
                value.writable = false;
            }
            if (value.readable && value.getter == null && value.field == null) {
                value.readable = false;
            }
        }

        List<CompileTimeDescriptor> result = properties.keySet().stream()
                .sorted(String::compareTo)
                .map(properties::get)
                .collect(Collectors.toList());

        Internals.COMPILE_CLASS_CACHE.put(clazz, result);

        return result;
    }

    private static String parseJsonAnnotations(ReflectAnnotatedElement field, CompileTimeDescriptor property, String jsonName) {
        if (field.getAnnotation(JsonIgnore.class) != null) {
            property.serializable = false;
        }
        JsonProperty annotation = field.getAnnotation(JsonProperty.class);
        if (annotation != null) {
            switch (annotation.access()) {
                case READ_ONLY:
                    property.writable = false;
                    break;
                case WRITE_ONLY:
                    property.readable = false;
                    break;
                case READ_WRITE:
                case AUTO:
                    break;
            }
            if (!annotation.value().isEmpty()) {
                return annotation.value();
            }
        }
        return jsonName;
    }

    private static void extractTypeArguments(CompileTimeDescriptor property, Type genericType) {
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) (genericType)).getActualTypeArguments();
            ReflectClass<?>[] typeParameters = new ReflectClass<?>[actualTypeArguments.length];
            for (int i = 0; i < actualTypeArguments.length; i++) {
                typeParameters[i] = actualTypeArguments[i] instanceof Class<?> ? findClass((Class<?>) actualTypeArguments[i]) : null;
            }
            property.typeParameters = typeParameters;
        }
    }

    @Getter
    public static class CompileTimeDescriptor {
        private final String name;
        private String jsonName;
        private boolean readable;
        private boolean writable;
        private boolean serializable;

        @Nullable
        private ReflectField field;
        @Nullable
        private ReflectMethod getter;
        @Nullable
        private ReflectMethod setter;
        private ReflectClass<?> type;
        private ReflectClass<?>[] typeParameters;

        private CompileTimeDescriptor(String name) {
            this.name = name;
            readable = true;
            writable = true;
            serializable = true;
        }
    }

    @Getter
    public static class Descriptor {
        private String name;
        private String jsonName;
        private boolean readable;
        private boolean writable;
        private boolean serializable;

        private Class<?> type;
        private Class<?>[] typeParameters = null;
    }

    private static class Internals {
        private static final Map<ReflectClass<?>, List<CompileTimeDescriptor>> COMPILE_CLASS_CACHE = new HashMap<>();
    }
}
