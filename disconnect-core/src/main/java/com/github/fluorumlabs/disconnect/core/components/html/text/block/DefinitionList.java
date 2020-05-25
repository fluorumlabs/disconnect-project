package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLDListElement;
import js.web.dom.HTMLElement;

@Tag("dl")
public class DefinitionList extends HtmlComponent<HTMLDListElement> {
    @Tag("dt")
    public static class Term extends HtmlComponent<HTMLElement> {
    }

    @Tag("dd")
    public static class Definition extends HtmlComponent<HTMLElement> {
    }
}
