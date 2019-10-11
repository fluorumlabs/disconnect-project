package org.vaadin.disconnect.vue.client.router;

import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSArray;
import org.vaadin.disconnect.vue.client.router.RouteRecord;

/**
 * Created by Artem Godin on 10/1/2019.
 */
public interface Route extends JSObject {
    @JSProperty
    String getPath();

    @JSProperty
    Parameters getParams();

    @JSProperty
    Parameters getQuery();

    @JSProperty
    String getHash();

    @JSProperty
    String getFullPath();

    @JSProperty
    JSArray<RouteRecord> getMatched();

    interface Parameters extends JSObject {
        @JSIndexer
        JSObject get(String key);
    }
}
