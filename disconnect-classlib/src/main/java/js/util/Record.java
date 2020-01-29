package js.util;

import js.lang.Any;
import org.teavm.jso.JSIndexer;


public interface Record<V extends Any> extends Any {
    @JSIndexer
    V get(String key);

    @JSIndexer
    void set(String key, V value);
}
