package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Position of the axis title.
 *
 */
public interface AxisTitlePositionObject extends Any {
  /**
   * X position.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * X position.
   *
   * @implspec x: number;
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Y position.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Y position.
   *
   * @implspec y: number;
   *
   */
  @JSProperty("y")
  void setY(double value);
}
