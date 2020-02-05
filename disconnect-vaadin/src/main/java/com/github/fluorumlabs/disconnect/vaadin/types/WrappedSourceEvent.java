package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface WrappedSourceEvent<E extends Event> extends CustomEvent<WrappedSourceEvent.Details<E>> {
    interface Details<E extends Event> extends Any {
        @JSProperty
        E getSourceEvent();
    }
}
