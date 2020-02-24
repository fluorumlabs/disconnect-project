package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback when a series point is clicked. Return false to cancel the
 * action.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesPointClickCallbackFunction extends Any {
  void apply(SeriesPointClickEventObject e);
}
