package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotIkhSenkouSpanStylesOptions extends Any {
  /**
   * (Highstock) Color of the area between Senkou Span A and B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.styles.fill">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.styles.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  @Nullable
  String getFill();

  /**
   * (Highstock) Color of the area between Senkou Span A and B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.styles.fill">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.styles.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  void setFill(String value);
}
