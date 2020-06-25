package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of Supertrend indicator series
 * points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotSupertrendParamsOptions extends Any {
  /**
   * (Highstock) Multiplier for Supertrend Indicator.
   *
   */
  @JSProperty("multiplier")
  double getMultiplier();

  /**
   * (Highstock) Multiplier for Supertrend Indicator.
   *
   */
  @JSProperty("multiplier")
  void setMultiplier(double value);

  /**
   * (Highstock) The base period for indicator Supertrend Indicator
   * calculations. This is the number of data points which are taken into
   * account for the indicator calculations.
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) The base period for indicator Supertrend Indicator
   * calculations. This is the number of data points which are taken into
   * account for the indicator calculations.
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  class Builder {
    private final PlotSupertrendParamsOptions object = Any.empty();

    public PlotSupertrendParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Multiplier for Supertrend Indicator.
     *
     */
    public Builder multiplier(double value) {
      object.setMultiplier(value);
      return this;
    }

    /**
     * (Highstock) The base period for indicator Supertrend Indicator
     * calculations. This is the number of data points which are taken into
     * account for the indicator calculations.
     *
     */
    public Builder period(double value) {
      object.setPeriod(value);
      return this;
    }
  }
}
