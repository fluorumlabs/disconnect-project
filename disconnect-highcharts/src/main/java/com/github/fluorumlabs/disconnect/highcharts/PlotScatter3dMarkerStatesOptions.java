package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states</a>
 *
 */
public interface PlotScatter3dMarkerStatesOptions extends Any {
  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotScatter3dMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.hover</a>
   *
   * @implspec hover?: PlotScatter3dMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotScatter3dMarkerStatesHoverOptions value);

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotScatter3dMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.normal</a>
   *
   * @implspec normal?: PlotScatter3dMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotScatter3dMarkerStatesNormalOptions value);

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotScatter3dMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts) The appearance of the point marker when selected. In order
   * to allow a point to be selected, set the <code>series.allowPointSelect</code> option
   * to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.scatter3d.marker.states.select</a>
   *
   * @implspec select?: PlotScatter3dMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotScatter3dMarkerStatesSelectOptions value);
}
