package com.github.fluorumlabs.disconnect.core.utils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 6/24/2020.
 */
public final class Memoized<VALUE> {
    @Nullable
    private VALUE computed = null;
    private final Supplier<VALUE> supplier;

    private Memoized(Supplier<VALUE> supplier) {
        this.supplier = supplier;
    }

    public static <VALUE> Memoized<VALUE> from(Supplier<VALUE> supplier) {
        return new Memoized<>(supplier);
    }

    public VALUE get() {
        if ( computed == null ) {
            computed = supplier.get();
        }
        return computed;
    }
}
