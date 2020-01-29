package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides access to the properties of <clipPath> elements, as well as methods to manipulate them. */
        public interface SVGClipPathElement extends SVGElement {
        @JSProperty
        SVGAnimatedEnumeration getClipPathUnits();

        @JSProperty
        SVGAnimatedTransformList getTransform();

        @JSBody(script = "return SVGClipPathElement.prototype")
        static SVGClipPathElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGClipPathElement()")
        static SVGClipPathElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
