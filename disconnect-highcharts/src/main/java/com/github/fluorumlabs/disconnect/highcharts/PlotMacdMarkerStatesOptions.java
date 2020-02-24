package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states">https://api.highcharts.com/highstock/plotOptions.macd.marker.states</a>
 *
 */
public interface PlotMacdMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.hover</a>
   *
   * @implspec hover?: PlotMacdMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMacdMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.hover</a>
   *
   * @implspec hover?: PlotMacdMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMacdMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.normal</a>
   *
   * @implspec normal?: PlotMacdMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMacdMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.normal</a>
   *
   * @implspec normal?: PlotMacdMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMacdMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.select">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.select</a>
   *
   * @implspec select?: PlotMacdMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMacdMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.marker.states.select">https://api.highcharts.com/highstock/plotOptions.macd.marker.states.select</a>
   *
   * @implspec select?: PlotMacdMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMacdMarkerStatesSelectOptions value);
}
