package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * A rectangle.
 *
 */
public interface RectangleObject extends Any {
  /**
   * Height of the rectangle.
   *
   * @implspec height: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the rectangle.
   *
   * @implspec height: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the rectangle.
   *
   * @implspec width: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the rectangle.
   *
   * @implspec width: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * Horizontal position of the rectangle.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal position of the rectangle.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical position of the rectangle.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical position of the rectangle.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
