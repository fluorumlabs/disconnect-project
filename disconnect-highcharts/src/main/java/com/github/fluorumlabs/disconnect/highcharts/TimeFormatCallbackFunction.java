package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function of an additional date format specifier.
 *
 * @param timestamp
 * The time to format.
 *
 * @return The formatted portion of the date.
 *
 */
@JSFunctor
@FunctionalInterface
public interface TimeFormatCallbackFunction extends Any {
  String apply(double timestamp);
}
