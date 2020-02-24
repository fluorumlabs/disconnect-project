package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Axis-specific data of a selection.
 *
 */
public interface SelectDataObject extends Any {
  /**
   * @implspec axis: Axis;
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * @implspec axis: Axis;
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * @implspec max: number;
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * @implspec min: number;
   *
   */
  @JSProperty("min")
  void setMin(double value);
}
