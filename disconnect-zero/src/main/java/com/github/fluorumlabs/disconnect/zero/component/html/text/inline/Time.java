package com.github.fluorumlabs.disconnect.zero.component.html.text.inline;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import js.web.dom.HTMLTimeElement;

@Tag("time")
public class Time extends HtmlComponent<HTMLTimeElement> {
    public String getDateTime() {
        return getElement().getDateTime();
    }

    public void setDateTime(String dateTime) {
        getElement().setDateTime(dateTime);
    }
}
