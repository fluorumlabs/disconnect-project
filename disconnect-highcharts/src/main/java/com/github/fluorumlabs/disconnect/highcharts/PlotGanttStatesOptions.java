package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Gantt) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.states">https://api.highcharts.com/gantt/plotOptions.gantt.states</a>
 *
 */
public interface PlotGanttStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.states.hover">https://api.highcharts.com/highcharts/plotOptions.gantt.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.states.hover">https://api.highcharts.com/highstock/plotOptions.gantt.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.states.hover">https://api.highcharts.com/gantt/plotOptions.gantt.states.hover</a>
   *
   * @implspec hover?: PlotGanttStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotGanttStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.states.hover">https://api.highcharts.com/highcharts/plotOptions.gantt.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.states.hover">https://api.highcharts.com/highstock/plotOptions.gantt.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.states.hover">https://api.highcharts.com/gantt/plotOptions.gantt.states.hover</a>
   *
   * @implspec hover?: PlotGanttStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotGanttStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gantt.states.normal">https://api.highcharts.com/highmaps/plotOptions.gantt.states.normal</a>
   *
   * @implspec normal?: PlotGanttStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotGanttStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.gantt.states.normal">https://api.highcharts.com/highmaps/plotOptions.gantt.states.normal</a>
   *
   * @implspec normal?: PlotGanttStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotGanttStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.states.select">https://api.highcharts.com/highcharts/plotOptions.gantt.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.states.select">https://api.highcharts.com/highstock/plotOptions.gantt.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.states.select">https://api.highcharts.com/gantt/plotOptions.gantt.states.select</a>
   *
   * @implspec select?: PlotGanttStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotGanttStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gantt.states.select">https://api.highcharts.com/highcharts/plotOptions.gantt.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gantt.states.select">https://api.highcharts.com/highstock/plotOptions.gantt.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.gantt.states.select">https://api.highcharts.com/gantt/plotOptions.gantt.states.select</a>
   *
   * @implspec select?: PlotGanttStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotGanttStatesSelectOptions value);
}
