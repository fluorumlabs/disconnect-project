package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Result object of a map transformation.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/map.src.js"
)
public interface MapCoordinateObject extends Any {
  /**
   * X coordinate on the map.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * X coordinate on the map.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Y coordinate on the map.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Y coordinate on the map.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final MapCoordinateObject object = Any.empty();

    private Builder() {
    }

    public MapCoordinateObject build() {
      return object;
    }

    /**
     * X coordinate on the map.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Y coordinate on the map.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
