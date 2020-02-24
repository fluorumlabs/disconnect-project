package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback to execute when series points are dropped.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesPointDropCallbackFunction extends Any {
  void apply(SeriesPointDropEventObject e);
}
