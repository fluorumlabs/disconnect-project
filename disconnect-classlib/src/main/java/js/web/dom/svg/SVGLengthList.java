package js.web.dom.svg;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The SVGLengthList defines a list of SVGLength objects. */
        public interface SVGLengthList extends ArrayLike<SVGLength> {

        @JSProperty
         int getNumberOfItems();

         SVGLength appendItem(SVGLength newItem);
         void clear();
         SVGLength getItem(int index);
         SVGLength initialize(SVGLength newItem);
         SVGLength insertItemBefore(SVGLength newItem, int index);
         SVGLength removeItem(int index);
         SVGLength replaceItem(SVGLength newItem, int index);


        @JSBody(script = "return SVGLengthList.prototype")
        static SVGLengthList prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGLengthList()")
        static SVGLengthList create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
