package js.web.dom.svg;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
 */
public interface SVGTransform extends Any {
    @JSBody(script = "return SVGTransform.prototype")
    static SVGTransform prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTransform()")
    static SVGTransform create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getAngle();

    @JSProperty
    SVGMatrix getMatrix();

    void setMatrix(SVGMatrix matrix);

    @JSProperty
    Type getType();

    void setRotate(double angle, double cx, double cy);

    void setScale(double sx, double sy);

    void setSkewX(double angle);

    void setSkewY(double angle);

    void setTranslate(double tx, double ty);

    abstract class Type extends JsEnum {
        public static final Type SVG_TRANSFORM_MATRIX = JsEnum.from("SVGTransform.SVG_TRANSFORM_MATRIX");


        public static final Type SVG_TRANSFORM_ROTATE = JsEnum.from("SVGTransform.SVG_TRANSFORM_ROTATE");


        public static final Type SVG_TRANSFORM_SCALE = JsEnum.from("SVGTransform.SVG_TRANSFORM_SCALE");


        public static final Type SVG_TRANSFORM_SKEWX = JsEnum.from("SVGTransform.SVG_TRANSFORM_SKEWX");


        public static final Type SVG_TRANSFORM_SKEWY = JsEnum.from("SVGTransform.SVG_TRANSFORM_SKEWY");


        public static final Type SVG_TRANSFORM_TRANSLATE = JsEnum.from("SVGTransform.SVG_TRANSFORM_TRANSLATE");


        public static final Type SVG_TRANSFORM_UNKNOWN = JsEnum.from("SVGTransform.SVG_TRANSFORM_UNKNOWN");
    }


}
