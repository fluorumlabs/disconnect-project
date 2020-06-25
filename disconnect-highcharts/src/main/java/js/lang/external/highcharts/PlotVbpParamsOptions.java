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
public interface PlotVbpParamsOptions extends Any {
  /**
   * (Highstock) The number of price zones.
   *
   */
  @JSProperty("ranges")
  double getRanges();

  /**
   * (Highstock) The number of price zones.
   *
   */
  @JSProperty("ranges")
  void setRanges(double value);

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
    private final PlotVbpParamsOptions object = Any.empty();

    public PlotVbpParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The number of price zones.
     *
     */
    public Builder ranges(double value) {
      object.setRanges(value);
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
