package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) The normal state of a single point marker.
 * Currently only used for setting animation when returning to normal state from
 * hover.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.line.data.marker.states.normal">https://api.highcharts.com/highcharts/series.line.data.marker.states.normal</a>
 * @see <a href="https://api.highcharts.com/highstock/series.line.data.marker.states.normal">https://api.highcharts.com/highstock/series.line.data.marker.states.normal</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.line.data.marker.states.normal">https://api.highcharts.com/highmaps/series.line.data.marker.states.normal</a>
 *
 */
public interface SeriesLineDataMarkerStatesNormalOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Animation when returning to normal
   * state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highcharts, Highstock, Highmaps) Animation when returning to normal
   * state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Animation when returning to normal
   * state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highcharts/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highstock/series.line.data.marker.states.normal.animation</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation">https://api.highcharts.com/highmaps/series.line.data.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);
}
