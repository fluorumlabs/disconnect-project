package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Senkou Span B line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpanB">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpanB</a>
 *
 */
public interface PlotIkhSenkouSpanBOptions extends Any {
  /**
   * @implspec styles?: PlotIkhSenkouSpanBStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhSenkouSpanBStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhSenkouSpanBStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhSenkouSpanBStylesOptions value);
}
