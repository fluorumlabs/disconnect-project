package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <time> elements. */
public interface HTMLTimeElement extends HTMLElement {
    @JSProperty
    String getDateTime();

    @JSProperty
    void setDateTime(String dateTime);

    @JSBody(script = "return HTMLTimeElement.prototype")
    static HTMLTimeElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLTimeElement()")
    static HTMLTimeElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
