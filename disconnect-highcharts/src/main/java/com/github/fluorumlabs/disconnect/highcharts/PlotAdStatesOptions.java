package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states">https://api.highcharts.com/highstock/plotOptions.ad.states</a>
 *
 */
public interface PlotAdStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.states.hover</a>
   *
   * @implspec hover?: PlotAdStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAdStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ad.states.hover">https://api.highcharts.com/highstock/plotOptions.ad.states.hover</a>
   *
   * @implspec hover?: PlotAdStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAdStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ad.states.normal">https://api.highcharts.com/highmaps/plotOptions.ad.states.normal</a>
   *
   * @implspec normal?: PlotAdStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAdStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ad.states.normal">https://api.highcharts.com/highmaps/plotOptions.ad.states.normal</a>
   *
   * @implspec normal?: PlotAdStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAdStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ad.states.select">https://api.highcharts.com/highmaps/plotOptions.ad.states.select</a>
   *
   * @implspec select?: PlotAdStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAdStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ad.states.select">https://api.highcharts.com/highmaps/plotOptions.ad.states.select</a>
   *
   * @implspec select?: PlotAdStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAdStatesSelectOptions value);
}
