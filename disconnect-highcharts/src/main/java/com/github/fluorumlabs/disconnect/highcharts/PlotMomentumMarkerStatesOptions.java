package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states</a>
 *
 */
public interface PlotMomentumMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.hover</a>
   *
   * @implspec hover?: PlotMomentumMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMomentumMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.hover</a>
   *
   * @implspec hover?: PlotMomentumMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMomentumMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.normal</a>
   *
   * @implspec normal?: PlotMomentumMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMomentumMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.normal</a>
   *
   * @implspec normal?: PlotMomentumMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMomentumMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.select">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.select</a>
   *
   * @implspec select?: PlotMomentumMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMomentumMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.select">https://api.highcharts.com/highstock/plotOptions.momentum.marker.states.select</a>
   *
   * @implspec select?: PlotMomentumMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMomentumMarkerStatesSelectOptions value);
}
