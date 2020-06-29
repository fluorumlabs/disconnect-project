package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Normalized interval.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TimeNormalizedObject extends Any {
  /**
   * The count.
   *
   */
  @JSProperty("count")
  double getCount();

  /**
   * The count.
   *
   */
  @JSProperty("count")
  void setCount(double value);

  /**
   * The interval in axis values (ms).
   *
   */
  @JSProperty("unitRange")
  double getUnitRange();

  /**
   * The interval in axis values (ms).
   *
   */
  @JSProperty("unitRange")
  void setUnitRange(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TimeNormalizedObject object = Any.empty();

    private Builder() {
    }

    public TimeNormalizedObject build() {
      return object;
    }

    /**
     * The count.
     *
     */
    public Builder count(double value) {
      object.setCount(value);
      return this;
    }

    /**
     * The interval in axis values (ms).
     *
     */
    public Builder unitRange(double value) {
      object.setUnitRange(value);
      return this;
    }
  }
}
