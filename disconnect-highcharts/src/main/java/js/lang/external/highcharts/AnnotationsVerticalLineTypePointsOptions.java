package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsVerticalLineTypePointsOptions extends Any {
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

  class Builder {
    private final AnnotationsVerticalLineTypePointsOptions object = Any.empty();

    public AnnotationsVerticalLineTypePointsOptions build() {
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
