package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsFibonacciTypePointsOptions extends Any {
  @JSProperty("controlPoint")
  double getControlPoint();

  @JSProperty("controlPoint")
  void setControlPoint(double value);

  /**
   * (Highstock) The x position of the point.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highstock) The x position of the point.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highstock) The y position of the point.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highstock) The y position of the point.
   *
   */
  @JSProperty("y")
  void setY(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsFibonacciTypePointsOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsFibonacciTypePointsOptions build() {
      return object;
    }

    public Builder controlPoint(double value) {
      object.setControlPoint(value);
      return this;
    }

    /**
     * (Highstock) The x position of the point.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highstock) The y position of the point.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
