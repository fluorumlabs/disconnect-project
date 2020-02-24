package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

public interface PlotVbpParamsOptions extends Any {
  /**
   * (Highstock) The number of price zones.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.params.ranges">https://api.highcharts.com/highstock/plotOptions.vbp.params.ranges</a>
   *
   * @implspec ranges?: number;
   *
   */
  @JSProperty("ranges")
  double getRanges();

  /**
   * (Highstock) The number of price zones.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.params.ranges">https://api.highcharts.com/highstock/plotOptions.vbp.params.ranges</a>
   *
   * @implspec ranges?: number;
   *
   */
  @JSProperty("ranges")
  void setRanges(double value);

  /**
   * (Highstock) The id of volume series which is mandatory. For example using
   * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
   * using OHLC and volume values.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.vbp.params.volumeSeriesID</a>
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
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.vbp.params.volumeSeriesID">https://api.highcharts.com/highstock/plotOptions.vbp.params.volumeSeriesID</a>
   *
   * @implspec volumeSeriesID?: string;
   *
   */
  @JSProperty("volumeSeriesID")
  void setVolumeSeriesID(String value);
}
