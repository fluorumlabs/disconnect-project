package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Axis context of the selection.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartSelectionAxisContextObject extends Any {
  /**
   * The selected Axis.
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * The selected Axis.
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * The maximum axis value, either automatic or set manually.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum axis value, either automatic or set manually.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * The minimum axis value, either automatic or set manually.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum axis value, either automatic or set manually.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartSelectionAxisContextObject object = Any.empty();

    private Builder() {
    }

    public ChartSelectionAxisContextObject build() {
      return object;
    }

    /**
     * The selected Axis.
     *
     */
    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    /**
     * The maximum axis value, either automatic or set manually.
     *
     */
    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    /**
     * The minimum axis value, either automatic or set manually.
     *
     */
    public Builder min(double value) {
      object.setMin(value);
      return this;
    }
  }
}
