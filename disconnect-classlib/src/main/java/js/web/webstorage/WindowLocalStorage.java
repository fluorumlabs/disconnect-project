package js.web.webstorage;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface WindowLocalStorage extends Any {
        @JSProperty
        Storage getLocalStorage();

        }
