package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface AxisLabelsFormatterContextObject extends Any {
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
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  Chart getChart();

  /**
   * @implspec chart: Chart;
   *
   */
  @JSProperty("chart")
  void setChart(Chart value);

  /**
   * @implspec isFirst: boolean;
   *
   */
  @JSProperty("isFirst")
  boolean getIsFirst();

  /**
   * @implspec isFirst: boolean;
   *
   */
  @JSProperty("isFirst")
  void setIsFirst(boolean value);

  /**
   * @implspec isLast: boolean;
   *
   */
  @JSProperty("isLast")
  boolean getIsLast();

  /**
   * @implspec isLast: boolean;
   *
   */
  @JSProperty("isLast")
  void setIsLast(boolean value);

  /**
   * @implspec value: number;
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * @implspec value: number;
   *
   */
  @JSProperty("value")
  void setValue(double value);
}
