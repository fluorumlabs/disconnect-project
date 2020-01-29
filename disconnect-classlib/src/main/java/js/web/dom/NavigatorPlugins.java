package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorPlugins extends Any {
    @JSProperty
    MimeTypeArray getMimeTypes();

    @JSProperty
    PluginArray getPlugins();

    boolean javaEnabled();
}
