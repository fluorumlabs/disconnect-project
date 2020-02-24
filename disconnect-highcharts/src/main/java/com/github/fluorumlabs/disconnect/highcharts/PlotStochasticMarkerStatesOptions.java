package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states</a>
 *
 */
public interface PlotStochasticMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.hover</a>
   *
   * @implspec hover?: PlotStochasticMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotStochasticMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.hover</a>
   *
   * @implspec hover?: PlotStochasticMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotStochasticMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.normal</a>
   *
   * @implspec normal?: PlotStochasticMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotStochasticMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.normal</a>
   *
   * @implspec normal?: PlotStochasticMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotStochasticMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.select">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.select</a>
   *
   * @implspec select?: PlotStochasticMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotStochasticMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.select">https://api.highcharts.com/highstock/plotOptions.stochastic.marker.states.select</a>
   *
   * @implspec select?: PlotStochasticMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotStochasticMarkerStatesSelectOptions value);
}
