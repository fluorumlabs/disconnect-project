package com.github.fluorumlabs.disconnect.highcharts;

import js.web.pointerevents.PointerEvent;
import org.teavm.jso.JSProperty;

/**
 * A native browser mouse or touch event, extended with position information
 * relative to the Chart.container.
 *
 */
public interface PointerEventObject extends PointerEvent {
  /**
   * The X coordinate of the pointer interaction relative to the chart.
   *
   * @implspec chartX: number;
   *
   */
  @JSProperty("chartX")
  double getChartX();

  /**
   * The X coordinate of the pointer interaction relative to the chart.
   *
   * @implspec chartX: number;
   *
   */
  @JSProperty("chartX")
  void setChartX(double value);

  /**
   * The Y coordinate of the pointer interaction relative to the chart.
   *
   * @implspec chartY: number;
   *
   */
  @JSProperty("chartY")
  double getChartY();

  /**
   * The Y coordinate of the pointer interaction relative to the chart.
   *
   * @implspec chartY: number;
   *
   */
  @JSProperty("chartY")
  void setChartY(double value);
}
