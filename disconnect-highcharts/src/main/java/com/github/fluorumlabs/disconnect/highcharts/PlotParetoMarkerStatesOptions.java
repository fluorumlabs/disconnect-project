package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states</a>
 *
 */
public interface PlotParetoMarkerStatesOptions extends Any {
  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.hover</a>
   *
   * @implspec hover?: PlotParetoMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotParetoMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.hover</a>
   *
   * @implspec hover?: PlotParetoMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotParetoMarkerStatesHoverOptions value);

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.normal</a>
   *
   * @implspec normal?: PlotParetoMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotParetoMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.normal</a>
   *
   * @implspec normal?: PlotParetoMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotParetoMarkerStatesNormalOptions value);

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.select</a>
   *
   * @implspec select?: PlotParetoMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotParetoMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.pareto.marker.states.select</a>
   *
   * @implspec select?: PlotParetoMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotParetoMarkerStatesSelectOptions value);
}
