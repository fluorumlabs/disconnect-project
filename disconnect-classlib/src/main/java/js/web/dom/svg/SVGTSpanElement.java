package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * A <tspan> element.
 */
public interface SVGTSpanElement extends SVGTextPositioningElement {
    @JSBody(script = "return SVGTSpanElement.prototype")
    static SVGTSpanElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTSpanElement()")
    static SVGTSpanElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
