package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states</a>
 *
 */
public interface PlotScatter3dStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatter3dStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatter3dStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatter3dStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatter3dStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatter3dStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.scatter3d.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatter3dStatesHoverMarkerStatesSelectOptions value);
}
