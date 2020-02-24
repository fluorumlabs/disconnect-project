package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;feMergeNode&gt; element.
 */
public interface SVGFEMergeNodeElement extends SVGElement {
    @JSBody(script = "return SVGFEMergeNodeElement.prototype")
    static SVGFEMergeNodeElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGFEMergeNodeElement()")
    static SVGFEMergeNodeElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getIn1();

}
