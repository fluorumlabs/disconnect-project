package js.web.dom.svg;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface SVGPathSeg extends Any {
    @JSBody(script = "return SVGPathSeg.prototype")
    static SVGPathSeg prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPathSeg()")
    static SVGPathSeg create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    PathSegType getPathSegType();

    @JSProperty
    String getPathSegTypeAsLetter();

    abstract class PathSegType extends JsEnum {
        public static final PathSegType PATHSEG_ARC_ABS = JsEnum.from("SVGPathSeg.PATHSEG_ARC_ABS");


        public static final PathSegType PATHSEG_ARC_REL = JsEnum.from("SVGPathSeg.PATHSEG_ARC_REL");


        public static final PathSegType PATHSEG_CLOSEPATH = JsEnum.from("SVGPathSeg.PATHSEG_CLOSEPATH");


        public static final PathSegType PATHSEG_CURVETO_CUBIC_ABS = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_CUBIC_ABS");


        public static final PathSegType PATHSEG_CURVETO_CUBIC_REL = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_CUBIC_REL");


        public static final PathSegType PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_ABS");


        public static final PathSegType PATHSEG_CURVETO_CUBIC_SMOOTH_REL = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_CUBIC_SMOOTH_REL");


        public static final PathSegType PATHSEG_CURVETO_QUADRATIC_ABS = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_ABS");


        public static final PathSegType PATHSEG_CURVETO_QUADRATIC_REL = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_REL");


        public static final PathSegType PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS");


        public static final PathSegType PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = JsEnum.from("SVGPathSeg.PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL");


        public static final PathSegType PATHSEG_LINETO_ABS = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_ABS");


        public static final PathSegType PATHSEG_LINETO_HORIZONTAL_ABS = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_ABS");


        public static final PathSegType PATHSEG_LINETO_HORIZONTAL_REL = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_HORIZONTAL_REL");


        public static final PathSegType PATHSEG_LINETO_REL = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_REL");


        public static final PathSegType PATHSEG_LINETO_VERTICAL_ABS = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_VERTICAL_ABS");


        public static final PathSegType PATHSEG_LINETO_VERTICAL_REL = JsEnum.from("SVGPathSeg.PATHSEG_LINETO_VERTICAL_REL");


        public static final PathSegType PATHSEG_MOVETO_ABS = JsEnum.from("SVGPathSeg.PATHSEG_MOVETO_ABS");


        public static final PathSegType PATHSEG_MOVETO_REL = JsEnum.from("SVGPathSeg.PATHSEG_MOVETO_REL");


        public static final PathSegType PATHSEG_UNKNOWN = JsEnum.from("SVGPathSeg.PATHSEG_UNKNOWN");
    }


}
