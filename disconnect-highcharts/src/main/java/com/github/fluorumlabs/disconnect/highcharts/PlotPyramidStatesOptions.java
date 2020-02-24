package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the series states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states">https://api.highcharts.com/highcharts/plotOptions.pyramid.states</a>
 *
 */
public interface PlotPyramidStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.hover">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.hover</a>
   *
   * @implspec hover?: PlotPyramidStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotPyramidStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.pyramid.states.hover">https://api.highcharts.com/highcharts/plotOptions.pyramid.states.hover</a>
   *
   * @implspec hover?: PlotPyramidStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotPyramidStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.normal">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.normal</a>
   *
   * @implspec normal?: PlotPyramidStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotPyramidStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.normal">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.normal</a>
   *
   * @implspec normal?: PlotPyramidStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotPyramidStatesNormalOptions value);

  /**
   * (Highmaps) Options for a selected funnel item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select</a>
   *
   * @implspec select?: PlotPyramidStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotPyramidStatesSelectOptions getSelect();

  /**
   * (Highmaps) Options for a selected funnel item.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select">https://api.highcharts.com/highmaps/plotOptions.pyramid.states.select</a>
   *
   * @implspec select?: PlotPyramidStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotPyramidStatesSelectOptions value);
}
