package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Describes a range.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RangeObject extends Any {
  /**
   * Maximum number of the range.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * Maximum number of the range.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * Minimum number of the range.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * Minimum number of the range.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  class Builder {
    private final RangeObject object = Any.empty();

    public RangeObject build() {
      return object;
    }

    /**
     * Maximum number of the range.
     *
     */
    public Builder max(double value) {
      object.setMax(value);
      return this;
    }

    /**
     * Minimum number of the range.
     *
     */
    public Builder min(double value) {
      object.setMin(value);
      return this;
    }
  }
}
