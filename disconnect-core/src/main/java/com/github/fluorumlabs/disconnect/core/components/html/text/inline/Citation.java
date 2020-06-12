package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("cite")
public class Citation extends HtmlComponent<HTMLElement> {
    public Citation() {
        super();
    }

    public Citation(String textContent) {
        super(textContent);
    }

    public Citation(Component<?>... components) {
        super(components);
    }
}
