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
import org.teavm.jso.JSByRef;

import java.util.RandomAccess;


public interface ReadonlyArray<T extends Any> extends ConcatArray<T>, RandomAccess {
    /**
     * Returns a string representation of an array.
     */
     String toString();
    /**
     * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
     */
     String toLocaleString();
    /**
     * Combines two or more arrays.
     * @param items Additional items to add to the end of array1.
     */
    @JSBody(params = "items", script = "return this.concat.apply(this, items)")
     ReadonlyArray<T> concat(@JSByRef ConcatArray<T>... items);
    /**
     * Combines two or more arrays.
     * @param items Additional items to add to the end of array1.
     */
    @JSBody(params = "items", script = "return this.concat.apply(this, items)")
     ReadonlyArray<T> concat(@JSByRef T... items);
    /**
     * Returns the index of the first occurrence of a value in an array.
     * @param searchElement The value to locate in the array.
     * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
     */
     int indexOf(T searchElement, int fromIndex);
     int indexOf(T searchElement);
    /**
     * Returns the index of the last occurrence of a specified value in an array.
     * @param searchElement The value to locate in the array.
     * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
     */
     int lastIndexOf(T searchElement, int fromIndex);
     int lastIndexOf(T searchElement);
    /**
     * Determines whether all the members of an array satisfy the specified test.
     * @param callbackfn A function that accepts up to three arguments. The every method calls
     * the callbackfn function for each element in the array until the callbackfn returns a value
     * which is coercible to the Boolean value false, or until the end of the array.
     * @param thisArg An object to which the this keyword can refer in the callbackfn function.
     * If thisArg is omitted, undefined is used as the this value.
     */
     boolean every(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn, Any thisArg);
     boolean every(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn);
    /**
     * Determines whether the specified callback function returns true for any element of an array.
     * @param callbackfn A function that accepts up to three arguments. The some method calls
     * the callbackfn function for each element in the array until the callbackfn returns a value
     * which is coercible to the Boolean value true, or until the end of the array.
     * @param thisArg An object to which the this keyword can refer in the callbackfn function.
     * If thisArg is omitted, undefined is used as the this value.
     */
     boolean some(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn, Any thisArg);
     boolean some(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn);
    /**
     * Performs the specified action for each element in an array.
     * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
     * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
     void forEach(IntKeyConsumer<T,ReadonlyArray<T>> callbackfn, Any thisArg);
     void forEach(IntKeyConsumer<T,ReadonlyArray<T>> callbackfn);
    /**
     * Calls a defined callback function on each element of an array, and returns an array that contains the results.
     * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
     * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
     <U extends Any> ReadonlyArray<U> map(IntKeyFunction<T,U,ReadonlyArray<T>> callbackfn, Any thisArg);
     <U extends Any> ReadonlyArray<U> map(IntKeyFunction<T,U,ReadonlyArray<T>> callbackfn);
    /**
     * Returns the elements of an array that meet the condition specified in a callback function.
     * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
     * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
     */
     ReadonlyArray<T> filter(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn, Any thisArg);
     ReadonlyArray<T> filter(IntKeyPredicate<T,ReadonlyArray<T>> callbackfn);
    /**
     * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
     */
     <U extends Any> U reduce(ArrayReducer<T,U,ReadonlyArray<T>> callbackfn, U initialValue);
     T reduce(ArrayReducer<T,T,ReadonlyArray<T>> callbackfn);
    /**
     * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
     * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
     * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
     */
     <U extends Any> U reduceRight(ArrayReducer<T,U,ReadonlyArray<T>> callbackfn, U initialValue);
     T reduceRight(ArrayReducer<T,T,ReadonlyArray<T>> callbackfn);

    /**
     * Returns the value of the first element in the array where predicate is true, and undefined
     * otherwise.
     * @param predicate find calls predicate once for each element of the array, in ascending
     * order, until it finds one where predicate returns true. If such an element is found, find
     * immediately returns that element value. Otherwise, find returns undefined.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
     <S extends T> S find (IntKeyPredicate<T, ReadonlyArray<T>> predicate);

    /**
     * Returns the index of the first element in the array where predicate is true, and -1
     * otherwise.
     * @param predicate find calls predicate once for each element of the array, in ascending
     * order, until it finds one where predicate returns true. If such an element is found,
     * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
     * @param thisArg If provided, it will be used as the this value for each invocation of
     * predicate. If it is not provided, undefined is used instead.
     */
     int findIndex(IntKeyPredicate<T, ReadonlyArray<T>> predicate);

    /**
     * Returns an iterable of key, value pairs for every entry in the array
     */
     JsIterable<IntKeyValue<T>> entries();

    /**
     * Returns an iterable of keys in the array
     */
     IntIterableIterator keys();

    /**
     * Returns an iterable of values in the array
     */
     IterableIterator<T> values();


}
