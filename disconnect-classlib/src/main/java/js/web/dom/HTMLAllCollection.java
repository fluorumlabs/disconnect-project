package js.web.dom;

import js.lang.Unknown;
import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface HTMLAllCollection extends ArrayLike<Element> {
    @JSBody(script = "return HTMLAllCollection.prototype")
    static HTMLAllCollection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLAllCollection()")
    static HTMLAllCollection create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the number of elements in the collection.
     */
    @JSProperty
    int getLength();

    /**
     * Returns the item with index index from the collection (determined by tree order).
     */
    @Nullable
    Unknown item(String nameOrIndex);

    @Nullable
    Unknown item();

    /**
     * Returns the item with ID or name name from the collection.
     * <p>
     * If there are multiple matching items, then an HTMLCollection object containing all those elements is returned.
     *
     * @JSProperty Only button, form, iframe, input, map, meta, object, select, and textarea elements can have a name for the purpose of this getMethod();
     * @JSProperty void setMethod(* Only button, form, iframe, input, map, meta, object, select, and textarea elements can have a name for the purpose of this method);
     *         their name is given by the value of their name attribute.
     */
    @Nullable
    Unknown namedItem(String name);

}
