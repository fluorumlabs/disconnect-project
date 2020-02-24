package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the &lt;feFlood&gt; element.
 */
public interface SVGFEFloodElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEFloodElement.prototype")
    static SVGFEFloodElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEFloodElement()")
    static SVGFEFloodElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
