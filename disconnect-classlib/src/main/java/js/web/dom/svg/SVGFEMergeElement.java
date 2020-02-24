package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the &lt;feMerge&gt; element.
 */
public interface SVGFEMergeElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
    @JSBody(script = "return SVGFEMergeElement.prototype")
    static SVGFEMergeElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEMergeElement()")
    static SVGFEMergeElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
