package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states</a>
 *
 */
public interface PlotScatterMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatterMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatterMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatterMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatterMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatterMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatterMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatterMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatterMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.select</a>
   *
   * @implspec select?: PlotScatterMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatterMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter.marker.states.select</a>
   *
   * @implspec select?: PlotScatterMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatterMarkerStatesSelectOptions value);
}
