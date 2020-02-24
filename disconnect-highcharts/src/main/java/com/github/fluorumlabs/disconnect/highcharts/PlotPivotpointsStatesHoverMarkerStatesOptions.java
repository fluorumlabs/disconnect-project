package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states</a>
 *
 */
public interface PlotPivotpointsStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotPivotpointsStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPivotpointsStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotPivotpointsStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPivotpointsStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotPivotpointsStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPivotpointsStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotPivotpointsStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPivotpointsStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotPivotpointsStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPivotpointsStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.pivotpoints.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.pivotpoints.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotPivotpointsStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPivotpointsStatesHoverMarkerStatesSelectOptions value);
}
