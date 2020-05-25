package com.github.fluorumlabs.disconnect.zero.component.html.text.block;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLElement;

@Tag("figure")
public class Figure extends HtmlComponent<HTMLElement> {
    @Tag("figcaption")
    public static class Caption extends HtmlComponent<HTMLElement> {
    }

}
