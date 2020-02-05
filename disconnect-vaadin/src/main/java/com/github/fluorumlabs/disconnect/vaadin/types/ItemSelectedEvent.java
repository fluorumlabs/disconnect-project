package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface ItemSelectedEvent<ITEM extends Any> extends CustomEvent<ItemSelectedEvent.Details<ITEM>> {
    interface Details<ITEM extends Any> extends Any {
        @JSProperty
        ITEM getValue();
    }
}
