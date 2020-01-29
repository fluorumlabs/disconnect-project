package js.web.webstorage;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface WindowSessionStorage extends Any {
        @JSProperty
        Storage getSessionStorage();

        }
