package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("i")
public class Indication extends HtmlComponent<HTMLElement> {
    public Indication() {
        super();
    }

    public Indication(String textContent) {
        super(textContent);
    }

    public Indication(Component<?>... components) {
        super(components);
    }
}
