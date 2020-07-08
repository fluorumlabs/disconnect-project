package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.internals.EnumeratedStringValueResolver;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public final class LowerCase {
    private LowerCase(){}


    @Nullable
    public static String of(@Nullable Enum<?> enumValue) {
        if (enumValue == null) {
            return null;
        } else {
            return EnumeratedStringValueResolver.getValue(enumValue);
        }
    }

    @Nullable
    public static <E extends Enum<E>> E parse(Class<E> enumClass, @Nullable String x) {
        if (x == null) {
            return null;
        }

        for (E enumConstant : enumClass.getEnumConstants()) {
            if ( x.equals(of(enumConstant)) ) {
                return enumConstant;
            }
        }
        throw new IllegalArgumentException("Unknown enum value " + x +" for "+enumClass.getSimpleName());
    }

}
