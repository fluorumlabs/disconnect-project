package js.util.collections;

import js.lang.Any;
import js.util.function.StringKeyConsumer;
import js.util.iterable.IterableIterator;
import js.util.iterable.StringIterableIterator;
import org.teavm.jso.JSProperty;


public interface ReadonlyStringMap<V extends Any> extends IterableIterator<StringKeyValue<V>>, Any {
     void forEach(StringKeyConsumer<V, ReadonlyStringMap<V>> callbackfn);
     V get(String key);
     boolean has(String key);

    @JSProperty
     int getSize();

    /**
     * Returns an iterable of key, value pairs for every entry in the map.
     */
     IterableIterator<StringKeyValue<V>> entries();

    /**
     * Returns an iterable of keys in the map
     */
     StringIterableIterator keys();

    /**
     * Returns an iterable of values in the map
     */
     IterableIterator<V> values();
}
