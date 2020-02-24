package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states</a>
 *
 */
public interface PlotAdStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAdStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAdStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAdStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAdStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAdStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAdStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAdStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAdStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAdStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAdStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.ad.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.ad.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAdStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAdStatesHoverMarkerStatesSelectOptions value);
}
