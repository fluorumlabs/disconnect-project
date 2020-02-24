package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states</a>
 *
 */
public interface PlotTilemapStatesHoverMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotTilemapStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotTilemapStatesHoverMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.hover</a>
   *
   * @implspec hover?: PlotTilemapStatesHoverMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotTilemapStatesHoverMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotTilemapStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotTilemapStatesHoverMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock) The normal state of a single point marker.
   * Currently only used for setting animation when returning to normal state
   * from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.normal</a>
   *
   * @implspec normal?: PlotTilemapStatesHoverMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotTilemapStatesHoverMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotTilemapStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotTilemapStatesHoverMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock) The appearance of the point marker when selected.
   * In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.tilemap.states.hover.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.select">https://api.highcharts.com/highstock/plotOptions.tilemap.states.hover.marker.states.select</a>
   *
   * @implspec select?: PlotTilemapStatesHoverMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotTilemapStatesHoverMarkerStatesSelectOptions value);
}
