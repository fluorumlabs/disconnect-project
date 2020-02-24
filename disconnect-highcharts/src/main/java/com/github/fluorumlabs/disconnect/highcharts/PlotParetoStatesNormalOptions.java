package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) Overrides for the normal state.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal</a>
 *
 */
public interface PlotParetoStatesNormalOptions extends Any {
  /**
   * (Highmaps) Animation options for the fill color when returning from hover
   * state to normal state. The animation adds some latency in order to reduce
   * the effect of flickering when hovering in and out of for example an
   * uneven coastline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown getAnimation();

  /**
   * (Highmaps) Animation options for the fill color when returning from hover
   * state to normal state. The animation adds some latency in order to reduce
   * the effect of flickering when hovering in and out of for example an
   * uneven coastline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highmaps) Animation options for the fill color when returning from hover
   * state to normal state. The animation adds some latency in order to reduce
   * the effect of flickering when hovering in and out of for example an
   * uneven coastline.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal.animation</a>
   *
   * @implspec animation?: (boolean|AnimationOptionsObject);
   *
   */
  @JSProperty("animation")
  void setAnimation(AnimationOptionsObject value);
}
