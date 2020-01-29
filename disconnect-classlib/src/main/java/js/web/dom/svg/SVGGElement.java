package js.web.dom.svg;

import org.teavm.jso.JSBody;

/** Corresponds to the <g> element. */
        public interface SVGGElement extends SVGGraphicsElement {
                @JSBody(script = "return SVGGElement.prototype")
                static SVGGElement prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new SVGGElement()")
                static SVGGElement create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
