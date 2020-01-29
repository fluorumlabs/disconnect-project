package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.HasClickEvent;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.HTMLElement;


public class HTMLComponent<E extends HTMLElement, T extends HTMLComponent<E, T>> extends AbstractComponent<E> implements
        HasComponents<E, T, AbstractComponent<?>>,
        HasClickEvent<E> {

    protected HTMLComponent(String tagName) {
        super(tagName);
    }
}
