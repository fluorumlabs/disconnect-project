package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <switch> element.
 */
public interface SVGSwitchElement extends SVGGraphicsElement {
    @JSBody(script = "return SVGSwitchElement.prototype")
    static SVGSwitchElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGSwitchElement()")
    static SVGSwitchElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
