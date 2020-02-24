package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states">https://api.highcharts.com/highcharts/plotOptions.area.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states">https://api.highcharts.com/highstock/plotOptions.area.marker.states</a>
 *
 */
public interface PlotAreaMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.area.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreaMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.area.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreaMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.area.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreaMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.area.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreaMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.select">https://api.highcharts.com/highstock/plotOptions.area.marker.states.select</a>
   *
   * @implspec select?: PlotAreaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreaMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.area.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.area.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.area.marker.states.select">https://api.highcharts.com/highstock/plotOptions.area.marker.states.select</a>
   *
   * @implspec select?: PlotAreaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreaMarkerStatesSelectOptions value);
}
