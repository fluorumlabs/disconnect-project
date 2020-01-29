package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface NavigatorLanguage extends Any {
        @JSProperty
        String getLanguage();

        @JSProperty
        String[] getLanguages();
        }
