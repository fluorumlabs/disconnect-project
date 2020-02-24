package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback when a series has been animated.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesAfterAnimateCallbackFunction extends Any {
  void apply(SeriesAfterAnimateEventObject e);
}
