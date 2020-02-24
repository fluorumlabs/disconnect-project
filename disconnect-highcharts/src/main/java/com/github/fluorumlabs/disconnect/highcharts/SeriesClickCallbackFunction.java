package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback when a series is clicked. Return false to cancel toogle
 * actions.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesClickCallbackFunction extends Any {
  void apply(SeriesClickEventObject e);
}
