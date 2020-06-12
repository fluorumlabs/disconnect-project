package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("sup")
public class Superscript extends HtmlComponent<HTMLElement> {
    public Superscript() {
        super();
    }

    public Superscript(String textContent) {
        super(textContent);
    }

    public Superscript(Component<?>... components) {
        super(components);
    }
}
