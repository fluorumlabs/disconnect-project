package com.github.fluorumlabs.disconnect.core.utils;

import js.lang.Any;

import java.io.Serializable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface Serialized<T> extends Any {
    static <T extends Serializable> Serialized<T> from(T value) {
        return SerDes.serialize(value);
    }
}
