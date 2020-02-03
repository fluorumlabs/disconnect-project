package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.HTMLElement;


public class HTMLComponent<E extends HTMLElement, T extends HTMLComponent<E, T>>
        extends AbstractHTMLComponent<E, T> implements
        HasComponents<E, T, AbstractComponent<?>> {

    protected HTMLComponent(String tagName) {
        super(tagName);
    }
}
