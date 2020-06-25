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
public interface PlotPriceenvelopesParamsOptions extends Any {
  /**
   * (Highstock) Percentage below the moving average that should be displayed.
   * 0.1 means 90%. Relative to the calculated value.
   *
   */
  @JSProperty("bottomBand")
  double getBottomBand();

  /**
   * (Highstock) Percentage below the moving average that should be displayed.
   * 0.1 means 90%. Relative to the calculated value.
   *
   */
  @JSProperty("bottomBand")
  void setBottomBand(double value);

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
   * (Highstock) Percentage above the moving average that should be displayed.
   * 0.1 means 110%. Relative to the calculated value.
   *
   */
  @JSProperty("topBand")
  double getTopBand();

  /**
   * (Highstock) Percentage above the moving average that should be displayed.
   * 0.1 means 110%. Relative to the calculated value.
   *
   */
  @JSProperty("topBand")
  void setTopBand(double value);

  class Builder {
    private final PlotPriceenvelopesParamsOptions object = Any.empty();

    public PlotPriceenvelopesParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Percentage below the moving average that should be displayed.
     * 0.1 means 90%. Relative to the calculated value.
     *
     */
    public Builder bottomBand(double value) {
      object.setBottomBand(value);
      return this;
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
     * (Highstock) Percentage above the moving average that should be displayed.
     * 0.1 means 110%. Relative to the calculated value.
     *
     */
    public Builder topBand(double value) {
      object.setTopBand(value);
      return this;
    }
  }
}
