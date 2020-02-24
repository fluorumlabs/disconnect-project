package com.github.fluorumlabs.disconnect.highcharts;

import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for Chikou line
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.chikouLine">https://api.highcharts.com/highstock/plotOptions.ikh.chikouLine</a>
 *
 */
public interface PlotIkhChikouLineOptions extends Any {
  /**
   * @implspec styles?: PlotIkhChikouLineStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhChikouLineStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhChikouLineStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhChikouLineStylesOptions value);
}
