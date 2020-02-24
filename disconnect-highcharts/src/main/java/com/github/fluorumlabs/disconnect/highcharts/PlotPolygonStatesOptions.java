package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.states">https://api.highcharts.com/highcharts/plotOptions.polygon.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.states">https://api.highcharts.com/highstock/plotOptions.polygon.states</a>
 *
 */
public interface PlotPolygonStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.states.hover">https://api.highcharts.com/highcharts/plotOptions.polygon.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.states.hover">https://api.highcharts.com/highstock/plotOptions.polygon.states.hover</a>
   *
   * @implspec hover?: PlotPolygonStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPolygonStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.states.hover">https://api.highcharts.com/highcharts/plotOptions.polygon.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.states.hover">https://api.highcharts.com/highstock/plotOptions.polygon.states.hover</a>
   *
   * @implspec hover?: PlotPolygonStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPolygonStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.polygon.states.normal">https://api.highcharts.com/highmaps/plotOptions.polygon.states.normal</a>
   *
   * @implspec normal?: PlotPolygonStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPolygonStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.polygon.states.normal">https://api.highcharts.com/highmaps/plotOptions.polygon.states.normal</a>
   *
   * @implspec normal?: PlotPolygonStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPolygonStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.polygon.states.select">https://api.highcharts.com/highmaps/plotOptions.polygon.states.select</a>
   *
   * @implspec select?: PlotPolygonStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPolygonStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.polygon.states.select">https://api.highcharts.com/highmaps/plotOptions.polygon.states.select</a>
   *
   * @implspec select?: PlotPolygonStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPolygonStatesSelectOptions value);
}
