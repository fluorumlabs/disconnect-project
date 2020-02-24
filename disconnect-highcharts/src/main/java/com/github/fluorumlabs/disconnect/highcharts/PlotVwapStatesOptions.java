package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.states">https://api.highcharts.com/highstock/plotOptions.vwap.states</a>
 *
 */
public interface PlotVwapStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.states.hover">https://api.highcharts.com/highstock/plotOptions.vwap.states.hover</a>
   *
   * @implspec hover?: PlotVwapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVwapStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.states.hover">https://api.highcharts.com/highstock/plotOptions.vwap.states.hover</a>
   *
   * @implspec hover?: PlotVwapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVwapStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vwap.states.normal">https://api.highcharts.com/highmaps/plotOptions.vwap.states.normal</a>
   *
   * @implspec normal?: PlotVwapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVwapStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vwap.states.normal">https://api.highcharts.com/highmaps/plotOptions.vwap.states.normal</a>
   *
   * @implspec normal?: PlotVwapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVwapStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vwap.states.select">https://api.highcharts.com/highmaps/plotOptions.vwap.states.select</a>
   *
   * @implspec select?: PlotVwapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVwapStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vwap.states.select">https://api.highcharts.com/highmaps/plotOptions.vwap.states.select</a>
   *
   * @implspec select?: PlotVwapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVwapStatesSelectOptions value);
}
