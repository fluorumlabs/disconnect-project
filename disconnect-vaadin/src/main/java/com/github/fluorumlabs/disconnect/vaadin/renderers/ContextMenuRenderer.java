package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.ContextMenuElement;
import js.lang.Any;
import js.lang.Unknown;
import js.web.dom.Element;
import js.web.dom.EventTarget;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface ContextMenuRenderer extends Any {
    void render(Element root, ContextMenuElement contextMenu, Context context);

    interface Context extends Any {
        @JSProperty
        EventTarget getTarget();

        @JSProperty
        void setTarget(EventTarget target);

        @JSProperty
        Unknown getDetail();

        @JSProperty
        void setDetail(Unknown detail);
    }
}
