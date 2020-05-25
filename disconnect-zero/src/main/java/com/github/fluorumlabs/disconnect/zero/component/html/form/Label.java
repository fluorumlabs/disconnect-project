package com.github.fluorumlabs.disconnect.zero.component.html.form;

import com.github.fluorumlabs.disconnect.zero.annotations.Tag;
import com.github.fluorumlabs.disconnect.zero.component.HtmlComponent;
import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.web.dom.HTMLLabelElement;

import java.util.Optional;

@Tag("label")
public class Label extends HtmlComponent<HTMLLabelElement> {
    public Optional<HtmlComponent<?>> getControl() {
        return Optional.ofNullable(getElement().getControl()).map(TagRegistry::recover);
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    /**
     * Sets or retrieves the object to which the given label object is assigned.
     */
    public String getHtmlFor() {
        return getElement().getHtmlFor();
    }

    public void setHtmlFor(String htmlFor) {
        getElement().setHtmlFor(htmlFor);
    }
}
