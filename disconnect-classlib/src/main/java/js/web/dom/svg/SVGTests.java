package js.web.dom.svg;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface SVGTests extends Any {
        @JSProperty
        SVGStringList getRequiredExtensions();

        @JSProperty
        SVGStringList getSystemLanguage();

        }
