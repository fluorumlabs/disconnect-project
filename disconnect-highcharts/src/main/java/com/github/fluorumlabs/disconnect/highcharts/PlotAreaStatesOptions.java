package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.states">https://api.highcharts.com/highcharts/plotOptions.area.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.states">https://api.highcharts.com/highstock/plotOptions.area.states</a>
 *
 */
public interface PlotAreaStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.states.hover">https://api.highcharts.com/highcharts/plotOptions.area.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.states.hover">https://api.highcharts.com/highstock/plotOptions.area.states.hover</a>
   *
   * @implspec hover?: PlotAreaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreaStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.states.hover">https://api.highcharts.com/highcharts/plotOptions.area.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.states.hover">https://api.highcharts.com/highstock/plotOptions.area.states.hover</a>
   *
   * @implspec hover?: PlotAreaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreaStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.area.states.normal">https://api.highcharts.com/highmaps/plotOptions.area.states.normal</a>
   *
   * @implspec normal?: PlotAreaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreaStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.area.states.normal">https://api.highcharts.com/highmaps/plotOptions.area.states.normal</a>
   *
   * @implspec normal?: PlotAreaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreaStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.area.states.select">https://api.highcharts.com/highmaps/plotOptions.area.states.select</a>
   *
   * @implspec select?: PlotAreaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreaStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.area.states.select">https://api.highcharts.com/highmaps/plotOptions.area.states.select</a>
   *
   * @implspec select?: PlotAreaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreaStatesSelectOptions value);
}
