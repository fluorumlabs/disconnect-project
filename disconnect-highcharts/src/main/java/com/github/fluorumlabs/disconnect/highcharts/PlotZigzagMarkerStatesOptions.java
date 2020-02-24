package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states</a>
 *
 */
public interface PlotZigzagMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.hover</a>
   *
   * @implspec hover?: PlotZigzagMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotZigzagMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.hover</a>
   *
   * @implspec hover?: PlotZigzagMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotZigzagMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.normal</a>
   *
   * @implspec normal?: PlotZigzagMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotZigzagMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.normal</a>
   *
   * @implspec normal?: PlotZigzagMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotZigzagMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.select">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.select</a>
   *
   * @implspec select?: PlotZigzagMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotZigzagMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.select">https://api.highcharts.com/highstock/plotOptions.zigzag.marker.states.select</a>
   *
   * @implspec select?: PlotZigzagMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotZigzagMarkerStatesSelectOptions value);
}
