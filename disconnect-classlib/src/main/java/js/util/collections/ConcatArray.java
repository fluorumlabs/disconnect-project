package js.util.collections;

import js.lang.Any;


public interface ConcatArray<T extends Any> extends ArrayLike<T> {
    /**
     * Adds all the elements of an array separated by the specified separator string.
     * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
     */
     String join(String separator);
     String join();

    /**
     * Returns a section of an array.
     * @param start The beginning of the specified portion of the array.
     * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
     */
     Array<T> slice(int start, int end);
     Array<T> slice(int start);
     Array<T> slice();
}
