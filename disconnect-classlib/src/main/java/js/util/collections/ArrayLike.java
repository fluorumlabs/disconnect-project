package js.util.collections;

import js.lang.Any;
import js.util.iterable.IterableIterable;
import org.teavm.jso.JSIndexer;


public interface ArrayLike<T extends Any> extends IterableIterable<T>, Any {
    /**
     * Gets the length of the array. This is a number one higher than the highest element defined in an array.
     */
     int getLength();

    @JSIndexer
     T get(int n);
}
