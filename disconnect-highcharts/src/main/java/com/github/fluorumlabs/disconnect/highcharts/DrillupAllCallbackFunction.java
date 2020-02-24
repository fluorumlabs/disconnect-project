package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * This gets fired after all the series have been drilled up. This is especially
 * usefull in a chart with multiple drilldown series.
 *
 * @param this
 * The chart where the event occurs.
 *
 * @param e
 * The final drillup event.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DrillupAllCallbackFunction extends Any {
  void apply(DrillupAllEventObject e);
}
