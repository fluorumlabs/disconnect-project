package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.states">https://api.highcharts.com/highcharts/plotOptions.bubble.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.states">https://api.highcharts.com/highstock/plotOptions.bubble.states</a>
 *
 */
public interface PlotBubbleStatesOptions extends Any {
  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.states.hover">https://api.highcharts.com/highcharts/plotOptions.bubble.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.states.hover">https://api.highcharts.com/highstock/plotOptions.bubble.states.hover</a>
   *
   * @implspec hover?: PlotBubbleStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBubbleStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bubble.states.hover">https://api.highcharts.com/highcharts/plotOptions.bubble.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bubble.states.hover">https://api.highcharts.com/highstock/plotOptions.bubble.states.hover</a>
   *
   * @implspec hover?: PlotBubbleStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBubbleStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bubble.states.normal">https://api.highcharts.com/highmaps/plotOptions.bubble.states.normal</a>
   *
   * @implspec normal?: PlotBubbleStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBubbleStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bubble.states.normal">https://api.highcharts.com/highmaps/plotOptions.bubble.states.normal</a>
   *
   * @implspec normal?: PlotBubbleStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBubbleStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bubble.states.select">https://api.highcharts.com/highmaps/plotOptions.bubble.states.select</a>
   *
   * @implspec select?: PlotBubbleStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBubbleStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bubble.states.select">https://api.highcharts.com/highmaps/plotOptions.bubble.states.select</a>
   *
   * @implspec select?: PlotBubbleStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBubbleStatesSelectOptions value);
}
