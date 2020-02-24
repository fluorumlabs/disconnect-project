package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.states">https://api.highcharts.com/highcharts/plotOptions.spline.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.states">https://api.highcharts.com/highstock/plotOptions.spline.states</a>
 *
 */
public interface PlotSplineStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.states.hover">https://api.highcharts.com/highcharts/plotOptions.spline.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.states.hover">https://api.highcharts.com/highstock/plotOptions.spline.states.hover</a>
   *
   * @implspec hover?: PlotSplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSplineStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.states.hover">https://api.highcharts.com/highcharts/plotOptions.spline.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.states.hover">https://api.highcharts.com/highstock/plotOptions.spline.states.hover</a>
   *
   * @implspec hover?: PlotSplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSplineStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.spline.states.normal">https://api.highcharts.com/highmaps/plotOptions.spline.states.normal</a>
   *
   * @implspec normal?: PlotSplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSplineStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.spline.states.normal">https://api.highcharts.com/highmaps/plotOptions.spline.states.normal</a>
   *
   * @implspec normal?: PlotSplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSplineStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.spline.states.select">https://api.highcharts.com/highmaps/plotOptions.spline.states.select</a>
   *
   * @implspec select?: PlotSplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSplineStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.spline.states.select">https://api.highcharts.com/highmaps/plotOptions.spline.states.select</a>
   *
   * @implspec select?: PlotSplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSplineStatesSelectOptions value);
}
