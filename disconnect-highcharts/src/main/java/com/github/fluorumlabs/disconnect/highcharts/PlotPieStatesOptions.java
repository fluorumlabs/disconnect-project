package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states">https://api.highcharts.com/highcharts/plotOptions.pie.states</a>
 *
 */
public interface PlotPieStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.hover">https://api.highcharts.com/highcharts/plotOptions.pie.states.hover</a>
   *
   * @implspec hover?: PlotPieStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPieStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pie.states.hover">https://api.highcharts.com/highcharts/plotOptions.pie.states.hover</a>
   *
   * @implspec hover?: PlotPieStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPieStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.states.normal">https://api.highcharts.com/highmaps/plotOptions.pie.states.normal</a>
   *
   * @implspec normal?: PlotPieStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPieStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.states.normal">https://api.highcharts.com/highmaps/plotOptions.pie.states.normal</a>
   *
   * @implspec normal?: PlotPieStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPieStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.states.select">https://api.highcharts.com/highmaps/plotOptions.pie.states.select</a>
   *
   * @implspec select?: PlotPieStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPieStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pie.states.select">https://api.highcharts.com/highmaps/plotOptions.pie.states.select</a>
   *
   * @implspec select?: PlotPieStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPieStatesSelectOptions value);
}
