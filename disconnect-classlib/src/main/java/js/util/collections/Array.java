package js.util.collections;

import js.lang.Any;
import js.util.function.JsComparator;
import js.util.iterable.JsIterable;
import org.teavm.jso.*;

import javax.annotation.Nullable;


public interface Array<T extends Any> extends ReadonlyArray<T> {
    @JSBody(script = "return []")
    static <T extends Any> Array<T> create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "arrayLength", script = "return new Array(arrayLength)")
    static <T extends Any> Array<T> create(int arrayLength) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "arrayLength", script = "return Array.apply(null, items)")
    static <T extends Any> Array<T> create(@JSByRef T... items) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Array.prototype")
    static Array<?> prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates an array from an array-like object.
     *
     * @param arrayLike An array-like object to convert to an array.
     */
    @JSBody(params = "arrayLike", script = "return Array.from(arrayLike)")
    static <T extends Any> Array<T> from(ArrayLike<T> arrayLike) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates an array from an iterable object.
     *
     * @param iterable An iterable object to convert to an array.
     */
    @JSBody(params = "iterable", script = "return Array.from(iterable)")
    static <T extends Any> Array<T> from(JsIterable<T> iterable) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates an array from an iterable object.
     *
     * @param arrayLike An array-like object to convert to an array.
     * @param mapfn     A mapping function to call on every element of the array.
     * @param thisArg   Value of 'this' used to invoke the mapfn.
     */
    @JSBody(params = {"arrayLike", "mapfn"}, script = "return Array.from(arrayLike, mapfn)")
    static <T extends Any, U extends Any> Array<U> from(ArrayLike<T> arrayLike, MapFunction<T, U> mapfn) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Creates an array from an iterable object.
     *
     * @param iterable An iterable object to convert to an array.
     * @param mapfn    A mapping function to call on every element of the array.
     * @param thisArg  Value of 'this' used to invoke the mapfn.
     */
    @JSBody(params = {"iterable", "mapfn"}, script = "return Array.from(iterable, mapfn)")
    static <T extends Any, U extends Any> Array<U> from(JsIterable<T> iterable, MapFunction<T, U> mapfn) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns a new array from a set of elements.
     *
     * @param items A set of elements to include in the new array object.
     */
    @JSBody(params = "items", script = "return Array.of.apply(Array, arrayLike)")
    static <T extends Any> Array<T> of(@JSByRef T... items) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Removes the last element from an array and returns it.
     */
    @Nullable
    T pop();

    /**
     * Appends new elements to an array, and returns the new length of the array.
     *
     * @param items New elements of the Array.
     */
    @JSBody(params = "items", script = "return this.push.apply(this, items)")
    int push(@JSByRef T... items);

    /**
     * Reverses the elements in an Array.
     */
    Array<T> reverse();

    /**
     * Removes the first element from an array and returns it.
     */
    @Nullable
    T shift();

    /**
     * Sorts an array.
     *
     * @param compareFn Function used to determine the order of the elements. It is expected to return
     *                  a negative value if first argument is less than second argument, zero if they're equal and a positive
     *                  value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
     *                  ```ts
     *                  [11,2,22,1].sort((a, b) => a - b)
     *                  ```
     */
    Array<T> sort(JsComparator<T> compareFn);

    Array<T> sort();

    /**
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     *
     * @param start       The zero-based location in the array from which to start removing elements.
     * @param deleteCount The number of elements to remove.
     */
    Array<T> splice(int start, int deleteCount);

    Array<T> splice(int start);

    /**
     * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
     *
     * @param start       The zero-based location in the array from which to start removing elements.
     * @param deleteCount The number of elements to remove.
     * @param items       Elements to insert into the array in place of the deleted elements.
     */
    @JSBody(params = {"start", "deleteCount", "items"}, script = "return this.splice.apply(this, [start, deleteCount].concat(items))")
    Array<T> splice(int start, int deleteCount, @JSByRef T... items);

    /**
     * Inserts new elements at the start of an array.
     *
     * @param items Elements to insert at the start of the Array.
     */
    @JSBody(params = "items", script = "return this.unshift.apply(this, items)")
    int unshift(@JSByRef T... items);

    @JSBody(script = "return this")
    T[] asArray();

    @JSIndexer
    void set(int n, T value);

    /**
     * Returns the this object after filling the section identified by start and end with value
     *
     * @param value value to fill array section with
     * @param start index to start filling the array at. If start is negative, it is treated as
     *              length+start where length is the length of the array.
     * @param end   index to stop filling the array at. If end is negative, it is treated as
     *              length+end.
     */
    Array<T> fill(T value, int start, int end);

    Array<T> fill(T value, int start);

    Array<T> fill(T value);

    /**
     * Returns the this object after copying a section of the array identified by start and end
     * to the same array starting at position target
     *
     * @param target If target is negative, it is treated as length+target where length is the
     *               length of the array.
     * @param start  If start is negative, it is treated as length+start. If end is negative, it
     *               is treated as length+end.
     * @param end    If not specified, length of the this object is used as its default value.
     */
    Array<T> copyWithin(int target, int start, int end);

    Array<T> copyWithin(int target, int start);

    @JSFunctor
    @FunctionalInterface
    interface MapFunction<T extends Any, U extends Any> extends JSObject {
        U map(T v, int k);
    }
}
