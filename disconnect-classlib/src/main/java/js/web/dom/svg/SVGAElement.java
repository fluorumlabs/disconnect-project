package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Provides access to the properties of <a> element, as well as methods to manipulate them. */
        public interface SVGAElement extends SVGGraphicsElement, SVGURIReference {
        @JSProperty
        SVGAnimatedString getTarget();

        @JSBody(script = "return SVGAElement.prototype")
        static SVGAElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAElement()")
        static SVGAElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
