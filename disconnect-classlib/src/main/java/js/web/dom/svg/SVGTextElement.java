package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <text> elements.
 */
public interface SVGTextElement extends SVGTextPositioningElement {
    @JSBody(script = "return SVGTextElement.prototype")
    static SVGTextElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTextElement()")
    static SVGTextElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
