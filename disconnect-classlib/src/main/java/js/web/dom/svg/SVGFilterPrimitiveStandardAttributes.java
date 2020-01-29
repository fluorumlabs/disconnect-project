package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface SVGFilterPrimitiveStandardAttributes extends Any {
    @JSProperty
    SVGAnimatedLength getHeight();

    @JSProperty
    SVGAnimatedString getResult();

    @JSProperty
    SVGAnimatedLength getWidth();

    @JSProperty
    SVGAnimatedLength getX();

    @JSProperty
    SVGAnimatedLength getY();

}
