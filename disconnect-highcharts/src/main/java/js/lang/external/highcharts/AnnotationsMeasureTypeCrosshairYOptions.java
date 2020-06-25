package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Configure a crosshair that is vertically placed in middle of
 * rectangle.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureTypeCrosshairYOptions extends Any {
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
   * (Highstock) Enable or disable the vertical crosshair.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the vertical crosshair.
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
  MarkerEnd getMarkerEnd();

  /**
   * (Highstock) The marker-end defines the arrowhead that will be drawn at
   * the final vertex of the given crosshair's path.
   *
   */
  @JSProperty("markerEnd")
  void setMarkerEnd(@Nullable MarkerEnd value);

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

  abstract class MarkerEnd extends JsEnum {
    public static final MarkerEnd ARROW = JsEnum.of("arrow");

    public static final MarkerEnd NONE = JsEnum.of("none");
  }

  class Builder {
    private final AnnotationsMeasureTypeCrosshairYOptions object = Any.empty();

    public AnnotationsMeasureTypeCrosshairYOptions build() {
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
     * (Highstock) Enable or disable the vertical crosshair.
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
    public Builder markerEnd(@Nullable MarkerEnd value) {
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
