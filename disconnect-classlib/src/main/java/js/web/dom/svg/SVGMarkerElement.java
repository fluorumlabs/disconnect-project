package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGMarkerElement extends SVGElement, SVGFitToViewBox {
        @JSProperty
        SVGAnimatedLength getMarkerHeight();

        @JSProperty
        SVGAnimatedEnumeration<MarkerUnit> getMarkerUnits();

        @JSProperty
        SVGAnimatedLength getMarkerWidth();

        @JSProperty
        SVGAnimatedAngle getOrientAngle();

        @JSProperty
        SVGAnimatedEnumeration<OrientType> getOrientType();

        @JSProperty
        SVGAnimatedLength getRefX();

        @JSProperty
        SVGAnimatedLength getRefY();

        void setOrientToAngle(SVGAngle angle);
        void setOrientToAuto();

        abstract class MarkerUnit extends JsEnum {
        public static final MarkerUnit SVG_MARKERUNITS_STROKEWIDTH = JsEnum.from("return SVGMarkerElement.SVG_MARKERUNITS_STROKEWIDTH");

public static final MarkerUnit SVG_MARKERUNITS_UNKNOWN = JsEnum.from("return SVGMarkerElement.SVG_MARKERUNITS_UNKNOWN");

        public static final MarkerUnit SVG_MARKERUNITS_USERSPACEONUSE = JsEnum.from("return SVGMarkerElement.SVG_MARKERUNITS_USERSPACEONUSE");}

abstract class OrientType extends JsEnum {
        public static final OrientType SVG_MARKER_ORIENT_ANGLE = JsEnum.from("return SVGMarkerElement.SVG_MARKER_ORIENT_ANGLE");

        public static final OrientType SVG_MARKER_ORIENT_AUTO = JsEnum.from("return SVGMarkerElement.SVG_MARKER_ORIENT_AUTO");

public static final OrientType SVG_MARKER_ORIENT_UNKNOWN = JsEnum.from("return SVGMarkerElement.SVG_MARKER_ORIENT_UNKNOWN");}

@JSBody(script = "return SVGMarkerElement.prototype")
static SVGMarkerElement prototype() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

@JSBody(script = "return new SVGMarkerElement()")
static SVGMarkerElement create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

        }
