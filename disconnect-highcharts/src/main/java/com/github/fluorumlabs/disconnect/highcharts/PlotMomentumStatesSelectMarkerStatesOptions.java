package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states</a>
 *
 */
public interface PlotMomentumStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotMomentumStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMomentumStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotMomentumStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMomentumStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotMomentumStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMomentumStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotMomentumStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMomentumStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotMomentumStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMomentumStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.momentum.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.momentum.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotMomentumStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMomentumStatesSelectMarkerStatesSelectOptions value);
}
