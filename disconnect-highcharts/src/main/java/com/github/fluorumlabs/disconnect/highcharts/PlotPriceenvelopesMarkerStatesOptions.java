package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) States for a single point marker.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states</a>
 *
 */
public interface PlotPriceenvelopesMarkerStatesOptions extends Any {
  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover</a>
   *
   * @implspec hover?: PlotPriceenvelopesMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPriceenvelopesMarkerStatesHoverOptions getHover();

  /**
   * (Highstock) The hover state for a single point marker.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.hover</a>
   *
   * @implspec hover?: PlotPriceenvelopesMarkerStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPriceenvelopesMarkerStatesHoverOptions value);

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.normal</a>
   *
   * @implspec normal?: PlotPriceenvelopesMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPriceenvelopesMarkerStatesNormalOptions getNormal();

  /**
   * (Highstock) The normal state of a single point marker. Currently only
   * used for setting animation when returning to normal state from hover.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.normal">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.normal</a>
   *
   * @implspec normal?: PlotPriceenvelopesMarkerStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPriceenvelopesMarkerStatesNormalOptions value);

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.select">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.select</a>
   *
   * @implspec select?: PlotPriceenvelopesMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPriceenvelopesMarkerStatesSelectOptions getSelect();

  /**
   * (Highstock) The appearance of the point marker when selected. In order to
   * allow a point to be selected, set the <code>series.allowPointSelect</code> option to
   * true.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.select">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.marker.states.select</a>
   *
   * @implspec select?: PlotPriceenvelopesMarkerStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPriceenvelopesMarkerStatesSelectOptions value);
}
