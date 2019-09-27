package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.html.HTMLElement;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public interface ComponentDefinition extends JSObject {
    @JSIndexer
    void addConfiguration(String key, JSObject value);

    @JSBody(script = "return Object.assign({}, this);")
    ComponentDefinition clone();
}
