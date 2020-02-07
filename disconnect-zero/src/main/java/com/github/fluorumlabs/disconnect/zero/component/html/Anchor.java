package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLAnchorElement;

import javax.annotation.Untainted;


public class Anchor extends HTMLContainerComponent<HTMLAnchorElement, Anchor> {
    public Anchor() {
        super("a");
    }

    public Anchor(String text) {
        this(text, false);
    }

    public Anchor(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public Anchor(Component<?>... components) {
        this();
        add(components);
    }

}
