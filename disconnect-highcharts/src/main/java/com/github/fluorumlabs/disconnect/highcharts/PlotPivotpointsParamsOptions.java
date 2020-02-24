package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotPivotpointsParamsOptions extends Any {
  /**
   * (Highstock) Algorithm used to calculate ressistance and support lines
   * based on pivot points. Implemented algorithms: <code>'standard'</code>,
   * <code>'fibonacci'</code> and <code>'camarilla'</code>
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.algorithm">https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.algorithm</a>
   *
   * @implspec algorithm?: string;
   *
   */
  @JSProperty("algorithm")
  @Nullable
  String getAlgorithm();

  /**
   * (Highstock) Algorithm used to calculate ressistance and support lines
   * based on pivot points. Implemented algorithms: <code>'standard'</code>,
   * <code>'fibonacci'</code> and <code>'camarilla'</code>
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.algorithm">https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.algorithm</a>
   *
   * @implspec algorithm?: string;
   *
   */
  @JSProperty("algorithm")
  void setAlgorithm(String value);

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.period">https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.period">https://api.highcharts.com/highstock/plotOptions.pivotpoints.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);
}
