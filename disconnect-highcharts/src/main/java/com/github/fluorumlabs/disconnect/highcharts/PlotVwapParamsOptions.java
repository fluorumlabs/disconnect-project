package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotVwapParamsOptions extends Any {
  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.params.period">https://api.highcharts.com/highstock/plotOptions.vwap.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.params.period">https://api.highcharts.com/highstock/plotOptions.vwap.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.vwap.params.volumeSeriesID</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vwap.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.vwap.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  void setVolumeSeriesID(String value);
}
