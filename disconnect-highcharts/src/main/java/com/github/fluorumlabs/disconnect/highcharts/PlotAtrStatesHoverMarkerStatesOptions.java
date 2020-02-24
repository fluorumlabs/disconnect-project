package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states</a>
 *
 */
public interface PlotAtrStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAtrStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAtrStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAtrStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAtrStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAtrStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAtrStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.atr.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.atr.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAtrStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAtrStatesHoverMarkerStatesSelectOptions value);
}
