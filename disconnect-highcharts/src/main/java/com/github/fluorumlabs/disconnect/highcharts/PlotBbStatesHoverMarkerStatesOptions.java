package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states</a>
 *
 */
public interface PlotBbStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotBbStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBbStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotBbStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBbStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotBbStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBbStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotBbStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBbStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotBbStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBbStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bb.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bb.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotBbStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBbStatesHoverMarkerStatesSelectOptions value);
}
