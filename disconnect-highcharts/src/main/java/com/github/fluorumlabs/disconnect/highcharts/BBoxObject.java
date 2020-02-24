package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Bounding box of an element.
 *
 */
public interface BBoxObject extends Any {
  /**
   * Height of the bounding box.
   *
   * @implspec height: number;
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the bounding box.
   *
   * @implspec height: number;
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the bounding box.
   *
   * @implspec width: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the bounding box.
   *
   * @implspec width: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * Horizontal position of the bounding box.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal position of the bounding box.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical position of the bounding box.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical position of the bounding box.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
