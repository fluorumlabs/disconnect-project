package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the &lt;title&gt; element.
 */
public interface SVGTitleElement extends SVGElement {
    @JSBody(script = "return SVGTitleElement.prototype")
    static SVGTitleElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTitleElement()")
    static SVGTitleElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
