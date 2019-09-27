package org.vaadin.disconnect.vue.client.state;

import org.teavm.platform.Platform;
import org.vaadin.disconnect.vue.client.Observer;

import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public abstract class State {
    public final <V> Observer<V> observe(Supplier<V> getter) {
        Observer<V> observer = new Observer<>();
        // Double evaluation, but no hardcore tricks
        Vuex.watch(() -> Platform.getPlatformObject(getter.get()), () -> observer.accept(getter.get()));
        return observer;
    }

}
