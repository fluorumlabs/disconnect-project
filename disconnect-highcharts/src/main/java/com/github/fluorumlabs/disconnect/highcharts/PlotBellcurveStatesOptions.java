package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A wrapper object for all the series options in specific states.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states</a>
 *
 */
public interface PlotBellcurveStatesOptions extends Any {
  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  @Nullable
  PlotBellcurveStatesHoverOptions getHover();

  /**
   * (Highcharts) Options for the hovered series. These settings override the
   * normal state options when a series is moused over or touched.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover">https://api.highcharts.com/highcharts/plotOptions.bellcurve.states.hover</a>
   *
   * @implspec hover?: PlotBellcurveStatesHoverOptions;
   *
   */
  @JSProperty("hover")
  void setHover(PlotBellcurveStatesHoverOptions value);

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.normal">https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  @Nullable
  PlotBellcurveStatesNormalOptions getNormal();

  /**
   * (Highmaps) Overrides for the normal state.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.normal">https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.normal</a>
   *
   * @implspec normal?: PlotBellcurveStatesNormalOptions;
   *
   */
  @JSProperty("normal")
  void setNormal(PlotBellcurveStatesNormalOptions value);

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.select">https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.select</a>
   *
   * @implspec select?: PlotBellcurveStatesSelectOptions;
   *
   */
  @JSProperty("select")
  @Nullable
  PlotBellcurveStatesSelectOptions getSelect();

  /**
   * (Highmaps) Specific options for point in selected states, after being
   * selected by allowPointSelect or programmatically.
   *
   * @see <a href="https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.select">https://api.highcharts.com/highmaps/plotOptions.bellcurve.states.select</a>
   *
   * @implspec select?: PlotBellcurveStatesSelectOptions;
   *
   */
  @JSProperty("select")
  void setSelect(PlotBellcurveStatesSelectOptions value);
}
