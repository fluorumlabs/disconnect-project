package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <pattern> element. */
        public interface SVGPatternElement extends SVGElement, SVGFitToViewBox, SVGTests, SVGURIReference {
        @JSProperty
        SVGAnimatedLength getHeight();

        @JSProperty
        SVGAnimatedEnumeration getPatternContentUnits();

        @JSProperty
        SVGAnimatedTransformList getPatternTransform();

        @JSProperty
        SVGAnimatedEnumeration getPatternUnits();

        @JSProperty
        SVGAnimatedLength getWidth();

        @JSProperty
        SVGAnimatedLength getX();

        @JSProperty
        SVGAnimatedLength getY();

        @JSBody(script = "return SVGPatternElement.prototype")
        static SVGPatternElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPatternElement()")
        static SVGPatternElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
