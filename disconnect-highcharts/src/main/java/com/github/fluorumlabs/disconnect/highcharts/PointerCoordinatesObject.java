package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Pointer coordinates.
 *
 */
public interface PointerCoordinatesObject extends Any {
  /**
   * @implspec chartX: number;
   *
   */
  @JSProperty("chartX")
  double getChartX();

  /**
   * @implspec chartX: number;
   *
   */
  @JSProperty("chartX")
  void setChartX(double value);

  /**
   * @implspec chartY: number;
   *
   */
  @JSProperty("chartY")
  double getChartY();

  /**
   * @implspec chartY: number;
   *
   */
  @JSProperty("chartY")
  void setChartY(double value);
}
