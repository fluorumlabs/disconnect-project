package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.states">https://api.highcharts.com/highcharts/plotOptions.bar.states</a>
 *
 */
public interface PlotBarStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.states.hover">https://api.highcharts.com/highcharts/plotOptions.bar.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bar.states.hover">https://api.highcharts.com/highstock/plotOptions.bar.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bar.states.hover">https://api.highcharts.com/gantt/plotOptions.bar.states.hover</a>
   *
   * @implspec hover?: PlotBarStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBarStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.states.hover">https://api.highcharts.com/highcharts/plotOptions.bar.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bar.states.hover">https://api.highcharts.com/highstock/plotOptions.bar.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bar.states.hover">https://api.highcharts.com/gantt/plotOptions.bar.states.hover</a>
   *
   * @implspec hover?: PlotBarStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBarStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bar.states.normal">https://api.highcharts.com/highmaps/plotOptions.bar.states.normal</a>
   *
   * @implspec normal?: PlotBarStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBarStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bar.states.normal">https://api.highcharts.com/highmaps/plotOptions.bar.states.normal</a>
   *
   * @implspec normal?: PlotBarStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBarStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.states.select">https://api.highcharts.com/highcharts/plotOptions.bar.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bar.states.select">https://api.highcharts.com/highstock/plotOptions.bar.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bar.states.select">https://api.highcharts.com/gantt/plotOptions.bar.states.select</a>
   *
   * @implspec select?: PlotBarStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBarStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bar.states.select">https://api.highcharts.com/highcharts/plotOptions.bar.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bar.states.select">https://api.highcharts.com/highstock/plotOptions.bar.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bar.states.select">https://api.highcharts.com/gantt/plotOptions.bar.states.select</a>
   *
   * @implspec select?: PlotBarStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBarStatesSelectOptions value);
}
