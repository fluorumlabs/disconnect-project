package com.github.fluorumlabs.disconnect.core.components.html.text;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLQuoteElement;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HtmlQuoteComponent extends HtmlComponent<HTMLQuoteElement> {
    protected HtmlQuoteComponent() {}

    /**
     * Sets or retrieves reference information about the object.
     */
    @JSProperty
    public String getCite() {
        return getElement().getCite();
    }

    @JSProperty
    public void setCite(String cite) {
        getElement().setCite(cite);
    }
}
