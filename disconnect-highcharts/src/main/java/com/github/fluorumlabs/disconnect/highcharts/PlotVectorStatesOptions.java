package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states">https://api.highcharts.com/highcharts/plotOptions.vector.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states">https://api.highcharts.com/highstock/plotOptions.vector.states</a>
 *
 */
public interface PlotVectorStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.hover">https://api.highcharts.com/highcharts/plotOptions.vector.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.hover">https://api.highcharts.com/highstock/plotOptions.vector.states.hover</a>
   *
   * @implspec hover?: PlotVectorStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVectorStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.vector.states.hover">https://api.highcharts.com/highcharts/plotOptions.vector.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vector.states.hover">https://api.highcharts.com/highstock/plotOptions.vector.states.hover</a>
   *
   * @implspec hover?: PlotVectorStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVectorStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.states.normal">https://api.highcharts.com/highmaps/plotOptions.vector.states.normal</a>
   *
   * @implspec normal?: PlotVectorStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVectorStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.states.normal">https://api.highcharts.com/highmaps/plotOptions.vector.states.normal</a>
   *
   * @implspec normal?: PlotVectorStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVectorStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.states.select">https://api.highcharts.com/highmaps/plotOptions.vector.states.select</a>
   *
   * @implspec select?: PlotVectorStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVectorStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vector.states.select">https://api.highcharts.com/highmaps/plotOptions.vector.states.select</a>
   *
   * @implspec select?: PlotVectorStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVectorStatesSelectOptions value);
}
