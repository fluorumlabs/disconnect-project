package org.vaadin.disconnect.vue.client.utils;

import org.teavm.jso.core.JSString;
import org.vaadin.disconnect.vue.client.internals.EnumeratedStringValueResolver;

/**
 * Created by Artem Godin on 8/30/2019.
 */
public interface EnumeratedString {
    String name();

    default String prefix() { return ""; }

    default JSString value() {
        return EnumeratedStringValueResolver.getValue(this);
    }
}
