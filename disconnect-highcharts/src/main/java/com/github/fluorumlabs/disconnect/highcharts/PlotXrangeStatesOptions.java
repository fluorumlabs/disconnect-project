package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states">https://api.highcharts.com/highcharts/plotOptions.xrange.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states">https://api.highcharts.com/highstock/plotOptions.xrange.states</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states">https://api.highcharts.com/gantt/plotOptions.xrange.states</a>
 *
 */
public interface PlotXrangeStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states.hover">https://api.highcharts.com/highcharts/plotOptions.xrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states.hover">https://api.highcharts.com/highstock/plotOptions.xrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states.hover">https://api.highcharts.com/gantt/plotOptions.xrange.states.hover</a>
   *
   * @implspec hover?: PlotXrangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotXrangeStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states.hover">https://api.highcharts.com/highcharts/plotOptions.xrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states.hover">https://api.highcharts.com/highstock/plotOptions.xrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states.hover">https://api.highcharts.com/gantt/plotOptions.xrange.states.hover</a>
   *
   * @implspec hover?: PlotXrangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotXrangeStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.states.normal">https://api.highcharts.com/highmaps/plotOptions.xrange.states.normal</a>
   *
   * @implspec normal?: PlotXrangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotXrangeStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.xrange.states.normal">https://api.highcharts.com/highmaps/plotOptions.xrange.states.normal</a>
   *
   * @implspec normal?: PlotXrangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotXrangeStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states.select">https://api.highcharts.com/highcharts/plotOptions.xrange.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states.select">https://api.highcharts.com/highstock/plotOptions.xrange.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states.select">https://api.highcharts.com/gantt/plotOptions.xrange.states.select</a>
   *
   * @implspec select?: PlotXrangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotXrangeStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.states.select">https://api.highcharts.com/highcharts/plotOptions.xrange.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.states.select">https://api.highcharts.com/highstock/plotOptions.xrange.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.states.select">https://api.highcharts.com/gantt/plotOptions.xrange.states.select</a>
   *
   * @implspec select?: PlotXrangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotXrangeStatesSelectOptions value);
}
