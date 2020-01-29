package js.web.dom.svg;

import js.lang.Any;
import js.web.dom.DOMRect;
import js.web.dom.DOMRectReadOnly;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Used for attributes of basic SVGRect which can be animated.
 */
public interface SVGAnimatedRect extends Any {
    @JSBody(script = "return SVGAnimatedRect.prototype")
    static SVGAnimatedRect prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGAnimatedRect()")
    static SVGAnimatedRect create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    DOMRectReadOnly getAnimVal();

    @JSProperty
    DOMRect getBaseVal();

}
