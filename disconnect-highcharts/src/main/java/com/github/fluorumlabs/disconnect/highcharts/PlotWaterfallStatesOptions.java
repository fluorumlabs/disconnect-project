package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states">https://api.highcharts.com/highcharts/plotOptions.waterfall.states</a>
 *
 */
public interface PlotWaterfallStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states.hover">https://api.highcharts.com/highcharts/plotOptions.waterfall.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.states.hover">https://api.highcharts.com/highstock/plotOptions.waterfall.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.states.hover">https://api.highcharts.com/gantt/plotOptions.waterfall.states.hover</a>
   *
   * @implspec hover?: PlotWaterfallStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotWaterfallStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states.hover">https://api.highcharts.com/highcharts/plotOptions.waterfall.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.states.hover">https://api.highcharts.com/highstock/plotOptions.waterfall.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.states.hover">https://api.highcharts.com/gantt/plotOptions.waterfall.states.hover</a>
   *
   * @implspec hover?: PlotWaterfallStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotWaterfallStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.states.normal">https://api.highcharts.com/highmaps/plotOptions.waterfall.states.normal</a>
   *
   * @implspec normal?: PlotWaterfallStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotWaterfallStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.waterfall.states.normal">https://api.highcharts.com/highmaps/plotOptions.waterfall.states.normal</a>
   *
   * @implspec normal?: PlotWaterfallStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotWaterfallStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states.select">https://api.highcharts.com/highcharts/plotOptions.waterfall.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.states.select">https://api.highcharts.com/highstock/plotOptions.waterfall.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.states.select">https://api.highcharts.com/gantt/plotOptions.waterfall.states.select</a>
   *
   * @implspec select?: PlotWaterfallStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotWaterfallStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.waterfall.states.select">https://api.highcharts.com/highcharts/plotOptions.waterfall.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.waterfall.states.select">https://api.highcharts.com/highstock/plotOptions.waterfall.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.waterfall.states.select">https://api.highcharts.com/gantt/plotOptions.waterfall.states.select</a>
   *
   * @implspec select?: PlotWaterfallStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotWaterfallStatesSelectOptions value);
}
