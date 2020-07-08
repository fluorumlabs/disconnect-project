package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.utils.EnumeratedKebabString;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class EnumeratedStringValueResolver {
    private final static Map<String,String> ENUM_VALUES = new HashMap<>();

    public static String getValue(EnumeratedKebabString enumeratedKebabString) {
        String value = ENUM_VALUES.get(enumeratedKebabString.name());
        if (value != null) {
            return value;
        }

        value = enumeratedKebabString.name().replace("_", "-").toLowerCase();
        ENUM_VALUES.put(enumeratedKebabString.name(), value);

        return value;
    }

    public static String getValue(Object object) {
        String key = Objects.toString(object);
        String value = ENUM_VALUES.get(key);
        if (value != null) {
            return value;
        }

        value = StringUtils.replaceChars(key,'_', '-').toLowerCase();
        ENUM_VALUES.put(key, value);

        return value;
    }
}
