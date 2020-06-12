package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("mark")
public class Mark extends HtmlComponent<HTMLElement> {
    public Mark() {
        super();
    }

    public Mark(String textContent) {
        super(textContent);
    }

    public Mark(Component<?>... components) {
        super(components);
    }
}
