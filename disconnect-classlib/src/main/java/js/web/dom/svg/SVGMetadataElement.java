package js.web.dom.svg;

import org.teavm.jso.JSBody;

/**
 * Corresponds to the <metadata> element.
 */
public interface SVGMetadataElement extends SVGElement {
    @JSBody(script = "return SVGMetadataElement.prototype")
    static SVGMetadataElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGMetadataElement()")
    static SVGMetadataElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
