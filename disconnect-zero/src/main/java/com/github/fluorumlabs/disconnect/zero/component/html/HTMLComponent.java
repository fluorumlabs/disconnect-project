package com.github.fluorumlabs.disconnect.zero.component.html;

import js.web.dom.HTMLElement;


public class HTMLComponent<E extends HTMLElement, T extends HTMLComponent<E, T>>
        extends AbstractHTMLComponent<E, T> {

    protected HTMLComponent(String tagName) {
        super(tagName);
    }
}
