package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of regression series' points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotVwapParamsOptions extends Any {
  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) The base period for indicator calculations. This is the
   * number of data points which are taken into account for the indicator
   * calculations.
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  /**
   * (Highstock) The id of volume series which is mandatory. For example using
   * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
   * using OHLC and volume values.
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
   */
  @JSProperty("volumeSeriesID")
  void setVolumeSeriesID(@Nullable String value);

  class Builder {
    private final PlotVwapParamsOptions object = Any.empty();

    public PlotVwapParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The base period for indicator calculations. This is the
     * number of data points which are taken into account for the indicator
     * calculations.
     *
     */
    public Builder period(double value) {
      object.setPeriod(value);
      return this;
    }

    /**
     * (Highstock) The id of volume series which is mandatory. For example using
     * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
     * using OHLC and volume values.
     *
     */
    public Builder volumeSeriesID(@Nullable String value) {
      object.setVolumeSeriesID(value);
      return this;
    }
  }
}