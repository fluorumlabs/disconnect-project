package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("code")
public class Code extends HtmlComponent<HTMLElement> {
    public Code() {
        super();
    }

    public Code(String textContent) {
        super(textContent);
    }

    public Code(Component<?>... components) {
        super(components);
    }
}
