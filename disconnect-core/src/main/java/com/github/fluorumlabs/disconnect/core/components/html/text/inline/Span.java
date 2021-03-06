package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLSpanElement;

@Tag("span")
public class Span extends HtmlComponent<HTMLSpanElement> {
    public Span() {
        super();
    }

    public Span(String textContent) {
        super(textContent);
    }

    public Span(Component<?>... components) {
        super(components);
    }
}
