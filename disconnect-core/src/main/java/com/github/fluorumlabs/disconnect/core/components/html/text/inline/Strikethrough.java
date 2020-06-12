package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("s")
public class Strikethrough extends HtmlComponent<HTMLElement> {
    public Strikethrough() {
        super();
    }

    public Strikethrough(String textContent) {
        super(textContent);
    }

    public Strikethrough(Component<?>... components) {
        super(components);
    }
}
