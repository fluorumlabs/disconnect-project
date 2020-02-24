package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states">https://api.highcharts.com/highcharts/plotOptions.series.marker.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states">https://api.highcharts.com/highstock/plotOptions.series.marker.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states">https://api.highcharts.com/highmaps/plotOptions.series.marker.states</a>
 *
 */
public interface PlotSeriesMarkerStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.series.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.hover</a>
   *
   * @implspec hover?: PlotSeriesMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSeriesMarkerStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) The hover state for a single point
   * marker.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.hover">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.series.marker.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.hover">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.hover</a>
   *
   * @implspec hover?: PlotSeriesMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSeriesMarkerStatesHoverOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.series.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.normal</a>
   *
   * @implspec normal?: PlotSeriesMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSeriesMarkerStatesNormalOptions getNormal();

  /**
   * (Highcharts, Highstock, Highmaps) The normal state of a single point
   * marker. Currently only used for setting animation when returning to
   * normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.normal">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.series.marker.states.normal</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.normal">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.normal</a>
   *
   * @implspec normal?: PlotSeriesMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSeriesMarkerStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.select">https://api.highcharts.com/highstock/plotOptions.series.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.select</a>
   *
   * @implspec select?: PlotSeriesMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSeriesMarkerStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Highmaps) The appearance of the point marker when
   * selected. In order to allow a point to be selected, set the
   * <code>series.allowPointSelect</code> option to true.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.marker.states.select">https://api.highcharts.com/highcharts/plotOptions.series.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.marker.states.select">https://api.highcharts.com/highstock/plotOptions.series.marker.states.select</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.marker.states.select">https://api.highcharts.com/highmaps/plotOptions.series.marker.states.select</a>
   *
   * @implspec select?: PlotSeriesMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSeriesMarkerStatesSelectOptions value);
}
