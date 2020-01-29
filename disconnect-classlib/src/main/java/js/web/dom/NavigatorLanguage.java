package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorLanguage extends Any {
    @JSProperty
    String getLanguage();

    @JSProperty
    String[] getLanguages();
}
