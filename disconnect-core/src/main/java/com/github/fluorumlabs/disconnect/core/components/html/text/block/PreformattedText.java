package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLPreElement;

@Tag("pre")
public class PreformattedText extends HtmlComponent<HTMLPreElement> {
    public PreformattedText() {
        super();
    }

    public PreformattedText(String textContent) {
        super(textContent);
    }

    public PreformattedText(Component<?>... components) {
        super(components);
    }
}
