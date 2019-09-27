package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSObject;
import org.vaadin.disconnect.vue.client.events.NativeEventListener;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public final class HtmlElement extends Element<HtmlElement> implements HasStyle<HtmlElement>, HasChildElements<HtmlElement, Element<?>> {
    public HtmlElement(String tag) {
        super(tag);
    }

    public HtmlElement set(String key, String value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, String[] value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, boolean value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, boolean[] value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, int value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, int[] value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, double value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, double[] value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, JSObject value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement set(String key, JSObject[] value) {
        data().domProperties().set(key, value);
        return this;
    }

    public HtmlElement setEventListener(String event, NativeEventListener<?> listener) {
        data().nativeEventListeners().set(event, listener);
        return this;
    }
}
