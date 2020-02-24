package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states">https://api.highcharts.com/highstock/plotOptions.mfi.states</a>
 *
 */
public interface PlotMfiStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.states.hover</a>
   *
   * @implspec hover?: PlotMfiStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMfiStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.states.hover">https://api.highcharts.com/highstock/plotOptions.mfi.states.hover</a>
   *
   * @implspec hover?: PlotMfiStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMfiStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mfi.states.normal">https://api.highcharts.com/highmaps/plotOptions.mfi.states.normal</a>
   *
   * @implspec normal?: PlotMfiStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMfiStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mfi.states.normal">https://api.highcharts.com/highmaps/plotOptions.mfi.states.normal</a>
   *
   * @implspec normal?: PlotMfiStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMfiStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mfi.states.select">https://api.highcharts.com/highmaps/plotOptions.mfi.states.select</a>
   *
   * @implspec select?: PlotMfiStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMfiStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mfi.states.select">https://api.highcharts.com/highmaps/plotOptions.mfi.states.select</a>
   *
   * @implspec select?: PlotMfiStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMfiStatesSelectOptions value);
}
