package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states">https://api.highcharts.com/highstock/plotOptions.zigzag.states</a>
 *
 */
public interface PlotZigzagStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover</a>
   *
   * @implspec hover?: PlotZigzagStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotZigzagStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover">https://api.highcharts.com/highstock/plotOptions.zigzag.states.hover</a>
   *
   * @implspec hover?: PlotZigzagStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotZigzagStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.normal">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.normal</a>
   *
   * @implspec normal?: PlotZigzagStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotZigzagStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.normal">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.normal</a>
   *
   * @implspec normal?: PlotZigzagStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotZigzagStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.select">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.select</a>
   *
   * @implspec select?: PlotZigzagStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotZigzagStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.zigzag.states.select">https://api.highcharts.com/highmaps/plotOptions.zigzag.states.select</a>
   *
   * @implspec select?: PlotZigzagStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotZigzagStatesSelectOptions value);
}
