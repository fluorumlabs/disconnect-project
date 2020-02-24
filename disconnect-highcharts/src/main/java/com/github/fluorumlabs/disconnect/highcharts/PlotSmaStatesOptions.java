package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.states">https://api.highcharts.com/highstock/plotOptions.sma.states</a>
 *
 */
public interface PlotSmaStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.states.hover">https://api.highcharts.com/highstock/plotOptions.sma.states.hover</a>
   *
   * @implspec hover?: PlotSmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSmaStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.states.hover">https://api.highcharts.com/highstock/plotOptions.sma.states.hover</a>
   *
   * @implspec hover?: PlotSmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSmaStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sma.states.normal">https://api.highcharts.com/highmaps/plotOptions.sma.states.normal</a>
   *
   * @implspec normal?: PlotSmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSmaStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sma.states.normal">https://api.highcharts.com/highmaps/plotOptions.sma.states.normal</a>
   *
   * @implspec normal?: PlotSmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSmaStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sma.states.select">https://api.highcharts.com/highmaps/plotOptions.sma.states.select</a>
   *
   * @implspec select?: PlotSmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSmaStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sma.states.select">https://api.highcharts.com/highmaps/plotOptions.sma.states.select</a>
   *
   * @implspec select?: PlotSmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSmaStatesSelectOptions value);
}
