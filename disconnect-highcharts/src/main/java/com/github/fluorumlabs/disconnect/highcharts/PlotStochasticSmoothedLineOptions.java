package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Smoothed line options.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine">https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine</a>
 *
 */
public interface PlotStochasticSmoothedLineOptions extends Any {
  /**
   * (Highstock) Styles for a smoothed line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine.styles">https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine.styles</a>
   *
   * @implspec styles?: PlotStochasticSmoothedLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotStochasticSmoothedLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a smoothed line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine.styles">https://api.highcharts.com/highstock/plotOptions.stochastic.smoothedLine.styles</a>
   *
   * @implspec styles?: PlotStochasticSmoothedLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotStochasticSmoothedLineStylesOptions value);
}
