package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("dfn")
public class Definition extends HtmlComponent<HTMLElement> {
    public Definition() {
        super();
    }

    public Definition(String textContent) {
        super(textContent);
    }

    public Definition(Component<?>... components) {
        super(components);
    }
}
