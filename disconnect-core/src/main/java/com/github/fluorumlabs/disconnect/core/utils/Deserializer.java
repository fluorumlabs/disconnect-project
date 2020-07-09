package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.lang.JsObject;
import js.lang.Unknown;
import js.util.JS;
import js.util.Record;
import js.util.collections.Array;
import org.teavm.metaprogramming.*;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import static org.teavm.metaprogramming.Metaprogramming.*;

/**
 * Created by Artem Godin on 6/10/2020.
 */
@SuppressWarnings({"ReturnOfNull", "unchecked"})
@CompileTime
final class Deserializer {
    private Deserializer() {}

    static Object deserialize(Class<?> clazz, Any object) {
        if (SerDes.MIRROR_MODE) {
            if (JS.isUndefinedOrNull(Platform.getPlatformObject(clazz).cast())) {
                return (Any) object;
            }
            return unmirror_(clazz, object);
        } else {
            if (JS.isUndefinedOrNull(Platform.getPlatformObject(clazz).cast())) {
                return DisconnectUtils.deepCopy((Any) object).cast();
            }
            return deserialize_(clazz, object);
        }
    }

    @Meta
    private static native Object deserialize_(Class<?> clazz, Any object);

    private static void deserialize_(ReflectClass<?> clazz, Value<Any> value) {
        Value<Object> result = deserializeValue(clazz, value)
                .orElseGet(() -> deserializeObject(clazz, value));
        exit(() -> result.get());
    }

    @Meta
    static native Object unmirror_(Class<?> clazz, Any object);

    private static void unmirror_(ReflectClass<?> clazz, Value<Any> value) {
        Value<Object> result = deserializeValue(clazz, value)
                .orElseGet(() -> unmirrorObject(clazz, value));
        exit(() -> result.get());
    }

    @Meta
    static native List<Object> deserializeList(Class<?> clazz, Any object);

    private static void deserializeList(ReflectClass<?> clazz, Value<Any> value) {
        Value<Object> result = deserializeArray(value, clazz);
        exit(() -> result.get()==null?null:Arrays.asList((Object[])result.get()));
    }

    @Meta
    static native EnumSet<?> deserializeEnumSet(Class<? extends Enum<?>> clazz, Any object);

    private static void deserializeEnumSet(ReflectClass<? extends Enum<?>> clazz, Value<Any> value) {
        Value<Object> result = deserializeEnumSet(value, clazz);
        exit(() -> result.get());
    }

    @Meta
    static native Set<Object> deserializeSet(Class<?> clazz, Any object);

    private static void deserializeSet(ReflectClass<?> clazz, Value<Any> value) {
        Value<Object> result = deserializeSet(value, clazz);
        exit(() -> result.get());
    }

    @Meta
    static native Map<String, Object> deserializeMap(Class<?> clazz, Any object);

    private static void deserializeMap(ReflectClass<?> clazz, Value<Any> value) {
        Value<Object> result = deserializeMap(value, clazz);
        exit(() -> result.get());
    }

