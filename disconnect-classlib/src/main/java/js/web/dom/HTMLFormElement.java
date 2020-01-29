package js.web.dom;

import js.lang.Unknown;
import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/** A <form> element in the DOM; it allows access to and in some cases modification of aspects of the form, as well as access to its component elements. */
public interface HTMLFormElement extends ArrayLike<Element>, HTMLElement {
    /**
     * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     */
    @JSProperty
     String getAcceptCharset();

    @JSProperty
     void setAcceptCharset(String acceptCharset);

    /**
     * Sets or retrieves the URL to which the form content is sent for processing.
     */
    @JSProperty
     String getAction();

    @JSProperty
     void setAction(String action);

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @JSProperty
     String getAutocomplete();

    @JSProperty
     void setAutocomplete(String autocomplete);

    /**
     * Retrieves a collection, in source order, of all controls in a given form.
     */
    @JSProperty
     HTMLFormControlsCollection getElements();

    /**
     * Sets or retrieves the MIME encoding for the form.
     */
    @JSProperty
     String getEncoding();

    @JSProperty
     void setEncoding(String encoding);

    /**
     * Sets or retrieves the encoding type for the form.
     */
    @JSProperty
     String getEnctype();

    @JSProperty
     void setEnctype(String enctype);

    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JSProperty
     int getLength();

    /**
     * Sets or retrieves how to send the form data to the server.
     */
    @JSProperty
     String getMethod();

    @JSProperty
     void setMethod(String method);

    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
     String getName();

    @JSProperty
     void setName(String name);

    /**
     * Designates a form that is not validated when submitted.
     */
    @JSProperty
     boolean isNoValidate();

    @JSProperty
     void setNoValidate(boolean noValidate);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JSProperty
     String getTarget();

    @JSProperty
     void setTarget(String target);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
     boolean checkValidity();
     boolean reportValidity();
    /**
     * Fires when the user resets a form.
     */
     void reset();
    /**
     * Fires when a FORM is about to be submitted.
     */
     void submit();

    @JSIndexer
     Unknown get(String name);


    @JSBody(script = "return HTMLFormElement.prototype")
    static HTMLFormElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLFormElement()")
    static HTMLFormElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
