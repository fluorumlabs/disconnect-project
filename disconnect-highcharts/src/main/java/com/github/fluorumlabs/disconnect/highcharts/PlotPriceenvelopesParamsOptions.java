package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotPriceenvelopesParamsOptions extends Any {
  /**
   * (Highstock) Percentage below the moving average that should be displayed.
   * 0.1 means 90%. Relative to the calculated value.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.bottomBand">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.bottomBand</a>
   *
   * @implspec bottomBand?: number;
   *
   */
  @JSProperty("bottomBand")
  double getBottomBand();

  /**
   * (Highstock) Percentage below the moving average that should be displayed.
   * 0.1 means 90%. Relative to the calculated value.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.bottomBand">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.bottomBand</a>
   *
   * @implspec bottomBand?: number;
   *
   */
  @JSProperty("bottomBand")
  void setBottomBand(double value);

  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.index">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.index</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.index">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.index</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.period">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.period">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) Percentage above the moving average that should be displayed.
   * 0.1 means 110%. Relative to the calculated value.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.topBand">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.topBand</a>
   *
   * @implspec topBand?: number;
   *
   */
  @JSProperty("topBand")
  double getTopBand();

  /**
   * (Highstock) Percentage above the moving average that should be displayed.
   * 0.1 means 110%. Relative to the calculated value.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.topBand">https://api.highcharts.com/highstock/plotOptions.priceenvelopes.params.topBand</a>
   *
   * @implspec topBand?: number;
   *
   */
  @JSProperty("topBand")
  void setTopBand(double value);
}
