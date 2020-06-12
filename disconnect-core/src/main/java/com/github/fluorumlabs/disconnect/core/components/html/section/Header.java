package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("header")
public class Header extends HtmlComponent<HTMLElement> {
    public Header() {
        super();
    }

    public Header(String textContent) {
        super(textContent);
    }

    public Header(Component<?>... components) {
        super(components);
    }
}
