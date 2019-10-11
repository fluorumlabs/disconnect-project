package org.vaadin.disconnect.vue.client.router;

import org.teavm.jso.JSByRef;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.core.JSObjects;
import org.vaadin.disconnect.vue.client.internals.ComponentDefinition;

/**
 * Created by Artem Godin on 10/1/2019.
 */
public interface RouteRecord extends JSObject {
    @JSProperty
    void setPath(String path);

    @JSProperty
    void setComponent(ComponentDefinition component);

    @JSProperty
    void setAlias(@JSByRef String[] aliases);

    @JSProperty
    void setChildren(@JSByRef RouteRecord[] children);

    static RouteRecord create(String path, ComponentDefinition component, String[] aliases, RouteRecord[] children) {
        RouteRecord config = JSObjects.create();
        config.setPath(path);
        config.setAlias(aliases);
        config.setComponent(component);
        config.setChildren(children);

        return config;
    }
}
