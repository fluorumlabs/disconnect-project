package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Positions in terms of axis values.
 *
 */
public interface PointerAxisCoordinatesObject extends Any {
  /**
   * Positions on the x-axis.
   *
   * @implspec xAxis: Array<PointerAxisCoordinateObject>;
   *
   */
  @JSProperty("xAxis")
  Array<PointerAxisCoordinateObject> getXAxis();

  /**
   * Positions on the x-axis.
   *
   * @implspec xAxis: Array<PointerAxisCoordinateObject>;
   *
   */
  @JSProperty("xAxis")
  void setXAxis(Array<PointerAxisCoordinateObject> value);

  /**
   * Positions on the y-axis.
   *
   * @implspec yAxis: Array<PointerAxisCoordinateObject>;
   *
   */
  @JSProperty("yAxis")
  Array<PointerAxisCoordinateObject> getYAxis();

  /**
   * Positions on the y-axis.
   *
   * @implspec yAxis: Array<PointerAxisCoordinateObject>;
   *
   */
  @JSProperty("yAxis")
  void setYAxis(Array<PointerAxisCoordinateObject> value);
}
