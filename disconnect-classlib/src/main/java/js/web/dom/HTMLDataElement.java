package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <data> elements. */
public interface HTMLDataElement extends HTMLElement {
    @JSProperty
    String getValue();

    @JSProperty
    void setValue(String value);

    @JSBody(script = "return HTMLDataElement.prototype")
    static HTMLDataElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDataElement()")
    static HTMLDataElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
