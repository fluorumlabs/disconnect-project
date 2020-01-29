package js.web.dom.svg;

import js.web.dom.HTMLOrSVGScriptElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the SVG <script> element.
 */
public interface SVGScriptElement extends SVGElement, SVGURIReference, HTMLOrSVGScriptElement {
    @JSBody(script = "return SVGScriptElement.prototype")
    static SVGScriptElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGScriptElement()")
    static SVGScriptElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getType();

    @JSProperty
    void setType(String type);

}
