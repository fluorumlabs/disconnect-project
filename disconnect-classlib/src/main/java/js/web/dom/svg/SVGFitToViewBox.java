package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface SVGFitToViewBox extends Any {
    @JSProperty
    SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    @JSProperty
    SVGAnimatedRect getViewBox();

}
