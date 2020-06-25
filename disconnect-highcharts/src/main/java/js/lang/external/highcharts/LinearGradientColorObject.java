package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Defines the start position and the end position for a gradient relative to
 * the shape. Start position (x1, y1) and end position (x2, y2) are relative to
 * the shape, where 0 means top/left and 1 is bottom/right.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LinearGradientColorObject extends Any {
  /**
   * Start horizontal position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("x1")
  double getX1();

  /**
   * Start horizontal position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("x1")
  void setX1(double value);

  /**
   * End horizontal position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("x2")
  double getX2();

  /**
   * End horizontal position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("x2")
  void setX2(double value);

  /**
   * Start vertical position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("y1")
  double getY1();

  /**
   * Start vertical position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("y1")
  void setY1(double value);

  /**
   * End vertical position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("y2")
  double getY2();

  /**
   * End vertical position of the gradient. Float ranges 0-1.
   *
   */
  @JSProperty("y2")
  void setY2(double value);

  class Builder {
    private final LinearGradientColorObject object = Any.empty();

    public LinearGradientColorObject build() {
      return object;
    }

    /**
     * Start horizontal position of the gradient. Float ranges 0-1.
     *
     */
    public Builder x1(double value) {
      object.setX1(value);
      return this;
    }

    /**
     * End horizontal position of the gradient. Float ranges 0-1.
     *
     */
    public Builder x2(double value) {
      object.setX2(value);
      return this;
    }

    /**
     * Start vertical position of the gradient. Float ranges 0-1.
     *
     */
    public Builder y1(double value) {
      object.setY1(value);
      return this;
    }

    /**
     * End vertical position of the gradient. Float ranges 0-1.
     *
     */
    public Builder y2(double value) {
      object.setY2(value);
      return this;
    }
  }
}
