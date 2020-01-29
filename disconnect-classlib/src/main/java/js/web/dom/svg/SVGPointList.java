package js.web.dom.svg;

import js.util.collections.ArrayLike;
import js.web.dom.DOMPoint;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;


public interface SVGPointList extends ArrayLike<DOMPoint> {
        @JSProperty
         int getLength();

        @JSProperty
         int getNumberOfItems();

         SVGPoint appendItem(SVGPoint newItem);
         void clear();
         SVGPoint getItem(int index);
         SVGPoint initialize(SVGPoint newItem);
         SVGPoint insertItemBefore(SVGPoint newItem, int index);
         SVGPoint removeItem(int index);
         SVGPoint replaceItem(SVGPoint newItem, int index);

        @JSIndexer
         DOMPoint get(int index);

        @JSIndexer
         void set(int index, SVGPoint value);


        @JSBody(script = "return SVGPointList.prototype")
        static SVGPointList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPointList()")
        static SVGPointList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
