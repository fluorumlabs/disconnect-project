package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) A wrapper object for all the series options
 * in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.states">https://api.highcharts.com/highcharts/plotOptions.series.states</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.states">https://api.highcharts.com/highstock/plotOptions.series.states</a>
 * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states">https://api.highcharts.com/highmaps/plotOptions.series.states</a>
 *
 */
public interface PlotSeriesStatesOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Options for the hovered series. These
   * settings override the normal state options when a series is moused over
   * or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.states.hover">https://api.highcharts.com/highcharts/plotOptions.series.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.states.hover">https://api.highcharts.com/highstock/plotOptions.series.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.hover">https://api.highcharts.com/highmaps/plotOptions.series.states.hover</a>
   *
   * @implspec hover?: PlotSeriesStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSeriesStatesHoverOptions getHover();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the hovered series. These
   * settings override the normal state options when a series is moused over
   * or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.series.states.hover">https://api.highcharts.com/highcharts/plotOptions.series.states.hover</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.series.states.hover">https://api.highcharts.com/highstock/plotOptions.series.states.hover</a>
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.hover">https://api.highcharts.com/highmaps/plotOptions.series.states.hover</a>
   *
   * @implspec hover?: PlotSeriesStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSeriesStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.normal">https://api.highcharts.com/highmaps/plotOptions.series.states.normal</a>
   *
   * @implspec normal?: PlotSeriesStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSeriesStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.normal">https://api.highcharts.com/highmaps/plotOptions.series.states.normal</a>
   *
   * @implspec normal?: PlotSeriesStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSeriesStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.select">https://api.highcharts.com/highmaps/plotOptions.series.states.select</a>
   *
   * @implspec select?: PlotSeriesStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSeriesStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.series.states.select">https://api.highcharts.com/highmaps/plotOptions.series.states.select</a>
   *
   * @implspec select?: PlotSeriesStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSeriesStatesSelectOptions value);
}
