package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * A rectangle.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RectangleObject extends Any {
  /**
   * Height of the rectangle.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the rectangle.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the rectangle.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the rectangle.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * Horizontal position of the rectangle.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal position of the rectangle.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical position of the rectangle.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical position of the rectangle.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final RectangleObject object = Any.empty();

    private Builder() {
    }

    public RectangleObject build() {
      return object;
    }

    /**
     * Height of the rectangle.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * Width of the rectangle.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * Horizontal position of the rectangle.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Vertical position of the rectangle.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
