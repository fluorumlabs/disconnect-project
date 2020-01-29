package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegCurvetoCubicRel extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getX1();

        @JSProperty
        void setX1(double x1);

        @JSProperty
        double getX2();

        @JSProperty
        void setX2(double x2);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSProperty
        double getY1();

        @JSProperty
        void setY1(double y1);

        @JSProperty
        double getY2();

        @JSProperty
        void setY2(double y2);

        @JSBody(script = "return SVGPathSegCurvetoCubicRel.prototype")
        static SVGPathSegCurvetoCubicRel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegCurvetoCubicRel()")
        static SVGPathSegCurvetoCubicRel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
