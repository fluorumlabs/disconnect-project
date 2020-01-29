package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <feFuncR> element.
 */
public interface SVGFEFuncRElement extends SVGComponentTransferFunctionElement {
    @JSBody(script = "return SVGFEFuncRElement.prototype")
    static SVGFEFuncRElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEFuncRElement()")
    static SVGFEFuncRElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
