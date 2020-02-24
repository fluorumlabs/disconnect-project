package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.states">https://api.highcharts.com/highstock/plotOptions.cci.states</a>
 *
 */
public interface PlotCciStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.states.hover">https://api.highcharts.com/highstock/plotOptions.cci.states.hover</a>
   *
   * @implspec hover?: PlotCciStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotCciStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cci.states.hover">https://api.highcharts.com/highstock/plotOptions.cci.states.hover</a>
   *
   * @implspec hover?: PlotCciStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotCciStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cci.states.normal">https://api.highcharts.com/highmaps/plotOptions.cci.states.normal</a>
   *
   * @implspec normal?: PlotCciStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotCciStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cci.states.normal">https://api.highcharts.com/highmaps/plotOptions.cci.states.normal</a>
   *
   * @implspec normal?: PlotCciStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotCciStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cci.states.select">https://api.highcharts.com/highmaps/plotOptions.cci.states.select</a>
   *
   * @implspec select?: PlotCciStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotCciStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cci.states.select">https://api.highcharts.com/highmaps/plotOptions.cci.states.select</a>
   *
   * @implspec select?: PlotCciStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotCciStatesSelectOptions value);
}
