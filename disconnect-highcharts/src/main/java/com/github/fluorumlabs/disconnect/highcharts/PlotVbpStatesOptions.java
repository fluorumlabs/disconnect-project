package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.states">https://api.highcharts.com/highstock/plotOptions.vbp.states</a>
 *
 */
public interface PlotVbpStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.states.hover">https://api.highcharts.com/highstock/plotOptions.vbp.states.hover</a>
   *
   * @implspec hover?: PlotVbpStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVbpStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.states.hover">https://api.highcharts.com/highstock/plotOptions.vbp.states.hover</a>
   *
   * @implspec hover?: PlotVbpStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVbpStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vbp.states.normal">https://api.highcharts.com/highmaps/plotOptions.vbp.states.normal</a>
   *
   * @implspec normal?: PlotVbpStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVbpStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vbp.states.normal">https://api.highcharts.com/highmaps/plotOptions.vbp.states.normal</a>
   *
   * @implspec normal?: PlotVbpStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVbpStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vbp.states.select">https://api.highcharts.com/highmaps/plotOptions.vbp.states.select</a>
   *
   * @implspec select?: PlotVbpStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVbpStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.vbp.states.select">https://api.highcharts.com/highmaps/plotOptions.vbp.states.select</a>
   *
   * @implspec select?: PlotVbpStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVbpStatesSelectOptions value);
}
