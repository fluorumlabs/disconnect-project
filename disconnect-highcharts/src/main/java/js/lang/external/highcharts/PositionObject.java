package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * An object containing <code>x</code> and <code>y</code> properties for the position of an element.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PositionObject extends Any {
  /**
   * X position of the element.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * X position of the element.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Y position of the element.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Y position of the element.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PositionObject object = Any.empty();

    private Builder() {
    }

    public PositionObject build() {
      return object;
    }

    /**
     * X position of the element.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Y position of the element.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
