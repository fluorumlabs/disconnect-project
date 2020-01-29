package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegMovetoRel extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return SVGPathSegMovetoRel.prototype")
        static SVGPathSegMovetoRel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegMovetoRel()")
        static SVGPathSegMovetoRel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
