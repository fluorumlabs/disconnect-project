package js.util.collections;

import js.lang.Any;
import js.util.iterable.IterableIterable;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;


/**
 * The interface Array like.
 *
 * @param <T> the type parameter
 */
public interface ArrayLike<T extends Any> extends IterableIterable<T>, Any {
    /**
     * Gets the length of the array. This is a number one higher than the highest element defined in an array.
     *
     * @return the length
     */
    @JSProperty
    int getLength();

    /**
     * Get t.
     *
     * @param n the n
     *
     * @return the t
     */
    @JSIndexer
    T get(int n);
}
