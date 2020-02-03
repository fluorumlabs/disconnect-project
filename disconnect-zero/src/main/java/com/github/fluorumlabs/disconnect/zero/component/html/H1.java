package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLHeadingElement;

import javax.annotation.Untainted;


public class H1 extends HTMLContainerComponent<HTMLHeadingElement, H1> {
    public H1() {
        super("h1");
    }

    public H1(String text) {
        this(text, false);
    }

    public H1(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public H1(Component<?>... components) {
        this();
        add(components);
    }

}
