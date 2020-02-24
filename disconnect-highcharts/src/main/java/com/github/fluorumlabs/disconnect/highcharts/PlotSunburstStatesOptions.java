package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states">https://api.highcharts.com/highcharts/plotOptions.sunburst.states</a>
 *
 */
public interface PlotSunburstStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover</a>
   *
   * @implspec hover?: PlotSunburstStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotSunburstStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover">https://api.highcharts.com/highcharts/plotOptions.sunburst.states.hover</a>
   *
   * @implspec hover?: PlotSunburstStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotSunburstStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.normal">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.normal</a>
   *
   * @implspec normal?: PlotSunburstStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotSunburstStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.normal">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.normal</a>
   *
   * @implspec normal?: PlotSunburstStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotSunburstStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select</a>
   *
   * @implspec select?: PlotSunburstStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotSunburstStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select">https://api.highcharts.com/highmaps/plotOptions.sunburst.states.select</a>
   *
   * @implspec select?: PlotSunburstStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotSunburstStatesSelectOptions value);
}
