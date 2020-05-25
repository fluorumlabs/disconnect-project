package com.github.fluorumlabs.disconnect.core.components.html.table;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLTableColElement;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HtmlTableColComponent extends HtmlComponent<HTMLTableColElement> {
    protected HtmlTableColComponent(){}

    /**
     * Sets or retrieves the number of columns in the group.
     */
    @JSProperty
    public int getSpan() {
        return getElement().getSpan();
    }

    @JSProperty
    public void setSpan(int span) {
        getElement().setSpan(span);
    }
}