    private static Optional<Value<Object>> deserializeValue(ReflectClass<?> clazz, Value<Any> value) {
        if (findClass(Any.class).isAssignableFrom(clazz)) {
            return Optional.of(emit(() -> value.get()));
        } else if (clazz.isEnum()) {
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
            return Optional.of(deserializeArray(value, clazz.getComponentType()));
        }

        switch (clazz.getName()) {
            case "java.lang.String":
                return Optional.of(emit(() -> value.get() == null ? null : value.get().<Unknown>cast().stringValue()));
            case "java.util.Date":
                return Optional.of(emit(() -> value.get() == null ? null : new Date(Math.round(value.get().<Unknown>cast().doubleValue()))));
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
            return emit(() -> value.get() == null ? null : deserialize(clazz.asJavaClass(), value.get().cast()));
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
        List<BeanProperties.CompileTimeDescriptor> propertyDescriptors = BeanProperties.getCompileTimePropertyDescriptors(clazz);

        Value<Object> result = emit(() -> {
            Object retrieve = SerDes.JAVA_REFERENCE.retrieve(value.get());
            if (retrieve != null) {
                return retrieve;
            }
            try {
                return clazz.asJavaClass().newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new IllegalStateException("Cannot create instance of "+clazz.asJavaClass().getName(), e);
            }
        });

        for (BeanProperties.CompileTimeDescriptor property : propertyDescriptors) {
            if (property.isSerializable() && property.isWritable()) {
                Value<Object> finalDeserializedValue = deserializeGenericValue(clazz, value, property);
                if (property.getSetter() != null) {
                    ReflectMethod setter = property.getSetter();
                    emit(() -> setter.invoke(result.get(), finalDeserializedValue.get()));
                } else {
                    ReflectField field = property.getField();
                    emit(() -> field.set(result.get(), finalDeserializedValue.get()));
                }
            }
        }

        return emit(() -> result.get());
    }

    private static Value<Object> unmirrorObject(ReflectClass<?> clazz, Value<Any> value) {
        return emit(() -> SerDes.JAVA_REFERENCE.retrieve(value.get()));
    }

    private static Value<Object> deserializeGenericValue(ReflectClass<?> clazz, Value<Any> value, BeanProperties.CompileTimeDescriptor property) {
        String jsonName = property.getJsonName();
        Value<Any> serializedValue = emit(() -> {
            Any any = value.get().<Record<Any>>cast().get(jsonName);
            return JS.isUndefinedOrNull(any)?null:any;
        });

        if (findClass(Any.class).isAssignableFrom(property.getType())) {
            return emit(() -> serializedValue.get());
        }

        Value<Object> deserializedValue;

        String propertyName = property.getName();
        String className = clazz.getName();

        if (property.getTypeParameters() != null && property.getTypeParameters().length > 0) {
            ReflectClass<?> typeParameter = property.getTypeParameters()[0];
            if (typeParameter != null) {
                if (findClass(List.class).isAssignableFrom(property.getType())) {
                    Value<Object> deserializedArray = deserializeArray(serializedValue, typeParameter);
                    deserializedValue = emit(() -> deserializedArray.get()==null?null:Arrays.asList((Object[])deserializedArray.get()));
                } else if (findClass(Optional.class).isAssignableFrom(property.getType())) {
                    deserializedValue = deserializeOptional(serializedValue, typeParameter);
                } else if (findClass(EnumSet.class).isAssignableFrom(property.getType())) {
                    deserializedValue = deserializeEnumSet(serializedValue, typeParameter);
                } else if (findClass(Set.class).isAssignableFrom(property.getType())) {
                    deserializedValue = deserializeSet(serializedValue, typeParameter);
                } else if (findClass(Map.class).isAssignableFrom(property.getType()) && property.getTypeParameters().length > 1 && property.getTypeParameters()[1] != null) {
                    ReflectClass<?> mapTypeParameter = property.getTypeParameters()[1];
                    deserializedValue = deserializeMap(serializedValue, mapTypeParameter);
                } else {
                    deserializedValue = emit(() -> {
                        throw new UnsupportedOperationException("Unsupported generic argument for "+className+"."+propertyName);
                    });
                }
            } else {
                deserializedValue = emit(() -> {
                    throw new UnsupportedOperationException("Unsupported generic argument for "+className+"."+propertyName);
                });
            }
        } else {
            deserializedValue = deserializeFieldValue(property.getType(), serializedValue);
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
                    result.set(i, deserialize(typeParameter.asJavaClass(), serialized));
                } else {
                    result.set(i, null);
                }
            }

            return result;
        });
    }

    private static Value<Object> deserializeOptional(Value<Any> value, ReflectClass<?> typeParameter) {
        return emit(() -> {
            if (value.get() == null) {
                return Optional.empty();
            }

            return Optional.ofNullable(deserialize(typeParameter.asJavaClass(), value.get().cast()));
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
                    result.add(deserialize(typeParameter.asJavaClass(), serialized.cast()));
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
                    result.put(key, deserialize(typeParameter.asJavaClass(), serialized.cast()));
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
                    result.add(deserialize(typeParameter.asJavaClass(), serialized));
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

    private static Value<Object> deserializeArray(Value<Any> value, ReflectClass<?> itemClass) {
        return emit(() -> {
            if (value.get() == null) {
                return null;
            }

            Array<Any> array = value.get().cast();
            Object[] result = itemClass.createArray(array.getLength());

            for (int i = 0; i < array.getLength(); i++) {
                Any serialized = array.get(i);
                if (serialized != null) {
                    result[i] = deserialize(itemClass.asJavaClass(), serialized);
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
