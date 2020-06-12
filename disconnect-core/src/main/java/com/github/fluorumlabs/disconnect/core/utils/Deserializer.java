package com.github.fluorumlabs.disconnect.core.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import js.lang.Any;
import js.lang.JsObject;
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
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/10/2020.
 */
@SuppressWarnings({"ReturnOfNull", "unchecked"})
@CompileTime
public final class Deserializer {
    private Deserializer() {}

    public static <T> T deserialize(Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (T) deserialize((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only Serializable objects can be deserialized");
        }
    }

    @Meta
    private static native Serializable deserialize(Class<? extends Serializable> clazz, Any object);

    private static void deserialize(ReflectClass<? extends Serializable> clazz, Value<Any> value) {
        Value<Object> result = deserializeValue(clazz, value)
                .orElseGet(() -> deserializeObject(clazz, value));
        exit(() -> result.get());
    }

    public static <T> List<T> deserializeList(Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (List<T>) deserializeList((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only lists of Serializable objects can be deserialized");
        }
    }

    @Meta
    private static native List<Serializable> deserializeList(Class<? extends Serializable> clazz, Any object);

    private static void deserializeList(ReflectClass<? extends Serializable> clazz, Value<Any> value) {
        Value<Object> result = deserializeList(value, clazz);
        exit(() -> result.get());
    }

    public static <T extends Enum<T>> EnumSet<T> deserializeEnumSet(Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (EnumSet<T>) deserializeEnumSet(clazz, object);
        } else {
            throw new IllegalArgumentException("Only sets of Serializable objects can be deserialized");
        }
    }

    @Meta
    private static native EnumSet<?> deserializeEnumSet(Class<? extends Enum<?>> clazz, Any object);

    private static void deserializeEnumSet(ReflectClass<? extends Enum<?>> clazz, Value<Any> value) {
        Value<Object> result = deserializeEnumSet(value, clazz);
        exit(() -> result.get());
    }

    public static <T> Set<T> deserializeSet(Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (Set<T>) deserializeSet((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only sets of Serializable objects can be deserialized");
        }
    }

    @Meta
    private static native Set<Serializable> deserializeSet(Class<? extends Serializable> clazz, Any object);

    private static void deserializeSet(ReflectClass<? extends Serializable> clazz, Value<Any> value) {
        Value<Object> result = deserializeSet(value, clazz);
        exit(() -> result.get());
    }

    public static <T> Map<String, T> deserializeMap(Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (Map<String, T>) deserializeMap((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only maps of Serializable objects can be deserialized");
        }
    }

    @Meta
    private static native Map<String, Serializable> deserializeMap(Class<? extends Serializable> clazz, Any object);

    private static void deserializeMap(ReflectClass<? extends Serializable> clazz, Value<Any> value) {
        Value<Object> result = deserializeMap(value, clazz);
        exit(() -> result.get());
    }

    private static Optional<Value<Object>> deserializeValue(ReflectClass<?> clazz, Value<Any> value) {
        if (clazz.isEnum()) {
            return Optional.of(deserializeEnum(clazz, value));
        } else if (clazz.isArray()) {
            switch (clazz.getComponentType().getName()) {
                case "java.lang.String":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().stringArrayValue()));
                case "~Z":
                case "boolean":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().booleanArrayValue()));
                case "~B":
                case "byte":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().byteArrayValue()));
                case "~C":
                case "char":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().charArrayValue()));
                case "~S":
                case "short":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().shortArrayValue()));
                case "~I":
                case "int":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().intArrayValue()));
                case "~F":
                case "float":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().floatArrayValue()));
                case "~D":
                case "double":
                    return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().doubleArrayValue()));

            }
            return Optional.of(deserializeArray(clazz.getComponentType(), value));
        }

        switch (clazz.getName()) {
            case "java.lang.String":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().stringValue()));
            case "java.util.Date":
                return Optional.of(emit(() -> value.get() == null ? null : Unknown.of(((Date)(value.get())).getTime())));
            case "~Z":
            case "boolean":
            case "java.lang.Boolean":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().booleanValue()));
            case "~B":
            case "byte":
            case "java.lang.Byte":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().byteValue()));
            case "~C":
            case "char":
            case "java.lang.Character":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().charValue()));
            case "~S":
            case "short":
            case "java.lang.Short":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().shortValue()));
            case "~I":
            case "int":
            case "java.lang.Integer":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().intValue()));
            case "~F":
            case "float":
            case "java.lang.Float":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().floatValue()));
            case "~D":
            case "double":
            case "java.lang.Double":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().doubleValue()));
        }

        return Optional.empty();
    }

    private static Value<Object> deserializeFieldValue(ReflectClass<?> clazz, Value<Any> value) {
        return deserializeValue(clazz, value)
                .orElseGet(() -> {
            return emit(() -> value.get() == null ? null : deserialize((Class<? extends Serializable>) value.get().getClass(), value.get()));
        });
    }

    private static Value<Object> deserializeEnum(ReflectClass<?> clazz, Value<Any> value) {
        Value<String> text = emit(() -> value.get().<Unknown>cast().stringValue());
        Value<Object> result = lazy(() -> null);

        for (ReflectField field : clazz.getDeclaredFields()) {
            if (field.isEnumConstant()) {
                String fieldName = field.getName();
                Value<Object> currentResult = result;
                result = lazy(() -> text.get().equals(fieldName) ? field.get(null) : currentResult.get());
            }
        }

        Value<Object> finalResult = result;
        return emit(() -> finalResult.get());
    }

    private static Value<Object> deserializeObject(ReflectClass<?> clazz, Value<Any> value) {
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
                if (annotation.access() == JsonProperty.Access.READ_ONLY) {
                    continue;
                }
                if (!annotation.value().isEmpty()) {
                    fieldName = annotation.value();
                }
            }

            Property property = properties.computeIfAbsent(fieldName, name -> new Property());
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
        }

        for (ReflectMethod method : clazz.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || !Modifier.isPublic(method.getModifiers()) || method.getParameterCount() != 1) {
                continue;
            }
            if (!method.getName().startsWith( "set")) {
                continue;
            }
            String fieldName = method.getName().substring(3);
            if (fieldName.isEmpty() || fieldName.charAt(0) < 'A' || fieldName.charAt(0) > 'Z') {
                continue;
            }
            if (method.getAnnotation(JsonIgnore.class) != null) {
                continue;
            }
            fieldName = StringUtils.uncapitalize(fieldName);

            JsonProperty annotation = method.getAnnotation(JsonProperty.class);
            if (annotation != null) {
                if (annotation.access() == JsonProperty.Access.READ_ONLY) {
                    continue;
                }
                if (!annotation.value().isEmpty()) {
                    fieldName = annotation.value();
                }
            }

            Property property = properties.computeIfAbsent(fieldName, name -> new Property());
            property.field = null;
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
        }

        List<String> propertyNames = new ArrayList<>(properties.keySet());
        propertyNames.sort(String::compareTo);

        Value<Object> result = emit(() -> {
            try {
                return clazz.asJavaClass().newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new IllegalStateException("Cannot create instance of "+clazz.asJavaClass().getName(), e);
            }
        });

        for (String propertyName : propertyNames) {
            Property property = properties.get(propertyName);
            Value<Object> finalDeserializedValue = deserializeGenericValue(clazz, value, propertyName, property);
            if (property.setter != null) {
                ReflectMethod setter = property.setter;
                emit(() -> setter.invoke(result.get(), finalDeserializedValue.get()));
            } else {
                ReflectField field = property.field;
                emit(() -> field.set(result.get(), finalDeserializedValue.get()));
            }
        }

        return emit(() -> result.get());
    }

    private static Value<Object> deserializeGenericValue(ReflectClass<?> clazz, Value<Any> value, String propertyName, Property property) {
        Value<Any> serializedValue = emit(() -> value.get().<Record<Any>>cast().get(propertyName));

        Value<Object> deserializedValue;

        if (property.typeParameters != null && property.typeParameters.length > 0) {
            ReflectClass<?> typeParameter = property.typeParameters[0];
            if (typeParameter != null) {
                if (findClass(List.class).isAssignableFrom(property.type) && findClass(Serializable.class).isAssignableFrom(typeParameter)) {
                    deserializedValue = deserializeList(serializedValue, typeParameter);
                } else if (findClass(EnumSet.class).isAssignableFrom(property.type)) {
                    deserializedValue = deserializeEnumSet(serializedValue, typeParameter);
                } else if (findClass(Set.class).isAssignableFrom(property.type) && findClass(Serializable.class).isAssignableFrom(typeParameter)) {
                    deserializedValue = deserializeSet(serializedValue, typeParameter);
                } else if (findClass(Map.class).isAssignableFrom(property.type) && property.typeParameters.length > 1 && property.typeParameters[1] != null && findClass(Serializable.class).isAssignableFrom(property.typeParameters[1])) {
                    ReflectClass<?> mapTypeParameter = property.typeParameters[1];
                    deserializedValue = deserializeMap(serializedValue, mapTypeParameter);
                } else {
                    deserializedValue = emit(() -> {
                        throw new UnsupportedOperationException("Unsupported generic argument for "+clazz.asJavaClass().getName()+"."+propertyName);
                    });
                }
            } else {
                deserializedValue = emit(() -> {
                    throw new UnsupportedOperationException("Unsupported generic argument for "+clazz.asJavaClass().getName()+"."+propertyName);
                });
            }
        } else {
            deserializedValue = deserializeFieldValue(property.type, serializedValue);
        }

        return deserializedValue;
    }

    private static Value<Object> deserializeList(Value<Any> value, ReflectClass<?> typeParameter) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> array = value.get().cast();
            Vector<Object> result = new Vector<>(array.getLength());
            result.setSize(array.getLength());

            for (int i : array.keys().iterable()) {
                Any serialized = array.get(i);
                if (serialized != null) {
                    result.set(i, deserialize((Class<? extends Serializable>) typeParameter.asJavaClass(), serialized));
                } else {
                    result.set(i, null);
                }
            }

            return result;
        });
    }

    private static Value<Object> deserializeEnumSet(Value<Any> value, ReflectClass<?> typeParameter) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> array = value.get().cast();
            Set<Object> result = (Set<Object>)EnumSet.noneOf((Class<? extends Enum>)typeParameter.asJavaClass());

            for (int i = 0; i < array.getLength(); i++) {
                Any serialized = array.get(i);
                if (serialized != null) {
                    result.add(deserialize(serialized, typeParameter.asJavaClass()));
                } else {
                    result.add(null);
                }
            }

            return result;
        });
    }

    private static Value<Object> deserializeMap(Value<Any> value, ReflectClass<?> typeParameter) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Record<Any> record = value.get().cast();
            Map<String,Object> result = new HashMap<>();

            for (String key : JsObject.keys(record)) {
                Any serialized = record.get(key);
                if (serialized != null) {
                    result.put(key, deserialize(serialized, typeParameter.asJavaClass()));
                } else {
                    result.put(key, null);
                }
            }

            return result;
        });
    }

    private static Value<Object> deserializeSet(Value<Any> value, ReflectClass<?> typeParameter) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> array = value.get().cast();
            Set<Object> result = new HashSet<>();

            for (int i = 0; i < array.getLength(); i++) {
                Any serialized = array.get(i);
                if (serialized != null) {
                    result.add(deserialize(serialized, typeParameter.asJavaClass()));
                } else {
                    result.add(null);
                }
            }

            return result;
        });
    }


    private static void extractTypeArguments(Property property, Type genericType) {
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) (genericType)).getActualTypeArguments();
            ReflectClass<?>[] typeParameters = new ReflectClass<?>[actualTypeArguments.length];
            for (int i = 0; i < actualTypeArguments.length; i++) {
                typeParameters[i] = actualTypeArguments[i] instanceof Class<?> ? findClass((Class<?>) actualTypeArguments[i]) : null;
            }
            property.typeParameters = typeParameters;
        }
    }

    private static Value<Object> deserializeArray(ReflectClass<?> itemClass, Value<Any> value) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> array = value.get().cast();
            Object[] result = itemClass.createArray(array.getLength());

            for (int i = 0; i < array.getLength(); i++) {
                Any serialized = array.get(i);
                if (serialized != null) {
                    result[i] = deserialize((Class<? extends Serializable>) itemClass.asJavaClass(), serialized);
                } else {
                    result[i] = null;
                }
            }

            return result;
        });
    }

    private static class Property {
        @Nullable
        private ReflectField field;
        @Nullable
        private ReflectMethod setter;
        private ReflectClass<?> type;
        private ReflectClass<?>[] typeParameters;
    }
}
