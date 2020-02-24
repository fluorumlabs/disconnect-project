package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating &lt;param&gt; elements, representing a pair of a key and a value that acts as a parameter for an &lt;object&gt; element.
 */
public interface HTMLParamElement extends HTMLElement {
    @JSBody(script = "return HTMLParamElement.prototype")
    static HTMLParamElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLParamElement()")
    static HTMLParamElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves the name of an input parameter for an element.
     */
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    /**
     * Sets or retrieves the content type of the resource designated by the value attribute.
     */
    @Deprecated
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    /**
     * Sets or retrieves the value of an input parameter for an element.
     */
    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    /**
     * Sets or retrieves the data type of the value attribute.
     */
    @Deprecated
    @JSProperty
    String getValueType();

    @JSProperty
    void setValueType(String valueType);

}
