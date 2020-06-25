package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of Williams %R series points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotWilliamsrParamsOptions extends Any {
  /**
   * (Highstock) Period for Williams %R oscillator
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) Period for Williams %R oscillator
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  class Builder {
    private final PlotWilliamsrParamsOptions object = Any.empty();

    public PlotWilliamsrParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Period for Williams %R oscillator
     *
     */
    public Builder period(double value) {
      object.setPeriod(value);
      return this;
    }
  }
}
