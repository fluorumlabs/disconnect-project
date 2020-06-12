package com.github.fluorumlabs.disconnect.core.components.html.text.block;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLLIElement;

@Tag("li")
public class ListItem extends HtmlComponent<HTMLLIElement> {
    public ListItem() {
        super();
    }

    public ListItem(String textContent) {
        super(textContent);
    }

    public ListItem(Component<?>... components) {
        super(components);
    }

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
