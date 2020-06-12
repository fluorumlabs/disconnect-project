package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("var")
public class Variable extends HtmlComponent<HTMLElement> {
    public Variable() {
        super();
    }

    public Variable(String textContent) {
        super(textContent);
    }

    public Variable(Component<?>... components) {
        super(components);
    }
}
