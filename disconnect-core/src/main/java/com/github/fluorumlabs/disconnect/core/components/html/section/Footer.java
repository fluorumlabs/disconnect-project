package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("footer")
public class Footer extends HtmlComponent<HTMLElement> {
    public Footer() {
        super();
    }

    public Footer(String textContent) {
        super(textContent);
    }

    public Footer(Component<?>... components) {
        super(components);
    }
}
