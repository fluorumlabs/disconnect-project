package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegLinetoAbs extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return SVGPathSegLinetoAbs.prototype")
        static SVGPathSegLinetoAbs prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegLinetoAbs()")
        static SVGPathSegLinetoAbs create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
