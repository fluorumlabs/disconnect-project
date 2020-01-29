package js.web.dom.svg;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 */
public interface SVGNumberList extends ArrayLike<SVGNumber> {

    @JSBody(script = "return SVGNumberList.prototype")
    static SVGNumberList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGNumberList()")
    static SVGNumberList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getNumberOfItems();

    SVGNumber appendItem(SVGNumber newItem);

    void clear();

    SVGNumber getItem(int index);

    SVGNumber initialize(SVGNumber newItem);

    SVGNumber insertItemBefore(SVGNumber newItem, int index);

    SVGNumber removeItem(int index);

    SVGNumber replaceItem(SVGNumber newItem, int index);

}
