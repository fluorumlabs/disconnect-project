package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

/**
 * Function callback when the checkbox next to the series' name in the legend is
 * clicked.
 *
 * @param e
 * Event arguments.
 *
 */
@JSFunctor
@FunctionalInterface
public interface SeriesCheckboxClickCallbackFunction extends Any {
  void apply(SeriesCheckboxClickEventObject e);
}
