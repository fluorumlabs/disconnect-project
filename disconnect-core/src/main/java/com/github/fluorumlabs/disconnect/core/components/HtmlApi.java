package com.github.fluorumlabs.disconnect.core.components;

import js.web.dom.Element;

/**
 * Created by Artem Godin on 5/12/2020.
 */
public interface HtmlApi<X extends Element> extends HasElement<X> {
    default String getInnerHTML() {
        return getElement().getInnerHTML();
    }

    default void setInnerHTML(String innerHTML) {
        getElement().setInnerHTML(innerHTML);
    }

    default String getOuterHTML() {
        return getElement().getOuterHTML();
    }

    default void setOuterHTML(String outerHTML) {
        getElement().setOuterHTML(outerHTML);
    }
}
