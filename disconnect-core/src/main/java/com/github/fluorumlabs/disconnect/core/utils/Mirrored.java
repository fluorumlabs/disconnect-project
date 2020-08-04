package com.github.fluorumlabs.disconnect.core.utils;

import java.io.Serializable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface Mirrored<T> extends Serialized<T> {
    static <T extends Serializable> Mirrored<T> from(T value) {
        return SerDes.mirror(value);
    }
}
