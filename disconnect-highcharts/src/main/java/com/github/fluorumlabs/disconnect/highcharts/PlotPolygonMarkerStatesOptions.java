package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states</a>
 *
 */
public interface PlotPolygonMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.hover</a>
   *
   * @implspec hover?: PlotPolygonMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPolygonMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.hover</a>
   *
   * @implspec hover?: PlotPolygonMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPolygonMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.normal</a>
   *
   * @implspec normal?: PlotPolygonMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPolygonMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.normal</a>
   *
   * @implspec normal?: PlotPolygonMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPolygonMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.select">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.select</a>
   *
   * @implspec select?: PlotPolygonMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPolygonMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.polygon.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.select">https://api.highcharts.com/highstock/plotOptions.polygon.marker.states.select</a>
   *
   * @implspec select?: PlotPolygonMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPolygonMarkerStatesSelectOptions value);
}
