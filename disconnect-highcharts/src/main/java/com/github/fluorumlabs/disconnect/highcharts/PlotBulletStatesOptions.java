package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.states">https://api.highcharts.com/highcharts/plotOptions.bullet.states</a>
 *
 */
public interface PlotBulletStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.states.hover">https://api.highcharts.com/highcharts/plotOptions.bullet.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bullet.states.hover">https://api.highcharts.com/highstock/plotOptions.bullet.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bullet.states.hover">https://api.highcharts.com/gantt/plotOptions.bullet.states.hover</a>
   *
   * @implspec hover?: PlotBulletStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBulletStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Gantt) Options for the hovered point. These
   * settings override the normal state options when a point is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.states.hover">https://api.highcharts.com/highcharts/plotOptions.bullet.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bullet.states.hover">https://api.highcharts.com/highstock/plotOptions.bullet.states.hover</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bullet.states.hover">https://api.highcharts.com/gantt/plotOptions.bullet.states.hover</a>
   *
   * @implspec hover?: PlotBulletStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBulletStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bullet.states.normal">https://api.highcharts.com/highmaps/plotOptions.bullet.states.normal</a>
   *
   * @implspec normal?: PlotBulletStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBulletStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bullet.states.normal">https://api.highcharts.com/highmaps/plotOptions.bullet.states.normal</a>
   *
   * @implspec normal?: PlotBulletStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBulletStatesNormalOptions value);

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.states.select">https://api.highcharts.com/highcharts/plotOptions.bullet.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bullet.states.select">https://api.highcharts.com/highstock/plotOptions.bullet.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bullet.states.select">https://api.highcharts.com/gantt/plotOptions.bullet.states.select</a>
   *
   * @implspec select?: PlotBulletStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBulletStatesSelectOptions getSelect();

  /**
   * (Highcharts, Highstock, Gantt) Options for the selected point. These
   * settings override the normal state options when a point is selected.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.states.select">https://api.highcharts.com/highcharts/plotOptions.bullet.states.select</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bullet.states.select">https://api.highcharts.com/highstock/plotOptions.bullet.states.select</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.bullet.states.select">https://api.highcharts.com/gantt/plotOptions.bullet.states.select</a>
   *
   * @implspec select?: PlotBulletStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBulletStatesSelectOptions value);
}
