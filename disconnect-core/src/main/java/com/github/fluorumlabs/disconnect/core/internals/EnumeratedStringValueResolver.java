package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.utils.EnumeratedKebabString;
import js.lang.Any;
import js.util.StringRecord;


public class EnumeratedStringValueResolver {
    private final static StringRecord ENUM_VALUES = Any.empty();

    public static String getValue(EnumeratedKebabString enumeratedKebabString) {
        String value = ENUM_VALUES.get(enumeratedKebabString.name());
        if (value != null) {
            return value;
        }

        value = enumeratedKebabString.name().replace("_", "-").toLowerCase();
        ENUM_VALUES.set(enumeratedKebabString.name(), value);

        return value;
    }
}
