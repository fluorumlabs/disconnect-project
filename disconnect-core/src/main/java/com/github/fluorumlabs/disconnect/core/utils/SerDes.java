package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.util.JS;
import js.util.Record;
import js.util.collections.Array;
import org.teavm.platform.Platform;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Artem Godin on 6/12/2020.
 */
@SuppressWarnings("unchecked")
public final class SerDes {
    static final SidebandReference<Any> JS_REFERENCE = new SidebandReference<>("JS Mirror");
    static final SidebandReference<Object> JAVA_REFERENCE = new SidebandReference<>("Java Mirror");

    static boolean MIRROR_MODE = false;

    private SerDes() {
    }

    @Nullable
    public static <T> Serialized<T> serialize(@Nullable T object) {
        if (object == null) {
            return null;
        }
        Class<?> clazz = object.getClass();
        if (JS.isUndefinedOrNull(Platform.getPlatformObject(clazz).cast())) {
            return DisconnectUtils.deepCopy((Any) object).cast();
        } else {
            MIRROR_MODE = false;
            return Serializer.serialize(clazz, object).cast();
        }
    }

    @Nullable
    public static <T> Mirrored<T> mirror(@Nullable T object) {
        if (object == null) {
            return null;
        }
        Class<?> clazz = object.getClass();
        if (JS.isUndefinedOrNull(Platform.getPlatformObject(clazz).cast())) {
            return DisconnectUtils.deepCopy((Any) object).cast();
        } else {
            MIRROR_MODE = true;
            return Serializer.serialize(clazz, object).cast();
        }
    }

    @Nullable
    public static <T> T deserialize(@Nullable Serialized<T> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (T) Deserializer.deserialize(clazz, object);
        }
    }

    @Nullable
    public static <T> List<T> deserializeList(@Nullable Array<Serialized<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (List<T>) Deserializer.deserializeList(clazz, object);
        }
    }

    @Nullable
    public static <T> List<T> deserializeList(@Nullable Serialized<List<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (List<T>) Deserializer.deserializeList(clazz, object);
        }
    }

    @Nullable
    public static <T extends Enum<T>> EnumSet<T> deserializeEnumSet(@Nullable Array<Serialized<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (EnumSet<T>) Deserializer.deserializeEnumSet(clazz, object);
        }
    }

    @Nullable
    public static <T extends Enum<T>> EnumSet<T> deserializeEnumSet(@Nullable Serialized<EnumSet<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (EnumSet<T>) Deserializer.deserializeEnumSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Set<T> deserializeSet(@Nullable Array<Serialized<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (Set<T>) Deserializer.deserializeSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Set<T> deserializeSet(@Nullable Serialized<Set<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (Set<T>) Deserializer.deserializeSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Map<String, T> deserializeMap(@Nullable Record<Serialized<T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (Map<String, T>) Deserializer.deserializeMap(clazz, object);
        }
    }

    @Nullable
    public static <T> Map<String, T> deserializeMap(@Nullable Serialized<Map<String,T>> object, Class<T> clazz) {
        MIRROR_MODE = false;
        if (object == null) {
            return null;
        } else {
            return (Map<String, T>) Deserializer.deserializeMap(clazz, object);
        }
    }

    @Nullable
    public static <T> T unmirror(@Nullable Mirrored<T> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (T) Deserializer.deserialize(clazz, object);
        }
    }

    @Nullable
    public static <T> List<T> unmirrorList(@Nullable Array<Mirrored<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (List<T>) Deserializer.deserializeList(clazz, object);
        }
    }

    @Nullable
    public static <T> List<T> unmirrorList(@Nullable Mirrored<List<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (List<T>) Deserializer.deserializeList(clazz, object);
        }
    }

    @Nullable
    public static <T extends Enum<T>> EnumSet<T> unmirrorEnumSet(@Nullable Array<Mirrored<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (EnumSet<T>) Deserializer.deserializeEnumSet(clazz, object);
        }
    }

    @Nullable
    public static <T extends Enum<T>> EnumSet<T> unmirrorEnumSet(@Nullable Mirrored<EnumSet<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (EnumSet<T>) Deserializer.deserializeEnumSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Set<T> unmirrorSet(@Nullable Array<Mirrored<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (Set<T>) Deserializer.deserializeSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Set<T> unmirrorSet(@Nullable Mirrored<Set<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (Set<T>) Deserializer.deserializeSet(clazz, object);
        }
    }

    @Nullable
    public static <T> Map<String, T> unmirrorMap(@Nullable Record<Mirrored<T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (Map<String, T>) Deserializer.deserializeMap(clazz, object);
        }
    }

    @Nullable
    public static <T> Map<String, T> unmirrorMap(@Nullable Mirrored<Map<String,T>> object, Class<T> clazz) {
        MIRROR_MODE = true;
        if (object == null) {
            return null;
        } else {
            return (Map<String, T>) Deserializer.deserializeMap(clazz, object);
        }
    }
}
