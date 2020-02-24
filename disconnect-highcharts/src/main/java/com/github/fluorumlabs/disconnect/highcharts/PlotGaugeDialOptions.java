package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the dial or arrow pointer of the gauge.
 *
 * In styled mode, the dial is styled with the <code>.highcharts-gauge-series .highcharts-dial</code> rule.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial">https://api.highcharts.com/highcharts/plotOptions.gauge.dial</a>
 *
 */
public interface PlotGaugeDialOptions extends Any {
  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  Unknown getBackgroundColor();

  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(GradientColorObject value);

  /**
   * (Highcharts) The background or fill color of the gauge's dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.backgroundColor</a>
   *
   * @implspec backgroundColor?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * (Highcharts) The length of the dial's base part, relative to the total
   * radius or length of the dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseLength">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseLength</a>
   *
   * @implspec baseLength?: string;
   *
   */
  @JSProperty("baseLength")
  @Nullable
  String getBaseLength();

  /**
   * (Highcharts) The length of the dial's base part, relative to the total
   * radius or length of the dial.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseLength">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseLength</a>
   *
   * @implspec baseLength?: string;
   *
   */
  @JSProperty("baseLength")
  void setBaseLength(String value);

  /**
   * (Highcharts) The pixel width of the base of the gauge dial. The base is
   * the part closest to the pivot, defined by baseLength.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseWidth</a>
   *
   * @implspec baseWidth?: number;
   *
   */
  @JSProperty("baseWidth")
  double getBaseWidth();

  /**
   * (Highcharts) The pixel width of the base of the gauge dial. The base is
   * the part closest to the pivot, defined by baseLength.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.baseWidth</a>
   *
   * @implspec baseWidth?: number;
   *
   */
  @JSProperty("baseWidth")
  void setBaseWidth(double value);

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The border color or stroke of the gauge's dial. By default,
   * the borderWidth is 0, so this must be set in addition to a custom border
   * color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderColor">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) The width of the gauge dial border in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The width of the gauge dial border in pixels.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The radius or length of the dial, in percentages relative to
   * the radius of the gauge itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.radius">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.radius</a>
   *
   * @implspec radius?: string;
   *
   */
  @JSProperty("radius")
  @Nullable
  String getRadius();

  /**
   * (Highcharts) The radius or length of the dial, in percentages relative to
   * the radius of the gauge itself.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.radius">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.radius</a>
   *
   * @implspec radius?: string;
   *
   */
  @JSProperty("radius")
  void setRadius(String value);

  /**
   * (Highcharts) The length of the dial's rear end, the part that extends out
   * on the other side of the pivot. Relative to the dial's length.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.rearLength">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.rearLength</a>
   *
   * @implspec rearLength?: string;
   *
   */
  @JSProperty("rearLength")
  @Nullable
  String getRearLength();

  /**
   * (Highcharts) The length of the dial's rear end, the part that extends out
   * on the other side of the pivot. Relative to the dial's length.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.rearLength">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.rearLength</a>
   *
   * @implspec rearLength?: string;
   *
   */
  @JSProperty("rearLength")
  void setRearLength(String value);

  /**
   * (Highcharts) The width of the top of the dial, closest to the perimeter.
   * The pivot narrows in from the base to the top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.topWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.topWidth</a>
   *
   * @implspec topWidth?: number;
   *
   */
  @JSProperty("topWidth")
  double getTopWidth();

  /**
   * (Highcharts) The width of the top of the dial, closest to the perimeter.
   * The pivot narrows in from the base to the top.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.gauge.dial.topWidth">https://api.highcharts.com/highcharts/plotOptions.gauge.dial.topWidth</a>
   *
   * @implspec topWidth?: number;
   *
   */
  @JSProperty("topWidth")
  void setTopWidth(double value);
}
