package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotIkhParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.index">https://api.highcharts.com/highstock/plotOptions.ikh.params.index</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.index">https://api.highcharts.com/highstock/plotOptions.ikh.params.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.period">https://api.highcharts.com/highstock/plotOptions.ikh.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.period">https://api.highcharts.com/highstock/plotOptions.ikh.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) The base period for Senkou Span B calculations
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.periodSenkouSpanB">https://api.highcharts.com/highstock/plotOptions.ikh.params.periodSenkouSpanB</a>
   *
   * @implspec periodSenkouSpanB?: number;
   *
   */
  @JSProperty("periodSenkouSpanB")
  double getPeriodSenkouSpanB();

  /**
   * (Highstock) The base period for Senkou Span B calculations
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.periodSenkouSpanB">https://api.highcharts.com/highstock/plotOptions.ikh.params.periodSenkouSpanB</a>
   *
   * @implspec periodSenkouSpanB?: number;
   *
   */
  @JSProperty("periodSenkouSpanB")
  void setPeriodSenkouSpanB(double value);

  /**
   * (Highstock) The base period for Tenkan calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.periodTenkan">https://api.highcharts.com/highstock/plotOptions.ikh.params.periodTenkan</a>
   *
   * @implspec periodTenkan?: number;
   *
   */
  @JSProperty("periodTenkan")
  double getPeriodTenkan();

  /**
   * (Highstock) The base period for Tenkan calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.ikh.params.periodTenkan">https://api.highcharts.com/highstock/plotOptions.ikh.params.periodTenkan</a>
   *
   * @implspec periodTenkan?: number;
   *
   */
  @JSProperty("periodTenkan")
  void setPeriodTenkan(double value);
}
