package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states</a>
 *
 */
public interface PlotPriceenvelopesStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states.hover">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states.hover</a>
   *
   * @implspec hover?: PlotPriceenvelopesStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPriceenvelopesStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states.hover">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.states.hover</a>
   *
   * @implspec hover?: PlotPriceenvelopesStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPriceenvelopesStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.normal">https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.normal</a>
   *
   * @implspec normal?: PlotPriceenvelopesStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPriceenvelopesStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.normal">https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.normal</a>
   *
   * @implspec normal?: PlotPriceenvelopesStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPriceenvelopesStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.select">https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.select</a>
   *
   * @implspec select?: PlotPriceenvelopesStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPriceenvelopesStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.select">https://api.highcharts.com/highmaps/plotOptions.priceenvelopes.states.select</a>
   *
   * @implspec select?: PlotPriceenvelopesStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPriceenvelopesStatesSelectOptions value);
}
