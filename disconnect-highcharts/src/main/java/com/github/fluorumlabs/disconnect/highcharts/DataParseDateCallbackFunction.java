package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to parse string representations of dates into JavaScript
 * timestamps (milliseconds since 1.1.1970).
 *
 * @return Timestamp (milliseconds since 1.1.1970) as integer for Date class.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DataParseDateCallbackFunction extends Any {
  double apply(String dateValue);
}
