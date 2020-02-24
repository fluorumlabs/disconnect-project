package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * An object containing <code>left</code> and <code>top</code> properties for the position in the
 * page.
 *
 */
public interface OffsetObject extends Any {
  /**
   * Left distance to the page border.
   *
   * @implspec left: number;
   *
   */
  @JSProperty("left")
  double getLeft();

  /**
   * Left distance to the page border.
   *
   * @implspec left: number;
   *
   */
  @JSProperty("left")
  void setLeft(double value);

  /**
   * Top distance to the page border.
   *
   * @implspec top: number;
   *
   */
  @JSProperty("top")
  double getTop();

  /**
   * Top distance to the page border.
   *
   * @implspec top: number;
   *
   */
  @JSProperty("top")
  void setTop(double value);
}
