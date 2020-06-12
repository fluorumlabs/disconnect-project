package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.util.JS;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Artem Godin on 6/12/2020.
 */
@SuppressWarnings("unchecked")
public final class SerDes {
    private SerDes() {
    }

    @Nullable
    public static Any serialize(@Nullable Object object) {
        if (object == null) {
            return null;
        }
        Class<?> clazz = object.getClass();
        if (JS.isUndefinedOrNull(Platform.getPlatformObject(clazz).cast())) {
            return DisconnectUtils.deepCopy((Any) object);
        } else {
            return Serializer.serialize(clazz, object);
        }
    }

    @Nullable
    public static <T> T deserialize(@Nullable Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (T) Deserializer.deserialize((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only Serializable objects can be deserialized");
        }
    }

    @Nullable
    public static <T> List<T> deserializeList(@Nullable Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (List<T>) Deserializer.deserializeList((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only lists of Serializable objects can be deserialized");
        }
    }

    @Nullable
    public static <T extends Enum<T>> EnumSet<T> deserializeEnumSet(@Nullable Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (EnumSet<T>) Deserializer.deserializeEnumSet(clazz, object);
        } else {
            throw new IllegalArgumentException("Only sets of Serializable objects can be deserialized");
        }
    }

    @Nullable
    public static <T> Set<T> deserializeSet(@Nullable Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (Set<T>) Deserializer.deserializeSet((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only sets of Serializable objects can be deserialized");
        }
    }

    @Nullable
    public static <T> Map<String, T> deserializeMap(@Nullable Any object, Class<T> clazz) {
        if (object == null) {
            return null;
        } else if (Serializable.class.isAssignableFrom(clazz)) {
            return (Map<String, T>) Deserializer.deserializeMap((Class<? extends Serializable>) clazz, object);
        } else {
            throw new IllegalArgumentException("Only maps of Serializable objects can be deserialized");
        }
    }
}
