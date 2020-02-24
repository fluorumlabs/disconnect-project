package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states</a>
 *
 */
public interface PlotAreasplinerangeStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotAreasplinerangeStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover">https://api.highcharts.com/highcharts/plotOptions.areasplinerange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover">https://api.highcharts.com/highstock/plotOptions.areasplinerange.states.hover</a>
   *
   * @implspec hover?: PlotAreasplinerangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotAreasplinerangeStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.normal">https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotAreasplinerangeStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.normal">https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.normal</a>
   *
   * @implspec normal?: PlotAreasplinerangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotAreasplinerangeStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.select">https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotAreasplinerangeStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.select">https://api.highcharts.com/highmaps/plotOptions.areasplinerange.states.select</a>
   *
   * @implspec select?: PlotAreasplinerangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotAreasplinerangeStatesSelectOptions value);
}
