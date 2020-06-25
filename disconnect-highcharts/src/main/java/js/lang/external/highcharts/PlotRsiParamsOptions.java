package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
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
public interface PlotRsiParamsOptions extends Any {
  /**
   * (Highstock) Number of maximum decimals that are used in RSI calculations.
   *
   */
  @JSProperty("decimals")
  double getDecimals();

  /**
   * (Highstock) Number of maximum decimals that are used in RSI calculations.
   *
   */
  @JSProperty("decimals")
  void setDecimals(double value);

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

  class Builder {
    private final PlotRsiParamsOptions object = Any.empty();

    public PlotRsiParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Number of maximum decimals that are used in RSI calculations.
     *
     */
    public Builder decimals(double value) {
      object.setDecimals(value);
      return this;
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
  }
}
