package com.github.fluorumlabs.disconnect.polymer.types;

import js.web.dom.Event;
import js.web.dom.EventTarget;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
@Deprecated
public interface LegacyEventInit extends Event.EventInit {
    @JSProperty
    EventTarget getNode();

    @JSProperty
    void setNode(EventTarget node);
}
