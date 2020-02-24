package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states">https://api.highcharts.com/highstock/plotOptions.bb.marker.states</a>
 *
 */
public interface PlotBbMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.hover</a>
   *
   * @implspec hover?: PlotBbMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBbMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.hover</a>
   *
   * @implspec hover?: PlotBbMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBbMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.normal</a>
   *
   * @implspec normal?: PlotBbMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBbMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.normal</a>
   *
   * @implspec normal?: PlotBbMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBbMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.select</a>
   *
   * @implspec select?: PlotBbMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBbMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bb.marker.states.select</a>
   *
   * @implspec select?: PlotBbMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBbMarkerStatesSelectOptions value);
}
