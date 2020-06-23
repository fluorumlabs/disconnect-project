package com.github.fluorumlabs.disconnect.core.utils;

import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.util.collections.Array;
import org.teavm.metaprogramming.CompileTime;
import org.teavm.metaprogramming.Meta;
import org.teavm.metaprogramming.ReflectClass;
import org.teavm.metaprogramming.Value;
import org.teavm.metaprogramming.reflect.ReflectField;
import org.teavm.metaprogramming.reflect.ReflectMethod;

import javax.annotation.Nullable;
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
        List<BeanProperties.CompileTimeDescriptor> propertyDescriptors = BeanProperties.getCompileTimePropertyDescriptors(clazz);

        Value<Record<Any>> result = emit(() -> Any.empty());

        for (BeanProperties.CompileTimeDescriptor property : propertyDescriptors) {
            if (property.isSerializable() && property.isReadable()) {
                String jsonName = property.getJsonName();
                if (property.getGetter() != null) {
                    ReflectMethod getter = property.getGetter();
                    Value<Object> propertyValue = emit(() -> getter.invoke(value.get()));
                    Value<Any> serializedValue = serializeFieldValue(property.getType(), propertyValue);
                    emit(() -> {
                        result.get().set(jsonName, serializedValue.get());
                    });
                } else {
                    ReflectField field = property.getField();
                    Value<Object> propertyValue = emit(() -> field.get(value.get()));
                    Value<Any> serializedValue = serializeFieldValue(property.getType(), propertyValue);
                    emit(() -> {
                        result.get().set(jsonName, serializedValue.get());
                    });
                }
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
