package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <desc> element.
 */
public interface SVGDescElement extends SVGElement {
    @JSBody(script = "return SVGDescElement.prototype")
    static SVGDescElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGDescElement()")
    static SVGDescElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
