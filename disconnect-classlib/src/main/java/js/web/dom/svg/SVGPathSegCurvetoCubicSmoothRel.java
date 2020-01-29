package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getX2();

        @JSProperty
        void setX2(double x2);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSProperty
        double getY2();

        @JSProperty
        void setY2(double y2);

        @JSBody(script = "return SVGPathSegCurvetoCubicSmoothRel.prototype")
        static SVGPathSegCurvetoCubicSmoothRel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegCurvetoCubicSmoothRel()")
        static SVGPathSegCurvetoCubicSmoothRel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
