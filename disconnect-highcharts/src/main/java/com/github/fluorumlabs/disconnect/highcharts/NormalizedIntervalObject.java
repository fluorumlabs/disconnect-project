package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Normalized interval.
 *
 */
public interface NormalizedIntervalObject extends Any {
  /**
   * The count.
   *
   * @implspec count: number;
   *
   */
  @JSProperty("count")
  double getCount();

  /**
   * The count.
   *
   * @implspec count: number;
   *
   */
  @JSProperty("count")
  void setCount(double value);

  /**
   * The interval in axis values (ms).
   *
   * @implspec unitRange: number;
   *
   */
  @JSProperty("unitRange")
  double getUnitRange();

  /**
   * The interval in axis values (ms).
   *
   * @implspec unitRange: number;
   *
   */
  @JSProperty("unitRange")
  void setUnitRange(double value);
}
