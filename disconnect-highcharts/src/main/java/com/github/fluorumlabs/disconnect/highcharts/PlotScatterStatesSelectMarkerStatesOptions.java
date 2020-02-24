package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states</a>
 *
 */
public interface PlotScatterStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatterStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatterStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatterStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatterStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatterStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatterStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatterStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatterStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotScatterStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatterStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotScatterStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatterStatesSelectMarkerStatesSelectOptions value);
}
