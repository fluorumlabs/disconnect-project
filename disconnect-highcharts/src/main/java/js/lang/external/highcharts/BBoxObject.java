package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Bounding box of an element.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface BBoxObject extends PositionObject {
  /**
   * Height of the bounding box.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the bounding box.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the bounding box.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the bounding box.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * Horizontal position of the bounding box.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal position of the bounding box.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical position of the bounding box.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical position of the bounding box.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final BBoxObject object = Any.empty();

    private Builder() {
    }

    public BBoxObject build() {
      return object;
    }

    /**
     * Height of the bounding box.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * Width of the bounding box.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * Horizontal position of the bounding box.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Vertical position of the bounding box.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
