package js.util;

import js.lang.Any;
import org.teavm.jso.JSIndexer;


public interface StringRecord extends Any {
    @JSIndexer
    String get(String key);

    @JSIndexer
    void set(String key, String value);
}
