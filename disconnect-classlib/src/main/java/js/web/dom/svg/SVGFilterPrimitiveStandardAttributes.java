package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
