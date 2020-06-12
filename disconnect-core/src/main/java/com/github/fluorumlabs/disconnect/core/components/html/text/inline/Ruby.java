package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("ruby")
public class Ruby extends HtmlComponent<HTMLElement> {
    public Ruby() {
        super();
    }

    public Ruby(String textContent) {
        super(textContent);
    }

    public Ruby(Component<?>... components) {
        super(components);
    }

    @Tag("rb")
    public static class Base extends HtmlComponent<HTMLElement> {
        public Base() {
            super();
        }

        public Base(String textContent) {
            super(textContent);
        }

        public Base(Component<?>... components) {
            super(components);
        }
    }

    @Tag("rp")
    public static class FallbackParenthesis extends HtmlComponent<HTMLElement> {
        public FallbackParenthesis() {
            super();
        }

        public FallbackParenthesis(String textContent) {
            super(textContent);
        }

        public FallbackParenthesis(Component<?>... components) {
            super(components);
        }
    }

    @Tag("rt")
    public static class Text extends HtmlComponent<HTMLElement> {
        public Text() {
            super();
        }

        public Text(String textContent) {
            super(textContent);
        }

        public Text(Component<?>... components) {
            super(components);
        }
    }

}
