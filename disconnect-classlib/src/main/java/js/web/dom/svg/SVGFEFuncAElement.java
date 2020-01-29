package js.web.dom.svg;

import org.teavm.jso.JSBody;

/** Corresponds to the <feFuncA> element. */
        public interface SVGFEFuncAElement extends SVGComponentTransferFunctionElement {
                @JSBody(script = "return SVGFEFuncAElement.prototype")
                static SVGFEFuncAElement prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new SVGFEFuncAElement()")
                static SVGFEFuncAElement create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
