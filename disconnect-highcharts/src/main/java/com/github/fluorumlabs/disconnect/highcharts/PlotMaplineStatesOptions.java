package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states">https://api.highcharts.com/highmaps/plotOptions.mapline.states</a>
 *
 */
public interface PlotMaplineStatesOptions extends Any {
  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapline.states.hover</a>
   *
   * @implspec hover?: PlotMaplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMaplineStatesHoverOptions getHover();

  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.hover">https://api.highcharts.com/highmaps/plotOptions.mapline.states.hover</a>
   *
   * @implspec hover?: PlotMaplineStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMaplineStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapline.states.normal</a>
   *
   * @implspec normal?: PlotMaplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMaplineStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.normal">https://api.highcharts.com/highmaps/plotOptions.mapline.states.normal</a>
   *
   * @implspec normal?: PlotMaplineStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMaplineStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.select">https://api.highcharts.com/highmaps/plotOptions.mapline.states.select</a>
   *
   * @implspec select?: PlotMaplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMaplineStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mapline.states.select">https://api.highcharts.com/highmaps/plotOptions.mapline.states.select</a>
   *
   * @implspec select?: PlotMaplineStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMaplineStatesSelectOptions value);
}
