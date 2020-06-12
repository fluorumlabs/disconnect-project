package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLDivElement;

@Tag("div")
public class Div extends HtmlComponent<HTMLDivElement> {
    public Div() {
        super();
    }

    public Div(String textContent) {
        super(textContent);
    }

    public Div(Component<?>... components) {
        super(components);
    }
}
