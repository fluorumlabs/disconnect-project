package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("aside")
public class Aside extends HtmlComponent<HTMLElement> {
    public Aside() {
        super();
    }

    public Aside(String textContent) {
        super(textContent);
    }

    public Aside(Component<?>... components) {
        super(components);
    }
}
