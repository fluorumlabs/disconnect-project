package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.states">https://api.highcharts.com/highstock/plotOptions.ema.states</a>
 *
 */
public interface PlotEmaStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.states.hover">https://api.highcharts.com/highstock/plotOptions.ema.states.hover</a>
   *
   * @implspec hover?: PlotEmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotEmaStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ema.states.hover">https://api.highcharts.com/highstock/plotOptions.ema.states.hover</a>
   *
   * @implspec hover?: PlotEmaStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotEmaStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ema.states.normal">https://api.highcharts.com/highmaps/plotOptions.ema.states.normal</a>
   *
   * @implspec normal?: PlotEmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotEmaStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ema.states.normal">https://api.highcharts.com/highmaps/plotOptions.ema.states.normal</a>
   *
   * @implspec normal?: PlotEmaStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotEmaStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ema.states.select">https://api.highcharts.com/highmaps/plotOptions.ema.states.select</a>
   *
   * @implspec select?: PlotEmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotEmaStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.ema.states.select">https://api.highcharts.com/highmaps/plotOptions.ema.states.select</a>
   *
   * @implspec select?: PlotEmaStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotEmaStatesSelectOptions value);
}
