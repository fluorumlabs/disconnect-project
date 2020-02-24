package js.util.collections;

import js.lang.Any;


/**
 * The interface Concat array.
 *
 * @param <T> the type parameter
 */
public interface ConcatArray<T extends Any> extends ArrayLike<T> {
    /**
     * Adds all the elements of an array separated by the specified separator string.
     *
     * @param separator A string used to separate one element of an array from the next in the resulting String. If
     *                  omitted, the array elements are separated with a comma.
     *
     * @return the string
     */
    String join(String separator);

    /**
     * Join string.
     *
     * @return the string
     */
    String join();

    /**
     * Returns a section of an array.
     *
     * @param start The beginning of the specified portion of the array.
     * @param end   The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
     *
     * @return the array
     */
    Array<T> slice(int start, int end);

    /**
     * Slice array.
     *
     * @param start the start
     *
     * @return the array
     */
    Array<T> slice(int start);

    /**
     * Slice array.
     *
     * @return the array
     */
    Array<T> slice();
}
