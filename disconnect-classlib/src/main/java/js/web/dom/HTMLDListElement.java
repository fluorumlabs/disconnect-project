package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those of the regular HTMLElement interface it also has available to it by inheritance) for manipulating definition list (&lt;dl&gt;) elements.
 */
public interface HTMLDListElement extends HTMLElement {
    @JSBody(script = "return HTMLDListElement.prototype")
    static HTMLDListElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLDListElement()")
    static HTMLDListElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    boolean isCompact();

    @JSProperty
    void setCompact(boolean compact);

}
