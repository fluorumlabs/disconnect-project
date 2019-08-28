package org.vaadin.disconnect.core.client;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.events.Event;
import org.teavm.jso.dom.events.EventListener;

/**
 * Created by Artem Godin on 8/21/2019.
 */
public interface ElementPrototype<T extends ElementPrototype> extends JSObject {
    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, String value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, String[] value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, boolean value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, int value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, float value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, double value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = value; return this;")
    T with(String property, JSObject value);

    @JSBody(params = {"property", "value"}, script = "this[1][property] = $rtd_wrapThread(value); return this;")
    T with(String property, EventListener<?> value);

    @JSBody(params = {"_className"},
            script = "this[1].className = (this[1].className?(this[1].className + ' '):'') + _className; return this;")
    T className(String _className);

    default T key(String key) {
        return with("key", key);
    }

    default T id(String id) {
        return with("id", id);
    }

    /*default void setClassName(String className) {
        setProperty("className", className);
    }

    default T withClassName(String className) {
        setClassName(className);
        return (T)this;
    }*/

    /*
    @JSBody(params = {"styleName", "value"}, script = "this[1].style[styleName] = value;")
    void setStyle(String styleName, String value);

    default T withStyle(String styleName, String value) {
        setStyle(styleName, value);
        return (T)this;
    }

    @JSBody(params = {"attribute", "value"}, script = "this[1].attrs[attribute] = value;")
    void setAttribute(String attribute, String value);

    @JSBody(params = {"attribute", "value"}, script = "this[1].attrs[attribute] = value;")
    void setAttribute(String attribute, boolean value);

    default T withAttribute(String attribute, String value) {
        setAttribute(attribute, value);
        return (T)this;
    }

    default T withAttribute(String attribute, boolean value) {
        setAttribute(attribute, value);
        return (T)this;
    }

    @JSBody(params = {"property", "value"}, script = "this[1].props[property] = value;")
    void setProperty(String property, String value);

    @JSBody(params = {"property", "value"}, script = "this[1].props[property] = value;")
    void setProperty(String property, JSObject value);

    default T withProperty(String property, String value) {
        setProperty(property, value);
        return (T)this;
    }

    default T withProperty(String property, JSObject value) {
        setProperty(property, value);
        return (T)this;
    }

    @JSBody(params = {"property", "value"}, script = "this[1].domProps[property] = value;")
    void setDomProperty(String property, String value);

    @JSBody(params = {"property", "value"}, script = "this[1].domProps[property] = value;")
    void setDomProperty(String property, JSObject value);

    default T withDomProperty(String property, String value) {
        setDomProperty(property, value);
        return (T)this;
    }

    default T withDomProperty(String property, JSObject value) {
        setDomProperty(property, value);
        return (T)this;
    }

    @JSBody(params = {"type", "listener"}, script = "this[1].on[type] = listener")
    <E extends Event> void addEventListenerInternal(String type, EventListener<E> listener);

    default <E extends Event> void addEventListener(String type, EventListener<E> listener) {
        addEventListenerInternal(type, evt -> new Thread(() -> listener.handleEvent((E)evt)).start());
    }

    default <E extends Event> T withEventListener(String type, EventListener<E> eventListener) {
        addEventListener(type, eventListener);
        return (T)this;
    }

    @JSBody(params = {"type", "listener"}, script = "this[1].nativeOn[type] = listener")
    <E extends Event> void addNativeEventListenerInternal(String type, EventListener<E> listener);

    default <E extends Event> void addNativeEventListener(String type, EventListener<E> listener) {
        addNativeEventListenerInternal(type, evt -> new Thread(() -> listener.handleEvent((E)evt)).start());
    }

    default <E extends Event> T withNativeEventListener(String type, EventListener<E> eventListener) {
        addNativeEventListener(type, eventListener);
        return (T)this;
    }

    @JSBody(params = {"directive"}, script = "this[1].directives.push(directive)")
    <D extends JSObject> void addDirective(D directive);

    default <D extends JSObject> T withDirective(D directive) {
        addDirective(directive);
        return (T)this;
    }

    //TODO scopedSlots

    @JSBody(params = {"slotName"}, script = "this[1].slot = slotName")
    void setSlot(String slotName);

    default T slotted(String slotName) {
        setSlot(slotName);
        return (T)this;
    }

    @JSBody(params = {"keyValue"}, script = "this[1].key = keyValue")
    void setKey(String keyValue);

    default T withKey(String keyValue) {
        setKey(keyValue);
        return (T)this;
    }

    @JSBody(params = {"refValue"}, script = "this[1].key = refValue")
    void setRef(String refValue);

    default T withRef(String refValue) {
        setKey(refValue);
        return (T)this;
    }
*/
    @JSBody(params = {"child"}, script = "child && this[2].push(child); return this;")
    T add(ElementPrototype child);

    default T text(String text) {
        return add(Elements.text(text));
    }

    default T add(ElementPrototype... children) {
        for (ElementPrototype child : children) {
            add(child);
        }
        return (T) this;
    }
}
