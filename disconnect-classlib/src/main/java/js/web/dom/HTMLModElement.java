package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond the regular methods and properties available through the HTMLElement interface they also have available to them by inheritance) for manipulating modification elements, that is &lt;del&gt; and &lt;ins&gt;.
 */
public interface HTMLModElement extends HTMLElement {
    @JSBody(script = "return HTMLModElement.prototype")
    static HTMLModElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLModElement()")
    static HTMLModElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or retrieves reference information about the object.
     */
    @JSProperty
    String getCite();

    @JSProperty
    void setCite(String cite);

    /**
     * Sets or retrieves the date and time of a modification to the object.
     */
    @JSProperty
    String getDateTime();

    @JSProperty
    void setDateTime(String dateTime);

}
