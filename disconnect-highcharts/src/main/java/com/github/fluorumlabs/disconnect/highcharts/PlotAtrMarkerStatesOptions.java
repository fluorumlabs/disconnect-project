package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states">https://api.highcharts.com/highstock/plotOptions.atr.marker.states</a>
 *
 */
public interface PlotAtrMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAtrMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAtrMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAtrMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAtrMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.select</a>
   *
   * @implspec select?: PlotAtrMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAtrMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.marker.states.select</a>
   *
   * @implspec select?: PlotAtrMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAtrMarkerStatesSelectOptions value);
}
