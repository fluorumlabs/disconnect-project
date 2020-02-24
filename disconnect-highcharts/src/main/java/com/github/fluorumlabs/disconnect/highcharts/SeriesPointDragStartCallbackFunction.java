package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback to execute when a series point is dragged.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesPointDragStartCallbackFunction extends Any {
  void apply(SeriesPointDragStartEventObject e);
}
