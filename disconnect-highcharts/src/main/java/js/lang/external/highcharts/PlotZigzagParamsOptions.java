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
public interface PlotZigzagParamsOptions extends Any {
  /**
   * (Highstock) The threshold for the value change.
   *
   * For example deviation=1 means the indicator will ignore all price
   * movements less than 1%.
   *
   */
  @JSProperty("deviation")
  double getDeviation();

  /**
   * (Highstock) The threshold for the value change.
   *
   * For example deviation=1 means the indicator will ignore all price
   * movements less than 1%.
   *
   */
  @JSProperty("deviation")
  void setDeviation(double value);

  /**
   * (Highstock) The point index which indicator calculations will base - high
   * value.
   *
   * For example using OHLC data, index=1 means the indicator will be
   * calculated using High values.
   *
   */
  @JSProperty("highIndex")
  double getHighIndex();

  /**
   * (Highstock) The point index which indicator calculations will base - high
   * value.
   *
   * For example using OHLC data, index=1 means the indicator will be
   * calculated using High values.
   *
   */
  @JSProperty("highIndex")
  void setHighIndex(double value);

  /**
   * (Highstock) The point index which indicator calculations will base - low
   * value.
   *
   * For example using OHLC data, index=2 means the indicator will be
   * calculated using Low values.
   *
   */
  @JSProperty("lowIndex")
  double getLowIndex();

  /**
   * (Highstock) The point index which indicator calculations will base - low
   * value.
   *
   * For example using OHLC data, index=2 means the indicator will be
   * calculated using Low values.
   *
   */
  @JSProperty("lowIndex")
  void setLowIndex(double value);

  class Builder {
    private final PlotZigzagParamsOptions object = Any.empty();

    public PlotZigzagParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The threshold for the value change.
     *
     * For example deviation=1 means the indicator will ignore all price
     * movements less than 1%.
     *
     */
    public Builder deviation(double value) {
      object.setDeviation(value);
      return this;
    }

    /**
     * (Highstock) The point index which indicator calculations will base - high
     * value.
     *
     * For example using OHLC data, index=1 means the indicator will be
     * calculated using High values.
     *
     */
    public Builder highIndex(double value) {
      object.setHighIndex(value);
      return this;
    }

    /**
     * (Highstock) The point index which indicator calculations will base - low
     * value.
     *
     * For example using OHLC data, index=2 means the indicator will be
     * calculated using Low values.
     *
     */
    public Builder lowIndex(double value) {
      object.setLowIndex(value);
      return this;
    }
  }
}
