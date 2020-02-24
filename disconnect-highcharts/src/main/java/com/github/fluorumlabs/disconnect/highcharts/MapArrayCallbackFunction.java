package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to map the values in an array.
 *
 * @param value
 * The value to replace.
 *
 * @param index
 * The index position of the value.
 *
 * @param arr
 * The array as a reference.
 *
 * @return The new value as a replacement.
 *
 */
@JSFunctor
@FunctionalInterface
public interface MapArrayCallbackFunction extends Any {
  Any apply(Any value, double index, Array<Any> arr);
}
