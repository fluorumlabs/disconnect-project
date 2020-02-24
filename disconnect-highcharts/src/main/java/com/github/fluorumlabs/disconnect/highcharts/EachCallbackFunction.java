package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;

/**
 * The iterator callback.
 *
 * @param item
 * The array item.
 *
 * @param index
 * The item's index in the array.
 *
 * @param arr
 * The array that each is being applied to.
 *
 */
@JSFunctor
@FunctionalInterface
public interface EachCallbackFunction<T extends Any> extends Any {
  void apply(T item, double index, Array<T> arr);
}
