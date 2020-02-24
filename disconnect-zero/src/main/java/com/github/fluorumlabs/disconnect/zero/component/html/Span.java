package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLSpanElement;

import javax.annotation.Untainted;


public class Span extends HTMLContainerComponent<HTMLSpanElement, Span> {
    public Span() {
        super("span");
    }

    public Span(String text) {
        this(text, false);
    }

    public Span(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public Span(Component<?>... components) {
        this();
        add(components);
    }

}
