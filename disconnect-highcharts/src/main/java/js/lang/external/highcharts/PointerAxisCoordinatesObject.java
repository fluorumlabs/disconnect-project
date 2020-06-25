package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Positions in terms of axis values.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointerAxisCoordinatesObject extends Any {
  /**
   * Positions on the x-axis.
   *
   */
  @JSProperty("xAxis")
  PointerAxisCoordinateObject[] getXAxis();

  /**
   * Positions on the x-axis.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(PointerAxisCoordinateObject[] value);

  /**
   * Positions on the y-axis.
   *
   */
  @JSProperty("yAxis")
  PointerAxisCoordinateObject[] getYAxis();

  /**
   * Positions on the y-axis.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(PointerAxisCoordinateObject[] value);

  class Builder {
    private final PointerAxisCoordinatesObject object = Any.empty();

    public PointerAxisCoordinatesObject build() {
      return object;
    }

    /**
     * Positions on the x-axis.
     *
     */
    public Builder xAxis(PointerAxisCoordinateObject[] value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * Positions on the y-axis.
     *
     */
    public Builder yAxis(PointerAxisCoordinateObject[] value) {
      object.setYAxis(value);
      return this;
    }
  }
}
