package com.github.fluorumlabs.disconnect.highcharts;

import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotPsarParamsOptions extends Any {
  /**
   * (Highstock) Number of maximum decimals that are used in PSAR
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.decimals">https://api.highcharts.com/highstock/plotOptions.psar.params.decimals</a>
   *
   * @implspec decimals?: number;
   *
   */
  @JSProperty("decimals")
  double getDecimals();

  /**
   * (Highstock) Number of maximum decimals that are used in PSAR
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.decimals">https://api.highcharts.com/highstock/plotOptions.psar.params.decimals</a>
   *
   * @implspec decimals?: number;
   *
   */
  @JSProperty("decimals")
  void setDecimals(double value);

  /**
   * (Highstock) Acceleration factor increases by increment each time the
   * extreme point makes a new high.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.increment">https://api.highcharts.com/highstock/plotOptions.psar.params.increment</a>
   *
   * @implspec increment?: number;
   *
   */
  @JSProperty("increment")
  double getIncrement();

  /**
   * (Highstock) Acceleration factor increases by increment each time the
   * extreme point makes a new high.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.increment">https://api.highcharts.com/highstock/plotOptions.psar.params.increment</a>
   *
   * @implspec increment?: number;
   *
   */
  @JSProperty("increment")
  void setIncrement(double value);

  /**
   * (Highstock) Index from which PSAR is starting calculation
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.index">https://api.highcharts.com/highstock/plotOptions.psar.params.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) Index from which PSAR is starting calculation
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.index">https://api.highcharts.com/highstock/plotOptions.psar.params.index</a>
   *
   * @implspec index?: number;
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) The initial value for acceleration factor. Acceleration
   * factor is starting with this value and increases by specified increment
   * each time the extreme point makes a new high. AF can reach a maximum of
   * maxAccelerationFactor, no matter how long the uptrend extends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.initialAccelerationFactor">https://api.highcharts.com/highstock/plotOptions.psar.params.initialAccelerationFactor</a>
   *
   * @implspec initialAccelerationFactor?: number;
   *
   */
  @JSProperty("initialAccelerationFactor")
  double getInitialAccelerationFactor();

  /**
   * (Highstock) The initial value for acceleration factor. Acceleration
   * factor is starting with this value and increases by specified increment
   * each time the extreme point makes a new high. AF can reach a maximum of
   * maxAccelerationFactor, no matter how long the uptrend extends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.initialAccelerationFactor">https://api.highcharts.com/highstock/plotOptions.psar.params.initialAccelerationFactor</a>
   *
   * @implspec initialAccelerationFactor?: number;
   *
   */
  @JSProperty("initialAccelerationFactor")
  void setInitialAccelerationFactor(double value);

  /**
   * (Highstock) The Maximum value for acceleration factor. AF can reach a
   * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.maxAccelerationFactor">https://api.highcharts.com/highstock/plotOptions.psar.params.maxAccelerationFactor</a>
   *
   * @implspec maxAccelerationFactor?: number;
   *
   */
  @JSProperty("maxAccelerationFactor")
  double getMaxAccelerationFactor();

  /**
   * (Highstock) The Maximum value for acceleration factor. AF can reach a
   * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.psar.params.maxAccelerationFactor">https://api.highcharts.com/highstock/plotOptions.psar.params.maxAccelerationFactor</a>
   *
   * @implspec maxAccelerationFactor?: number;
   *
   */
  @JSProperty("maxAccelerationFactor")
  void setMaxAccelerationFactor(double value);
}
