package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("kbd")
public class KeyboardInput extends HtmlComponent<HTMLElement> {
    public KeyboardInput() {
        super();
    }

    public KeyboardInput(String textContent) {
        super(textContent);
    }

    public KeyboardInput(Component<?>... components) {
        super(components);
    }
}
