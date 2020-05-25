package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.EnumeratedStringValueResolver;


public interface EnumeratedKebabString {
    String name();

    default String prefix() { return ""; }

    default String value() {
        return EnumeratedStringValueResolver.getValue(this);
    }
}
