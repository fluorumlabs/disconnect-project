package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoVerticalRel extends SVGPathSeg {
        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return SVGPathSegLinetoVerticalRel.prototype")
        static SVGPathSegLinetoVerticalRel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegLinetoVerticalRel()")
        static SVGPathSegLinetoVerticalRel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
