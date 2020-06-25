package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for annotation's shapes.
 * Each shape inherits options from the shapeOptions object. An option from the
 * shapeOptions can be overwritten by config for a specific shape.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationAnnotationsShapeOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
   * for the shape's stroke.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
   * for the shape's stroke.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFill();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable PatternObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable GradientColorObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
   * around an annotation making this annotation to focus. Defined in pixels.
   *
   */
  @JSProperty("snap")
  double getSnap();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
   * around an annotation making this annotation to focus. Defined in pixels.
   *
   */
  @JSProperty("snap")
  void setSnap(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
   * the annotation shape. Note, type has to be set to <code>'image'</code>.
   *
   */
  @JSProperty("src")
  @Nullable
  String getSrc();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
   * the annotation shape. Note, type has to be set to <code>'image'</code>.
   *
   */
  @JSProperty("src")
  void setSrc(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
   *
   */
  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
   * shape.
   *
   */
  @JSProperty("strokeWidth")
  double getStrokeWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
   * shape.
   *
   */
  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  class Builder {
    private final NavigationAnnotationsShapeOptions object = Any.empty();

    public NavigationAnnotationsShapeOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
     * for the shape's stroke.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable PatternObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable GradientColorObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
     *
     */
    public Builder r(double value) {
      object.setR(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
     * around an annotation making this annotation to focus. Defined in pixels.
     *
     */
    public Builder snap(double value) {
      object.setSnap(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
     * the annotation shape. Note, type has to be set to <code>'image'</code>.
     *
     */
    public Builder src(@Nullable String value) {
      object.setSrc(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
     *
     */
    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
     * shape.
     *
     */
    public Builder strokeWidth(double value) {
      object.setStrokeWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
