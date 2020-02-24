package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotZigzagParamsOptions extends Any {
  /**
   * (Highstock) The threshold for the value change.
   *
   * For example deviation=1 means the indicator will ignore all price
   * movements less than 1%.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.deviation">https://api.highcharts.com/highstock/plotOptions.zigzag.params.deviation</a>
   *
   * @implspec deviation?: number;
   *
   */
  @JSProperty("deviation")
  double getDeviation();

  /**
   * (Highstock) The threshold for the value change.
   *
   * For example deviation=1 means the indicator will ignore all price
   * movements less than 1%.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.deviation">https://api.highcharts.com/highstock/plotOptions.zigzag.params.deviation</a>
   *
   * @implspec deviation?: number;
   *
   */
  @JSProperty("deviation")
  void setDeviation(double value);

  /**
   * (Highstock) The point index which indicator calculations will base - high
   * value.
   *
   * For example using OHLC data, index=1 means the indicator will be
   * calculated using High values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.highIndex">https://api.highcharts.com/highstock/plotOptions.zigzag.params.highIndex</a>
   *
   * @implspec highIndex?: number;
   *
   */
  @JSProperty("highIndex")
  double getHighIndex();

  /**
   * (Highstock) The point index which indicator calculations will base - high
   * value.
   *
   * For example using OHLC data, index=1 means the indicator will be
   * calculated using High values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.highIndex">https://api.highcharts.com/highstock/plotOptions.zigzag.params.highIndex</a>
   *
   * @implspec highIndex?: number;
   *
   */
  @JSProperty("highIndex")
  void setHighIndex(double value);

  /**
   * (Highstock) The point index which indicator calculations will base - low
   * value.
   *
   * For example using OHLC data, index=2 means the indicator will be
   * calculated using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.lowIndex">https://api.highcharts.com/highstock/plotOptions.zigzag.params.lowIndex</a>
   *
   * @implspec lowIndex?: number;
   *
   */
  @JSProperty("lowIndex")
  double getLowIndex();

  /**
   * (Highstock) The point index which indicator calculations will base - low
   * value.
   *
   * For example using OHLC data, index=2 means the indicator will be
   * calculated using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.zigzag.params.lowIndex">https://api.highcharts.com/highstock/plotOptions.zigzag.params.lowIndex</a>
   *
   * @implspec lowIndex?: number;
   *
   */
  @JSProperty("lowIndex")
  void setLowIndex(double value);
}
