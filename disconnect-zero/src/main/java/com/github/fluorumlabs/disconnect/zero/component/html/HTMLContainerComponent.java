package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.HTMLElement;

import javax.annotation.Untainted;


public class HTMLContainerComponent<E extends HTMLElement, T extends HTMLContainerComponent<E, T>>
        extends HTMLComponent<E, T> implements
        HasComponents<E, T, Component<?>> {

    protected HTMLContainerComponent(String tagName) {
        super(tagName);
    }

    public T html(@Untainted String html) {
        getNode().setInnerHTML(html);
        return (T) this;
    }

    public String html() {
        return getNode().getInnerHTML();
    }

}
