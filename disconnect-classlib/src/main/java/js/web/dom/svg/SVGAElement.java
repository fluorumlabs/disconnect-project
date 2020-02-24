package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides access to the properties of &lt;a&gt; element, as well as methods to manipulate them.
 */
public interface SVGAElement extends SVGGraphicsElement, SVGURIReference {
    @JSBody(script = "return SVGAElement.prototype")
    static SVGAElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAElement()")
    static SVGAElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedString getTarget();

}
