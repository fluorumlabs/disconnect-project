package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface NavigatorPlugins extends Any {
        @JSProperty
        MimeTypeArray getMimeTypes();

        @JSProperty
        PluginArray getPlugins();

        boolean javaEnabled();
        }
