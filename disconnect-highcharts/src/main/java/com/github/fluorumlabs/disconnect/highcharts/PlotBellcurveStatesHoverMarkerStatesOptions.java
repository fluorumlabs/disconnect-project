package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states</a>
 *
 */
public interface PlotBellcurveStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBellcurveStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBellcurveStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBellcurveStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBellcurveStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotBellcurveStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBellcurveStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.bellcurve.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotBellcurveStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBellcurveStatesHoverMarkerStatesSelectOptions value);
}
