package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states</a>
 *
 */
public interface PlotIkhMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.hover</a>
   *
   * @implspec hover?: PlotIkhMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotIkhMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.hover</a>
   *
   * @implspec hover?: PlotIkhMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotIkhMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.normal</a>
   *
   * @implspec normal?: PlotIkhMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotIkhMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.normal</a>
   *
   * @implspec normal?: PlotIkhMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotIkhMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.select</a>
   *
   * @implspec select?: PlotIkhMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotIkhMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ikh.marker.states.select</a>
   *
   * @implspec select?: PlotIkhMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotIkhMarkerStatesSelectOptions value);
}
