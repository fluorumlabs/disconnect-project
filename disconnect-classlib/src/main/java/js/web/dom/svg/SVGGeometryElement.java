package js.web.dom.svg;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.web.dom.DOMPoint;
import js.web.dom.DOMPointInit;


public interface SVGGeometryElement extends SVGGraphicsElement {
        @JSProperty
        SVGAnimatedNumber getPathLength();

        DOMPoint getPointAtLength(double distance);
        double getTotalLength();
        boolean isPointInFill(DOMPointInit point);
        boolean isPointInFill();
        boolean isPointInStroke(DOMPointInit point);
        boolean isPointInStroke();

        @JSBody(script = "return SVGGeometryElement.prototype")
        static SVGGeometryElement prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGGeometryElement()")
        static SVGGeometryElement create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
