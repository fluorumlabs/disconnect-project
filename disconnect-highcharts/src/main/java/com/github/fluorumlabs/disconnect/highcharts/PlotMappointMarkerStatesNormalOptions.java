package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) The normal state of a single point marker. Currently only used for
 * setting animation when returning to normal state from hover.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal</a>
 *
 */
public interface PlotMappointMarkerStatesNormalOptions extends Any {
  /**
   * (Highmaps) Animation when returning to normal state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highmaps) Animation when returning to normal state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highmaps) Animation when returning to normal state after hovering.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.mappoint.marker.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);
}
