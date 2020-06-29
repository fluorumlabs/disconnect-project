package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of Chaikin Oscillator series
 * points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotChaikinParamsOptions extends Any {
  /**
   * (Highstock) Periods for Chaikin Oscillator calculations.
   *
   */
  @JSProperty("periods")
  @Nullable
  double[] getPeriods();

  /**
   * (Highstock) Periods for Chaikin Oscillator calculations.
   *
   */
  @JSProperty("periods")
  void setPeriods(double... value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotChaikinParamsOptions object = Any.empty();

    private Builder() {
    }

    public PlotChaikinParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Periods for Chaikin Oscillator calculations.
     *
     */
    public Builder periods(double... value) {
      object.setPeriods(value);
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
