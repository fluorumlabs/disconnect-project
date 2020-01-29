package js.web.dom.svg;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface SVGTests extends Any {
    @JSProperty
    SVGStringList getRequiredExtensions();

    @JSProperty
    SVGStringList getSystemLanguage();

}
