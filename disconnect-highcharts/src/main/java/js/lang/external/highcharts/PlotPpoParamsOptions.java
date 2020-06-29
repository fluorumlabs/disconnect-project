package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of Percentage Price Oscillator
 * series points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPpoParamsOptions extends Any {
  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * By default index value used to be set to 0. Since Highstock 7 by default
   * index is set to 3 which means that the ema indicator will be calculated
   * using Close values.
   *
   */
  @JSProperty("index")
  double getIndex();

  /**
   * (Highstock) The point index which indicator calculations will base. For
   * example using OHLC data, index=2 means the indicator will be calculated
   * using Low values.
   *
   * By default index value used to be set to 0. Since Highstock 7 by default
   * index is set to 3 which means that the ema indicator will be calculated
   * using Close values.
   *
   */
  @JSProperty("index")
  void setIndex(double value);

  /**
   * (Highstock) Periods for Percentage Price Oscillator calculations.
   *
   */
  @JSProperty("periods")
  @Nullable
  double[] getPeriods();

  /**
   * (Highstock) Periods for Percentage Price Oscillator calculations.
   *
   */
  @JSProperty("periods")
  void setPeriods(double... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotPpoParamsOptions object = Any.empty();

    private Builder() {
    }

    public PlotPpoParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) The point index which indicator calculations will base. For
     * example using OHLC data, index=2 means the indicator will be calculated
     * using Low values.
     *
     * By default index value used to be set to 0. Since Highstock 7 by default
     * index is set to 3 which means that the ema indicator will be calculated
     * using Close values.
     *
     */
    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    /**
     * (Highstock) Periods for Percentage Price Oscillator calculations.
     *
     */
    public Builder periods(double... value) {
      object.setPeriods(value);
      return this;
    }
  }
}
