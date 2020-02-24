package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.states">https://api.highcharts.com/highstock/plotOptions.rsi.states</a>
 *
 */
public interface PlotRsiStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.states.hover">https://api.highcharts.com/highstock/plotOptions.rsi.states.hover</a>
   *
   * @implspec hover?: PlotRsiStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotRsiStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.states.hover">https://api.highcharts.com/highstock/plotOptions.rsi.states.hover</a>
   *
   * @implspec hover?: PlotRsiStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotRsiStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.rsi.states.normal">https://api.highcharts.com/highmaps/plotOptions.rsi.states.normal</a>
   *
   * @implspec normal?: PlotRsiStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotRsiStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.rsi.states.normal">https://api.highcharts.com/highmaps/plotOptions.rsi.states.normal</a>
   *
   * @implspec normal?: PlotRsiStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotRsiStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.rsi.states.select">https://api.highcharts.com/highmaps/plotOptions.rsi.states.select</a>
   *
   * @implspec select?: PlotRsiStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotRsiStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.rsi.states.select">https://api.highcharts.com/highmaps/plotOptions.rsi.states.select</a>
   *
   * @implspec select?: PlotRsiStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotRsiStatesSelectOptions value);
}
