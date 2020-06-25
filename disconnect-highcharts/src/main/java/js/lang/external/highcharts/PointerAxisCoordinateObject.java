package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * One position in relation to an axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointerAxisCoordinateObject extends Any {
  /**
   * Related axis.
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * Related axis.
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * Axis value.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Axis value.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  class Builder {
    private final PointerAxisCoordinateObject object = Any.empty();

    public PointerAxisCoordinateObject build() {
      return object;
    }

    /**
     * Related axis.
     *
     */
    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    /**
     * Axis value.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
