package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only. */
        public interface SVGAngle extends Any {
        @JSProperty
        int getUnitType();

        @JSProperty
        double getValue();

        @JSProperty
        void setValue(double value);

        @JSProperty
        String getValueAsString();

        @JSProperty
        void setValueAsString(String valueAsString);

        @JSProperty
        double getValueInSpecifiedUnits();

        @JSProperty
        void setValueInSpecifiedUnits(double valueInSpecifiedUnits);

        void convertToSpecifiedUnits(UnitType unitType);
        void newValueSpecifiedUnits(UnitType unitType, double valueInSpecifiedUnits);

        abstract class UnitType extends JsEnum {
        public static final UnitType SVG_ANGLETYPE_DEG = JsEnum.from("return SVGAngle.SVG_ANGLETYPE_DEG");

        public static final UnitType SVG_ANGLETYPE_GRAD = JsEnum.from("return SVGAngle.SVG_ANGLETYPE_GRAD");

        public static final UnitType SVG_ANGLETYPE_RAD = JsEnum.from("return SVGAngle.SVG_ANGLETYPE_RAD");

        public static final UnitType SVG_ANGLETYPE_UNKNOWN = JsEnum.from("return SVGAngle.SVG_ANGLETYPE_UNKNOWN");

        public static final UnitType SVG_ANGLETYPE_UNSPECIFIED = JsEnum.from("return SVGAngle.SVG_ANGLETYPE_UNSPECIFIED");}

        @JSBody(script = "return SVGAngle.prototype")
        static SVGAngle prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGAngle()")
        static SVGAngle create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
