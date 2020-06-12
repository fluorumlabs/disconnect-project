package com.github.fluorumlabs.disconnect.core.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.collections.Array;
import org.apache.commons.lang3.StringUtils;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.Value;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import javax.annotation.Nullable;
import java.lang.reflect.Modifier;
import java.util.*;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/10/2020.
 */
@SuppressWarnings({"ReturnOfNull", "unchecked"})
@CompileTime
final class Serializer {
    private Serializer() {}

    @Meta
    static native Any serialize(Class<?> clazz, Object object);

    private static void serialize(ReflectClass<?> clazz, Value<Object> value) {
        Value<Any> result = serializeValue(clazz, value)
                .orElseGet(() -> serializeObject(clazz, value));
        exit(() -> result.get());
    }

    private static Optional<Value<Any>> serializeValue(ReflectClass<?> clazz, Value<Object> value) {
        if (clazz.isEnum()) {
            return Optional.of(serializeEnum(value));
        } else if (clazz.isArray()) {
            switch (clazz.getComponentType().getName()) {
                case "java.lang.String":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((String[])value.get())));
                case "~Z":
                case "boolean":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((boolean[]) value.get())));
                case "~B":
                case "byte":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((byte[]) value.get())));
                case "~C":
                case "char":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((char[]) value.get())));
                case "~S":
                case "short":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((short[]) value.get())));
                case "~I":
                case "int":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((int[]) value.get())));
                case "~F":
                case "float":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((float[]) value.get())));
                case "~D":
                case "double":
                    return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((double[]) value.get())));

            }
            return Optional.of(serializeArray(clazz.getComponentType(), value));
        } else if (findClass(Collection.class).isAssignableFrom(clazz)) {
            return Optional.of(serializeCollection(value));
        } else if (findClass(Map.class).isAssignableFrom(clazz)) {
            return Optional.of(serializeMap(value));
        }

        switch (clazz.getName()) {
            case "java.lang.String":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((String)value.get())));
            case "java.util.Date":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of(((Date)(value.get())).getTime())));
            case "java.util.Optional":
                return Optional.of(emit(() -> value.get() == null ? null : ((Optional<Object>)value.get()).map(SerDes::serialize).orElse(null)));
            case "~Z":
            case "boolean":
            case "java.lang.Boolean":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Boolean) value.get())));
            case "~B":
            case "byte":
            case "java.lang.Byte":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Byte)value.get())));
            case "~C":
            case "char":
            case "java.lang.Character":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Character)value.get())));
            case "~S":
            case "short":
            case "java.lang.Short":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Short)value.get())));
            case "~I":
            case "int":
            case "java.lang.Integer":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Integer)value.get())));
            case "~F":
            case "float":
            case "java.lang.Float":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Float)value.get())));
            case "~D":
            case "double":
            case "java.lang.Double":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of((Double)value.get())));
        }

        return Optional.empty();
    }

    private static Value<Any> serializeFieldValue(ReflectClass<?> clazz, Value<Object> value) {
        return serializeValue(clazz, value)
                .orElseGet(() -> {
            return emit(() -> value.get() == null ? null : serialize(value.get().getClass(), value.get()));
        });
    }

    private static Value<Any> serializeEnum(Value<Object> value) {
        return emit(() -> value.get() == null ? null : Unknown.of(((Enum<?>)value.get()).name()));
    }

    private static Value<Any> serializeObject(ReflectClass<?> clazz, Value<Object> value) {
        Map<String, Property> properties = new HashMap<>();

        for (ReflectField field : clazz.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) || !Modifier.isPublic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) {
                continue;
            }
            if (field.getAnnotation(JsonIgnore.class) != null) {
                continue;
            }

            // get property name
            String fieldName = field.getName();

            JsonProperty annotation = field.getAnnotation(JsonProperty.class);
            if (annotation != null) {
                if (annotation.access() == JsonProperty.Access.WRITE_ONLY) {
                    continue;
                }
                if (!annotation.value().isEmpty()) {
                    fieldName = annotation.value();
                }
            }

            Property property = properties.computeIfAbsent(fieldName, name -> new Property());
            property.field = field;
            property.type = field.getType();
        }

        for (ReflectMethod method : clazz.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || !Modifier.isPublic(method.getModifiers()) || method.getParameterCount() > 0) {
                continue;
            }
            if (!StringUtils.startsWithAny(method.getName(), "get", "is")) {
                continue;
            }
            String fieldName = method.getName();
            if (fieldName.startsWith("get")) {
                fieldName = fieldName.substring(3);
            } else if (fieldName.startsWith("is")) {
                fieldName = fieldName.substring(2);
            }
            if (fieldName.isEmpty() || fieldName.charAt(0) < 'A' || fieldName.charAt(0) > 'Z') {
                continue;
            }
            if (method.getAnnotation(JsonIgnore.class) != null) {
                continue;
            }
            fieldName = StringUtils.uncapitalize(fieldName);

            JsonProperty annotation = method.getAnnotation(JsonProperty.class);
            if (annotation != null) {
                if (annotation.access() == JsonProperty.Access.WRITE_ONLY) {
                    continue;
                }
                if (!annotation.value().isEmpty()) {
                    fieldName = annotation.value();
                }
            }

            Property property = properties.computeIfAbsent(fieldName, name -> new Property());
            property.field = null;
            property.getter = method;
            property.type = method.getReturnType();
        }

        List<String> propertyNames = new ArrayList<>(properties.keySet());
        propertyNames.sort(String::compareTo);

        Value<Record<Any>> result = emit(() -> Any.empty());

        for (String propertyName : propertyNames) {
            if (propertyName.equals("class")) {
                continue;
            }
            Property property = properties.get(propertyName);
            if (property.getter != null) {
                ReflectMethod getter = property.getter;
                Value<Object> propertyValue = emit(() -> getter.invoke(value.get()));
                Value<Any> serializedValue = serializeFieldValue(property.type, propertyValue);
                emit(() -> {
                    result.get().set(propertyName, serializedValue.get());
                });
            } else {
                ReflectField field = property.field;
                Value<Object> propertyValue = emit(() -> field.get(value.get()));
                Value<Any> serializedValue = serializeFieldValue(property.type, propertyValue);
                emit(() -> {
                    result.get().set(propertyName, serializedValue.get());
                });
            }
        }

        return emit(() -> result.get());
    }

    private static Value<Any> serializeArray(ReflectClass<?> itemClass, Value<Object> value) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }
            Object[] serializables = (Object[])(value.get());

            Array<Any> result = Array.create();
            for (int i = 0; i < serializables.length; i++) {
                Object serializable = serializables[i];
                if (serializable != null) {
                    result.set(i, serialize(itemClass.asJavaClass(), serializable));
                } else {
                    result.set(i, null);
                }
            }

            return result;
        });
    }

    private static Value<Any> serializeCollection(Value<Object> value) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> result = Array.create();
            int i = 0;
            for (Object o : (Iterable<Object>) value.get()) {
                if (o != null) {
                    result.set(i, serialize(o.getClass(), o));
                } else {
                    result.set(i, null);
                }
                i++;
            }
            return result;
        });
    }

    private static Value<Any> serializeMap(Value<Object> value) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Record<Any> result = Any.empty();
            for (Map.Entry<String, Object> entry : ((Map<String,Object>)value.get()).entrySet()) {
                result.set(entry.getKey(), entry.getValue() == null ? null : SerDes.serialize(entry.getValue()));
            }
            return result;
        });
    }

    private static class Property {
        @Nullable
        private ReflectField field;
        @Nullable
        private ReflectMethod getter;
        private ReflectClass<?> type;
    }
}
