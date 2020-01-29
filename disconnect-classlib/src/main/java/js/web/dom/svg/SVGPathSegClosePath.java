package js.web.dom.svg;

import org.teavm.jso.JSBody;


public interface SVGPathSegClosePath extends SVGPathSeg {
        @JSBody(script = "return SVGPathSegClosePath.prototype")
        static SVGPathSegClosePath prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegClosePath()")
        static SVGPathSegClosePath create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
