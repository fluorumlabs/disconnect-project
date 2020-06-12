package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("u")
public class UnarticulatedAnnotation extends HtmlComponent<HTMLElement> {
    public UnarticulatedAnnotation() {
        super();
    }

    public UnarticulatedAnnotation(String textContent) {
        super(textContent);
    }

    public UnarticulatedAnnotation(Component<?>... components) {
        super(components);
    }
}
