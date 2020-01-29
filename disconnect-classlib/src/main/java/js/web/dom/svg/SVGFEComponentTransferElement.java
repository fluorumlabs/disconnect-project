package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** Corresponds to the <feComponentTransfer> element. */
        public interface SVGFEComponentTransferElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
        @JSProperty
        SVGAnimatedString getIn1();

        @JSBody(script = "return SVGFEComponentTransferElement.prototype")
        static SVGFEComponentTransferElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGFEComponentTransferElement()")
        static SVGFEComponentTransferElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
