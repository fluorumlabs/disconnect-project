package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("address")
public class Address extends HtmlComponent<HTMLElement> {
    public Address() {
        super();
    }

    public Address(String textContent) {
        super(textContent);
    }

    public Address(Component<?>... components) {
        super(components);
    }
}
