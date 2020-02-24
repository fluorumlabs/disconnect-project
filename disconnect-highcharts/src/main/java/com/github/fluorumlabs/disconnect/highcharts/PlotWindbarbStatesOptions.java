package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states">https://api.highcharts.com/highcharts/plotOptions.windbarb.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states">https://api.highcharts.com/highstock/plotOptions.windbarb.states</a>
 *
 */
public interface PlotWindbarbStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.hover">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.hover">https://api.highcharts.com/highstock/plotOptions.windbarb.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.hover">https://api.highcharts.com/gantt/plotOptions.windbarb.states.hover</a>
   *
   * @implspec hover?: PlotWindbarbStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotWindbarbStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.hover">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.hover">https://api.highcharts.com/highstock/plotOptions.windbarb.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.hover">https://api.highcharts.com/gantt/plotOptions.windbarb.states.hover</a>
   *
   * @implspec hover?: PlotWindbarbStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotWindbarbStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.windbarb.states.normal">https://api.highcharts.com/highmaps/plotOptions.windbarb.states.normal</a>
   *
   * @implspec normal?: PlotWindbarbStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotWindbarbStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.windbarb.states.normal">https://api.highcharts.com/highmaps/plotOptions.windbarb.states.normal</a>
   *
   * @implspec normal?: PlotWindbarbStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotWindbarbStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select</a>
   *
   * @implspec select?: PlotWindbarbStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotWindbarbStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select">https://api.highcharts.com/highcharts/plotOptions.windbarb.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.windbarb.states.select">https://api.highcharts.com/highstock/plotOptions.windbarb.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.windbarb.states.select">https://api.highcharts.com/gantt/plotOptions.windbarb.states.select</a>
   *
   * @implspec select?: PlotWindbarbStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotWindbarbStatesSelectOptions value);
}
