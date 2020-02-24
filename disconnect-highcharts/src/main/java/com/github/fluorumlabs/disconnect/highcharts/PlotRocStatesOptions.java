package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.states">https://api.highcharts.com/highstock/plotOptions.roc.states</a>
 *
 */
public interface PlotRocStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.states.hover">https://api.highcharts.com/highstock/plotOptions.roc.states.hover</a>
   *
   * @implspec hover?: PlotRocStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotRocStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.roc.states.hover">https://api.highcharts.com/highstock/plotOptions.roc.states.hover</a>
   *
   * @implspec hover?: PlotRocStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotRocStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.roc.states.normal">https://api.highcharts.com/highmaps/plotOptions.roc.states.normal</a>
   *
   * @implspec normal?: PlotRocStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotRocStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.roc.states.normal">https://api.highcharts.com/highmaps/plotOptions.roc.states.normal</a>
   *
   * @implspec normal?: PlotRocStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotRocStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.roc.states.select">https://api.highcharts.com/highmaps/plotOptions.roc.states.select</a>
   *
   * @implspec select?: PlotRocStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotRocStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.roc.states.select">https://api.highcharts.com/highmaps/plotOptions.roc.states.select</a>
   *
   * @implspec select?: PlotRocStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotRocStatesSelectOptions value);
}
