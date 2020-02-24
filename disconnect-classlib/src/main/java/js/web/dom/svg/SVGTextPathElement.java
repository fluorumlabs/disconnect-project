package js.web.dom.svg;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Corresponds to the &lt;textPath&gt; element.
 */
public interface SVGTextPathElement extends SVGTextContentElement, SVGURIReference {
    @JSBody(script = "return SVGTextPathElement.prototype")
    static SVGTextPathElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new SVGTextPathElement()")
    static SVGTextPathElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    SVGAnimatedEnumeration<Method> getMethod();

    @JSProperty
    SVGAnimatedEnumeration<Spacing> getSpacing();

    @JSProperty
    SVGAnimatedLength getStartOffset();

    abstract class Method extends JsEnum {
        public static final Method TEXTPATH_METHODTYPE_ALIGN = JsEnum.from("SVGTextPathElement.TEXTPATH_METHODTYPE_ALIGN");


        public static final Method TEXTPATH_METHODTYPE_STRETCH = JsEnum.from("SVGTextPathElement.TEXTPATH_METHODTYPE_STRETCH");


        public static final Method TEXTPATH_METHODTYPE_UNKNOWN = JsEnum.from("SVGTextPathElement.TEXTPATH_METHODTYPE_UNKNOWN");
    }

    abstract class Spacing extends JsEnum {

        public static final Spacing TEXTPATH_SPACINGTYPE_AUTO = JsEnum.from("SVGTextPathElement.TEXTPATH_SPACINGTYPE_AUTO");


        public static final Spacing TEXTPATH_SPACINGTYPE_EXACT = JsEnum.from("SVGTextPathElement.TEXTPATH_SPACINGTYPE_EXACT");


        public static final Spacing TEXTPATH_SPACINGTYPE_UNKNOWN = JsEnum.from("SVGTextPathElement.TEXTPATH_SPACINGTYPE_UNKNOWN");
    }

}
