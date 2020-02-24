package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states">https://api.highcharts.com/highmaps/plotOptions.mappoint.states</a>
 *
 */
public interface PlotMappointStatesOptions extends Any {
  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.hover">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.hover</a>
   *
   * @implspec hover?: PlotMappointStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMappointStatesHoverOptions getHover();

  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.hover">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.hover</a>
   *
   * @implspec hover?: PlotMappointStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMappointStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.normal">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.normal</a>
   *
   * @implspec normal?: PlotMappointStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMappointStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.normal">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.normal</a>
   *
   * @implspec normal?: PlotMappointStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMappointStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.select">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.select</a>
   *
   * @implspec select?: PlotMappointStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMappointStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.mappoint.states.select">https://api.highcharts.com/highmaps/plotOptions.mappoint.states.select</a>
   *
   * @implspec select?: PlotMappointStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMappointStatesSelectOptions value);
}
