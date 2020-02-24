package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states</a>
 *
 */
public interface SeriesBellcurveDataMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesBellcurveDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  SeriesBellcurveDataMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.hover">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.hover</a>
   *
   * @implspec hover?: SeriesBellcurveDataMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(SeriesBellcurveDataMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesBellcurveDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  SeriesBellcurveDataMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.normal">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.normal</a>
   *
   * @implspec normal?: SeriesBellcurveDataMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(SeriesBellcurveDataMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.select</a>
   *
   * @implspec select?: SeriesBellcurveDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  SeriesBellcurveDataMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highcharts/series.bellcurve.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highstock/series.bellcurve.data.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.select">https://api.highcharts.com/highmaps/series.bellcurve.data.marker.states.select</a>
   *
   * @implspec select?: SeriesBellcurveDataMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(SeriesBellcurveDataMarkerStatesSelectOptions value);
}
