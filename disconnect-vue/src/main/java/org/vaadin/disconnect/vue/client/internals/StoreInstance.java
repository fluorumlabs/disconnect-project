package org.vaadin.disconnect.vue.client.internals;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.platform.PlatformObject;

/**
 * Created by Artem Godin on 9/20/2019.
 */
public interface StoreInstance extends JSObject {
    @JSBody(params = "name", script = "return this.state[name]")
    PlatformObject getState(String name);

    @JSBody(params ="name", script = "return name in this.state")
    boolean hasState(String name);

    void registerModule(String name, StoreDefinition definition);

    void unregisterModule(String name);
}
