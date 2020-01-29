package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The SVGTransformList defines a list of SVGTransform objects.
 */
public interface SVGTransformList extends Any {
    @JSBody(script = "return SVGTransformList.prototype")
    static SVGTransformList prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTransformList()")
    static SVGTransformList create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getNumberOfItems();

    SVGTransform appendItem(SVGTransform newItem);

    void clear();

    SVGTransform consolidate();

    SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

    SVGTransform getItem(int index);

    SVGTransform initialize(SVGTransform newItem);

    SVGTransform insertItemBefore(SVGTransform newItem, int index);

    SVGTransform removeItem(int index);

    SVGTransform replaceItem(SVGTransform newItem, int index);

}
