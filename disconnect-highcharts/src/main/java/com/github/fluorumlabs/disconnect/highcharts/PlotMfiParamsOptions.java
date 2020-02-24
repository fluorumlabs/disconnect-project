package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotMfiParamsOptions extends Any {
  /**
   * (Highstock) Number of maximum decimals that are used in MFI calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.decimals">https://api.highcharts.com/highstock/plotOptions.mfi.params.decimals</a>
   *
   * @implspec decimals?: number;
   *
   */
  @JSProperty("decimals")
  double getDecimals();

  /**
   * (Highstock) Number of maximum decimals that are used in MFI calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.decimals">https://api.highcharts.com/highstock/plotOptions.mfi.params.decimals</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.period">https://api.highcharts.com/highstock/plotOptions.mfi.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.period">https://api.highcharts.com/highstock/plotOptions.mfi.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) The id of volume series which is mandatory. For example using
   * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
   * using OHLC and volume values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.mfi.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  @Nullable
  String getVolumeSeriesID();

  /**
   * (Highstock) The id of volume series which is mandatory. For example using
   * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
   * using OHLC and volume values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.mfi.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.mfi.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  void setVolumeSeriesID(String value);
}
