package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( object | AnnotationsTunnelTypeBackgroundOptions ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Additional options for an annotation with the type.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsTunnelTypeOptions extends Any {
  /**
   * (Highstock) Background options.
   *
   */
  @JSProperty("background")
  @Nullable
  Unknown /* ( object | AnnotationsTunnelTypeBackgroundOptions ) */ getBackground();

  /**
   * (Highstock) Background options.
   *
   */
  @JSProperty("background")
  void setBackground(@Nullable AnnotationsTunnelTypeBackgroundOptions value);

  /**
   * (Highstock) Background options.
   *
   */
  @JSProperty("background")
  void setBackground(@Nullable Any value);

  /**
   * (Highstock) The height of the annotation in terms of yAxis.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock) The height of the annotation in terms of yAxis.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock) Options for the control point which controls the annotation's
   * height.
   *
   */
  @JSProperty("heightControlPoint")
  @Nullable
  AnnotationsTunnelTypeHeightControlPointOptions getHeightControlPoint();

  /**
   * (Highstock) Options for the control point which controls the annotation's
   * height.
   *
   */
  @JSProperty("heightControlPoint")
  void setHeightControlPoint(@Nullable AnnotationsTunnelTypeHeightControlPointOptions value);

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  @Nullable
  AnnotationsTunnelTypeLineOptions getLine();

  /**
   * (Highstock) Line options.
   *
   */
  @JSProperty("line")
  void setLine(@Nullable AnnotationsTunnelTypeLineOptions value);

  @JSProperty("points")
  @Nullable
  AnnotationsTunnelTypePointsOptions[] getPoints();

  @JSProperty("points")
  void setPoints(AnnotationsTunnelTypePointsOptions... value);

  /**
   * (Highstock) This number defines which xAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("xAxis")
  double getXAxis();

  /**
   * (Highstock) This number defines which xAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("xAxis")
  void setXAxis(double value);

  /**
   * (Highstock) This number defines which yAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("yAxis")
  double getYAxis();

  /**
   * (Highstock) This number defines which yAxis the point is connected to. It
   * refers to either the axis id or the index of the axis in the xAxis array.
   *
   */
  @JSProperty("yAxis")
  void setYAxis(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsTunnelTypeOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsTunnelTypeOptions build() {
      return object;
    }

    /**
     * (Highstock) Background options.
     *
     */
    public Builder background(@Nullable AnnotationsTunnelTypeBackgroundOptions value) {
      object.setBackground(value);
      return this;
    }

    /**
     * (Highstock) Background options.
     *
     */
    public Builder background(@Nullable Any value) {
      object.setBackground(value);
      return this;
    }

    /**
     * (Highstock) The height of the annotation in terms of yAxis.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock) Options for the control point which controls the annotation's
     * height.
     *
     */
    public Builder heightControlPoint(
        @Nullable AnnotationsTunnelTypeHeightControlPointOptions value) {
      object.setHeightControlPoint(value);
      return this;
    }

    /**
     * (Highstock) Line options.
     *
     */
    public Builder line(@Nullable AnnotationsTunnelTypeLineOptions value) {
      object.setLine(value);
      return this;
    }

    public Builder points(AnnotationsTunnelTypePointsOptions... value) {
      object.setPoints(value);
      return this;
    }

    /**
     * (Highstock) This number defines which xAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     *
     */
    public Builder xAxis(double value) {
      object.setXAxis(value);
      return this;
    }

    /**
     * (Highstock) This number defines which yAxis the point is connected to. It
     * refers to either the axis id or the index of the axis in the xAxis array.
     *
     */
    public Builder yAxis(double value) {
      object.setYAxis(value);
      return this;
    }
  }
}
