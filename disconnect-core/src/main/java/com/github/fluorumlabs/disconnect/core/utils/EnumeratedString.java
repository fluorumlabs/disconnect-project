package com.github.fluorumlabs.disconnect.core.utils;


public interface EnumeratedString {
    String name();

    String value();

    boolean matches(String x);

    static <E extends Enum & EnumeratedString> E from(Class<E> enumClass, String x) {
        for (E enumConstant : enumClass.getEnumConstants()) {
            if ( enumConstant.matches(x) ) {
                return enumConstant;
            }
        }
        throw new IllegalArgumentException("Unknown enum value " + x +" for "+enumClass.getSimpleName());
    }
}
