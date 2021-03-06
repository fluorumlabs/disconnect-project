package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("strong")
public class Strong extends HtmlComponent<HTMLElement> {
    public Strong() {
        super();
    }

    public Strong(String textContent) {
        super(textContent);
    }

    public Strong(Component<?>... components) {
        super(components);
    }
}
