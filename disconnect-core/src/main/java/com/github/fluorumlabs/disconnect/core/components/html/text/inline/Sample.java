package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("samp")
public class Sample extends HtmlComponent<HTMLElement> {
    public Sample() {
        super();
    }

    public Sample(String textContent) {
        super(textContent);
    }

    public Sample(Component<?>... components) {
        super(components);
    }
}
