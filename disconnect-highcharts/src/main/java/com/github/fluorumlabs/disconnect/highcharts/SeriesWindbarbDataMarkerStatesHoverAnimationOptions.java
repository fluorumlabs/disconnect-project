package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Animation when hovering over the marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.windbarb.data.marker.states.hover.animation">https://api.highcharts.com/highcharts/series.windbarb.data.marker.states.hover.animation</a>
 * @see <a href="https://api.highcharts.com/highstock/series.windbarb.data.marker.states.hover.animation">https://api.highcharts.com/highstock/series.windbarb.data.marker.states.hover.animation</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.windbarb.data.marker.states.hover.animation">https://api.highcharts.com/highmaps/series.windbarb.data.marker.states.hover.animation</a>
 *
 */
public interface SeriesWindbarbDataMarkerStatesHoverAnimationOptions extends Any {
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
