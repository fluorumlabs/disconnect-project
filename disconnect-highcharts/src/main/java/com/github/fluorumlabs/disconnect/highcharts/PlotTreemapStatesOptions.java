package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states">https://api.highcharts.com/highcharts/plotOptions.treemap.states</a>
 *
 */
public interface PlotTreemapStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover</a>
   *
   * @implspec hover?: PlotTreemapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotTreemapStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover">https://api.highcharts.com/highcharts/plotOptions.treemap.states.hover</a>
   *
   * @implspec hover?: PlotTreemapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotTreemapStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.normal">https://api.highcharts.com/highmaps/plotOptions.treemap.states.normal</a>
   *
   * @implspec normal?: PlotTreemapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotTreemapStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.normal">https://api.highcharts.com/highmaps/plotOptions.treemap.states.normal</a>
   *
   * @implspec normal?: PlotTreemapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotTreemapStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.select">https://api.highcharts.com/highmaps/plotOptions.treemap.states.select</a>
   *
   * @implspec select?: PlotTreemapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotTreemapStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.treemap.states.select">https://api.highcharts.com/highmaps/plotOptions.treemap.states.select</a>
   *
   * @implspec select?: PlotTreemapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotTreemapStatesSelectOptions value);
}
