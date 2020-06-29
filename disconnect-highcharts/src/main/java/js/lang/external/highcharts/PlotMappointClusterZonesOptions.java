package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) An array defining zones within marker clusters.
 *
 * In styled mode, the color zones are styled with the
 * <code>.highcharts-cluster-zone-{n}</code> class, or custom classed from the <code>className</code>
 * option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotMappointClusterZonesOptions extends Any {
  /**
   * (Highcharts, Highmaps) Styled mode only. A custom class name for the
   * zone.
   *
   */
  @JSProperty("className")
  @Nullable
  String getClassName();

  /**
   * (Highcharts, Highmaps) Styled mode only. A custom class name for the
   * zone.
   *
   */
  @JSProperty("className")
  void setClassName(@Nullable String value);

  /**
   * (Highcharts, Highmaps) The value where the zone starts.
   *
   */
  @JSProperty("from")
  double getFrom();

  /**
   * (Highcharts, Highmaps) The value where the zone starts.
   *
   */
  @JSProperty("from")
  void setFrom(double value);

  /**
   * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
   * zone.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
   * zone.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts, Highmaps) The value where the zone ends.
   *
   */
  @JSProperty("to")
  double getTo();

  /**
   * (Highcharts, Highmaps) The value where the zone ends.
   *
   */
  @JSProperty("to")
  void setTo(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotMappointClusterZonesOptions object = Any.empty();

    private Builder() {
    }

    public PlotMappointClusterZonesOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) Styled mode only. A custom class name for the
     * zone.
     *
     */
    public Builder className(@Nullable String value) {
      object.setClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The value where the zone starts.
     *
     */
    public Builder from(double value) {
      object.setFrom(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
     * zone.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The value where the zone ends.
     *
     */
    public Builder to(double value) {
      object.setTo(value);
      return this;
    }
  }
}
