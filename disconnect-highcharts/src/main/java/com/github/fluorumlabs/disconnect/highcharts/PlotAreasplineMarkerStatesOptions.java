package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states</a>
 *
 */
public interface PlotAreasplineMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreasplineMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplineMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreasplineMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreasplineMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplineMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreasplineMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreasplineMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areaspline.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areaspline.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplineMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreasplineMarkerStatesSelectOptions value);
}
