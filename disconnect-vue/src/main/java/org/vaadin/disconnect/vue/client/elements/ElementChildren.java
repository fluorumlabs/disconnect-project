package org.vaadin.disconnect.vue.client.elements;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.Platform;
import org.teavm.platform.PlatformObject;

/**
 * Created by Artem Godin on 9/26/2019.
 */
public abstract class ElementChildren implements JSObject {
    private ElementChildren() {
    }

    @JSBody(script = "return []")
    public static native ElementChildren create();

    @JSBody(params = "element", script = "this.push(element);")
    private native void add(PlatformObject element);

    @JSBody(params = {"element"}, script = "this.unshift(element);")
    private native void insertAt0(PlatformObject element);

    @JSBody(params = {"index","element"}, script = "this.splice(index, 0, element);")
    private native void insertAt(int index, PlatformObject element);

    public void add(Element element) {
        add(Platform.getPlatformObject(element));
    }

    public void insertAt(int index, Element element) {
        if ( index == 0 ) {
            insertAt0(Platform.getPlatformObject(element));
        } else {
            insertAt(index, Platform.getPlatformObject(element));
        }
    }

    @JSBody(params = "element", script = "var index = this.findIndex(function(e){return e.data.key === element.data.key;}); if (index > -1) { this.splice(index, 1); }")
    private native void remove(PlatformObject element);

    @JSBody(params = "_key", script = "var index = this.findIndex(function(e){return e.data.key === _key;}); if (index > -1) { this.splice(index, 1); }")
    public native void removeByKey(String _key);

    public void remove(Element element) {
        remove(Platform.getPlatformObject(element));
    }

    @JSBody(script = "this.splice(0, this.length);")
    public final native void removeAll();
}
