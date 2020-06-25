package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Contains an axes of the clicked spot.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartClickEventAxisObject extends Any {
  /**
   * Axis at the clicked spot.
   *
   */
  @JSProperty("axis")
  Axis getAxis();

  /**
   * Axis at the clicked spot.
   *
   */
  @JSProperty("axis")
  void setAxis(Axis value);

  /**
   * Axis value at the clicked spot.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Axis value at the clicked spot.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  class Builder {
    private final ChartClickEventAxisObject object = Any.empty();

    public ChartClickEventAxisObject build() {
      return object;
    }

    /**
     * Axis at the clicked spot.
     *
     */
    public Builder axis(Axis value) {
      object.setAxis(value);
      return this;
    }

    /**
     * Axis value at the clicked spot.
     *
     */
    public Builder value(double value) {
      object.setValue(value);
      return this;
    }
  }
}
