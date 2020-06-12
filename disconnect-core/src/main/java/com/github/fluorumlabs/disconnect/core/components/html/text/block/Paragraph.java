package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLParagraphElement;

@Tag("p")
public class Paragraph extends HtmlComponent<HTMLParagraphElement> {
    public Paragraph() {
        super();
    }

    public Paragraph(String textContent) {
        super(textContent);
    }

    public Paragraph(Component<?>... components) {
        super(components);
    }
}
