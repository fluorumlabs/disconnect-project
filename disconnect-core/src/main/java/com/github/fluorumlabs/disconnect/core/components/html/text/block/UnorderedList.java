package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLUListElement;


@Tag("ul")
public class UnorderedList extends HtmlComponent<HTMLUListElement> {
    public UnorderedList() {
        super();
    }

    public UnorderedList(Component<?>... components) {
        super(components);
    }
}

