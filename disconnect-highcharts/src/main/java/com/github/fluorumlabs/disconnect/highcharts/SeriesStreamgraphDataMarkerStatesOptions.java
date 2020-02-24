package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states</a>
 *
 */
public interface SeriesStreamgraphDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesStreamgraphDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesStreamgraphDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.hover">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesStreamgraphDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesStreamgraphDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesStreamgraphDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesStreamgraphDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.normal">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesStreamgraphDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesStreamgraphDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.select</a>
   *
   * @implspec select?: SeriesStreamgraphDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesStreamgraphDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highcharts/series.streamgraph.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highstock/series.streamgraph.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.select">https://api.highcharts.com/highmaps/series.streamgraph.data.marker.states.select</a>
   *
   * @implspec select?: SeriesStreamgraphDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesStreamgraphDataMarkerStatesSelectOptions value);
}
