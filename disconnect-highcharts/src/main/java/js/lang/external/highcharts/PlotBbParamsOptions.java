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
public interface PlotBbParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   */
  @JSProperty("index")
  void setIndex(double value);

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
   * (Highstock) Standard deviation for top and bottom bands.
   *
   */
  @JSProperty("standardDeviation")
  double getStandardDeviation();

  /**
   * (Highstock) Standard deviation for top and bottom bands.
   *
   */
  @JSProperty("standardDeviation")
  void setStandardDeviation(double value);

  class Builder {
    private final PlotBbParamsOptions object = Any.empty();

    public PlotBbParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     *
     */
    public Builder index(double value) {
      object.setIndex(value);
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

    /**
     * (Highstock) Standard deviation for top and bottom bands.
     *
     */
    public Builder standardDeviation(double value) {
      object.setStandardDeviation(value);
      return this;
    }
  }
}