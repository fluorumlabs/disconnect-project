package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Containing the position of a box that should be avoided by labels.
 *
 */
public interface LabelIntersectBoxObject extends Any {
  /**
   * @implspec bottom: number;
   *
   */
  @JSProperty("bottom")
  double getBottom();

  /**
   * @implspec bottom: number;
   *
   */
  @JSProperty("bottom")
  void setBottom(double value);

  /**
   * @implspec left: number;
   *
   */
  @JSProperty("left")
  double getLeft();

  /**
   * @implspec left: number;
   *
   */
  @JSProperty("left")
  void setLeft(double value);

  /**
   * @implspec right: number;
   *
   */
  @JSProperty("right")
  double getRight();

  /**
   * @implspec right: number;
   *
   */
  @JSProperty("right")
  void setRight(double value);

  /**
   * @implspec top: number;
   *
   */
  @JSProperty("top")
  double getTop();

  /**
   * @implspec top: number;
   *
   */
  @JSProperty("top")
  void setTop(double value);
}
