package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states">https://api.highcharts.com/highcharts/plotOptions.sankey.states</a>
 *
 */
public interface PlotSankeyStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states.hover">https://api.highcharts.com/highcharts/plotOptions.sankey.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.states.hover">https://api.highcharts.com/highstock/plotOptions.sankey.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.states.hover">https://api.highcharts.com/gantt/plotOptions.sankey.states.hover</a>
   *
   * @implspec hover?: PlotSankeyStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSankeyStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states.hover">https://api.highcharts.com/highcharts/plotOptions.sankey.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.states.hover">https://api.highcharts.com/highstock/plotOptions.sankey.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.states.hover">https://api.highcharts.com/gantt/plotOptions.sankey.states.hover</a>
   *
   * @implspec hover?: PlotSankeyStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSankeyStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.states.normal">https://api.highcharts.com/highmaps/plotOptions.sankey.states.normal</a>
   *
   * @implspec normal?: PlotSankeyStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSankeyStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sankey.states.normal">https://api.highcharts.com/highmaps/plotOptions.sankey.states.normal</a>
   *
   * @implspec normal?: PlotSankeyStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSankeyStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states.select">https://api.highcharts.com/highcharts/plotOptions.sankey.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.states.select">https://api.highcharts.com/highstock/plotOptions.sankey.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.states.select">https://api.highcharts.com/gantt/plotOptions.sankey.states.select</a>
   *
   * @implspec select?: PlotSankeyStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSankeyStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sankey.states.select">https://api.highcharts.com/highcharts/plotOptions.sankey.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.sankey.states.select">https://api.highcharts.com/highstock/plotOptions.sankey.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.sankey.states.select">https://api.highcharts.com/gantt/plotOptions.sankey.states.select</a>
   *
   * @implspec select?: PlotSankeyStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSankeyStatesSelectOptions value);
}
