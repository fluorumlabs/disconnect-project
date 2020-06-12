package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("em")
public class Emphasis extends HtmlComponent<HTMLElement> {
    public Emphasis() {
        super();
    }

    public Emphasis(String textContent) {
        super(textContent);
    }

    public Emphasis(Component<?>... components) {
        super(components);
    }
}
