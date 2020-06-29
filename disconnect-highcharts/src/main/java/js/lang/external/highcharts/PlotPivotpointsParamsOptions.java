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
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPivotpointsParamsOptions extends Any {
  /**
   * (Highstock) Algorithm used to calculate ressistance and support lines
   * based on pivot points. Implemented algorithms: <code>'standard'</code>,
   * <code>'fibonacci'</code> and <code>'camarilla'</code>
   *
   */
  @JSProperty("algorithm")
  @Nullable
  String getAlgorithm();

  /**
   * (Highstock) Algorithm used to calculate ressistance and support lines
   * based on pivot points. Implemented algorithms: <code>'standard'</code>,
   * <code>'fibonacci'</code> and <code>'camarilla'</code>
   *
   */
  @JSProperty("algorithm")
  void setAlgorithm(@Nullable String value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotPivotpointsParamsOptions object = Any.empty();

    private Builder() {
    }

    public PlotPivotpointsParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Algorithm used to calculate ressistance and support lines
     * based on pivot points. Implemented algorithms: <code>'standard'</code>,
     * <code>'fibonacci'</code> and <code>'camarilla'</code>
     *
     */
    public Builder algorithm(@Nullable String value) {
      object.setAlgorithm(value);
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
