package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotMacdParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.index">https://api.highcharts.com/highstock/plotOptions.macd.params.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.index">https://api.highcharts.com/highstock/plotOptions.macd.params.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) The long period for indicator calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.longPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.longPeriod</a>
   *
   * @implspec longPeriod?: number;
   *
   */
  @JSProperty("longPeriod")
  double getLongPeriod();

  /**
   * (Highstock) The long period for indicator calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.longPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.longPeriod</a>
   *
   * @implspec longPeriod?: number;
   *
   */
  @JSProperty("longPeriod")
  void setLongPeriod(double value);

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.period">https://api.highcharts.com/highstock/plotOptions.macd.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.period">https://api.highcharts.com/highstock/plotOptions.macd.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) The short period for indicator calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.shortPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.shortPeriod</a>
   *
   * @implspec shortPeriod?: number;
   *
   */
  @JSProperty("shortPeriod")
  double getShortPeriod();

  /**
   * (Highstock) The short period for indicator calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.shortPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.shortPeriod</a>
   *
   * @implspec shortPeriod?: number;
   *
   */
  @JSProperty("shortPeriod")
  void setShortPeriod(double value);

  /**
   * (Highstock) The base period for signal calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.signalPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.signalPeriod</a>
   *
   * @implspec signalPeriod?: number;
   *
   */
  @JSProperty("signalPeriod")
  double getSignalPeriod();

  /**
   * (Highstock) The base period for signal calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.macd.params.signalPeriod">https://api.highcharts.com/highstock/plotOptions.macd.params.signalPeriod</a>
   *
   * @implspec signalPeriod?: number;
   *
   */
  @JSProperty("signalPeriod")
  void setSignalPeriod(double value);
}
