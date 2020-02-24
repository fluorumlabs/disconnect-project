package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states">https://api.highcharts.com/highcharts/plotOptions.scatter.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states">https://api.highcharts.com/highstock/plotOptions.scatter.states</a>
 *
 */
public interface PlotScatterStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.states.hover</a>
   *
   * @implspec hover?: PlotScatterStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatterStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.states.hover</a>
   *
   * @implspec hover?: PlotScatterStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatterStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter.states.normal">https://api.highcharts.com/highmaps/plotOptions.scatter.states.normal</a>
   *
   * @implspec normal?: PlotScatterStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatterStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter.states.normal">https://api.highcharts.com/highmaps/plotOptions.scatter.states.normal</a>
   *
   * @implspec normal?: PlotScatterStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatterStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter.states.select">https://api.highcharts.com/highmaps/plotOptions.scatter.states.select</a>
   *
   * @implspec select?: PlotScatterStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatterStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.scatter.states.select">https://api.highcharts.com/highmaps/plotOptions.scatter.states.select</a>
   *
   * @implspec select?: PlotScatterStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatterStatesSelectOptions value);
}
