package com.github.fluorumlabs.disconnect.core.components.html.embedding;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.Document;
import js.web.dom.HTMLEmbedElement;

import java.util.Optional;

@Tag("embed")
public class Embed extends HtmlComponent<HTMLEmbedElement> {
    /**
     * Sets or retrieves the height of the object.
     */
    public String getHeight() {
        return getElement().getHeight();
    }

    public void setHeight(String height) {
        getElement().setHeight(height);
    }

    /**
     * Sets or retrieves a URL to be loaded by the object.
     */
    public String getSrc() {
        return getElement().getSrc();
    }

    public void setSrc(String src) {
        getElement().setSrc(src);
    }

    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    public String getWidth() {
        return getElement().getWidth();
    }

    public void setWidth(String width) {
        getElement().setWidth(width);
    }

    public Optional<Document> getSVGDocument() {
        return Optional.ofNullable(getElement().getSVGDocument());
    }
}
