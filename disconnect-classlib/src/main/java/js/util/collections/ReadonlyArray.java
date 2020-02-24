package js.util.collections;

import js.lang.Any;
import js.util.function.ArrayReducer;
import js.util.function.IntKeyConsumer;
import js.util.function.IntKeyFunction;
import js.util.function.IntKeyPredicate;
import js.util.iterable.IntIterableIterator;
import js.util.iterable.IterableIterator;
import js.util.iterable.JsIterable;
import org.teavm.jso.JSBody;

import java.util.RandomAccess;


/**
 * The interface Readonly array.
 *
 * @param <T> the type parameter
 */
public interface ReadonlyArray<T extends Any> extends ConcatArray<T>, RandomAccess {
    /**
     * Returns a string representation of an array.
     */
    String toString();

    /**
     * Returns a string representation of an array. The elements are converted to string using their toLocalString
     * methods.
     *
     * @return the string
     */
    String toLocaleString();

    /**
     * Combines two or more arrays.
     *
     * @param items Additional items to add to the end of array1.
     *
     * @return the array
     */
    @JSBody(params = "items", script = "return this.concat.apply(this, items)")
    Array<T> concat(ConcatArray<T>... items);

    /**
     * Combines two or more arrays.
     *
     * @param items Additional items to add to the end of array1.
     *
     * @return the array
     */
    @JSBody(params = "items", script = "return this.concat.apply(this, items)")
    Array<T> concat(T... items);

    /**
     * Returns the index of the first occurrence of a value in an array.
     *
     * @param searchElement The value to locate in the array.
     * @param fromIndex     The array index at which to begin the search. If fromIndex is omitted, the search starts at
     *                      index 0.
     *
     * @return the int
     */
    int indexOf(T searchElement, int fromIndex);

    /**
     * Index of int.
     *
     * @param searchElement the search element
     *
     * @return the int
     */
    int indexOf(T searchElement);

    /**
     * Returns the index of the last occurrence of a specified value in an array.
     *
     * @param searchElement The value to locate in the array.
     * @param fromIndex     The array index at which to begin the search. If fromIndex is omitted, the search starts at
     *                      the last index in the array.
     *
     * @return the int
     */
    int lastIndexOf(T searchElement, int fromIndex);

    /**
     * Last index of int.
     *
     * @param searchElement the search element
     *
     * @return the int
     */
    int lastIndexOf(T searchElement);

    /**
     * Determines whether all the members of an array satisfy the specified test.
     *
     * @param callbackfn A function that accepts up to three arguments. The every method calls                   the
     *                   callbackfn function for each element in the array until the callbackfn returns a value
     *                   which is coercible to the Boolean value false, or until the end of the array.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function.                   If
     *                   thisArg is omitted, undefined is used as the this value.
     *
     * @return the boolean
     */
    boolean every(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn, Any thisArg);

    /**
     * Every boolean.
     *
     * @param callbackfn the callbackfn
     *
     * @return the boolean
     */
    boolean every(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn);

    /**
     * Determines whether the specified callback function returns true for any element of an array.
     *
     * @param callbackfn A function that accepts up to three arguments. The some method calls                   the
     *                   callbackfn function for each element in the array until the callbackfn returns a value
     *                   which is coercible to the Boolean value true, or until the end of the array.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function.                   If
     *                   thisArg is omitted, undefined is used as the this value.
     *
     * @return the boolean
     */
    boolean some(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn, Any thisArg);

    /**
     * Some boolean.
     *
     * @param callbackfn the callbackfn
     *
     * @return the boolean
     */
    boolean some(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn);

    /**
     * Performs the specified action for each element in an array.
     *
     * @param callbackfn A function that accepts up to three arguments. forEach calls the callbackfn function one
     *                   time for each element in the array.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function. If thisArg is
     *                   omitted, undefined is used as the this value.
     */
    void forEach(IntKeyConsumer<T, ReadonlyArray<T>> callbackfn, Any thisArg);

    /**
     * For each.
     *
     * @param callbackfn the callbackfn
     */
    void forEach(IntKeyConsumer<T, ReadonlyArray<T>> callbackfn);

