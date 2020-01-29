package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegList extends Any {
    @JSBody(script = "return SVGPathSegList.prototype")
    static SVGPathSegList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSegList()")
    static SVGPathSegList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getNumberOfItems();

    SVGPathSeg appendItem(SVGPathSeg newItem);

    void clear();

    SVGPathSeg getItem(int index);

    SVGPathSeg initialize(SVGPathSeg newItem);

    SVGPathSeg insertItemBefore(SVGPathSeg newItem, int index);

    SVGPathSeg removeItem(int index);

    SVGPathSeg replaceItem(SVGPathSeg newItem, int index);

}
