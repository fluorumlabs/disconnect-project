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
public interface PlotMacdParamsOptions extends Any {
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
   * (Highstock) The long period for indicator calculations.
   *
   */
  @JSProperty("longPeriod")
  double getLongPeriod();

  /**
   * (Highstock) The long period for indicator calculations.
   *
   */
  @JSProperty("longPeriod")
  void setLongPeriod(double value);

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
   * (Highstock) The short period for indicator calculations.
   *
   */
  @JSProperty("shortPeriod")
  double getShortPeriod();

  /**
   * (Highstock) The short period for indicator calculations.
   *
   */
  @JSProperty("shortPeriod")
  void setShortPeriod(double value);

  /**
   * (Highstock) The base period for signal calculations.
   *
   */
  @JSProperty("signalPeriod")
  double getSignalPeriod();

  /**
   * (Highstock) The base period for signal calculations.
   *
   */
  @JSProperty("signalPeriod")
  void setSignalPeriod(double value);

  class Builder {
    private final PlotMacdParamsOptions object = Any.empty();

    public PlotMacdParamsOptions build() {
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
     * (Highstock) The long period for indicator calculations.
     *
     */
    public Builder longPeriod(double value) {
      object.setLongPeriod(value);
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
     * (Highstock) The short period for indicator calculations.
     *
     */
    public Builder shortPeriod(double value) {
      object.setShortPeriod(value);
      return this;
    }

    /**
     * (Highstock) The base period for signal calculations.
     *
     */
    public Builder signalPeriod(double value) {
      object.setSignalPeriod(value);
      return this;
    }
  }
}
