package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

public interface Bidirectional {
@Tag("bdi")
class Isolate extends HtmlComponent<HTMLElement> {
    public Isolate() {
        super();
    }

    public Isolate(String textContent) {
        super(textContent);
    }

    public Isolate(Component<?>... components) {
        super(components);
    }
}

@Tag("bdo")
class TextOverride extends HtmlComponent<HTMLElement> {
    public TextOverride() {
        super();
    }

    public TextOverride(String textContent) {
        super(textContent);
    }

    public TextOverride(Component<?>... components) {
        super(components);
    }
}
}
