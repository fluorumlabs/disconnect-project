package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Options for annotation's shapes. Each shape inherits options from
 * the shapeOptions object. An option from the shapeOptions can be overwritten
 * by config for a specific shape.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsTunnelShapeOptions extends Any {
  /**
   * (Highstock) Name of the dash style to use for the shape's stroke.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highstock) Name of the dash style to use for the shape's stroke.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highstock) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFill();

  /**
   * (Highstock) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable String value);

  /**
   * (Highstock) The color of the shape's fill.
   *
   */
  @JSProperty("fill")
  void setFill(@Nullable GradientColorObject value);

  /**
   * (Highstock) The height of the shape.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) The height of the shape.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) The radius of the shape.
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * (Highstock) The radius of the shape.
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * (Highstock) Defines additional snapping area around an annotation making
   * this annotation to focus. Defined in pixels.
   *
   */
  @JSProperty("snap")
  double getSnap();

  /**
   * (Highstock) Defines additional snapping area around an annotation making
   * this annotation to focus. Defined in pixels.
   *
   */
  @JSProperty("snap")
  void setSnap(double value);

  /**
   * (Highstock) The URL for an image to use as the annotation shape. Note,
   * type has to be set to <code>'image'</code>.
   *
   */
  @JSProperty("src")
  @Nullable
  String getSrc();

  /**
   * (Highstock) The URL for an image to use as the annotation shape. Note,
   * type has to be set to <code>'image'</code>.
   *
   */
  @JSProperty("src")
  void setSrc(@Nullable String value);

  /**
   * (Highstock) The color of the shape's stroke.
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * (Highstock) The color of the shape's stroke.
   *
   */
  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  /**
   * (Highstock) The pixel stroke width of the shape.
   *
   */
  @JSProperty("strokeWidth")
  double getStrokeWidth();

  /**
   * (Highstock) The pixel stroke width of the shape.
   *
   */
  @JSProperty("strokeWidth")
  void setStrokeWidth(double value);

  /**
   * (Highstock) The width of the shape.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highstock) The width of the shape.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  class Builder {
    private final AnnotationsTunnelShapeOptions object = Any.empty();

    public AnnotationsTunnelShapeOptions build() {
      return object;
    }

    /**
     * (Highstock) Name of the dash style to use for the shape's stroke.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highstock) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable PatternObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highstock) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highstock) The color of the shape's fill.
     *
     */
    public Builder fill(@Nullable GradientColorObject value) {
      object.setFill(value);
      return this;
    }

    /**
     * (Highstock) The height of the shape.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock) The radius of the shape.
     *
     */
    public Builder r(double value) {
      object.setR(value);
      return this;
    }

    /**
     * (Highstock) Defines additional snapping area around an annotation making
     * this annotation to focus. Defined in pixels.
     *
     */
    public Builder snap(double value) {
      object.setSnap(value);
      return this;
    }

    /**
     * (Highstock) The URL for an image to use as the annotation shape. Note,
     * type has to be set to <code>'image'</code>.
     *
     */
    public Builder src(@Nullable String value) {
      object.setSrc(value);
      return this;
    }

    /**
     * (Highstock) The color of the shape's stroke.
     *
     */
    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }

    /**
     * (Highstock) The pixel stroke width of the shape.
     *
     */
    public Builder strokeWidth(double value) {
      object.setStrokeWidth(value);
      return this;
    }

    /**
     * (Highstock) The width of the shape.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
