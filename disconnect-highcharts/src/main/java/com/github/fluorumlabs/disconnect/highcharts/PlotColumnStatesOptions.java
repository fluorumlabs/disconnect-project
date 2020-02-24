package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.states">https://api.highcharts.com/highcharts/plotOptions.column.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.states">https://api.highcharts.com/highstock/plotOptions.column.states</a>
 *
 */
public interface PlotColumnStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.states.hover">https://api.highcharts.com/highcharts/plotOptions.column.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.states.hover">https://api.highcharts.com/highstock/plotOptions.column.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.states.hover">https://api.highcharts.com/gantt/plotOptions.column.states.hover</a>
   *
   * @implspec hover?: PlotColumnStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotColumnStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.states.hover">https://api.highcharts.com/highcharts/plotOptions.column.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.states.hover">https://api.highcharts.com/highstock/plotOptions.column.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.states.hover">https://api.highcharts.com/gantt/plotOptions.column.states.hover</a>
   *
   * @implspec hover?: PlotColumnStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotColumnStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.column.states.normal">https://api.highcharts.com/highmaps/plotOptions.column.states.normal</a>
   *
   * @implspec normal?: PlotColumnStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotColumnStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.column.states.normal">https://api.highcharts.com/highmaps/plotOptions.column.states.normal</a>
   *
   * @implspec normal?: PlotColumnStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotColumnStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.states.select">https://api.highcharts.com/highcharts/plotOptions.column.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.states.select">https://api.highcharts.com/highstock/plotOptions.column.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.states.select">https://api.highcharts.com/gantt/plotOptions.column.states.select</a>
   *
   * @implspec select?: PlotColumnStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotColumnStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.column.states.select">https://api.highcharts.com/highcharts/plotOptions.column.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.column.states.select">https://api.highcharts.com/highstock/plotOptions.column.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.column.states.select">https://api.highcharts.com/gantt/plotOptions.column.states.select</a>
   *
   * @implspec select?: PlotColumnStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotColumnStatesSelectOptions value);
}
