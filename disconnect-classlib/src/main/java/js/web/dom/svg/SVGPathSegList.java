package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGPathSegList extends Any {
        @JSProperty
        double getNumberOfItems();

        SVGPathSeg appendItem(SVGPathSeg newItem);
        void clear();
        SVGPathSeg getItem(int index);
        SVGPathSeg initialize(SVGPathSeg newItem);
        SVGPathSeg insertItemBefore(SVGPathSeg newItem, int index);
        SVGPathSeg removeItem(int index);
        SVGPathSeg replaceItem(SVGPathSeg newItem, int index);

        @JSBody(script = "return SVGPathSegList.prototype")
        static SVGPathSegList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegList()")
        static SVGPathSegList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
