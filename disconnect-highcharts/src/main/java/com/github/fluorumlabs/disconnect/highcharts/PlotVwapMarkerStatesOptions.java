package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states</a>
 *
 */
public interface PlotVwapMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.hover</a>
   *
   * @implspec hover?: PlotVwapMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVwapMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.hover</a>
   *
   * @implspec hover?: PlotVwapMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVwapMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.normal</a>
   *
   * @implspec normal?: PlotVwapMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVwapMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.normal</a>
   *
   * @implspec normal?: PlotVwapMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVwapMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.select</a>
   *
   * @implspec select?: PlotVwapMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVwapMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.select">https://api.highcharts.com/highstock/plotOptions.vwap.marker.states.select</a>
   *
   * @implspec select?: PlotVwapMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVwapMarkerStatesSelectOptions value);
}
