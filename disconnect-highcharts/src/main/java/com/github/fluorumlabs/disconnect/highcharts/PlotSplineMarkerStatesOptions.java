package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states">https://api.highcharts.com/highstock/plotOptions.spline.marker.states</a>
 *
 */
public interface PlotSplineMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.hover</a>
   *
   * @implspec hover?: PlotSplineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSplineMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.hover</a>
   *
   * @implspec hover?: PlotSplineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSplineMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.normal</a>
   *
   * @implspec normal?: PlotSplineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSplineMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.normal</a>
   *
   * @implspec normal?: PlotSplineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSplineMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.select">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.select</a>
   *
   * @implspec select?: PlotSplineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSplineMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.spline.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.spline.marker.states.select">https://api.highcharts.com/highstock/plotOptions.spline.marker.states.select</a>
   *
   * @implspec select?: PlotSplineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSplineMarkerStatesSelectOptions value);
}
