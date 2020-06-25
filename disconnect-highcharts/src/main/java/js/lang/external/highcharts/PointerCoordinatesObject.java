package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Pointer coordinates.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointerCoordinatesObject extends Any {
  @JSProperty("chartX")
  double getChartX();

  @JSProperty("chartX")
  void setChartX(double value);

  @JSProperty("chartY")
  double getChartY();

  @JSProperty("chartY")
  void setChartY(double value);

  class Builder {
    private final PointerCoordinatesObject object = Any.empty();

    public PointerCoordinatesObject build() {
      return object;
    }

    public Builder chartX(double value) {
      object.setChartX(value);
      return this;
    }

    public Builder chartY(double value) {
      object.setChartY(value);
      return this;
    }
  }
}
