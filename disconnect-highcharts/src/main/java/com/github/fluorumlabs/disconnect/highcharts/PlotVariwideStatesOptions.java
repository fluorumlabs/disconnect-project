package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.states">https://api.highcharts.com/highcharts/plotOptions.variwide.states</a>
 *
 */
public interface PlotVariwideStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.states.hover">https://api.highcharts.com/highcharts/plotOptions.variwide.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.variwide.states.hover">https://api.highcharts.com/highstock/plotOptions.variwide.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.variwide.states.hover">https://api.highcharts.com/gantt/plotOptions.variwide.states.hover</a>
   *
   * @implspec hover?: PlotVariwideStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotVariwideStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.states.hover">https://api.highcharts.com/highcharts/plotOptions.variwide.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.variwide.states.hover">https://api.highcharts.com/highstock/plotOptions.variwide.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.variwide.states.hover">https://api.highcharts.com/gantt/plotOptions.variwide.states.hover</a>
   *
   * @implspec hover?: PlotVariwideStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotVariwideStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variwide.states.normal">https://api.highcharts.com/highmaps/plotOptions.variwide.states.normal</a>
   *
   * @implspec normal?: PlotVariwideStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotVariwideStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.variwide.states.normal">https://api.highcharts.com/highmaps/plotOptions.variwide.states.normal</a>
   *
   * @implspec normal?: PlotVariwideStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotVariwideStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.states.select">https://api.highcharts.com/highcharts/plotOptions.variwide.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.variwide.states.select">https://api.highcharts.com/highstock/plotOptions.variwide.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.variwide.states.select">https://api.highcharts.com/gantt/plotOptions.variwide.states.select</a>
   *
   * @implspec select?: PlotVariwideStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotVariwideStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.variwide.states.select">https://api.highcharts.com/highcharts/plotOptions.variwide.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.variwide.states.select">https://api.highcharts.com/highstock/plotOptions.variwide.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.variwide.states.select">https://api.highcharts.com/gantt/plotOptions.variwide.states.select</a>
   *
   * @implspec select?: PlotVariwideStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotVariwideStatesSelectOptions value);
}
