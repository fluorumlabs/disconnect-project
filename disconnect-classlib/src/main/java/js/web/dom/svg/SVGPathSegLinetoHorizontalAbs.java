package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoHorizontalAbs extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSBody(script = "return SVGPathSegLinetoHorizontalAbs.prototype")
        static SVGPathSegLinetoHorizontalAbs prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegLinetoHorizontalAbs()")
        static SVGPathSegLinetoHorizontalAbs create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
