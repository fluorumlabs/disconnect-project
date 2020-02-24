package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * The font metrics.
 *
 */
public interface FontMetricsObject extends Any {
  /**
   * The baseline relative to the top of the box.
   *
   * @implspec b: number;
   *
   */
  @JSProperty("b")
  double getB();

  /**
   * The baseline relative to the top of the box.
   *
   * @implspec b: number;
   *
   */
  @JSProperty("b")
  void setB(double value);

  /**
   * The font size.
   *
   * @implspec f: number;
   *
   */
  @JSProperty("f")
  double getF();

  /**
   * The font size.
   *
   * @implspec f: number;
   *
   */
  @JSProperty("f")
  void setF(double value);

  /**
   * The line height.
   *
   * @implspec h: number;
   *
   */
  @JSProperty("h")
  double getH();

  /**
   * The line height.
   *
   * @implspec h: number;
   *
   */
  @JSProperty("h")
  void setH(double value);
}
