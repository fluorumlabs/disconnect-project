package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Top line options.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.topLine">https://api.highcharts.com/highstock/plotOptions.bb.topLine</a>
 *
 */
public interface PlotBbTopLineOptions extends Any {
  /**
   * (Highstock) Styles for a bottom line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.topLine.styles">https://api.highcharts.com/highstock/plotOptions.bb.topLine.styles</a>
   *
   * @implspec styles?: PlotBbTopLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotBbTopLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a bottom line.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.bb.topLine.styles">https://api.highcharts.com/highstock/plotOptions.bb.topLine.styles</a>
   *
   * @implspec styles?: PlotBbTopLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotBbTopLineStylesOptions value);
}
