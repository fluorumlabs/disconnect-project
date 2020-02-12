package js.web.dom.svg;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the preserveAspectRatio attribute, which is available for some of SVG's elements.
 */
public interface SVGPreserveAspectRatio extends Any {
    @JSBody(script = "return SVGPreserveAspectRatio.prototype")
    static SVGPreserveAspectRatio prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGPreserveAspectRatio()")
    static SVGPreserveAspectRatio create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Align getAlign();

    @JSProperty
    void setAlign(Align align);

    @JSProperty
    MeetOrSlice getMeetOrSlice();

    @JSProperty
    void setMeetOrSlice(MeetOrSlice meetOrSlice);

    abstract class MeetOrSlice extends JsEnum {
        public static final MeetOrSlice SVG_MEETORSLICE_MEET = JsEnum.from("SVGPreserveAspectRatio.SVG_MEETORSLICE_MEET");


        public static final MeetOrSlice SVG_MEETORSLICE_SLICE = JsEnum.from("SVGPreserveAspectRatio.SVG_MEETORSLICE_SLICE");


        public static final MeetOrSlice SVG_MEETORSLICE_UNKNOWN = JsEnum.from("SVGPreserveAspectRatio.SVG_MEETORSLICE_UNKNOWN");
    }

    abstract class Align extends JsEnum {
        public static final Align SVG_PRESERVEASPECTRATIO_NONE = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_NONE");


        public static final Align SVG_PRESERVEASPECTRATIO_UNKNOWN = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_UNKNOWN");


        public static final Align SVG_PRESERVEASPECTRATIO_XMAXYMAX = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMAXYMAX");


        public static final Align SVG_PRESERVEASPECTRATIO_XMAXYMID = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMAXYMID");


        public static final Align SVG_PRESERVEASPECTRATIO_XMAXYMIN = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMAXYMIN");


        public static final Align SVG_PRESERVEASPECTRATIO_XMIDYMAX = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMIDYMAX");


        public static final Align SVG_PRESERVEASPECTRATIO_XMIDYMID = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMIDYMID");


        public static final Align SVG_PRESERVEASPECTRATIO_XMIDYMIN = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMIDYMIN");


        public static final Align SVG_PRESERVEASPECTRATIO_XMINYMAX = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMINYMAX");


        public static final Align SVG_PRESERVEASPECTRATIO_XMINYMID = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMINYMID");


        public static final Align SVG_PRESERVEASPECTRATIO_XMINYMIN = JsEnum.from("SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMINYMIN");
    }

}
