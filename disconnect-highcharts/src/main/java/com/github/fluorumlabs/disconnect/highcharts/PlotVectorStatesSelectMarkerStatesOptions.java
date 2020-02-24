package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states</a>
 *
 */
public interface PlotVectorStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotVectorStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVectorStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotVectorStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVectorStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotVectorStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVectorStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotVectorStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVectorStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotVectorStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVectorStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.vector.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vector.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotVectorStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVectorStatesSelectMarkerStatesSelectOptions value);
}
