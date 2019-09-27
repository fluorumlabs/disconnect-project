package org.vaadin.disconnect.vue.client.events;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.events.Event;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@JSFunctor
public interface NativeEventListener<E extends Event> extends JSObject {
    void handleEvent(E event);
}
