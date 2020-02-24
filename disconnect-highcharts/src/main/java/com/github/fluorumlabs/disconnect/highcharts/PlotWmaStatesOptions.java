package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.states">https://api.highcharts.com/highstock/plotOptions.wma.states</a>
 *
 */
public interface PlotWmaStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.states.hover">https://api.highcharts.com/highstock/plotOptions.wma.states.hover</a>
   *
   * @implspec hover?: PlotWmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotWmaStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.states.hover">https://api.highcharts.com/highstock/plotOptions.wma.states.hover</a>
   *
   * @implspec hover?: PlotWmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotWmaStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wma.states.normal">https://api.highcharts.com/highmaps/plotOptions.wma.states.normal</a>
   *
   * @implspec normal?: PlotWmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotWmaStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wma.states.normal">https://api.highcharts.com/highmaps/plotOptions.wma.states.normal</a>
   *
   * @implspec normal?: PlotWmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotWmaStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wma.states.select">https://api.highcharts.com/highmaps/plotOptions.wma.states.select</a>
   *
   * @implspec select?: PlotWmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotWmaStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.wma.states.select">https://api.highcharts.com/highmaps/plotOptions.wma.states.select</a>
   *
   * @implspec select?: PlotWmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotWmaStatesSelectOptions value);
}
