package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLDivElement;

import javax.annotation.Untainted;


public class Div extends HTMLContainerComponent<HTMLDivElement, Div> {
    public Div() {
        super("div");
    }

    public Div(String text) {
        this(text, false);
    }

    public Div(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public Div(Component<?>... components) {
        this();
        add(components);
    }

}
