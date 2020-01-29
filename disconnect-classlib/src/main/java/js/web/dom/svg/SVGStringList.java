package js.web.dom.svg;

import js.util.collections.StringArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * The SVGStringList defines a list of DOMString objects.
 */
public interface SVGStringList extends StringArrayLike {

    @JSBody(script = "return SVGStringList.prototype")
    static SVGStringList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGStringList()")
    static SVGStringList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getNumberOfItems();

    String appendItem(String newItem);

    void clear();

    String getItem(int index);

    String initialize(String newItem);

    String insertItemBefore(String newItem, int index);

    String removeItem(int index);

    String replaceItem(String newItem, int index);

    @JSIndexer
    void set(int index, String value);

}
