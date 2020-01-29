package org.vaadin.disconnect.core.client.internals;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 8/30/2019.
 */
public interface JSObjectMap<K extends JSObject, V extends JSObject> extends JSObject {
    @JSIndexer
    V get(K key);

    @JSIndexer
    void set(K key, V value);
}
