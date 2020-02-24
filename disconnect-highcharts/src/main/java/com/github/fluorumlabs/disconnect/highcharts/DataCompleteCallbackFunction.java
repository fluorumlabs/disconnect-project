package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Callback function that gets called after parsing data.
 *
 * @param chartOptions
 * The chart options that were used.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DataCompleteCallbackFunction extends Any {
  void apply(ChartOptions chartOptions);
}
