package com.github.fluorumlabs.disconnect.zero.component.html.text.inline;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("ruby")
public class Ruby extends HtmlComponent<HTMLElement> {
    @Tag("rb")
    public static class Base extends HtmlComponent<HTMLElement> {
    }

    @Tag("rp")
    public static class FallbackParenthesis extends HtmlComponent<HTMLElement> {
    }

    @Tag("rt")
    public static class Text extends HtmlComponent<HTMLElement> {
    }

}
