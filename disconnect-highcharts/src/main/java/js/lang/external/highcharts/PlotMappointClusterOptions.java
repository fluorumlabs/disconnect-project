package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | AnimationOptionsObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Options for marker clusters, the concept of sampling
 * the data values into larger blocks in order to ease readability and increase
 * performance of the JavaScript charts.
 *
 * Note: marker clusters module is not working with <code>boost</code> and
 * <code>draggable-points</code> modules.
 *
 * The marker clusters feature requires the marker-clusters.js file to be
 * loaded, found in the modules directory of the download package, or online at
 * code.highcharts.com/modules/marker-clusters.js.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotMappointClusterOptions extends Any {
  /**
   * (Highcharts, Highmaps) When set to <code>false</code> prevent cluster overlapping -
   * this option works only when <code>layoutAlgorithm.type = &quot;grid&quot;</code>.
   *
   */
  @JSProperty("allowOverlap")
  boolean getAllowOverlap();

  /**
   * (Highcharts, Highmaps) When set to <code>false</code> prevent cluster overlapping -
   * this option works only when <code>layoutAlgorithm.type = &quot;grid&quot;</code>.
   *
   */
  @JSProperty("allowOverlap")
  void setAllowOverlap(boolean value);

  /**
   * (Highcharts, Highmaps) Options for the cluster marker animation.
   *
   */
  @JSProperty("animation")
  @Nullable
  Unknown /* ( boolean | AnimationOptionsObject ) */ getAnimation();

  /**
   * (Highcharts, Highmaps) Options for the cluster marker animation.
   *
   */
  @JSProperty("animation")
  void setAnimation(boolean value);

  /**
   * (Highcharts, Highmaps) Options for the cluster marker animation.
   *
   */
  @JSProperty("animation")
  void setAnimation(@Nullable AnimationOptionsObject value);

  /**
   * (Highcharts, Highmaps) Options for the cluster data labels.
   *
   */
  @JSProperty("dataLabels")
  @Nullable
  DataLabelsOptions getDataLabels();

  /**
   * (Highcharts, Highmaps) Options for the cluster data labels.
   *
   */
  @JSProperty("dataLabels")
  void setDataLabels(@Nullable DataLabelsOptions value);

  /**
   * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
   * when a cluster is clicked.
   *
   */
  @JSProperty("drillToCluster")
  boolean getDrillToCluster();

  /**
   * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
   * when a cluster is clicked.
   *
   */
  @JSProperty("drillToCluster")
  void setDrillToCluster(boolean value);

  /**
   * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  @JSProperty("events")
  @Nullable
  PlotMappointClusterEventsOptions getEvents();

  @JSProperty("events")
  void setEvents(@Nullable PlotMappointClusterEventsOptions value);

  /**
   * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
   * options to change the type of the algorithm, gridSize, distance or
   * iterations.
   *
   */
  @JSProperty("layoutAlgorithm")
  @Nullable
  PlotMappointClusterLayoutAlgorithmOptions getLayoutAlgorithm();

  /**
   * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
   * options to change the type of the algorithm, gridSize, distance or
   * iterations.
   *
   */
  @JSProperty("layoutAlgorithm")
  void setLayoutAlgorithm(@Nullable PlotMappointClusterLayoutAlgorithmOptions value);

  /**
   * (Highcharts, Highmaps) Options for the cluster marker.
   *
   */
  @JSProperty("marker")
  @Nullable
  PointMarkerOptionsObject getMarker();

  /**
   * (Highcharts, Highmaps) Options for the cluster marker.
   *
   */
  @JSProperty("marker")
  void setMarker(@Nullable PointMarkerOptionsObject value);

  /**
   * (Highcharts, Highmaps) The minimum amount of points to be combined into a
   * cluster. This value has to be greater or equal to 2.
   *
   */
  @JSProperty("minimumClusterSize")
  double getMinimumClusterSize();

  /**
   * (Highcharts, Highmaps) The minimum amount of points to be combined into a
   * cluster. This value has to be greater or equal to 2.
   *
   */
  @JSProperty("minimumClusterSize")
  void setMinimumClusterSize(double value);

  @JSProperty("states")
  @Nullable
  PlotMappointClusterStatesOptions getStates();

  @JSProperty("states")
  void setStates(@Nullable PlotMappointClusterStatesOptions value);

  /**
   * (Highcharts, Highmaps) An array defining zones within marker clusters.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-cluster-zone-{n}</code> class, or custom classed from the
   * <code>className</code> option.
   *
   */
  @JSProperty("zones")
  @Nullable
  PlotMappointClusterZonesOptions[] getZones();

  /**
   * (Highcharts, Highmaps) An array defining zones within marker clusters.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-cluster-zone-{n}</code> class, or custom classed from the
   * <code>className</code> option.
   *
   */
  @JSProperty("zones")
  void setZones(PlotMappointClusterZonesOptions... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotMappointClusterOptions object = Any.empty();

    private Builder() {
    }

    public PlotMappointClusterOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) When set to <code>false</code> prevent cluster overlapping -
     * this option works only when <code>layoutAlgorithm.type = &quot;grid&quot;</code>.
     *
     */
    public Builder allowOverlap(boolean value) {
      object.setAllowOverlap(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for the cluster marker animation.
     *
     */
    public Builder animation(boolean value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for the cluster marker animation.
     *
     */
    public Builder animation(@Nullable AnimationOptionsObject value) {
      object.setAnimation(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for the cluster data labels.
     *
     */
    public Builder dataLabels(@Nullable DataLabelsOptions value) {
      object.setDataLabels(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
     * when a cluster is clicked.
     *
     */
    public Builder drillToCluster(boolean value) {
      object.setDrillToCluster(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    public Builder events(@Nullable PlotMappointClusterEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
     * options to change the type of the algorithm, gridSize, distance or
     * iterations.
     *
     */
    public Builder layoutAlgorithm(@Nullable PlotMappointClusterLayoutAlgorithmOptions value) {
      object.setLayoutAlgorithm(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) Options for the cluster marker.
     *
     */
    public Builder marker(@Nullable PointMarkerOptionsObject value) {
      object.setMarker(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The minimum amount of points to be combined into a
     * cluster. This value has to be greater or equal to 2.
     *
     */
    public Builder minimumClusterSize(double value) {
      object.setMinimumClusterSize(value);
      return this;
    }

    public Builder states(@Nullable PlotMappointClusterStatesOptions value) {
      object.setStates(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) An array defining zones within marker clusters.
     *
     * In styled mode, the color zones are styled with the
     * <code>.highcharts-cluster-zone-{n}</code> class, or custom classed from the
     * <code>className</code> option.
     *
     */
    public Builder zones(PlotMappointClusterZonesOptions... value) {
      object.setZones(value);
      return this;
    }
  }
}
