package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Formats data as a string. Usually the data is accessible throught the <code>this</code>
 * keyword.
 *
 */
@JSFunctor
@FunctionalInterface
public interface FormatterCallbackFunction<T extends Any> extends Any {
  String apply();
}
