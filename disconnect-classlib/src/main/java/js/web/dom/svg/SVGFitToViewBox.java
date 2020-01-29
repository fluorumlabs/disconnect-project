package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGFitToViewBox extends Any {
        @JSProperty
        SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

        @JSProperty
        SVGAnimatedRect getViewBox();

        }
