package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("figure")
public class Figure extends HtmlComponent<HTMLElement> {
    @Tag("figcaption")
    public static class Caption extends HtmlComponent<HTMLElement> {
    }

}
