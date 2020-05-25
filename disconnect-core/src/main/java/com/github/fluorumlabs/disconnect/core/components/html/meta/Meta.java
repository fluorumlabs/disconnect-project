package com.github.fluorumlabs.disconnect.core.components.html.meta;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLMetaElement;

@Tag("meta")
public class Meta extends HtmlComponent<HTMLMetaElement> {

    /**
     * Gets or sets meta-information to associate with httpEquiv or name.
     */
    public String getContent() {
        return getElement().getContent();
    }

    public void setContent(String content) {
        getElement().setContent(content);
    }

    /**
     * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     */
    public String getHttpEquiv() {
        return getElement().getHttpEquiv();
    }

    public void setHttpEquiv(String httpEquiv) {
        getElement().setHttpEquiv(httpEquiv);
    }

    /**
     * Sets or retrieves the value specified in the content attribute of the meta object.
     */
    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }
}
