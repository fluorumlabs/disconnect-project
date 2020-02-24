package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states">https://api.highcharts.com/highmaps/plotOptions.map.states</a>
 *
 */
public interface PlotMapStatesOptions extends Any {
  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.hover">https://api.highcharts.com/highmaps/plotOptions.map.states.hover</a>
   *
   * @implspec hover?: PlotMapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotMapStatesHoverOptions getHover();

  /**
   * (Highmaps) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.hover">https://api.highcharts.com/highmaps/plotOptions.map.states.hover</a>
   *
   * @implspec hover?: PlotMapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotMapStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.normal">https://api.highcharts.com/highmaps/plotOptions.map.states.normal</a>
   *
   * @implspec normal?: PlotMapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotMapStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.normal">https://api.highcharts.com/highmaps/plotOptions.map.states.normal</a>
   *
   * @implspec normal?: PlotMapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotMapStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.select">https://api.highcharts.com/highmaps/plotOptions.map.states.select</a>
   *
   * @implspec select?: PlotMapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotMapStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.map.states.select">https://api.highcharts.com/highmaps/plotOptions.map.states.select</a>
   *
   * @implspec select?: PlotMapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotMapStatesSelectOptions value);
}
