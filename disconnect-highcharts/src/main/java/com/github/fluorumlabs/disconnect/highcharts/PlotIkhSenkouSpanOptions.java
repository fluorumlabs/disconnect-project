package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for area between Senkou Span A and B
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan</a>
 *
 */
public interface PlotIkhSenkouSpanOptions extends Any {
  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is above Senkou Span B. Note that if a <code>style.fill</code> is defined,
   * the <code>color</code> takes precedence and the <code>style.fill</code> is ignored.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("color")
  void setColor(Any value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  @Nullable
  Unknown getNegativeColor();

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(GradientColorObject value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(String value);

  /**
   * (Highstock) Color of the area between Senkou Span A and B, when Senkou
   * Span A is under Senkou Span B.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor">https://api.highcharts.com/highstock/plotOptions.ikh.senkouSpan.negativeColor</a>
   *
   * @implspec negativeColor?: (ColorString|GradientColorObject|object);
   *
   */
  @JSProperty("negativeColor")
  void setNegativeColor(Any value);

  /**
   * @implspec styles?: PlotIkhSenkouSpanStylesOptions;
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotIkhSenkouSpanStylesOptions getStyles();

  /**
   * @implspec styles?: PlotIkhSenkouSpanStylesOptions;
   *
   */
  @JSProperty("styles")
  void setStyles(PlotIkhSenkouSpanStylesOptions value);
}
