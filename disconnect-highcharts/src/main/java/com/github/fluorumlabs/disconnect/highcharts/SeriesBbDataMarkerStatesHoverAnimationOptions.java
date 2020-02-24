package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Animation when hovering over the marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.bb.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.bb.data.marker.states.hover.animation</a>
 * @see <a href="https://api.highcharts.com/highstock/series.bb.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.bb.data.marker.states.hover.animation</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.bb.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.bb.data.marker.states.hover.animation</a>
 *
 */
public interface SeriesBbDataMarkerStatesHoverAnimationOptions extends Any {
  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  double getDuration();

  /**
   * @implspec duration?: number;
   *
   */
  @JSProperty("duration")
  void setDuration(double value);
}
