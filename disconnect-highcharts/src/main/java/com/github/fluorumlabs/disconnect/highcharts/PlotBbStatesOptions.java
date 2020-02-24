package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states">https://api.highcharts.com/highstock/plotOptions.bb.states</a>
 *
 */
public interface PlotBbStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.states.hover</a>
   *
   * @implspec hover?: PlotBbStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBbStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.states.hover">https://api.highcharts.com/highstock/plotOptions.bb.states.hover</a>
   *
   * @implspec hover?: PlotBbStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBbStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bb.states.normal">https://api.highcharts.com/highmaps/plotOptions.bb.states.normal</a>
   *
   * @implspec normal?: PlotBbStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBbStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bb.states.normal">https://api.highcharts.com/highmaps/plotOptions.bb.states.normal</a>
   *
   * @implspec normal?: PlotBbStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBbStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bb.states.select">https://api.highcharts.com/highmaps/plotOptions.bb.states.select</a>
   *
   * @implspec select?: PlotBbStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBbStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bb.states.select">https://api.highcharts.com/highmaps/plotOptions.bb.states.select</a>
   *
   * @implspec select?: PlotBbStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBbStatesSelectOptions value);
}
