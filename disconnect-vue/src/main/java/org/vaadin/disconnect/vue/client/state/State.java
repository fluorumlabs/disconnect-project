package org.vaadin.disconnect.vue.client.state;

import org.teavm.platform.Platform;
import org.vaadin.disconnect.vue.client.Observer;
import org.vaadin.disconnect.vue.client.WrappedSupplier;

import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public abstract class State {
    public final <V> Observer<V> observe(Supplier<V> getter) {
        Observer<V> observer = new Observer<>();
        WrappedSupplier<V> wrappedSupplier = WrappedSupplier.of(getter);
        // Double evaluation, but no hardcore tricks
        Vuex.watch(wrappedSupplier::get, () -> observer.accept(wrappedSupplier.getValue()));
        return observer;
    }

}
