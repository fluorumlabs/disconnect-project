package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states">https://api.highcharts.com/highcharts/series.cci.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states">https://api.highcharts.com/highstock/series.cci.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states">https://api.highcharts.com/highmaps/series.cci.data.marker.states</a>
 *
 */
public interface SeriesCciDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.hover">https://api.highcharts.com/highcharts/series.cci.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.hover">https://api.highcharts.com/highstock/series.cci.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.hover">https://api.highcharts.com/highmaps/series.cci.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesCciDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesCciDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.hover">https://api.highcharts.com/highcharts/series.cci.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.hover">https://api.highcharts.com/highstock/series.cci.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.hover">https://api.highcharts.com/highmaps/series.cci.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesCciDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesCciDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.normal">https://api.highcharts.com/highcharts/series.cci.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.normal">https://api.highcharts.com/highstock/series.cci.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.normal">https://api.highcharts.com/highmaps/series.cci.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesCciDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesCciDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.normal">https://api.highcharts.com/highcharts/series.cci.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.normal">https://api.highcharts.com/highstock/series.cci.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.normal">https://api.highcharts.com/highmaps/series.cci.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesCciDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesCciDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.select">https://api.highcharts.com/highcharts/series.cci.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.select">https://api.highcharts.com/highstock/series.cci.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.select">https://api.highcharts.com/highmaps/series.cci.data.marker.states.select</a>
   *
   * @implspec select?: SeriesCciDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesCciDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.cci.data.marker.states.select">https://api.highcharts.com/highcharts/series.cci.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.cci.data.marker.states.select">https://api.highcharts.com/highstock/series.cci.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.cci.data.marker.states.select">https://api.highcharts.com/highmaps/series.cci.data.marker.states.select</a>
   *
   * @implspec select?: SeriesCciDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesCciDataMarkerStatesSelectOptions value);
}
