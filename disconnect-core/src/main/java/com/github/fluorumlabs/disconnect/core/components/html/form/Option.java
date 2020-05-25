package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.HTMLOptionElement;

import java.util.Optional;

@Tag("option")
public class Option extends HtmlComponent<HTMLOptionElement> {
    /**
     * Sets or retrieves the status of an option.
     */
    public boolean isDefaultSelected() {
        return getElement().isDefaultSelected();
    }

    public void setDefaultSelected(boolean defaultSelected) {
        getElement().setDefaultSelected(defaultSelected);
    }

    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    public void setDisabled(boolean disabled) {
        getElement().setDisabled(disabled);
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    /**
     * Sets or retrieves the ordinal position of an option in a list box.
     */
    public int getIndex() {
        return getElement().getIndex();
    }

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    public String getLabel() {
        return getElement().getLabel();
    }

    public void setLabel(String label) {
        getElement().setLabel(label);
    }

    /**
     * Sets or retrieves whether the option in the list box is the default item.
     */
    public boolean isSelected() {
        return getElement().isSelected();
    }

    public void setSelected(boolean selected) {
        getElement().setSelected(selected);
    }

    /**
     * Sets or retrieves the text string specified by the option tag.
     */
    public String getText() {
        return getElement().getText();
    }

    public void setText(String text) {
        getElement().setText(text);
    }

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    public String getValue() {
        return getElement().getValue();
    }

    public void setValue(String value) {
        getElement().setValue(value);
    }
}
