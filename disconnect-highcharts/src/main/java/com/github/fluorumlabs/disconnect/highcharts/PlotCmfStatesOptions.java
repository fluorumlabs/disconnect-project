package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.states">https://api.highcharts.com/highstock/plotOptions.cmf.states</a>
 *
 */
public interface PlotCmfStatesOptions extends Any {
  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.states.hover">https://api.highcharts.com/highstock/plotOptions.cmf.states.hover</a>
   *
   * @implspec hover?: PlotCmfStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotCmfStatesHoverOptions getHover();

  /**
   * (Highstock) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.states.hover">https://api.highcharts.com/highstock/plotOptions.cmf.states.hover</a>
   *
   * @implspec hover?: PlotCmfStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotCmfStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cmf.states.normal">https://api.highcharts.com/highmaps/plotOptions.cmf.states.normal</a>
   *
   * @implspec normal?: PlotCmfStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotCmfStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cmf.states.normal">https://api.highcharts.com/highmaps/plotOptions.cmf.states.normal</a>
   *
   * @implspec normal?: PlotCmfStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotCmfStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cmf.states.select">https://api.highcharts.com/highmaps/plotOptions.cmf.states.select</a>
   *
   * @implspec select?: PlotCmfStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotCmfStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.cmf.states.select">https://api.highcharts.com/highmaps/plotOptions.cmf.states.select</a>
   *
   * @implspec select?: PlotCmfStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotCmfStatesSelectOptions value);
}
