package js.util.collections;

import js.lang.Any;
import js.util.function.AnyKeyConsumer;
import js.util.iterable.IterableIterator;
import org.teavm.jso.JSProperty;


public interface ReadonlyMap<K extends Any, V extends Any> extends IterableIterator<KeyValue<K, V>>, Any {
    void forEach(AnyKeyConsumer<V, K, ReadonlyMap<K, V>> callbackfn);

    V get(K key);

    boolean has(K key);

    @JSProperty
    int getSize();

    /**
     * Returns an iterable of key, value pairs for every entry in the map.
     */
    IterableIterator<KeyValue<K, V>> entries();

    /**
     * Returns an iterable of keys in the map
     */
    IterableIterator<K> keys();

    /**
     * Returns an iterable of values in the map
     */
    IterableIterator<V> values();
}
