package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSObject;
import org.vaadin.disconnect.vue.client.events.EventListener;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public final class VueElement extends Element<VueElement> implements HasStyle<VueElement>, HasChildElements<VueElement, Element<?>> {
    public VueElement(Class<?> clazz) {
        super(clazz);
    }

    public VueElement set(String key, String value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, String[] value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, boolean value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, boolean[] value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, int value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, int[] value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, double value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, double[] value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, JSObject value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement set(String key, JSObject[] value) {
        data().properties().set(key, value);
        return this;
    }

    public VueElement setEventListener(String event, EventListener listener) {
        data().eventListeners().set(event, listener);
        return this;
    }
}
