package js.web.dom;

import js.lang.Unknown;
import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


/**
 * The interface Html all collection.
 */
public interface HTMLAllCollection extends ArrayLike<Element> {
    /**
     * Prototype html all collection.
     *
     * @return the html all collection
     */
    @JSBody(script = "return HTMLAllCollection.prototype")
    static HTMLAllCollection prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Create html all collection.
     *
     * @return the html all collection
     */
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
     *
     * @param nameOrIndex the name or index
     *
     * @return the unknown
     */
    @Nullable
    Unknown item(String nameOrIndex);

    /**
     * Item unknown.
     *
     * @return the unknown
     */
    @Nullable
    Unknown item();

    /**
     * Returns the item with ID or name name from the collection.
     * <p>
     * If there are multiple matching items, then an HTMLCollection object containing all those elements is returned.
     *
     * @param name the name
     *
     * @return the unknown
     */
    @Nullable
    Unknown namedItem(String name);

}
