package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationCard;
import com.github.fluorumlabs.disconnect.vaadin.elements.NotificationElement;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface NotificationRenderer extends Any {
    void render(NotificationCard root, NotificationElement notification);
}
