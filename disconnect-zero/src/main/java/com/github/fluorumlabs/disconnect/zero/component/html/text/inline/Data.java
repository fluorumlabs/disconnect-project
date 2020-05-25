package com.github.fluorumlabs.disconnect.zero.component.html.text.inline;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
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
