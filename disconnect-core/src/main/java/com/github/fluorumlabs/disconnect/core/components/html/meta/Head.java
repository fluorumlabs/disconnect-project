package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLHeadElement;

@Tag("head")
public class Head extends HtmlComponent<HTMLHeadElement> {
    public Head() {
        super();
    }

    public Head(Component<?>... components) {
        super(components);
    }
}
