package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Senkou Span A line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpanA">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpanA</a>
 *
 */
public interface PlotIkhSenkouSpanAOptions extends Any {
  /**
   * @implspec styles?: PlotIkhSenkouSpanAStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhSenkouSpanAStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhSenkouSpanAStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhSenkouSpanAStylesOptions value);
}
