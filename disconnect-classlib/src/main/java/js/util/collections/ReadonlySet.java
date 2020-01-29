package js.util.collections;

import js.lang.Any;
import js.util.function.AnyKeyConsumer;
import js.util.iterable.IterableIterator;
import org.teavm.jso.JSProperty;


public interface ReadonlySet<T extends Any> extends IterableIterator<KeyValue<T, T>>, Any {
     void forEach(AnyKeyConsumer<T,T,ReadonlySet<T>> callbackfn);
     boolean has(T value);
    @JSProperty
     double getSize();

    /**
     * Returns an iterable of [v,v] pairs for every value `v` in the set.
     */
     IterableIterator<KeyValue<T,T>> entries();
    /**
     * Despite its name, returns an iterable of the values in the set,
     */
     IterableIterator<T> keys();

    /**
     * Returns an iterable of values in the set.
     */
     IterableIterator<T> values();

}
