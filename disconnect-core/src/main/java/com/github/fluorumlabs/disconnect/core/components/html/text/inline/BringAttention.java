package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("b")
public class BringAttention extends HtmlComponent<HTMLElement> {
    public BringAttention() {
        super();
    }

    public BringAttention(String textContent) {
        super(textContent);
    }

    public BringAttention(Component<?>... components) {
        super(components);
    }
}
