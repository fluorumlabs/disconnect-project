package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states">https://api.highcharts.com/highstock/plotOptions.atr.states</a>
 *
 */
public interface PlotAtrStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAtrStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.atr.states.hover">https://api.highcharts.com/highstock/plotOptions.atr.states.hover</a>
   *
   * @implspec hover?: PlotAtrStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAtrStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.atr.states.normal">https://api.highcharts.com/highmaps/plotOptions.atr.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAtrStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.atr.states.normal">https://api.highcharts.com/highmaps/plotOptions.atr.states.normal</a>
   *
   * @implspec normal?: PlotAtrStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAtrStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.atr.states.select">https://api.highcharts.com/highmaps/plotOptions.atr.states.select</a>
   *
   * @implspec select?: PlotAtrStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAtrStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.atr.states.select">https://api.highcharts.com/highmaps/plotOptions.atr.states.select</a>
   *
   * @implspec select?: PlotAtrStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAtrStatesSelectOptions value);
}
