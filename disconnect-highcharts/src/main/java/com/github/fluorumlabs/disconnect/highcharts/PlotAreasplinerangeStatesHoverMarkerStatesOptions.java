package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states</a>
 *
 */
public interface PlotAreasplinerangeStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreasplinerangeStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreasplinerangeStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreasplinerangeStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreasplinerangeStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreasplinerangeStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreasplinerangeStatesHoverMarkerStatesSelectOptions value);
}
