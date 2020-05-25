package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import js.web.dom.HTMLFormElement;

@Tag("form")
public class Form extends HtmlComponent<HTMLFormElement> {
    /**
     * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     */
    public String getAcceptCharset() {
        return getElement().getAcceptCharset();
    }

    public void setAcceptCharset(String acceptCharset) {
        getElement().setAcceptCharset(acceptCharset);
    }

    /**
     * Sets or retrieves the URL to which the form content is sent for processing.
     */
    public String getAction() {
        return getElement().getAction();
    }

    public void setAction(String action) {
        getElement().setAction(action);
    }

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    public String getAutocomplete() {
        return getElement().getAutocomplete();
    }

    public void setAutocomplete(String autocomplete) {
        getElement().setAutocomplete(autocomplete);
    }

    /**
     * Retrieves a collection, in source order, of all controls in a given form.
     */
    public ComponentList<Input> getControls() {
        return  new ArrayLikeBackedComponentList<>(getElement().getElements().cast());
    }

    /**
     * Sets or retrieves the MIME encoding for the form.
     */
    public String getEncoding() {
        return getElement().getEncoding();
    }

    public void setEncoding(String encoding) {
        getElement().setEncoding(encoding);
    }

    /**
     * Sets or retrieves the encoding type for the form.
     */
    public String getEncType() {
        return getElement().getEnctype();
    }

    public void setEncType(String enctype) {
        getElement().setEnctype(enctype);
    }

    /**
     * Sets or retrieves how to send the form data to the server.
     */
    public String getMethod() {
        return getElement().getMethod();
    }

    public void setMethod(String method) {
        getElement().setMethod(method);
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
     * Designates a form that is not validated when submitted.
     */
    public boolean isNoValidate() {
        return getElement().isNoValidate();
    }

    public void setNoValidate(boolean noValidate) {
        getElement().setNoValidate(noValidate);
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

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    public boolean checkValidity() {
        return getElement().checkValidity();
    }

    public boolean reportValidity() {
        return getElement().reportValidity();
    }

    /**
     * Fires when the user resets a form.
     */
    public void reset() {
        getElement().reset();
    }

    /**
     * Fires when a FORM is about to be submitted.
     */
    public void submit() {
        getElement().submit();
    }
}
