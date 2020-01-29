package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <feGaussianBlur> element. */
        public interface SVGFEGaussianBlurElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
        @JSProperty
        SVGAnimatedString getIn1();

        @JSProperty
        SVGAnimatedNumber getStdDeviationX();

        @JSProperty
        SVGAnimatedNumber getStdDeviationY();

        @JSBody(script = "return SVGFEGaussianBlurElement.prototype")
        static SVGFEGaussianBlurElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGFEGaussianBlurElement()")
        static SVGFEGaussianBlurElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
