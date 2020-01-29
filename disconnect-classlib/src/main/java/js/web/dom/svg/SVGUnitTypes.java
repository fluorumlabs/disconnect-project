package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;

import js.lang.Any;

/** A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes. */
        public interface SVGUnitTypes extends Any {
                abstract class Type extends JsEnum {
        public static final Type SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = JsEnum.from("return SVGUnitTypes.SVG_UNIT_TYPE_OBJECTBOUNDINGBOX");


        public static final Type SVG_UNIT_TYPE_UNKNOWN = JsEnum.from("return SVGUnitTypes.SVG_UNIT_TYPE_UNKNOWN");


        public static final Type SVG_UNIT_TYPE_USERSPACEONUSE = JsEnum.from("return SVGUnitTypes.SVG_UNIT_TYPE_USERSPACEONUSE");}


        @JSBody(script = "return SVGUnitTypes.prototype")
        static SVGUnitTypes prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGUnitTypes()")
        static SVGUnitTypes create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
