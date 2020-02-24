package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Defines the start position and the end position for a gradient relative to
 * the shape. Start position (x1, y1) and end position (x2, y2) are relative to
 * the shape, where 0 means top/left and 1 is bottom/right.
 *
 */
public interface LinearGradientColorObject extends Any {
  /**
   * Start horizontal position of the gradient. Float ranges 0-1.
   *
   * @implspec x1: number;
   *
   */
  @JSProperty("x1")
  double getX1();

  /**
   * Start horizontal position of the gradient. Float ranges 0-1.
   *
   * @implspec x1: number;
   *
   */
  @JSProperty("x1")
  void setX1(double value);

  /**
   * End horizontal position of the gradient. Float ranges 0-1.
   *
   * @implspec x2: number;
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * End horizontal position of the gradient. Float ranges 0-1.
   *
   * @implspec x2: number;
   *
   */
  @JSProperty("x2")
  void setX2(double value);

  /**
   * Start vertical position of the gradient. Float ranges 0-1.
   *
   * @implspec y1: number;
   *
   */
  @JSProperty("y1")
  double getY1();

  /**
   * Start vertical position of the gradient. Float ranges 0-1.
   *
   * @implspec y1: number;
   *
   */
  @JSProperty("y1")
  void setY1(double value);

  /**
   * End vertical position of the gradient. Float ranges 0-1.
   *
   * @implspec y2: number;
   *
   */
  @JSProperty("y2")
  double getY2();

  /**
   * End vertical position of the gradient. Float ranges 0-1.
   *
   * @implspec y2: number;
   *
   */
  @JSProperty("y2")
  void setY2(double value);
}
