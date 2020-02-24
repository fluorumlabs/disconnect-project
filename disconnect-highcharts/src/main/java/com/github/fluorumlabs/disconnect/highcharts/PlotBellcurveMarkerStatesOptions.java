package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states</a>
 *
 */
public interface PlotBellcurveMarkerStatesOptions extends Any {
  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBellcurveMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBellcurveMarkerStatesHoverOptions value);

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBellcurveMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBellcurveMarkerStatesNormalOptions value);

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.select</a>
   *
   * @implspec select?: PlotBellcurveMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBellcurveMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.bellcurve.marker.states.select</a>
   *
   * @implspec select?: PlotBellcurveMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBellcurveMarkerStatesSelectOptions value);
}
