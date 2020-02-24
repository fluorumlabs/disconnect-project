package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to access the parsed columns, the two-dimentional input
 * data array directly, before they are interpreted into series data and
 * categories.
 *
 * @param columns
 * The parsed columns by the data module.
 *
 * @return Return <code>false</code> to stop completion, or call <code>this.complete()</code> to
 * continue async.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DataParsedCallbackFunction extends Any {
  boolean apply(Array<Array<Any>> columns);
}
