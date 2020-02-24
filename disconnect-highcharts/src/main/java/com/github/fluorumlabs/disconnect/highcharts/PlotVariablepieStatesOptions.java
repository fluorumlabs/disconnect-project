package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.states">https://api.highcharts.com/highcharts/plotOptions.variablepie.states</a>
 *
 */
public interface PlotVariablepieStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.states.hover">https://api.highcharts.com/highcharts/plotOptions.variablepie.states.hover</a>
   *
   * @implspec hover?: PlotVariablepieStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVariablepieStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variablepie.states.hover">https://api.highcharts.com/highcharts/plotOptions.variablepie.states.hover</a>
   *
   * @implspec hover?: PlotVariablepieStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVariablepieStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variablepie.states.normal">https://api.highcharts.com/highmaps/plotOptions.variablepie.states.normal</a>
   *
   * @implspec normal?: PlotVariablepieStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVariablepieStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variablepie.states.normal">https://api.highcharts.com/highmaps/plotOptions.variablepie.states.normal</a>
   *
   * @implspec normal?: PlotVariablepieStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVariablepieStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variablepie.states.select">https://api.highcharts.com/highmaps/plotOptions.variablepie.states.select</a>
   *
   * @implspec select?: PlotVariablepieStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVariablepieStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variablepie.states.select">https://api.highcharts.com/highmaps/plotOptions.variablepie.states.select</a>
   *
   * @implspec select?: PlotVariablepieStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVariablepieStatesSelectOptions value);
}
