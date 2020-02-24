package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states">https://api.highcharts.com/highcharts/plotOptions.columnrange.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states">https://api.highcharts.com/highstock/plotOptions.columnrange.states</a>
 *
 */
public interface PlotColumnrangeStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states.hover">https://api.highcharts.com/highcharts/plotOptions.columnrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states.hover">https://api.highcharts.com/highstock/plotOptions.columnrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.states.hover">https://api.highcharts.com/gantt/plotOptions.columnrange.states.hover</a>
   *
   * @implspec hover?: PlotColumnrangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotColumnrangeStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states.hover">https://api.highcharts.com/highcharts/plotOptions.columnrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states.hover">https://api.highcharts.com/highstock/plotOptions.columnrange.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.states.hover">https://api.highcharts.com/gantt/plotOptions.columnrange.states.hover</a>
   *
   * @implspec hover?: PlotColumnrangeStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotColumnrangeStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.states.normal">https://api.highcharts.com/highmaps/plotOptions.columnrange.states.normal</a>
   *
   * @implspec normal?: PlotColumnrangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotColumnrangeStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.columnrange.states.normal">https://api.highcharts.com/highmaps/plotOptions.columnrange.states.normal</a>
   *
   * @implspec normal?: PlotColumnrangeStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotColumnrangeStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states.select">https://api.highcharts.com/highcharts/plotOptions.columnrange.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states.select">https://api.highcharts.com/highstock/plotOptions.columnrange.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.states.select">https://api.highcharts.com/gantt/plotOptions.columnrange.states.select</a>
   *
   * @implspec select?: PlotColumnrangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotColumnrangeStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.columnrange.states.select">https://api.highcharts.com/highcharts/plotOptions.columnrange.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.columnrange.states.select">https://api.highcharts.com/highstock/plotOptions.columnrange.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.columnrange.states.select">https://api.highcharts.com/gantt/plotOptions.columnrange.states.select</a>
   *
   * @implspec select?: PlotColumnrangeStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotColumnrangeStatesSelectOptions value);
}
