package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.states">https://api.highcharts.com/highcharts/plotOptions.pareto.states</a>
 *
 */
public interface PlotParetoStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.states.hover">https://api.highcharts.com/highcharts/plotOptions.pareto.states.hover</a>
   *
   * @implspec hover?: PlotParetoStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotParetoStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pareto.states.hover">https://api.highcharts.com/highcharts/plotOptions.pareto.states.hover</a>
   *
   * @implspec hover?: PlotParetoStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotParetoStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal</a>
   *
   * @implspec normal?: PlotParetoStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotParetoStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal">https://api.highcharts.com/highmaps/plotOptions.pareto.states.normal</a>
   *
   * @implspec normal?: PlotParetoStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotParetoStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.select">https://api.highcharts.com/highmaps/plotOptions.pareto.states.select</a>
   *
   * @implspec select?: PlotParetoStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotParetoStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pareto.states.select">https://api.highcharts.com/highmaps/plotOptions.pareto.states.select</a>
   *
   * @implspec select?: PlotParetoStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotParetoStatesSelectOptions value);
}