    /**
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     *
     * @param <U>        the type parameter
     * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function
     *                   one time for each element in the array.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function. If thisArg is
     *                   omitted, undefined is used as the this value.
     *
     * @return the readonly array
     */
    <U extends Any> ReadonlyArray<U> map(IntKeyFunction<T, U, ReadonlyArray<T>> callbackfn, Any thisArg);

    /**
     * Map readonly array.
     *
     * @param <U>        the type parameter
     * @param callbackfn the callbackfn
     *
     * @return the readonly array
     */
    <U extends Any> ReadonlyArray<U> map(IntKeyFunction<T, U, ReadonlyArray<T>> callbackfn);

    /**
     * Returns the elements of an array that meet the condition specified in a callback function.
     *
     * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn
     *                   function one time for each element in the array.
     * @param thisArg    An object to which the this keyword can refer in the callbackfn function. If thisArg is
     *                   omitted, undefined is used as the this value.
     *
     * @return the readonly array
     */
    ReadonlyArray<T> filter(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn, Any thisArg);

    /**
     * Filter readonly array.
     *
     * @param callbackfn the callbackfn
     *
     * @return the readonly array
     */
    ReadonlyArray<T> filter(IntKeyPredicate<T, ReadonlyArray<T>> callbackfn);

    /**
     * Calls the specified callback function for all the elements in an array. The return value of the callback
     * function is the accumulated result, and is provided as an argument in the next call to the callback function.
     *
     * @param <U>          the type parameter
     * @param callbackfn   A function that accepts up to four arguments. The reduce method calls the callbackfn
     *                     function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
     *                     The first call to the callbackfn function provides this value as an argument instead of an
     *                     array value.
     *
     * @return the u
     */
    <U extends Any> U reduce(ArrayReducer<T, U, ReadonlyArray<T>> callbackfn, U initialValue);

    /**
     * Reduce t.
     *
     * @param callbackfn the callbackfn
     *
     * @return the t
     */
    T reduce(ArrayReducer<T, T, ReadonlyArray<T>> callbackfn);

    /**
     * Calls the specified callback function for all the elements in an array, in descending order. The return value
     * of the callback function is the accumulated result, and is provided as an argument in the next call to the
     * callback function.
     *
     * @param <U>          the type parameter
     * @param callbackfn   A function that accepts up to four arguments. The reduceRight method calls the callbackfn
     *                     function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation.
     *                     The first call to the callbackfn function provides this value as an argument instead of an
     *                     array value.
     *
     * @return the u
     */
    <U extends Any> U reduceRight(ArrayReducer<T, U, ReadonlyArray<T>> callbackfn, U initialValue);

    /**
     * Reduce right t.
     *
     * @param callbackfn the callbackfn
     *
     * @return the t
     */
    T reduceRight(ArrayReducer<T, T, ReadonlyArray<T>> callbackfn);

    /**
     * Returns the value of the first element in the array where predicate is true, and undefined
     * otherwise.
     *
     * @param <S>       the type parameter
     * @param predicate find calls predicate once for each element of the array, in ascending                  order,
     *                  until it finds one where predicate returns true. If such an element is found, find
     *                  immediately returns that element value. Otherwise, find returns undefined.
     *
     * @return the s
     */
    <S extends T> S find(IntKeyPredicate<T, ReadonlyArray<T>> predicate);

    /**
     * Returns the index of the first element in the array where predicate is true, and -1
     * otherwise.
     *
     * @param predicate find calls predicate once for each element of the array, in ascending                  order,
     *                  until it finds one where predicate returns true. If such an element is found,
     *                  findIndex immediately returns that element index. Otherwise, findIndex returns -1.
     *
     * @return the int
     */
    int findIndex(IntKeyPredicate<T, ReadonlyArray<T>> predicate);

    /**
     * Returns an iterable of key, value pairs for every entry in the array
     *
     * @return the js iterable
     */
    JsIterable<IntKeyValue<T>> entries();

    /**
     * Returns an iterable of keys in the array
     *
     * @return the int iterable iterator
     */
    IntIterableIterator keys();

    /**
     * Returns an iterable of values in the array
     *
     * @return the iterable iterator
     */
    IterableIterator<T> values();


}
