package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating unordered list elements. */
public interface HTMLUListElement extends HTMLElement {
    @Deprecated
    @JSProperty
    boolean isCompact();

    @JSProperty
    void setCompact(boolean compact);

    @Deprecated
    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

    @JSBody(script = "return HTMLUListElement.prototype")
    static HTMLUListElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLUListElement()")
    static HTMLUListElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
