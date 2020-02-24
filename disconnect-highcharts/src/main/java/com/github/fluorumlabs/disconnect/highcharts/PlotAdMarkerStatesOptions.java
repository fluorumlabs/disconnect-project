package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states">https://api.highcharts.com/highstock/plotOptions.ad.marker.states</a>
 *
 */
public interface PlotAdMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.hover</a>
   *
   * @implspec hover?: PlotAdMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAdMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.hover</a>
   *
   * @implspec hover?: PlotAdMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAdMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.normal</a>
   *
   * @implspec normal?: PlotAdMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAdMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.normal</a>
   *
   * @implspec normal?: PlotAdMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAdMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.select</a>
   *
   * @implspec select?: PlotAdMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAdMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ad.marker.states.select</a>
   *
   * @implspec select?: PlotAdMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAdMarkerStatesSelectOptions value);
}
