package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.DOMTokenList;
import js.web.dom.HTMLOutputElement;
import js.web.dom.ValidityState;

import java.util.Optional;

@Tag("output")
public class Output extends HtmlComponent<HTMLOutputElement> {
    public String getDefaultValue() {
        return getElement().getDefaultValue();
    }

    public void setDefaultValue(String defaultValue) {
        getElement().setDefaultValue(defaultValue);
    }

    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

    public DOMTokenList getHtmlFor() {
        return getElement().getHtmlFor();
    }

    public ComponentList<Label> getLabels() {
        return  new ArrayLikeBackedComponentList<>(getElement().getLabels());
    }

    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    public String getType() {
        return getElement().getType();
    }

    public String getValidationMessage() {
        return getElement().getValidationMessage();
    }

    public ValidityState getValidity() {
        return getElement().getValidity();
    }

    public String getValue() {
        return getElement().getValue();
    }

    public void setValue(String value) {
        getElement().setValue(value);
    }

    public boolean isWillValidate() {
        return getElement().isWillValidate();
    }

    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    public boolean reportValidity() {
        return getElement().reportValidity();
    }

    public void setCustomValidity(String error) {
        getElement().setCustomValidity(error);
    }
}
