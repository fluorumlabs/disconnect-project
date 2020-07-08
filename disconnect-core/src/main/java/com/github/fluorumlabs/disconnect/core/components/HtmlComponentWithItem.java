package com.github.fluorumlabs.disconnect.core.components;

import js.web.dom.HTMLElement;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Artem Godin on 7/4/2020.
 */
public class HtmlComponentWithItem<ITEM, X extends HTMLElement> extends HtmlComponent<X> {
    @Setter
    @Getter
    private Class<ITEM> itemClass = null;

    protected HtmlComponentWithItem() {
    }

    protected HtmlComponentWithItem(String textContent) {
        super(textContent);
    }

    protected HtmlComponentWithItem(Component<?>... components) {
        super(components);
    }

    protected HtmlComponentWithItem(Class<ITEM> itemClass) {
        this.itemClass = itemClass;
    }

    protected HtmlComponentWithItem(Class<ITEM> itemClass, String textContent) {
        this(textContent);
        this.itemClass = itemClass;
    }

    protected HtmlComponentWithItem(Class<ITEM> itemClass, Component<?>... components) {
        this(components);
        this.itemClass = itemClass;
    }
}
