package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.states">https://api.highcharts.com/highstock/plotOptions.stochastic.states</a>
 *
 */
public interface PlotStochasticStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.states.hover">https://api.highcharts.com/highstock/plotOptions.stochastic.states.hover</a>
   *
   * @implspec hover?: PlotStochasticStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotStochasticStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.states.hover">https://api.highcharts.com/highstock/plotOptions.stochastic.states.hover</a>
   *
   * @implspec hover?: PlotStochasticStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotStochasticStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.stochastic.states.normal">https://api.highcharts.com/highmaps/plotOptions.stochastic.states.normal</a>
   *
   * @implspec normal?: PlotStochasticStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotStochasticStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.stochastic.states.normal">https://api.highcharts.com/highmaps/plotOptions.stochastic.states.normal</a>
   *
   * @implspec normal?: PlotStochasticStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotStochasticStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.stochastic.states.select">https://api.highcharts.com/highmaps/plotOptions.stochastic.states.select</a>
   *
   * @implspec select?: PlotStochasticStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotStochasticStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.stochastic.states.select">https://api.highcharts.com/highmaps/plotOptions.stochastic.states.select</a>
   *
   * @implspec select?: PlotStochasticStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotStochasticStatesSelectOptions value);
}
