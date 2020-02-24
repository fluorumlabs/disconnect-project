package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states</a>
 *
 */
public interface PlotMfiMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover</a>
   *
   * @implspec hover?: PlotMfiMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMfiMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.hover</a>
   *
   * @implspec hover?: PlotMfiMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMfiMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.normal</a>
   *
   * @implspec normal?: PlotMfiMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMfiMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.normal</a>
   *
   * @implspec normal?: PlotMfiMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMfiMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.select">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.select</a>
   *
   * @implspec select?: PlotMfiMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMfiMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.select">https://api.highcharts.com/highstock/plotOptions.mfi.marker.states.select</a>
   *
   * @implspec select?: PlotMfiMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMfiMarkerStatesSelectOptions value);
}
