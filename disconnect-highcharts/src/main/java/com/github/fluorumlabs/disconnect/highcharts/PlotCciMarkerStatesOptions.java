package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states">https://api.highcharts.com/highstock/plotOptions.cci.marker.states</a>
 *
 */
public interface PlotCciMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.hover</a>
   *
   * @implspec hover?: PlotCciMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotCciMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.hover</a>
   *
   * @implspec hover?: PlotCciMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotCciMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.normal</a>
   *
   * @implspec normal?: PlotCciMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotCciMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.normal</a>
   *
   * @implspec normal?: PlotCciMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotCciMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.select">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.select</a>
   *
   * @implspec select?: PlotCciMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotCciMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.marker.states.select">https://api.highcharts.com/highstock/plotOptions.cci.marker.states.select</a>
   *
   * @implspec select?: PlotCciMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotCciMarkerStatesSelectOptions value);
}
