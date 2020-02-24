package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) A wrapper object for all the series options in
 * specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.states">https://api.highcharts.com/highcharts/plotOptions.heatmap.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states">https://api.highcharts.com/highmaps/plotOptions.heatmap.states</a>
 *
 */
public interface PlotHeatmapStatesOptions extends Any {
  /**
   * (Highcharts, Highmaps) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.states.hover">https://api.highcharts.com/highcharts/plotOptions.heatmap.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.hover">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.hover</a>
   *
   * @implspec hover?: PlotHeatmapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotHeatmapStatesHoverOptions getHover();

  /**
   * (Highcharts, Highmaps) Options for the hovered series. These settings
   * override the normal state options when a series is moused over or
   * touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.heatmap.states.hover">https://api.highcharts.com/highcharts/plotOptions.heatmap.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.hover">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.hover</a>
   *
   * @implspec hover?: PlotHeatmapStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotHeatmapStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.normal">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.normal</a>
   *
   * @implspec normal?: PlotHeatmapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotHeatmapStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.normal">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.normal</a>
   *
   * @implspec normal?: PlotHeatmapStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotHeatmapStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.select">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.select</a>
   *
   * @implspec select?: PlotHeatmapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotHeatmapStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.heatmap.states.select">https://api.highcharts.com/highmaps/plotOptions.heatmap.states.select</a>
   *
   * @implspec select?: PlotHeatmapStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotHeatmapStatesSelectOptions value);
}
