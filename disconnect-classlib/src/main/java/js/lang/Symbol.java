package js.lang;

import org.teavm.jso.JSBody;

/**
 * The interface Symbol.
 */
public interface Symbol extends Any {
    /**
     * Returns a new unique Symbol value.
     * @param  description Description of the new Symbol object.
     */
    @JSBody(params = "description", script = "return Symbol(description)")
    static Symbol create(String description) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Symbol()")
    static Symbol create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a string representation of an object.
     */
    String toString();

    /**
     * Returns the primitive value of the specified object.
     *
     * @return the symbol
     */
    Symbol valueOf();
}
