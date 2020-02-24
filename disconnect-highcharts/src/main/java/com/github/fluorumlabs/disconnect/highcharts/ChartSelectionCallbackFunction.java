package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSFunctor;

/**
 * Gets fired when an area of the chart has been selected. The default action
 * for the selection event is to zoom the chart to the selected area. It can be
 * prevented by calling <code>event.preventDefault()</code> or return false.
 *
 * @param event
 * Event informations
 *
 * @return Return false to prevent the default action, usually zoom.
 *
 */
@JSFunctor
@FunctionalInterface
public interface ChartSelectionCallbackFunction extends Any {
  boolean apply(Event event);
}
