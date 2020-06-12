package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("nav")
public class Navigation extends HtmlComponent<HTMLElement> {
    public Navigation() {
        super();
    }

    public Navigation(String textContent) {
        super(textContent);
    }

    public Navigation(Component<?>... components) {
        super(components);
    }
}
