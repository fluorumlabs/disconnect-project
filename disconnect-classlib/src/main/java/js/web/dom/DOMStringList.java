package js.web.dom;

import js.util.collections.StringArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A type returned by some APIs which contains a list of DOMString (strings).
 */
public interface DOMStringList extends StringArrayLike {
    @JSBody(script = "return DOMStringList.prototype")
    static DOMStringList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMStringList()")
    static DOMStringList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the number of strings in strings.
     */
    @JSProperty
    int getLength();

    /**
     * Returns true if strings contains string, and false otherwise.
     */
    boolean contains(String string);

    /**
     * Returns the string with index index from strings.
     */
    @Nullable
    String item(int index);

}
