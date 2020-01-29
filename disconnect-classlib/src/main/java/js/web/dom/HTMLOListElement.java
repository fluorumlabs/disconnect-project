package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating ordered list elements.
 */
public interface HTMLOListElement extends HTMLElement {
    @JSBody(script = "return HTMLOListElement.prototype")
    static HTMLOListElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLOListElement()")
    static HTMLOListElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    boolean isCompact();

    @JSProperty
    void setCompact(boolean compact);

    @JSProperty
    boolean isReversed();

    @JSProperty
    void setReversed(boolean reversed);

    /**
     * The starting number.
     */
    @JSProperty
    int getStart();

    @JSProperty
    void setStart(int start);

    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
