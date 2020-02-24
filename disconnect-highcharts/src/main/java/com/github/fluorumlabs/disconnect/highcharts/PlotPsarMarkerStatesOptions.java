package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states">https://api.highcharts.com/highstock/plotOptions.psar.marker.states</a>
 *
 */
public interface PlotPsarMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.hover</a>
   *
   * @implspec hover?: PlotPsarMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPsarMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.hover</a>
   *
   * @implspec hover?: PlotPsarMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPsarMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.normal</a>
   *
   * @implspec normal?: PlotPsarMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPsarMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.normal</a>
   *
   * @implspec normal?: PlotPsarMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPsarMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.select">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.select</a>
   *
   * @implspec select?: PlotPsarMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPsarMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.marker.states.select">https://api.highcharts.com/highstock/plotOptions.psar.marker.states.select</a>
   *
   * @implspec select?: PlotPsarMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPsarMarkerStatesSelectOptions value);
}
