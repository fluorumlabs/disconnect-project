package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Axis-specific data of a selection.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SelectDataObject extends Any {
  @JSProperty("axis")
  Axis getAxis();

  @JSProperty("axis")
  void setAxis(Axis value);

  @JSProperty("max")
  double getMax();

  @JSProperty("max")
  void setMax(double value);

  @JSProperty("min")
  double getMin();

  @JSProperty("min")
  void setMin(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SelectDataObject object = Any.empty();

    private Builder() {
    }

    public SelectDataObject build() {
      return object;
    }

    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    public Builder min(double value) {
      object.setMin(value);
      return this;
    }
  }
}
