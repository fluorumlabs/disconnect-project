package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegArcAbs extends SVGPathSeg {
        @JSProperty
        double getAngle();

        @JSProperty
        void setAngle(double angle);

        @JSProperty
        boolean isLargeArcFlag();

        @JSProperty
        void setLargeArcFlag(boolean largeArcFlag);

        @JSProperty
        double getR1();

        @JSProperty
        void setR1(double r1);

        @JSProperty
        double getR2();

        @JSProperty
        void setR2(double r2);

        @JSProperty
        boolean isSweepFlag();

        @JSProperty
        void setSweepFlag(boolean sweepFlag);

        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return SVGPathSegArcAbs.prototype")
        static SVGPathSegArcAbs prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegArcAbs()")
        static SVGPathSegArcAbs create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
