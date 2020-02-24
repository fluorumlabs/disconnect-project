package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Overrides for the normal state.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.normal">https://api.highcharts.com/highmaps/plotOptions.map.states.normal</a>
 *
 */
public interface PlotMapStatesNormalOptions extends Any {
  /**
   * (Highmaps) Animation options for the fill color when returning from hover
   * state to normal state. The animation adds some latency in order to reduce
   * the effect of flickering when hovering in and out of for example an
   * uneven coastline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.map.states.normal.animation</a>
   *
   * @implspec animation?: boolean;
   *
   */
  @JSProperty("animation")
  boolean getAnimation();

  /**
   * (Highmaps) Animation options for the fill color when returning from hover
   * state to normal state. The animation adds some latency in order to reduce
   * the effect of flickering when hovering in and out of for example an
   * uneven coastline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.map.states.normal.animation</a>
   *
   * @implspec animation?: boolean;
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);
}
