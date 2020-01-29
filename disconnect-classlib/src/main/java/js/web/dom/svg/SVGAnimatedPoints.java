package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGAnimatedPoints extends Any {
        @JSProperty
        SVGPointList getAnimatedPoints();

        @JSProperty
        SVGPointList getPoints();

        }
