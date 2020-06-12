package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("sub")
public class Subscript extends HtmlComponent<HTMLElement> {
    public Subscript() {
        super();
    }

    public Subscript(String textContent) {
        super(textContent);
    }

    public Subscript(Component<?>... components) {
        super(components);
    }
}
