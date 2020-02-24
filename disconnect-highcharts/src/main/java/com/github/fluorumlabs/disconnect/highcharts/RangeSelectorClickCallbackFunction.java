package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSFunctor;

/**
 * Callback function to react on button clicks.
 *
 * @param e
 * Event arguments.
 *
 * @param Return
 * false to cancel the default button event.
 *
 */
@JSFunctor
@FunctionalInterface
public interface RangeSelectorClickCallbackFunction extends Any {
  void apply(Event e, boolean Return);
}
