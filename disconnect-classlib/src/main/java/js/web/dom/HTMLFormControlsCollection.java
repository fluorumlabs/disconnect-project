package js.web.dom;

import js.lang.Unknown;
import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


/** A collection of HTML form control elements.  */
public interface HTMLFormControlsCollection extends ArrayLike<Element> {
    /**
     * Returns the item with ID or name name from the collection.
     *
     * If there are multiple matching items, then a RadioNodeList object containing all those elements is returned.
     */
    @Nullable
     Unknown namedItem(String name);

    @JSBody(script = "return HTMLFormControlsCollection.prototype")
    static HTMLFormControlsCollection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLFormControlsCollection()")
    static HTMLFormControlsCollection create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
