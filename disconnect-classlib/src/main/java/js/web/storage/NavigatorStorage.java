package js.web.storage;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface NavigatorStorage extends Any {
    @JSProperty
    StorageManager getStorage();

}
