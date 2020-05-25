package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLLIElement;

@Tag("li")
public class ListItem extends HtmlComponent<HTMLLIElement> {
    /**
     * Sets or retrieves the value of a list item.
     */
    public int getValue() {
        return getElement().getValue();
    }

    public void setValue(int value) {
        getElement().setValue(value);
    }
}
