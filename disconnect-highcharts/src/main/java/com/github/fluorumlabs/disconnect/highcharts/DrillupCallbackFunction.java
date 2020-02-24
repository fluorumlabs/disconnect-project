package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Gets fired when drilling up from a drilldown series.
 *
 * @param this
 * The chart where the event occurs.
 *
 * @param e
 * The drillup event.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DrillupCallbackFunction extends Any {
  void apply(DrillupEventObject e);
}
