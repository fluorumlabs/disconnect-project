package com.github.fluorumlabs.disconnect.core.components.html.embedding;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.html.form.Form;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.*;

import java.util.Optional;

@Tag("object")
public class ExternalObject extends HtmlComponent<HTMLObjectElement> {
    /**
     * Retrieves the document object of the page or frame.
     */
    public Optional<Document> getContentDocument() {
        return Optional.ofNullable(getElement().getContentDocument());
    }

    public WindowProxy getContentWindow() {
        return getElement().getContentWindow();
    }

    /**
     * Sets or retrieves the URL that references the data of the object.
     */
    public String getData() {
        return getElement().getData();
    }

    public void setData(String data) {
        getElement().setData(data);
    }

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    public Optional<Form> getForm() {
        return Optional.ofNullable(getElement().getForm()).map(TagRegistry::recover);
    }

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
     * Sets or retrieves the name of the object.
     */
    public String getName() {
        return getElement().getName();
    }

    public void setName(String name) {
        getElement().setName(name);
    }

    /**
     * Sets or retrieves the MIME type of the object.
     */
    public String getType() {
        return getElement().getType();
    }

    public void setType(String type) {
        getElement().setType(type);
    }

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String getUseMap() {
        return getElement().getUseMap();
    }

    public void setUseMap(String useMap) {
        getElement().setUseMap(useMap);
    }

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    public String getValidationMessage() {
        return getElement().getValidationMessage();
    }

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    public ValidityState getValidity() {
        return getElement().getValidity();
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

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    public boolean isWillValidate() {
        return getElement().isWillValidate();
    }

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    public Optional<Document> getSVGDocument() {
        return Optional.ofNullable(getElement().getSVGDocument());
    }

    public boolean reportValidity() {
        return getElement().reportValidity();
    }

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    public void setCustomValidity(String error) {
        getElement().setCustomValidity(error);
    }

    @Tag("param")
    public static class Parameter extends HtmlComponent<HTMLParamElement> {
        /**
         * Sets or retrieves the name of an input parameter for an element.
         */
        public String getName() {
            return getElement().getName();
        }

        public void setName(String name) {
            getElement().setName(name);
        }

        /**
         * Sets or retrieves the value of an input parameter for an element.
         */
        public String getValue() {
            return getElement().getValue();
        }

        public void setValue(String value) {
            getElement().setValue(value);
        }
    }
}
