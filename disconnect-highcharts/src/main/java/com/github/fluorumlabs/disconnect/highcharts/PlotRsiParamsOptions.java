package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotRsiParamsOptions extends Any {
  /**
   * (Highstock) Number of maximum decimals that are used in RSI calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.params.decimals">https://api.highcharts.com/highstock/plotOptions.rsi.params.decimals</a>
   *
   * @implspec decimals?: number;
   *
   */
  @JSProperty("decimals")
  double getDecimals();

  /**
   * (Highstock) Number of maximum decimals that are used in RSI calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.params.decimals">https://api.highcharts.com/highstock/plotOptions.rsi.params.decimals</a>
   *
   * @implspec decimals?: number;
   *
   */
  @JSProperty("decimals")
  void setDecimals(double value);

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.params.period">https://api.highcharts.com/highstock/plotOptions.rsi.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.rsi.params.period">https://api.highcharts.com/highstock/plotOptions.rsi.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);
}
