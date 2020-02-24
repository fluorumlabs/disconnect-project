package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.states">https://api.highcharts.com/highcharts/plotOptions.arearange.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.states">https://api.highcharts.com/highstock/plotOptions.arearange.states</a>
 *
 */
public interface PlotArearangeStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.states.hover">https://api.highcharts.com/highcharts/plotOptions.arearange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.states.hover">https://api.highcharts.com/highstock/plotOptions.arearange.states.hover</a>
   *
   * @implspec hover?: PlotArearangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotArearangeStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.arearange.states.hover">https://api.highcharts.com/highcharts/plotOptions.arearange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.arearange.states.hover">https://api.highcharts.com/highstock/plotOptions.arearange.states.hover</a>
   *
   * @implspec hover?: PlotArearangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotArearangeStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.states.normal">https://api.highcharts.com/highmaps/plotOptions.arearange.states.normal</a>
   *
   * @implspec normal?: PlotArearangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotArearangeStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.states.normal">https://api.highcharts.com/highmaps/plotOptions.arearange.states.normal</a>
   *
   * @implspec normal?: PlotArearangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotArearangeStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.states.select">https://api.highcharts.com/highmaps/plotOptions.arearange.states.select</a>
   *
   * @implspec select?: PlotArearangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotArearangeStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.arearange.states.select">https://api.highcharts.com/highmaps/plotOptions.arearange.states.select</a>
   *
   * @implspec select?: PlotArearangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotArearangeStatesSelectOptions value);
}
