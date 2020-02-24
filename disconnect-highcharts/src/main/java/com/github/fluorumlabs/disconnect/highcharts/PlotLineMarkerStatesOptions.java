package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states">https://api.highcharts.com/highcharts/plotOptions.line.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states">https://api.highcharts.com/highstock/plotOptions.line.marker.states</a>
 *
 */
public interface PlotLineMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.line.marker.states.hover</a>
   *
   * @implspec hover?: PlotLineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotLineMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.line.marker.states.hover</a>
   *
   * @implspec hover?: PlotLineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotLineMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.line.marker.states.normal</a>
   *
   * @implspec normal?: PlotLineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotLineMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.line.marker.states.normal</a>
   *
   * @implspec normal?: PlotLineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotLineMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.select">https://api.highcharts.com/highstock/plotOptions.line.marker.states.select</a>
   *
   * @implspec select?: PlotLineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotLineMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.line.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.line.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.line.marker.states.select">https://api.highcharts.com/highstock/plotOptions.line.marker.states.select</a>
   *
   * @implspec select?: PlotLineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotLineMarkerStatesSelectOptions value);
}
