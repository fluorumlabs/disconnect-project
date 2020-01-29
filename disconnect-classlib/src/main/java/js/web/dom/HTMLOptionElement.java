package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <option> elements and inherits all classes and methods of the HTMLElement interface.
 */
public interface HTMLOptionElement extends HTMLElement {
    @JSBody(script = "return HTMLOptionElement.prototype")
    static HTMLOptionElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLOptionElement()")
    static HTMLOptionElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the status of an option.
     */
    @JSProperty
    boolean isDefaultSelected();

    @JSProperty
    void setDefaultSelected(boolean defaultSelected);

    @JSProperty
    boolean isDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JSProperty
    @Nullable
    HTMLFormElement getForm();

    /**
     * Sets or retrieves the ordinal position of an option in a list box.
     */
    @JSProperty
    int getIndex();

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    @JSProperty
    String getLabel();

    @JSProperty
    void setLabel(String label);

    /**
     * Sets or retrieves whether the option in the list box is the default item.
     */
    @JSProperty
    boolean isSelected();

    @JSProperty
    void setSelected(boolean selected);

    /**
     * Sets or retrieves the text string specified by the option tag.
     */
    @JSProperty
    String getText();

    @JSProperty
    void setText(String text);

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

}
