package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


public interface HTMLCollection extends ArrayLike<Element> {
    /**
     * Retrieves a select object or an object from an options collection.
     */
    @Nullable
     Element namedItem(String name);

    @JSBody(script = "return HTMLCollection.prototype")
    static HTMLCollection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLCollection()")
    static HTMLCollection create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
