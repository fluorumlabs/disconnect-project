package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);

        @JSBody(script = "return SVGPathSegCurvetoQuadraticSmoothRel.prototype")
        static SVGPathSegCurvetoQuadraticSmoothRel prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGPathSegCurvetoQuadraticSmoothRel()")
        static SVGPathSegCurvetoQuadraticSmoothRel create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
