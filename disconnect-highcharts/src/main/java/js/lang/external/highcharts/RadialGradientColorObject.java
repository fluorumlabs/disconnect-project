package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Defines the center position and the radius for a gradient.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface RadialGradientColorObject extends Any {
  /**
   * Center horizontal position relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("cx")
  double getCx();

  /**
   * Center horizontal position relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("cx")
  void setCx(double value);

  /**
   * Center vertical position relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("cy")
  double getCy();

  /**
   * Center vertical position relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("cy")
  void setCy(double value);

  /**
   * Radius relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * Radius relative to the shape. Float ranges 0-1.
   *
   */
  @JSProperty("r")
  void setR(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final RadialGradientColorObject object = Any.empty();

    private Builder() {
    }

    public RadialGradientColorObject build() {
      return object;
    }

    /**
     * Center horizontal position relative to the shape. Float ranges 0-1.
     *
     */
    public Builder cx(double value) {
      object.setCx(value);
      return this;
    }

    /**
     * Center vertical position relative to the shape. Float ranges 0-1.
     *
     */
    public Builder cy(double value) {
      object.setCy(value);
      return this;
    }

    /**
     * Radius relative to the shape. Float ranges 0-1.
     *
     */
    public Builder r(double value) {
      object.setR(value);
      return this;
    }
  }
}
