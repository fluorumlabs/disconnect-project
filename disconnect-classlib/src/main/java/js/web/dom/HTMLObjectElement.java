package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;object&gt; element, representing external resources.
 */
public interface HTMLObjectElement extends HTMLElement {
    @JSBody(script = "return HTMLObjectElement.prototype")
    static HTMLObjectElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLObjectElement()")
    static HTMLObjectElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    /**
     * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
     */
    @Deprecated
    @JSProperty
    String getArchive();

    @JSProperty
    void setArchive(String archive);

    @Deprecated
    @JSProperty
    String getBorder();

    @JSProperty
    void setBorder(String border);

    /**
     * Sets or retrieves the URL of the file containing the compiled Java class.
     */
    @Deprecated
    @JSProperty
    String getCode();

    @JSProperty
    void setCode(String code);

    /**
     * Sets or retrieves the URL of the component.
     */
    @Deprecated
    @JSProperty
    String getCodeBase();

    @JSProperty
    void setCodeBase(String codeBase);

    /**
     * Sets or retrieves the Internet media type for the code associated with the object.
     */
    @Deprecated
    @JSProperty
    String getCodeType();

    @JSProperty
    void setCodeType(String codeType);

    /**
     * Retrieves the document object of the page or frame.
     */
    @JSProperty
    @Nullable
    Document getContentDocument();

    @JSProperty
    @Nullable
    WindowProxy getContentWindow();

    /**
     * Sets or retrieves the URL that references the data of the object.
     */
    @JSProperty
    String getData();

    @JSProperty
    void setData(String data);

    @Deprecated
    @JSProperty
    boolean isDeclare();

    @JSProperty
    void setDeclare(boolean declare);

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Sets or retrieves the height of the object.
     */
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    @Deprecated
    @JSProperty
    double getHspace();

    @JSProperty
    void setHspace(double hspace);

    /**
     * Sets or retrieves the name of the object.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Sets or retrieves a message to be displayed while an object is loading.
     */
    @Deprecated
    @JSProperty
    String getStandby();

    @JSProperty
    void setStandby(String standby);

    /**
     * Sets or retrieves the MIME type of the object.
     */
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    @JSProperty
    String getUseMap();

    @JSProperty
    void setUseMap(String useMap);

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    @JSProperty
    String getValidationMessage();

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    @JSProperty
    ValidityState getValidity();

    @Deprecated
    @JSProperty
    double getVspace();

    @JSProperty
    void setVspace(double vspace);

    /**
     * Sets or retrieves the width of the object.
     */
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    @JSProperty
    boolean isWillValidate();

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();

    @Nullable
    Document getSVGDocument();

    boolean reportValidity();

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     *
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

}
