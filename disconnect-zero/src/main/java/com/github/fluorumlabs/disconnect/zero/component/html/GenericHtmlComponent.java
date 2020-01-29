package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasClickEvent;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.web.dom.HTMLElement;


public class GenericHtmlComponent<E extends HTMLElement, T extends GenericHtmlComponent<E, T>> extends Component<E> implements
        HasComponents<E, T, Component<?>>,
        HasClickEvent<E> {

    protected GenericHtmlComponent(String tagName) {
        super(tagName);
    }
}
