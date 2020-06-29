package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Paramters used in calculation of aroon series points.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotAroonParamsOptions extends Any {
  /**
   * (Highstock) Period for Aroon indicator
   *
   */
  @JSProperty("period")
  double getPeriod();

  /**
   * (Highstock) Period for Aroon indicator
   *
   */
  @JSProperty("period")
  void setPeriod(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotAroonParamsOptions object = Any.empty();

    private Builder() {
    }

    public PlotAroonParamsOptions build() {
      return object;
    }

    /**
     * (Highstock) Period for Aroon indicator
     *
     */
    public Builder period(double value) {
      object.setPeriod(value);
      return this;
    }
  }
}
