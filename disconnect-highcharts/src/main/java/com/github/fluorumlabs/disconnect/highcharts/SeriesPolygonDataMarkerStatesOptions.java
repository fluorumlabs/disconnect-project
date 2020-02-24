package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states">https://api.highcharts.com/highcharts/series.polygon.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states">https://api.highcharts.com/highstock/series.polygon.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states">https://api.highcharts.com/highmaps/series.polygon.data.marker.states</a>
 *
 */
public interface SeriesPolygonDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.hover">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.hover">https://api.highcharts.com/highstock/series.polygon.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.hover">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesPolygonDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesPolygonDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.hover">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.hover">https://api.highcharts.com/highstock/series.polygon.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.hover">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesPolygonDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesPolygonDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.normal">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.normal">https://api.highcharts.com/highstock/series.polygon.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.normal">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesPolygonDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesPolygonDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.normal">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.normal">https://api.highcharts.com/highstock/series.polygon.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.normal">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesPolygonDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesPolygonDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.select">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.select">https://api.highcharts.com/highstock/series.polygon.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.select">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.select</a>
   *
   * @implspec select?: SeriesPolygonDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesPolygonDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.polygon.data.marker.states.select">https://api.highcharts.com/highcharts/series.polygon.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.polygon.data.marker.states.select">https://api.highcharts.com/highstock/series.polygon.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.polygon.data.marker.states.select">https://api.highcharts.com/highmaps/series.polygon.data.marker.states.select</a>
   *
   * @implspec select?: SeriesPolygonDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesPolygonDataMarkerStatesSelectOptions value);
}
