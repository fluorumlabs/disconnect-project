package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLBaseElement;

@Tag("base")
public class Base extends HtmlComponent<HTMLBaseElement> {
    /**
     * Gets or sets the baseline URL on which relative links are based.
     */
    public String getHref() {
        return getElement().getHref();
    }

    public void setHref(String href) {
        getElement().setHref(href);
    }

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    public String getTarget() {
        return getElement().getTarget();
    }

    public void setTarget(String target) {
        getElement().setTarget(target);
    }
}
