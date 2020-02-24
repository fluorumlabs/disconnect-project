package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states</a>
 *
 */
public interface SeriesScatter3dDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesScatter3dDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesScatter3dDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.hover">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesScatter3dDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesScatter3dDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesScatter3dDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesScatter3dDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.normal">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesScatter3dDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesScatter3dDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.select</a>
   *
   * @implspec select?: SeriesScatter3dDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesScatter3dDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highcharts/series.scatter3d.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highstock/series.scatter3d.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.select">https://api.highcharts.com/highmaps/series.scatter3d.data.marker.states.select</a>
   *
   * @implspec select?: SeriesScatter3dDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesScatter3dDataMarkerStatesSelectOptions value);
}
