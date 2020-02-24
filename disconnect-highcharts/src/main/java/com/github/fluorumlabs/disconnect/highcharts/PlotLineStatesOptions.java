package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.states">https://api.highcharts.com/highcharts/plotOptions.line.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.states">https://api.highcharts.com/highstock/plotOptions.line.states</a>
 *
 */
public interface PlotLineStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.states.hover">https://api.highcharts.com/highcharts/plotOptions.line.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.states.hover">https://api.highcharts.com/highstock/plotOptions.line.states.hover</a>
   *
   * @implspec hover?: PlotLineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotLineStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.states.hover">https://api.highcharts.com/highcharts/plotOptions.line.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.states.hover">https://api.highcharts.com/highstock/plotOptions.line.states.hover</a>
   *
   * @implspec hover?: PlotLineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotLineStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.line.states.normal">https://api.highcharts.com/highmaps/plotOptions.line.states.normal</a>
   *
   * @implspec normal?: PlotLineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotLineStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.line.states.normal">https://api.highcharts.com/highmaps/plotOptions.line.states.normal</a>
   *
   * @implspec normal?: PlotLineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotLineStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.line.states.select">https://api.highcharts.com/highmaps/plotOptions.line.states.select</a>
   *
   * @implspec select?: PlotLineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotLineStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.line.states.select">https://api.highcharts.com/highmaps/plotOptions.line.states.select</a>
   *
   * @implspec select?: PlotLineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotLineStatesSelectOptions value);
}
