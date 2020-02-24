package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states</a>
 *
 */
public interface PlotIkhStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotIkhStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotIkhStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotIkhStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotIkhStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotIkhStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotIkhStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotIkhStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotIkhStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotIkhStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotIkhStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.ikh.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ikh.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotIkhStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotIkhStatesHoverMarkerStatesSelectOptions value);
}
