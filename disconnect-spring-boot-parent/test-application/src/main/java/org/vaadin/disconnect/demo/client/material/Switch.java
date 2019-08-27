package org.vaadin.disconnect.demo.client.material;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.dom.events.Event;
import org.teavm.jso.dom.events.EventListener;
import org.vaadin.disconnect.core.client.ElementPrototype;
import org.vaadin.disconnect.core.client.Elements;
import org.vaadin.disconnect.demo.client.material.internals.CoreImports;

/**
 * Created by Artem Godin on 8/26/2019.
 */
public interface Switch extends ElementPrototype<Switch> {
    static Switch create() {
        return Elements.create(CoreImports.imports().get("Switch"));
    }

    default Switch color(Color color) {
        return with("color", color.getValue());
    }

    default Switch checked(boolean checked) {
        return with("checked", checked);
    }

    default Switch onChange(EventListener<?> eventListener) {
        return with("onChange", eventListener);
    }
}
