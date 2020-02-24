package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) All options related with look and positiong of targets.
 *
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions</a>
 *
 */
public interface PlotBulletTargetOptions extends Any {
  /**
   * (Highcharts) The border color of the rectangle representing the target.
   * When not set, the point's border color is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderColor">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  @Nullable
  String getBorderColor();

  /**
   * (Highcharts) The border color of the rectangle representing the target.
   * When not set, the point's border color is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderColor">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderColor</a>
   *
   * @implspec borderColor?: ColorString;
   *
   */
  @JSProperty("borderColor")
  void setBorderColor(String value);

  /**
   * (Highcharts) The border width of the rectangle representing the target.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderWidth">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  double getBorderWidth();

  /**
   * (Highcharts) The border width of the rectangle representing the target.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderWidth">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.borderWidth</a>
   *
   * @implspec borderWidth?: number;
   *
   */
  @JSProperty("borderWidth")
  void setBorderWidth(double value);

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown getColor();

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(GradientColorObject value);

  /**
   * (Highcharts) The color of the rectangle representing the target. When not
   * set, point's color (if set in point's options - <code>color</code>) or zone of the
   * target value (if <code>zones</code> or <code>negativeColor</code> are set) or the same color as
   * the point has is used.
   *
   * In styled mode, use class <code>highcharts-bullet-target</code> instead.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.color</a>
   *
   * @implspec color?: (ColorString|GradientColorObject);
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * (Highcharts) The height of the rectangle representing the target.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.height">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts) The height of the rectangle representing the target.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.height">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.height</a>
   *
   * @implspec height?: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  @Nullable
  Unknown getWidth();

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highcharts) The width of the rectangle representing the target. Could be
   * set as a pixel value or as a percentage of a column width.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width">https://api.highcharts.com/highcharts/plotOptions.bullet.targetOptions.width</a>
   *
   * @implspec width?: (number|string);
   *
   */
  @JSProperty("width")
  void setWidth(String value);
}
