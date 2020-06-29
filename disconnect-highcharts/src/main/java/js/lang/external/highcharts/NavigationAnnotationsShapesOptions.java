package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import js.lang.Unknown /* ( string | AnnotationMockPointOptionsObject ) */;
import js.lang.Unknown /* Array < ( string | AnnotationMockPointOptionsObject ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) An array of shapes for the
 * annotation. For options that apply to multiple shapes, then can be added to
 * the shapeOptions.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationAnnotationsShapesOptions extends Any {
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
   * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
   * drawn at the final vertex of the path. Custom markers can be defined in
   * defs property.
   *
   */
  @JSProperty("markerEnd")
  @Nullable
  String getMarkerEnd();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
   * drawn at the final vertex of the path. Custom markers can be defined in
   * defs property.
   *
   */
  @JSProperty("markerEnd")
  void setMarkerEnd(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
   * drawn at the first vertex of the path. Custom markers can be defined in
   * defs property.
   *
   */
  @JSProperty("markerStart")
  @Nullable
  String getMarkerStart();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
   * drawn at the first vertex of the path. Custom markers can be defined in
   * defs property.
   *
   */
  @JSProperty("markerStart")
  void setMarkerStart(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the shape will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  @Nullable
  Unknown /* ( string | AnnotationMockPointOptionsObject ) */ getPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the shape will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
   * which the shape will be connected. It can be either the point which
   * exists in the series - it is referenced by the point's id - or a new
   * point with defined x, y properties and optionally axes.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable AnnotationMockPointOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
   * shape. This option is available for shapes which can use multiple points
   * such as path. A point can be either a point object or a point's id.
   *
   */
  @JSProperty("points")
  @Nullable
  Unknown /* Array < ( string | AnnotationMockPointOptionsObject ) > */ getPoints();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
   * shape. This option is available for shapes which can use multiple points
   * such as path. A point can be either a point object or a point's id.
   *
   */
  @JSProperty("points")
  void setPoints(AnnotationMockPointOptionsObject... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
   * shape. This option is available for shapes which can use multiple points
   * such as path. A point can be either a point object or a point's id.
   *
   */
  @JSProperty("points")
  void setPoints(String... value);

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
   * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
   * circle or rectangle.
   *
   */
  @JSProperty("type")
  @Nullable
  String getType();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
   * circle or rectangle.
   *
   */
  @JSProperty("type")
  void setType(@Nullable String value);

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigationAnnotationsShapesOptions object = Any.empty();

    private Builder() {
    }

    public NavigationAnnotationsShapesOptions build() {
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
     * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
     * drawn at the final vertex of the path. Custom markers can be defined in
     * defs property.
     *
     */
    public Builder markerEnd(@Nullable String value) {
      object.setMarkerEnd(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
     * drawn at the first vertex of the path. Custom markers can be defined in
     * defs property.
     *
     */
    public Builder markerStart(@Nullable String value) {
      object.setMarkerStart(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the shape will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     *
     */
    public Builder point(@Nullable String value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
     * which the shape will be connected. It can be either the point which
     * exists in the series - it is referenced by the point's id - or a new
     * point with defined x, y properties and optionally axes.
     *
     */
    public Builder point(@Nullable AnnotationMockPointOptionsObject value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
     * shape. This option is available for shapes which can use multiple points
     * such as path. A point can be either a point object or a point's id.
     *
     */
    public Builder points(AnnotationMockPointOptionsObject... value) {
      object.setPoints(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
     * shape. This option is available for shapes which can use multiple points
     * such as path. A point can be either a point object or a point's id.
     *
     */
    public Builder points(String... value) {
      object.setPoints(value);
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
     * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
     * circle or rectangle.
     *
     */
    public Builder type(@Nullable String value) {
      object.setType(value);
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
