package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states</a>
 *
 */
public interface PlotPivotpointsMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.hover</a>
   *
   * @implspec hover?: PlotPivotpointsMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPivotpointsMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.hover</a>
   *
   * @implspec hover?: PlotPivotpointsMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPivotpointsMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.normal</a>
   *
   * @implspec normal?: PlotPivotpointsMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPivotpointsMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.normal</a>
   *
   * @implspec normal?: PlotPivotpointsMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPivotpointsMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.select">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.select</a>
   *
   * @implspec select?: PlotPivotpointsMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPivotpointsMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.select">https://api.highcharts.com/highstock/plotOptions.pivotpoints.marker.states.select</a>
   *
   * @implspec select?: PlotPivotpointsMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPivotpointsMarkerStatesSelectOptions value);
}
