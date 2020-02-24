package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the &lt;symbol&gt; element.
 */
public interface SVGSymbolElement extends SVGElement, SVGFitToViewBox {
    @JSBody(script = "return SVGSymbolElement.prototype")
    static SVGSymbolElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGSymbolElement()")
    static SVGSymbolElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
