package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states</a>
 *
 */
public interface PlotVbpMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.hover</a>
   *
   * @implspec hover?: PlotVbpMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVbpMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.hover</a>
   *
   * @implspec hover?: PlotVbpMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVbpMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.normal</a>
   *
   * @implspec normal?: PlotVbpMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVbpMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.normal</a>
   *
   * @implspec normal?: PlotVbpMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVbpMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select</a>
   *
   * @implspec select?: PlotVbpMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVbpMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vbp.marker.states.select</a>
   *
   * @implspec select?: PlotVbpMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVbpMarkerStatesSelectOptions value);
}
