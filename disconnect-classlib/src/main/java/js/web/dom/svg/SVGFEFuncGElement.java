package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <feFuncG> element.
 */
public interface SVGFEFuncGElement extends SVGComponentTransferFunctionElement {
    @JSBody(script = "return SVGFEFuncGElement.prototype")
    static SVGFEFuncGElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEFuncGElement()")
    static SVGFEFuncGElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
