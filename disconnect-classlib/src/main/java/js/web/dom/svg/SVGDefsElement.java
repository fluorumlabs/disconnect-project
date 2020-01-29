package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <defs> element.
 */
public interface SVGDefsElement extends SVGGraphicsElement {
    @JSBody(script = "return SVGDefsElement.prototype")
    static SVGDefsElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGDefsElement()")
    static SVGDefsElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
