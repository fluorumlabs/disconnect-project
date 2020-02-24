package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.states">https://api.highcharts.com/highcharts/plotOptions.histogram.states</a>
 *
 */
public interface PlotHistogramStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.states.hover">https://api.highcharts.com/highcharts/plotOptions.histogram.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.histogram.states.hover">https://api.highcharts.com/highstock/plotOptions.histogram.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.histogram.states.hover">https://api.highcharts.com/gantt/plotOptions.histogram.states.hover</a>
   *
   * @implspec hover?: PlotHistogramStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotHistogramStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.states.hover">https://api.highcharts.com/highcharts/plotOptions.histogram.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.histogram.states.hover">https://api.highcharts.com/highstock/plotOptions.histogram.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.histogram.states.hover">https://api.highcharts.com/gantt/plotOptions.histogram.states.hover</a>
   *
   * @implspec hover?: PlotHistogramStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotHistogramStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.histogram.states.normal">https://api.highcharts.com/highmaps/plotOptions.histogram.states.normal</a>
   *
   * @implspec normal?: PlotHistogramStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotHistogramStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.histogram.states.normal">https://api.highcharts.com/highmaps/plotOptions.histogram.states.normal</a>
   *
   * @implspec normal?: PlotHistogramStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotHistogramStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.states.select">https://api.highcharts.com/highcharts/plotOptions.histogram.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.histogram.states.select">https://api.highcharts.com/highstock/plotOptions.histogram.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.histogram.states.select">https://api.highcharts.com/gantt/plotOptions.histogram.states.select</a>
   *
   * @implspec select?: PlotHistogramStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotHistogramStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.histogram.states.select">https://api.highcharts.com/highcharts/plotOptions.histogram.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.histogram.states.select">https://api.highcharts.com/highstock/plotOptions.histogram.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.histogram.states.select">https://api.highcharts.com/gantt/plotOptions.histogram.states.select</a>
   *
   * @implspec select?: PlotHistogramStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotHistogramStatesSelectOptions value);
}
