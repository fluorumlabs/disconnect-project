package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.states">https://api.highcharts.com/highstock/plotOptions.macd.states</a>
 *
 */
public interface PlotMacdStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.states.hover">https://api.highcharts.com/highstock/plotOptions.macd.states.hover</a>
   *
   * @implspec hover?: PlotMacdStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMacdStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.states.hover">https://api.highcharts.com/highstock/plotOptions.macd.states.hover</a>
   *
   * @implspec hover?: PlotMacdStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMacdStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.macd.states.normal">https://api.highcharts.com/highmaps/plotOptions.macd.states.normal</a>
   *
   * @implspec normal?: PlotMacdStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMacdStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.macd.states.normal">https://api.highcharts.com/highmaps/plotOptions.macd.states.normal</a>
   *
   * @implspec normal?: PlotMacdStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMacdStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.macd.states.select">https://api.highcharts.com/highmaps/plotOptions.macd.states.select</a>
   *
   * @implspec select?: PlotMacdStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMacdStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.macd.states.select">https://api.highcharts.com/highmaps/plotOptions.macd.states.select</a>
   *
   * @implspec select?: PlotMacdStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMacdStatesSelectOptions value);
}
