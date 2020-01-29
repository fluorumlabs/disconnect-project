package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface SVGAnimatedPoints extends Any {
    @JSProperty
    SVGPointList getAnimatedPoints();

    @JSProperty
    SVGPointList getPoints();

}
