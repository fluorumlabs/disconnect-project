package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.core.JSArray;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;
import org.vaadin.disconnect.core.client.internals.DisconnectUtils;

import java.util.stream.Stream;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public abstract class ElementChildren implements JSObject {
    private ElementChildren() {
    }

    public final void add(Element element, ElementBase owner) {
        JSArray<JSObject> children = this.cast();
        children.push(DisconnectUtils.asJsObject(element));
        element.setParentElement(owner);
    }

    public final void insertAt(int index, Element element, ElementBase owner) {
        JSArray<JSObject> children = this.cast();
        if ( index == 0 ) {
            children.unshift(DisconnectUtils.asJsObject(element));
        } else {
            children.splice(index, 0, DisconnectUtils.asJsObject(element));
        }
        element.setParentElement(owner);
    }

    @JSBody(params = "element", script = "return this.findIndex(function(e){return e.data.key === element.data.key;});")
    private native int findIndex(JSObject element);

    @JSBody(params = "_key", script = "return this.findIndex(function(e){return e.data.key === _key;});")
    private native int findIndex(String _key);

    public final void removeByKey(String _key) {
        int index = findIndex(_key);
        if ( index >= 0 ) {
            JSArray<JSObject> children = this.cast();
            Element removed = DisconnectUtils.asJavaObject(children.get(index));
            children.splice(index,1);
            removed.setParentElement(null);
        }
    }

    public final void remove(Element element) {
        int index = findIndex(DisconnectUtils.asJsObject(element));
        if ( index >= 0 ) {
            JSArray<JSObject> children = this.cast();
            Element removed = DisconnectUtils.asJavaObject(children.get(index));
            children.splice(index,1);
            removed.setParentElement(null);
        }
    }

    public final Element get(int index) {
        JSArray<JSObject> children = this.cast();
        return DisconnectUtils.asJavaObject(children.get(index));
    }


    public final Element[] getElements() {
        JSArray<JSObject> children = this.cast();

        int length = children.getLength();
        Element[] elements = new Element[length];

        for ( int i = 0; i < length; i++ ) {
            elements[i] = DisconnectUtils.asJavaObject(children.get(i));
        }

        return elements;
    }

    public final void removeAll() {
        Element[] removed = getElements();

        JSArray<JSObject> children = this.cast();
        children.splice(0, children.getLength());

        for (Element element : removed) {
            element.setParentElement(null);
        }
    }
}
