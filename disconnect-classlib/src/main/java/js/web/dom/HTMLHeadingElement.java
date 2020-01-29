package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The different heading elements. It inherits methods and properties from the HTMLElement interface. */
public interface HTMLHeadingElement extends HTMLElement {
    /**
     * Sets or retrieves a value that indicates the table alignment.
     */
    @Deprecated
    @JSProperty
    String getAlign();

    @JSProperty
    void setAlign(String align);

    @JSBody(script = "return HTMLHeadingElement.prototype")
    static HTMLHeadingElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLHeadingElement()")
    static HTMLHeadingElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
