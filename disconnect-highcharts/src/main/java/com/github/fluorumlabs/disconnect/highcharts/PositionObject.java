package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * An object containing <code>x</code> and <code>y</code> properties for the position of an element.
 *
 */
public interface PositionObject extends Any {
  /**
   * X position of the element.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * X position of the element.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Y position of the element.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Y position of the element.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
