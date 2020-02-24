package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Kijun line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.kijunLine">https://api.highcharts.com/highstock/plotOptions.ikh.kijunLine</a>
 *
 */
public interface PlotIkhKijunLineOptions extends Any {
  /**
   * @implspec styles?: PlotIkhKijunLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhKijunLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhKijunLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhKijunLineStylesOptions value);
}
