package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface AbstractRange extends Any {
    @JSBody(script = "return new AbstractRange()")
    static AbstractRange create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return AbstractRange.prototype")
    static AbstractRange prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns true if range is collapsed, and false otherwise.
     */
    @JSProperty
    boolean isCollapsed();

    /**
     * Returns range's end node.
     */
    @JSProperty
    Node getEndContainer();

    /**
     * Returns range's end offset.
     */
    @JSProperty
    int getEndOffset();

    /**
     * Returns range's start node.
     */
    @JSProperty
    Node getStartContainer();

    /**
     * Returns range's start offset.
     */
    @JSProperty
    int getStartOffset();

}
