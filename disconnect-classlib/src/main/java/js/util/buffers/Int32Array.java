package js.util.buffers;

import js.lang.Any;
import js.lang.JsNumber;
import js.util.collections.ArrayLike;
import js.util.collections.IntPair;
import js.util.iterable.IntIterable;
import js.util.iterable.IntIterableIterable;
import js.util.iterable.IntIterableIterator;
import js.util.iterable.IterableIterator;
import org.teavm.jso.*;

import javax.annotation.Nullable;

/**
 * A typed array of 32-bit signed integer values. The contents are initialized to 0. If the requested number
 * of bytes could not be allocated an exception is raised.
 */
public interface Int32Array extends IntIterableIterable, ArrayBufferView, Any {
	/**
	 * The constant BYTES_PER_ELEMENT.
	 */
	int BYTES_PER_ELEMENT = _BYTES_PER_ELEMENT();

	/**
	 * Prototype int 32 array.
	 *
	 * @return the int 32 array
	 */
	@JSBody(script = "return Int32Array.prototype")
    static Int32Array prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create int 32 array.
	 *
	 * @param length the length
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "length", script = "return new Int32Array(length)")
    static Int32Array create(int length) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create int 32 array.
	 *
	 * @param arrayOrArrayBuffer the array or array buffer
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "arrayOrArrayBuffer", script = "return new Int32Array(arrayOrArrayBuffer)")
    static Int32Array create(ArrayLike<JsNumber> arrayOrArrayBuffer) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create int 32 array.
	 *
	 * @param arrayOrArrayBuffer the array or array buffer
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "arrayOrArrayBuffer", script = "return new Int32Array(arrayOrArrayBuffer)")
    static Int32Array create(ArrayBuffer arrayOrArrayBuffer) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Create int 32 array.
	 *
	 * @param buffer     the buffer
	 * @param byteOffset the byte offset
	 * @param length     the length
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = {"buffer", "byteOffset", "length"}, script = "return new Int32Array(buffer, byteOffset, length)")
    static Int32Array create(ArrayBuffer buffer, int byteOffset, int length) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * The size in bytes of each element in the array.
	 *
	 * @return the int
	 */
	@JSBody(script = "return Int32Array.BYTES_PER_ELEMENT")
    static int _BYTES_PER_ELEMENT() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Returns a new array from a set of elements.
	 *
	 * @param items A set of elements to include in the new array object.
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "items", script = "return Int32Array.of.apply(Int32Array, items)")
    static Int32Array of(int... items) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates an array from an array-like or iterable object.
	 *
	 * @param arrayLike An array-like or iterable object to convert to an array.
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "arrayLike", script = "return Int32Array.from(arrayLike)")
    static Int32Array from(ArrayLike<JsNumber> arrayLike) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * From int 32 array.
	 *
	 * @param arrayLike the array like
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = "arrayLike", script = "return Int32Array.from(arrayLike)")
    static Int32Array from(IntIterable arrayLike) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * Creates an array from an array-like or iterable object.
	 *
	 * @param <T>       the type parameter
	 * @param arrayLike An array-like or iterable object to convert to an array.
	 * @param mapfn     A mapping function to call on every element of the array.
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = {"arrayLike", "mapfn"}, script = "return Int32Array.from(arrayLike, mapfn)")
    static <T extends Any> Int32Array from(ArrayLike<T> arrayLike, Mapper<T> mapfn) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * From int 32 array.
	 *
	 * @param arrayLike the array like
	 * @param mapfn     the mapfn
	 *
	 * @return the int 32 array
	 */
	@JSBody(params = {"arrayLike", "mapfn"}, script = "return Float32Array.from(arrayLike, mapfn)")
    static Int32Array from(IntIterable arrayLike, IntMapper mapfn) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

	/**
	 * The size in bytes of each element in the array.
	 *
	 * @return the int
	 */
	@JSBody(script = "return this.BYTES_PER_ELEMENT")
    int BYTES_PER_ELEMENT();

    /**
     * The ArrayBuffer instance referenced by the array.
     */
    @JSProperty
    ArrayBuffer getBuffer();

    /**
     * The length in bytes of the array.
     */
    @JSProperty
    int getByteLength();

    /**
     * The offset in bytes of the array.
     */
    @JSProperty
    int getByteOffset();

	/**
	 * Returns the this object after copying a section of the array identified by start and end
	 * to the same array starting at position target
	 *
	 * @param target If target is negative, it is treated as length+target where length is the               length of
	 *                 the array.
	 * @param start  If start is negative, it is treated as length+start. If end is negative, it               is
	 *                  treated as length+end.
	 * @param end    If not specified, length of the this object is used as its default value.
	 *
	 * @return the int 32 array
	 */
	Int32Array copyWithin(int target, int start, int end);

	/**
	 * Copy within int 32 array.
	 *
	 * @param target the target
	 * @param start  the start
	 *
	 * @return the int 32 array
	 */
	Int32Array copyWithin(int target, int start);

	/**
	 * Determines whether all the members of an array satisfy the specified test.
	 *
	 * @param callbackfn A function that accepts up to three arguments. The every method calls                   the
	 *                      callbackfn function for each element in the array until the callbackfn returns a value
	 *                      which is coercible to the Boolean value false, or until the end of the array.
	 *
	 * @return the boolean
	 */
	boolean every(Predicate callbackfn);

	/**
	 * Returns the this object after filling the section identified by start and end with value
	 *
	 * @param value value to fill array section with
	 * @param start index to start filling the array at. If start is negative, it is treated as
	 *                 length+start where length is the length of the array.
	 * @param end   index to stop filling the array at. If end is negative, it is treated as              length+end.
	 *
	 * @return the int 32 array
	 */
	Int32Array fill(int value, int start, int end);

	/**
	 * Fill int 32 array.
	 *
	 * @param value the value
	 * @param start the start
	 *
	 * @return the int 32 array
	 */
	Int32Array fill(int value, int start);

	/**
	 * Fill int 32 array.
	 *
	 * @param value the value
	 *
	 * @return the int 32 array
	 */
	Int32Array fill(int value);

	/**
	 * Returns the elements of an array that meet the condition specified in a callback function.
	 *
	 * @param callbackfn A function that accepts up to three arguments. The filter method calls                   the
	 *                      callbackfn function one time for each element in the array.
	 *
	 * @return the int 32 array
	 */
	Int32Array filter(Predicate callbackfn);

	/**
	 * Returns the value of the first element in the array where predicate is true, and undefined
	 * otherwise.
	 *
	 * @param predicate find calls predicate once for each element of the array, in ascending                  order,
	 *                     until it finds one where predicate returns true. If such an element is found, find
	 *                     immediately returns that element value. Otherwise, find returns undefined.
	 *
	 * @return the js number
	 */
	@Nullable
    JsNumber find(Predicate predicate);

	/**
	 * Returns the index of the first element in the array where predicate is true, and -1
	 * otherwise.
	 *
	 * @param predicate find calls predicate once for each element of the array, in ascending                  order,
	 *                     until it finds one where predicate returns true. If such an element is found,
	 *                     findIndex immediately returns that element index. Otherwise, findIndex returns -1.
	 *
	 * @return the int
	 */
	int findIndex(Predicate predicate);

	/**
	 * Performs the specified action for each element in an array.
	 *
	 * @param callbackfn A function that accepts up to three arguments. forEach calls the                   callbackfn
	 *                     function one time for each element in the array.
	 */
	void forEach(Consumer callbackfn);

	/**
	 * Returns the index of the first occurrence of a value in an array.
	 *
	 * @param searchElement The value to locate in the array.
	 * @param fromIndex     The array index at which to begin the search. If fromIndex is omitted, the
	 *                   search starts at index 0.
	 *
	 * @return the int
	 */
	int indexOf(int searchElement, int fromIndex);

	/**
	 * Index of int.
	 *
	 * @param searchElement the search element
	 *
	 * @return the int
	 */
	int indexOf(int searchElement);

	/**
	 * Adds all the elements of an array separated by the specified separator string.
	 *
	 * @param separator A string used to separate one element of an array from the next in the
	 *                     resulting String. If omitted, the array elements are separated with a comma.
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
	 * Returns the index of the last occurrence of a value in an array.
	 *
	 * @param searchElement The value to locate in the array.
	 * @param fromIndex     The array index at which to begin the search. If fromIndex is omitted, the
	 *                   search starts at index 0.
	 *
	 * @return the int
	 */
	int lastIndexOf(int searchElement, int fromIndex);

	/**
	 * Last index of int.
	 *
	 * @param searchElement the search element
	 *
	 * @return the int
	 */
	int lastIndexOf(int searchElement);

	/**
	 * The length of the array.
	 *
	 * @return the length
	 */
	@JSProperty
    int getLength();

	/**
	 * Calls a defined callback function on each element of an array, and returns an array that
	 * contains the results.
	 *
	 * @param callbackfn A function that accepts up to three arguments. The map method calls the
	 *                      callbackfn function one time for each element in the array.
	 *
	 * @return the int 32 array
	 */
	Int32Array map(Function callbackfn);

	/**
	 * Calls the specified callback function for all the elements in an array. The return value of
	 * the callback function is the accumulated result, and is provided as an argument in the next
	 * call to the callback function.
	 *
	 * @param callbackfn   A function that accepts up to four arguments. The reduce method calls the
	 *                     callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified, it is used as the initial value to start
	 *                        the accumulation. The first call to the callbackfn function provides this value as an
	 *                        argument                     instead of an array value.
	 *
	 * @return the int
	 */
	int reduce(Reducer callbackfn, int initialValue);

	/**
	 * Reduce int.
	 *
	 * @param callbackfn the callbackfn
	 *
	 * @return the int
	 */
	int reduce(Reducer callbackfn);

	/**
	 * Calls the specified callback function for all the elements in an array. The return value of
	 * the callback function is the accumulated result, and is provided as an argument in the next
	 * call to the callback function.
	 *
	 * @param <R>          the type parameter
	 * @param callbackfn   A function that accepts up to four arguments. The reduce method calls the
	 *                     callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified, it is used as the initial value to start
	 *                        the accumulation. The first call to the callbackfn function provides this value as an
	 *                        argument                     instead of an array value.
	 *
	 * @return the r
	 */
	<R extends Any> R reduce(TReducer<R> callbackfn, R initialValue);

	/**
	 * Calls the specified callback function for all the elements in an array, in descending order.
	 * The return value of the callback function is the accumulated result, and is provided as an
	 * argument in the next call to the callback function.
	 *
	 * @param callbackfn   A function that accepts up to four arguments. The reduceRight method calls
	 *                    the callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified, it is used as the initial value to start
	 *                        the accumulation. The first call to the callbackfn function provides this value as an
	 *                        argument instead of an array value.
	 *
	 * @return the int
	 */
	int reduceRight(Reducer callbackfn, int initialValue);

	/**
	 * Reduce right int.
	 *
	 * @param callbackfn the callbackfn
	 *
	 * @return the int
	 */
	int reduceRight(Reducer callbackfn);

	/**
	 * Calls the specified callback function for all the elements in an array, in descending order.
	 * The return value of the callback function is the accumulated result, and is provided as an
	 * argument in the next call to the callback function.
	 *
	 * @param <R>          the type parameter
	 * @param callbackfn   A function that accepts up to four arguments. The reduceRight method calls
	 *                    the callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified, it is used as the initial value to start
	 *                        the accumulation. The first call to the callbackfn function provides this value as an
	 *                        argument                     instead of an array value.
	 *
	 * @return the r
	 */
	<R extends Any> R reduceRight(TReducer<R> callbackfn, R initialValue);

	/**
	 * Reverses the elements in an Array.
	 *
	 * @return the int 32 array
	 */
	Int32Array reverse();

	/**
	 * Sets a value or an array of values.
	 *
	 * @param array  A typed or untyped array of values to set.
	 * @param offset The index in the current array at which the values are to be written.
	 */
	void set(ArrayLike<JsNumber> array, int offset);

	/**
	 * Set.
	 *
	 * @param array the array
	 */
	void set(ArrayLike<JsNumber> array);

	/**
	 * Returns a section of an array.
	 *
	 * @param start The beginning of the specified portion of the array.
	 * @param end   The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
	 *
	 * @return the int 32 array
	 */
	Int32Array slice(int start, int end);

	/**
	 * Determines whether the specified callback function returns true for any element of an array.
	 *
	 * @param callbackfn A function that accepts up to three arguments. The some method calls                   the
	 *                      callbackfn function for each element in the array until the callbackfn returns a value
	 *                      which is coercible to the Boolean value true, or until the end of the array.
	 *
	 * @return the boolean
	 */
	boolean some(Predicate callbackfn);

	/**
	 * Sorts an array.
	 *
	 * @param compareFn Function used to determine the order of the elements. It is expected to return
	 *                   a negative value if first argument is less than second argument, zero if they're equal and a
	 *                   positive                  value otherwise. If omitted, the elements are sorted in ascending,
	 *                   ASCII character order.                  ```ts
	 *                   b)                  ```
	 *
	 * @return the int 32 array
	 */
	Int32Array sort(Comparator compareFn);

	/**
	 * Gets a new view of the ArrayBuffer store for this array, referencing the elements
	 * at begin, inclusive, up to end, exclusive.
	 *
	 * @param begin The index of the beginning of the array.
	 * @param end   The index of the end of the array.
	 *
	 * @return the int 32 array
	 */
	Int32Array subarray(int begin, int end);

	/**
	 * Subarray int 32 array.
	 *
	 * @param begin the begin
	 *
	 * @return the int 32 array
	 */
	Int32Array subarray(int begin);

	/**
	 * Subarray int 32 array.
	 *
	 * @return the int 32 array
	 */
	Int32Array subarray();

	/**
	 * Converts a number to a string by using the current locale.
	 *
	 * @return the string
	 */
	String toLocaleString();

    /**
     * Returns a string representation of an array.
     */
    String toString();

	/**
	 * Get int.
	 *
	 * @param index the index
	 *
	 * @return the int
	 */
	@JSIndexer
    int get(int index);

	/**
	 * Set.
	 *
	 * @param index the index
	 * @param value the value
	 */
	@JSIndexer
    void set(int index, int value);

	/**
	 * Entries iterable iterator.
	 *
	 * @return the iterable iterator
	 */
	IterableIterator<IntPair> entries();

	/**
	 * Returns an list of keys in the array
	 *
	 * @return the int iterable iterator
	 */
	IntIterableIterator keys();

	/**
	 * Returns an list of values in the array
	 *
	 * @return the int iterable iterator
	 */
	IntIterableIterator values();


	/**
	 * The interface Mapper.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    interface Mapper<T extends Any> extends JSObject {
		/**
		 * Map int.
		 *
		 * @param v the v
		 * @param k the k
		 *
		 * @return the int
		 */
		int map(T v, int k);
    }

	/**
	 * The interface Int mapper.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    interface IntMapper<T extends Any> extends JSObject {
		/**
		 * Map int.
		 *
		 * @param v the v
		 * @param k the k
		 *
		 * @return the int
		 */
		int map(int v, int k);
    }


	/**
	 * The interface Consumer.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Consumer extends JSObject {
		/**
		 * Accept.
		 *
		 * @param value the value
		 * @param index the index
		 * @param array the array
		 */
		void accept(int value, int index, Int32Array array);
    }


	/**
	 * The interface Function.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Function extends JSObject {
		/**
		 * Accept int.
		 *
		 * @param value the value
		 * @param index the index
		 * @param array the array
		 *
		 * @return the int
		 */
		int accept(int value, int index, Int32Array array);
    }


	/**
	 * The interface Predicate.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Predicate extends JSObject {
		/**
		 * Test boolean.
		 *
		 * @param value the value
		 * @param index the index
		 * @param array the array
		 *
		 * @return the boolean
		 */
		boolean test(int value, int index, Int32Array array);
    }


	/**
	 * The interface Reducer.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Reducer extends JSObject {
		/**
		 * Reduce int.
		 *
		 * @param previousValue the previous value
		 * @param currentValue  the current value
		 * @param currentIndex  the current index
		 * @param array         the array
		 *
		 * @return the int
		 */
		int reduce(int previousValue, int currentValue, int currentIndex, Int32Array array);
    }


	/**
	 * The interface T reducer.
	 *
	 * @param <T> the type parameter
	 */
	@JSFunctor
    @FunctionalInterface
    interface TReducer<T extends Any> extends JSObject {
		/**
		 * Reduce t.
		 *
		 * @param previousValue the previous value
		 * @param currentValue  the current value
		 * @param currentIndex  the current index
		 * @param array         the array
		 *
		 * @return the t
		 */
		T reduce(T previousValue, int currentValue, int currentIndex, Int32Array array);
    }


	/**
	 * The interface Comparator.
	 */
	@JSFunctor
    @FunctionalInterface
    interface Comparator {
		/**
		 * Compare int.
		 *
		 * @param a the a
		 * @param b the b
		 *
		 * @return the int
		 */
		int compare(int a, int b);
    }

}
