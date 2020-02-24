package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states">https://api.highcharts.com/highstock/plotOptions.momentum.states</a>
 *
 */
public interface PlotMomentumStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.states.hover</a>
   *
   * @implspec hover?: PlotMomentumStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMomentumStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.states.hover</a>
   *
   * @implspec hover?: PlotMomentumStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMomentumStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.momentum.states.normal">https://api.highcharts.com/highmaps/plotOptions.momentum.states.normal</a>
   *
   * @implspec normal?: PlotMomentumStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMomentumStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.momentum.states.normal">https://api.highcharts.com/highmaps/plotOptions.momentum.states.normal</a>
   *
   * @implspec normal?: PlotMomentumStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMomentumStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.momentum.states.select">https://api.highcharts.com/highmaps/plotOptions.momentum.states.select</a>
   *
   * @implspec select?: PlotMomentumStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMomentumStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.momentum.states.select">https://api.highcharts.com/highmaps/plotOptions.momentum.states.select</a>
   *
   * @implspec select?: PlotMomentumStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMomentumStatesSelectOptions value);
}
