package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states">https://api.highcharts.com/highstock/plotOptions.sma.marker.states</a>
 *
 */
public interface PlotSmaMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.hover</a>
   *
   * @implspec hover?: PlotSmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSmaMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.hover</a>
   *
   * @implspec hover?: PlotSmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSmaMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.normal</a>
   *
   * @implspec normal?: PlotSmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSmaMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.normal</a>
   *
   * @implspec normal?: PlotSmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSmaMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.select">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.select</a>
   *
   * @implspec select?: PlotSmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSmaMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sma.marker.states.select">https://api.highcharts.com/highstock/plotOptions.sma.marker.states.select</a>
   *
   * @implspec select?: PlotSmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSmaMarkerStatesSelectOptions value);
}
