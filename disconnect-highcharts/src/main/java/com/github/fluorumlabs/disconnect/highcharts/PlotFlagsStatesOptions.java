package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states">https://api.highcharts.com/highstock/plotOptions.flags.states</a>
 *
 */
public interface PlotFlagsStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover">https://api.highcharts.com/highstock/plotOptions.flags.states.hover</a>
   *
   * @implspec hover?: PlotFlagsStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotFlagsStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered point. These settings override the
   * normal state options when a point is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.hover">https://api.highcharts.com/highstock/plotOptions.flags.states.hover</a>
   *
   * @implspec hover?: PlotFlagsStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotFlagsStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.flags.states.normal">https://api.highcharts.com/highmaps/plotOptions.flags.states.normal</a>
   *
   * @implspec normal?: PlotFlagsStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotFlagsStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.flags.states.normal">https://api.highcharts.com/highmaps/plotOptions.flags.states.normal</a>
   *
   * @implspec normal?: PlotFlagsStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotFlagsStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.select">https://api.highcharts.com/highcharts/plotOptions.flags.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.select">https://api.highcharts.com/highstock/plotOptions.flags.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.select">https://api.highcharts.com/gantt/plotOptions.flags.states.select</a>
   *
   * @implspec select?: PlotFlagsStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotFlagsStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.flags.states.select">https://api.highcharts.com/highcharts/plotOptions.flags.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.flags.states.select">https://api.highcharts.com/highstock/plotOptions.flags.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.flags.states.select">https://api.highcharts.com/gantt/plotOptions.flags.states.select</a>
   *
   * @implspec select?: PlotFlagsStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotFlagsStatesSelectOptions value);
}
