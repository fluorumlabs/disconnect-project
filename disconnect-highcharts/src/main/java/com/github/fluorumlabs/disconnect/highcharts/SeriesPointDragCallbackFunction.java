package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback to execute while series points are dragged.
 *
 * @param e
 * Event arguments.
 *
 * @return Return false to stop the default drag action.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesPointDragCallbackFunction extends Any {
  boolean apply(SeriesPointDragEventObject e);
}
