package com.github.fluorumlabs.disconnect.core.utils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 6/24/2020.
 */
public final class Lazy<VALUE> {
    @Nullable
    private VALUE computed = null;
    private final Supplier<VALUE> supplier;

    private Lazy(Supplier<VALUE> supplier) {
        this.supplier = supplier;
    }

    public static <VALUE> Lazy<VALUE> from(Supplier<VALUE> supplier) {
        return new Lazy<>(supplier);
    }

    public VALUE get() {
        if ( computed == null ) {
            computed = supplier.get();
        }
        return computed;
    }
}
