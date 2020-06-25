package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string | null ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the shape.
 * This option is available for shapes which can use multiple points such as
 * path. A point can be either a point object or a point's id.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationMockPointOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
   * Units can be either in axis or chart pixel coordinates.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
   * Units can be either in axis or chart pixel coordinates.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the xAxis array. If the option is not configured or the
   * axis is not found the point's x coordinate refers to the chart pixels.
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown /* ( number | string | null ) */ getXAxis();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the xAxis array. If the option is not configured or the
   * axis is not found the point's x coordinate refers to the chart pixels.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the xAxis array. If the option is not configured or the
   * axis is not found the point's x coordinate refers to the chart pixels.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
   * Units can be either in axis or chart pixel coordinates.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
   * Units can be either in axis or chart pixel coordinates.
   *
   */
  @JSProperty("y")
  void setY(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the yAxis array. If the option is not configured or the
   * axis is not found the point's y coordinate refers to the chart pixels.
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown /* ( number | string | null ) */ getYAxis();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the yAxis array. If the option is not configured or the
   * axis is not found the point's y coordinate refers to the chart pixels.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
   * the point is connected to. It refers to either the axis id or the index
   * of the axis in the yAxis array. If the option is not configured or the
   * axis is not found the point's y coordinate refers to the chart pixels.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(@Nullable String value);

  class Builder {
    private final AnnotationMockPointOptionsObject object = Any.empty();

    public AnnotationMockPointOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
     * Units can be either in axis or chart pixel coordinates.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
     * the point is connected to. It refers to either the axis id or the index
     * of the axis in the xAxis array. If the option is not configured or the
     * axis is not found the point's x coordinate refers to the chart pixels.
     *
     */
    public Builder xAxis(double value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
     * the point is connected to. It refers to either the axis id or the index
     * of the axis in the xAxis array. If the option is not configured or the
     * axis is not found the point's x coordinate refers to the chart pixels.
     *
     */
    public Builder xAxis(@Nullable String value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
     * Units can be either in axis or chart pixel coordinates.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
     * the point is connected to. It refers to either the axis id or the index
     * of the axis in the yAxis array. If the option is not configured or the
     * axis is not found the point's y coordinate refers to the chart pixels.
     *
     */
    public Builder yAxis(double value) {
      object.setYAxis(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
     * the point is connected to. It refers to either the axis id or the index
     * of the axis in the yAxis array. If the option is not configured or the
     * axis is not found the point's y coordinate refers to the chart pixels.
     *
     */
    public Builder yAxis(@Nullable String value) {
      object.setYAxis(value);
      return this;
    }
  }
}
