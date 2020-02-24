package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Callback for chart constructors.
 *
 * @param chart
 * Created chart.
 *
 */
@JSFunctor
@FunctionalInterface
public interface ChartCallbackFunction extends Any {
  void apply(Chart chart);
}
