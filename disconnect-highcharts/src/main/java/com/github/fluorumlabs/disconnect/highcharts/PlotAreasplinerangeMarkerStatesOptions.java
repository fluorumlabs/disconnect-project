package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states</a>
 *
 */
public interface PlotAreasplinerangeMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreasplinerangeMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreasplinerangeMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreasplinerangeMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreasplinerangeMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreasplinerangeMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areasplinerange.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreasplinerangeMarkerStatesSelectOptions value);
}
