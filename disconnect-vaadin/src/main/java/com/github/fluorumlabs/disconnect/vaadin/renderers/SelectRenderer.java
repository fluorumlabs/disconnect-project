package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.SelectElement;
import com.github.fluorumlabs.disconnect.vaadin.elements.SelectOverlayElement;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface SelectRenderer extends Any {
    void render(SelectOverlayElement root, SelectElement select);
}
