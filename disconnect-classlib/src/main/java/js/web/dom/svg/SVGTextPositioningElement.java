package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Implemented by elements that support attributes that position individual text glyphs. It is inherited by SVGTextElement, SVGTSpanElement, SVGTRefElement and SVGAltGlyphElement.
 */
public interface SVGTextPositioningElement extends SVGTextContentElement {
    @JSBody(script = "return SVGTextPositioningElement.prototype")
    static SVGTextPositioningElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTextPositioningElement()")
    static SVGTextPositioningElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedLengthList getDx();

    @JSProperty
    SVGAnimatedLengthList getDy();

    @JSProperty
    SVGAnimatedNumberList getRotate();

    @JSProperty
    SVGAnimatedLengthList getX();

    @JSProperty
    SVGAnimatedLengthList getY();

}
