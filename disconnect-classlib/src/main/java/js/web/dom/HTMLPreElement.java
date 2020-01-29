package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Exposes specific properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating a block of preformatted text (<pre>).
 */
public interface HTMLPreElement extends HTMLElement {
    @JSBody(script = "return HTMLPreElement.prototype")
    static HTMLPreElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLPreElement()")
    static HTMLPreElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Sets or gets a value that you can use to implement your own width functionality for the object.
     */
    @Deprecated
    @JSProperty
    double getWidth();

    @JSProperty
    void setWidth(double width);

}
