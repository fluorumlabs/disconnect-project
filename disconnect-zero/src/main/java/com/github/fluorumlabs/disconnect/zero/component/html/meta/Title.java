package com.github.fluorumlabs.disconnect.zero.component.html.meta;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.*;
import js.web.webcomponents.HTMLSlotElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSProperty;


@Tag("title")
public class Title extends HtmlComponent<HTMLTitleElement> {
    /**
     * Retrieves or sets the text of the object as a string.
     */
    public String getText() {
        return getElement().getText();
    }

    public void setText(String text) {
        getElement().setText(text);
    }
}

