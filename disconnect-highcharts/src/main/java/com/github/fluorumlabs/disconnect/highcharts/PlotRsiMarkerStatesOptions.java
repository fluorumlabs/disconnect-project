package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states</a>
 *
 */
public interface PlotRsiMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.hover</a>
   *
   * @implspec hover?: PlotRsiMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotRsiMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.hover</a>
   *
   * @implspec hover?: PlotRsiMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotRsiMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.normal</a>
   *
   * @implspec normal?: PlotRsiMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotRsiMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.normal</a>
   *
   * @implspec normal?: PlotRsiMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotRsiMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.select">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.select</a>
   *
   * @implspec select?: PlotRsiMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotRsiMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.select">https://api.highcharts.com/highstock/plotOptions.rsi.marker.states.select</a>
   *
   * @implspec select?: PlotRsiMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotRsiMarkerStatesSelectOptions value);
}
