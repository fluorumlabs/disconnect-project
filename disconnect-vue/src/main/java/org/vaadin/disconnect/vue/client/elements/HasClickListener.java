package org.vaadin.disconnect.vue.client.elements;

import org.vaadin.disconnect.vue.client.events.VoidEventListener;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public interface HasClickListener<T extends HasClickListener<T>> extends ElementBase {
    T onClick(VoidEventListener listener);
}
