package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotCmfParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.index">https://api.highcharts.com/highstock/plotOptions.cmf.params.index</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.index">https://api.highcharts.com/highstock/plotOptions.cmf.params.index</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.period">https://api.highcharts.com/highstock/plotOptions.cmf.params.period</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.period">https://api.highcharts.com/highstock/plotOptions.cmf.params.period</a>
   *
   * @implspec period?: number;
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) The id of another series to use its data as volume data for
   * the indiator calculation.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.cmf.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  @Nullable
  String getVolumeSeriesID();

  /**
   * (Highstock) The id of another series to use its data as volume data for
   * the indiator calculation.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.cmf.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.cmf.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  void setVolumeSeriesID(String value);
}
