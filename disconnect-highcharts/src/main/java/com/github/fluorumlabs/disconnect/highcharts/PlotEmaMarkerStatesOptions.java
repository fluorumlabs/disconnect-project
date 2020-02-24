package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states">https://api.highcharts.com/highstock/plotOptions.ema.marker.states</a>
 *
 */
public interface PlotEmaMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.hover</a>
   *
   * @implspec hover?: PlotEmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotEmaMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.hover</a>
   *
   * @implspec hover?: PlotEmaMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotEmaMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.normal</a>
   *
   * @implspec normal?: PlotEmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotEmaMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.normal</a>
   *
   * @implspec normal?: PlotEmaMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotEmaMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.select</a>
   *
   * @implspec select?: PlotEmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotEmaMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ema.marker.states.select</a>
   *
   * @implspec select?: PlotEmaMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotEmaMarkerStatesSelectOptions value);
}
