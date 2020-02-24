package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Defines the center position and the radius for a gradient.
 *
 */
public interface RadialGradientColorObject extends Any {
  /**
   * Center horizontal position relative to the shape. Float ranges 0-1.
   *
   * @implspec cx: number;
   *
   */
  @JSProperty("cx")
  double getCx();

  /**
   * Center horizontal position relative to the shape. Float ranges 0-1.
   *
   * @implspec cx: number;
   *
   */
  @JSProperty("cx")
  void setCx(double value);

  /**
   * Center vertical position relative to the shape. Float ranges 0-1.
   *
   * @implspec cy: number;
   *
   */
  @JSProperty("cy")
  double getCy();

  /**
   * Center vertical position relative to the shape. Float ranges 0-1.
   *
   * @implspec cy: number;
   *
   */
  @JSProperty("cy")
  void setCy(double value);

  /**
   * Radius relative to the shape. Float ranges 0-1.
   *
   * @implspec r: number;
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * Radius relative to the shape. Float ranges 0-1.
   *
   * @implspec r: number;
   *
   */
  @JSProperty("r")
  void setR(double value);
}
