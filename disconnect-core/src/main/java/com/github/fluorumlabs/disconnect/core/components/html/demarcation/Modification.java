package com.github.fluorumlabs.disconnect.core.components.html.demarcation;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLModElement;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class Modification extends HtmlComponent<HTMLModElement> {
    protected Modification() {}

    /**
     * Sets or retrieves reference information about the object.
     */
    public String getCite() {
        return getElement().getCite();
    }

    public void setCite(String cite) {
        getElement().setCite(cite);
    }

    /**
     * Sets or retrieves the date and time of a modification to the object.
     */
    public String getDateTime() {
        return getElement().getDateTime();
    }

    public void setDateTime(String dateTime) {
        getElement().setDateTime(dateTime);
    }
}
