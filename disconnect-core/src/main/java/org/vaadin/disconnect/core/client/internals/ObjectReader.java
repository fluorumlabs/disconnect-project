package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/23/2019.
 */
public interface ObjectReader extends JSObject {
    @JSIndexer
    JSObject get(String name);
}
