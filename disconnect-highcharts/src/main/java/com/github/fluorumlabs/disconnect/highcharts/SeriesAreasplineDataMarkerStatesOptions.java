package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states">https://api.highcharts.com/highstock/series.areaspline.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states</a>
 *
 */
public interface SeriesAreasplineDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesAreasplineDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesAreasplineDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.hover">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesAreasplineDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesAreasplineDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesAreasplineDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesAreasplineDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.normal">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesAreasplineDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesAreasplineDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.select">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.select">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.select">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.select</a>
   *
   * @implspec select?: SeriesAreasplineDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesAreasplineDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.select">https://api.highcharts.com/highcharts/series.areaspline.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.areaspline.data.marker.states.select">https://api.highcharts.com/highstock/series.areaspline.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.select">https://api.highcharts.com/highmaps/series.areaspline.data.marker.states.select</a>
   *
   * @implspec select?: SeriesAreasplineDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesAreasplineDataMarkerStatesSelectOptions value);
}
