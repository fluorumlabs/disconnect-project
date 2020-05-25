package com.github.fluorumlabs.disconnect.zero.component.html.text.block;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
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
