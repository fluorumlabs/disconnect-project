package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.*;


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

