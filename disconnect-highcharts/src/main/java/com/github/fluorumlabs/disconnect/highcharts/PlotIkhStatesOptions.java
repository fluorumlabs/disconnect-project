package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states">https://api.highcharts.com/highstock/plotOptions.ikh.states</a>
 *
 */
public interface PlotIkhStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover</a>
   *
   * @implspec hover?: PlotIkhStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotIkhStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover</a>
   *
   * @implspec hover?: PlotIkhStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotIkhStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ikh.states.normal">https://api.highcharts.com/highmaps/plotOptions.ikh.states.normal</a>
   *
   * @implspec normal?: PlotIkhStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotIkhStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ikh.states.normal">https://api.highcharts.com/highmaps/plotOptions.ikh.states.normal</a>
   *
   * @implspec normal?: PlotIkhStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotIkhStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ikh.states.select">https://api.highcharts.com/highmaps/plotOptions.ikh.states.select</a>
   *
   * @implspec select?: PlotIkhStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotIkhStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ikh.states.select">https://api.highcharts.com/highmaps/plotOptions.ikh.states.select</a>
   *
   * @implspec select?: PlotIkhStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotIkhStatesSelectOptions value);
}
