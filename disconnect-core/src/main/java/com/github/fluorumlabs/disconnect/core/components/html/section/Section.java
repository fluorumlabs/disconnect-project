package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.*;


@Tag("section")
public class Section extends HtmlComponent<HTMLElement> {
    public Section() {
        super();
    }

    public Section(String textContent) {
        super(textContent);
    }

    public Section(Component<?>... components) {
        super(components);
    }
}

