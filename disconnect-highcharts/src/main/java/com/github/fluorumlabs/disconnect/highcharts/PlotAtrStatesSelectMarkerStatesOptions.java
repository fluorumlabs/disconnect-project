package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states</a>
 *
 */
public interface PlotAtrStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAtrStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAtrStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAtrStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAtrStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotAtrStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAtrStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.atr.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotAtrStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAtrStatesSelectMarkerStatesSelectOptions value);
}
