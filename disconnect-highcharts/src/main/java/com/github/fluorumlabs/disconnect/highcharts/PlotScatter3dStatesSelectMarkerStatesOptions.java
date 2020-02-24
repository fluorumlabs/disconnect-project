package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states</a>
 *
 */
public interface PlotScatter3dStatesSelectMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatter3dStatesSelectMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesSelectMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatter3dStatesSelectMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatter3dStatesSelectMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesSelectMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatter3dStatesSelectMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatter3dStatesSelectMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.select.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.select.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesSelectMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatter3dStatesSelectMarkerStatesSelectOptions value);
}
