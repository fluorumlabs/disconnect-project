package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Gets fired when a drilldown point is clicked, before the new series is added.
 * Note that when clicking a category label to trigger multiple series
 * drilldown, one <code>drilldown</code> event is triggered per point in the category.
 *
 * @param this
 * The chart where the event occurs.
 *
 * @param e
 * The drilldown event.
 *
 */
@JSFunctor
@FunctionalInterface
public interface DrilldownCallbackFunction extends Any {
  void apply(DrilldownEventObject e);
}
