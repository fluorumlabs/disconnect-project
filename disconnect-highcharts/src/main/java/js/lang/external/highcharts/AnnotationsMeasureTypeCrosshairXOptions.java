package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Configure a crosshair that is horizontally placed in middle of
 * rectangle.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureTypeCrosshairXOptions extends Any {
  /**
   * (Highstock) The dash or dot style of the crosshair's line. For possible
   * values, see this demonstration.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  DashStyle getDashStyle();

  /**
   * (Highstock) The dash or dot style of the crosshair's line. For possible
   * values, see this demonstration.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable DashStyle value);

  /**
   * (Highstock) Enable or disable the horizontal crosshair.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the horizontal crosshair.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) The marker-end defines the arrowhead that will be drawn at
   * the final vertex of the given crosshair's path.
   *
   */
  @JSProperty("markerEnd")
  @Nullable
  String getMarkerEnd();

  /**
   * (Highstock) The marker-end defines the arrowhead that will be drawn at
   * the final vertex of the given crosshair's path.
   *
   */
  @JSProperty("markerEnd")
  void setMarkerEnd(@Nullable String value);

  /**
   * (Highstock) The Z index of the crosshair in annotation.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock) The Z index of the crosshair in annotation.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AnnotationsMeasureTypeCrosshairXOptions object = Any.empty();

    private Builder() {
    }

    public AnnotationsMeasureTypeCrosshairXOptions build() {
      return object;
    }

    /**
     * (Highstock) The dash or dot style of the crosshair's line. For possible
     * values, see this demonstration.
     *
     */
    public Builder dashStyle(@Nullable DashStyle value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highstock) Enable or disable the horizontal crosshair.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) The marker-end defines the arrowhead that will be drawn at
     * the final vertex of the given crosshair's path.
     *
     */
    public Builder markerEnd(@Nullable String value) {
      object.setMarkerEnd(value);
      return this;
    }

    /**
     * (Highstock) The Z index of the crosshair in annotation.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
