package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * One position in relation to an axis.
 *
 */
public interface PointerAxisCoordinateObject extends Any {
  /**
   * Related axis.
   *
   * @implspec axis: Axis;
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * Related axis.
   *
   * @implspec axis: Axis;
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * Axis value.
   *
   * @implspec value: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Axis value.
   *
   * @implspec value: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);
}
