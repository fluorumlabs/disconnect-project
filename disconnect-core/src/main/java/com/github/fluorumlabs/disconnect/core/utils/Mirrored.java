package com.github.fluorumlabs.disconnect.core.utils;

import js.lang.Any;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface Mirrored<T> extends Serialized<T> {
    static <T> Mirrored<T> from(T value) {
        return SerDes.mirror(value);
    }
}
