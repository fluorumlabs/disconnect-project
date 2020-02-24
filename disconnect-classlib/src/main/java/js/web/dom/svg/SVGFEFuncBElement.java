package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the &lt;feFuncB&gt; element.
 */
public interface SVGFEFuncBElement extends SVGComponentTransferFunctionElement {

    @JSBody(script = "return SVGFEFuncBElement.prototype")
    static SVGFEFuncBElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEFuncBElement()")
    static SVGFEFuncBElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
