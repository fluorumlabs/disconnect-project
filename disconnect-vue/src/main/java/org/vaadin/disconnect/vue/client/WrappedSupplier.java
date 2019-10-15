package org.vaadin.disconnect.vue.client;

import java.util.function.Supplier;

/**
 * Created by Artem Godin on 10/11/2019.
 */
public final class WrappedSupplier<V> implements Supplier<Integer> {
    private V value;
    private Supplier<V> supplier;

    private WrappedSupplier(Supplier<V> value) {
        this.supplier = value;
    }

    public static <V> WrappedSupplier<V> of(Supplier<V> supplier) {
        return new WrappedSupplier<>(supplier);
    }

    public final V getValue() {
        return value;
    }

    @Override
    public final Integer get() {
        value = supplier.get();
        return value == null ? 0 : value.hashCode();
    }
}
