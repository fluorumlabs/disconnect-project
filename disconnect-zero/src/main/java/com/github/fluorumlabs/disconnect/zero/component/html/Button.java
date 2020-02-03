package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLButtonElement;

import javax.annotation.Untainted;


public class Button extends HTMLContainerComponent<HTMLButtonElement, Button> {
    public Button() {
        super("button");
    }

    public Button(String text) {
        this(text, false);
    }

    public Button(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public Button(Component<?>... components) {
        this();
        add(components);
    }

}
