package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("small")
public class Small extends HtmlComponent<HTMLElement> {
    public Small() {
        super();
    }

    public Small(String textContent) {
        super(textContent);
    }

    public Small(Component<?>... components) {
        super(components);
    }
}
