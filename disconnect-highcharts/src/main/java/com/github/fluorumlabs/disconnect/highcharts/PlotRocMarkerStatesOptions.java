package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states">https://api.highcharts.com/highstock/plotOptions.roc.marker.states</a>
 *
 */
public interface PlotRocMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.hover</a>
   *
   * @implspec hover?: PlotRocMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotRocMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.hover</a>
   *
   * @implspec hover?: PlotRocMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotRocMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.normal</a>
   *
   * @implspec normal?: PlotRocMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotRocMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.normal</a>
   *
   * @implspec normal?: PlotRocMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotRocMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.select">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.select</a>
   *
   * @implspec select?: PlotRocMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotRocMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.marker.states.select">https://api.highcharts.com/highstock/plotOptions.roc.marker.states.select</a>
   *
   * @implspec select?: PlotRocMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotRocMarkerStatesSelectOptions value);
}
