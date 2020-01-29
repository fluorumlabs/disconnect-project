package com.github.fluorumlabs.disconnect.zero.utils;

import com.github.fluorumlabs.disconnect.zero.internals.EnumeratedStringValueResolver;


public interface EnumeratedKebabString {
    String name();

    default String prefix() { return ""; }

    default String value() {
        return EnumeratedStringValueResolver.getValue(this);
    }
}
