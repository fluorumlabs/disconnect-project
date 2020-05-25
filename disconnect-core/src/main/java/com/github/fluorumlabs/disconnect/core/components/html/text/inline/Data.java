package com.github.fluorumlabs.disconnect.core.components.html.text.inline;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLDataElement;

@Tag("data")
public class Data extends HtmlComponent<HTMLDataElement> {
    public String getValue() {
        return getElement().getValue();
    }

    public void setValue(String value) {
        getElement().setValue(value);
    }
}
