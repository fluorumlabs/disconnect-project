package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Exposes specific properties and methods (beyond those defined by regular HTMLElement interface it also has available to it by inheritance) for manipulating list elements.
 */
public interface HTMLLIElement extends HTMLElement {
    @JSBody(script = "return HTMLLIElement.prototype")
    static HTMLLIElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLLIElement()")
    static HTMLLIElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Sets or retrieves the value of a list item.
     */
    @JSProperty
    int getValue();

    @JSProperty
    void setValue(int value);

}
