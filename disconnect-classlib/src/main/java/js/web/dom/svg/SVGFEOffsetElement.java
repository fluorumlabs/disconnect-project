package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feOffset&gt; element.
 */
public interface SVGFEOffsetElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEOffsetElement.prototype")
    static SVGFEOffsetElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEOffsetElement()")
    static SVGFEOffsetElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedNumber getDx();

    @JSProperty
    SVGAnimatedNumber getDy();

    @JSProperty
    SVGAnimatedString getIn1();

}
