package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to modify the CSV before parsing it by the data module.
 *
 * @param csv
 * The CSV to modify.
 *
 * @return The CSV to parse.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DataBeforeParseCallbackFunction extends Any {
  String apply(String csv);
}
