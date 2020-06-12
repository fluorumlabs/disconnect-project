package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("abbr")
public class Abbreviation extends HtmlComponent<HTMLElement> {
    public Abbreviation() {
        super();
    }

    public Abbreviation(String textContent) {
        super(textContent);
    }

    public Abbreviation(Component<?>... components) {
        super(components);
    }
}
