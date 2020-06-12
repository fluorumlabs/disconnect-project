package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("figure")
public class Figure extends HtmlComponent<HTMLElement> {
    public Figure() {
        super();
    }

    public Figure(Component<?>... components) {
        super(components);
    }

    @Tag("figcaption")
    public static class Caption extends HtmlComponent<HTMLElement> {
        public Caption() {
            super();
        }

        public Caption(String textContent) {
            super(textContent);
        }

        public Caption(Component<?>... components) {
            super(components);
        }
    }

}
