package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLParagraphElement;

import javax.annotation.Untainted;


public class Paragraph extends HTMLContainerComponent<HTMLParagraphElement, Paragraph> {
    public Paragraph() {
        super("p");
    }

    public Paragraph(String text) {
        this(text, false);
    }

    public Paragraph(@Untainted String text, boolean html) {
        this();
        if (html) {
            html(text);
        } else {
            text(text);
        }
    }

    public Paragraph(Component<?>... components) {
        this();
        add(components);
    }
}
