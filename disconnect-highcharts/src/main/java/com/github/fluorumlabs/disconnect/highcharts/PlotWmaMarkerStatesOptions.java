package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states">https://api.highcharts.com/highstock/plotOptions.wma.marker.states</a>
 *
 */
public interface PlotWmaMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.hover</a>
   *
   * @implspec hover?: PlotWmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotWmaMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.hover</a>
   *
   * @implspec hover?: PlotWmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotWmaMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.normal</a>
   *
   * @implspec normal?: PlotWmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotWmaMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.normal</a>
   *
   * @implspec normal?: PlotWmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotWmaMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.select">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.select</a>
   *
   * @implspec select?: PlotWmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotWmaMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.wma.marker.states.select">https://api.highcharts.com/highstock/plotOptions.wma.marker.states.select</a>
   *
   * @implspec select?: PlotWmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotWmaMarkerStatesSelectOptions value);
}
