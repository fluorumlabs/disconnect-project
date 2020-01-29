package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
        public interface SVGTransform extends Any {
        @JSProperty
        double getAngle();

        @JSProperty
        SVGMatrix getMatrix();

        @JSProperty
        Type getType();

        void setMatrix(SVGMatrix matrix);
        void setRotate(double angle, double cx, double cy);
        void setScale(double sx, double sy);
        void setSkewX(double angle);
        void setSkewY(double angle);
        void setTranslate(double tx, double ty);
        abstract class Type extends JsEnum {
        public static final Type SVG_TRANSFORM_MATRIX = JsEnum.from("return SVGTransform.SVG_TRANSFORM_MATRIX");


        public static final Type SVG_TRANSFORM_ROTATE = JsEnum.from("return SVGTransform.SVG_TRANSFORM_ROTATE");


        public static final Type SVG_TRANSFORM_SCALE = JsEnum.from("return SVGTransform.SVG_TRANSFORM_SCALE");


        public static final Type SVG_TRANSFORM_SKEWX = JsEnum.from("return SVGTransform.SVG_TRANSFORM_SKEWX");


        public static final Type SVG_TRANSFORM_SKEWY = JsEnum.from("return SVGTransform.SVG_TRANSFORM_SKEWY");


        public static final Type SVG_TRANSFORM_TRANSLATE = JsEnum.from("return SVGTransform.SVG_TRANSFORM_TRANSLATE");


        public static final Type SVG_TRANSFORM_UNKNOWN = JsEnum.from("return SVGTransform.SVG_TRANSFORM_UNKNOWN");}

        @JSBody(script = "return SVGTransform.prototype")
        static SVGTransform prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new SVGTransform()")
        static SVGTransform create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
