package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.states">https://api.highcharts.com/highstock/plotOptions.psar.states</a>
 *
 */
public interface PlotPsarStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.states.hover">https://api.highcharts.com/highstock/plotOptions.psar.states.hover</a>
   *
   * @implspec hover?: PlotPsarStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPsarStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.states.hover">https://api.highcharts.com/highstock/plotOptions.psar.states.hover</a>
   *
   * @implspec hover?: PlotPsarStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPsarStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.psar.states.normal">https://api.highcharts.com/highmaps/plotOptions.psar.states.normal</a>
   *
   * @implspec normal?: PlotPsarStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPsarStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.psar.states.normal">https://api.highcharts.com/highmaps/plotOptions.psar.states.normal</a>
   *
   * @implspec normal?: PlotPsarStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPsarStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.psar.states.select">https://api.highcharts.com/highmaps/plotOptions.psar.states.select</a>
   *
   * @implspec select?: PlotPsarStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPsarStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.psar.states.select">https://api.highcharts.com/highmaps/plotOptions.psar.states.select</a>
   *
   * @implspec select?: PlotPsarStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPsarStatesSelectOptions value);
}
