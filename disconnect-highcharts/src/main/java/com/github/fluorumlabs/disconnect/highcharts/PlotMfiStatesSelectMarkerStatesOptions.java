package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states</a>
 *
 */
public interface PlotMfiStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotMfiStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMfiStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotMfiStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMfiStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotMfiStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMfiStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotMfiStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMfiStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotMfiStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMfiStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.mfi.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.mfi.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotMfiStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMfiStatesSelectMarkerStatesSelectOptions value);
}
