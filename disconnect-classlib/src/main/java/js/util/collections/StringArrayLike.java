package js.util.collections;

import js.lang.Any;
import js.util.iterable.StringIterableIterable;
import org.teavm.jso.JSIndexer;


public interface StringArrayLike extends StringIterableIterable, Any {
    /**
     * Gets the length of the array. This is a number one higher than the highest element defined in an array.
     */
     int getLength();

    @JSIndexer
     String get(int n);
}
