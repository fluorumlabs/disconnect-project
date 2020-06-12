package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("main")
public class Main extends HtmlComponent<HTMLElement> {
    public Main() {
        super();
    }

    public Main(String textContent) {
        super(textContent);
    }

    public Main(Component<?>... components) {
        super(components);
    }
}
