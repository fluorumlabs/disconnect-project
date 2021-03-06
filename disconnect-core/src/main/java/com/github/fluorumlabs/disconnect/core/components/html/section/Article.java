package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("article")
public class Article extends HtmlComponent<HTMLElement> {
    public Article() {
        super();
    }

    public Article(String textContent) {
        super(textContent);
    }

    public Article(Component<?>... components) {
        super(components);
    }
}
