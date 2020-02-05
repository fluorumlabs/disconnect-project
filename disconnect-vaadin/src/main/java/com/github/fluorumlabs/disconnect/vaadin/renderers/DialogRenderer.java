package com.github.fluorumlabs.disconnect.vaadin.renderers;

import com.github.fluorumlabs.disconnect.vaadin.elements.DialogElement;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface DialogRenderer extends Any {
    void render(Element root, DialogElement dialog);
}
