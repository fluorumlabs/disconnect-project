package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to parse values entered in the input boxes and return a
 * valid JavaScript time as milliseconds since 1970.
 *
 * @param value
 * Input value to parse.
 *
 * @return Parsed JavaScript time value.
 *
 */
@JSFunctor
@FunctionalInterface
public interface RangeSelectorParseCallbackFunction extends Any {
  double apply(String value);
}
