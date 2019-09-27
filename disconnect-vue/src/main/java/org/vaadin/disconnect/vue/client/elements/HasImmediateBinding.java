package org.vaadin.disconnect.vue.client.elements;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasImmediateBinding<T extends HasImmediateBinding<T, V>, V> extends ElementBase {
    T bind(Supplier<V> getter, Consumer<V> setter, boolean immediate);
}
