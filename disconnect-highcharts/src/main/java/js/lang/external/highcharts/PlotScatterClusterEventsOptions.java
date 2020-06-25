package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotScatterClusterEventsOptions extends Any {
  /**
   * (Highcharts, Highmaps) Fires when the cluster point is clicked and
   * <code>drillToCluster</code> is enabled. One parameter, <code>event</code>, is passed to the
   * function. The default action is to zoom to the cluster points range. This
   * can be prevented by calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("drillToCluster")
  @Nullable
  MarkerClusterDrillCallbackFunction getDrillToCluster();

  /**
   * (Highcharts, Highmaps) Fires when the cluster point is clicked and
   * <code>drillToCluster</code> is enabled. One parameter, <code>event</code>, is passed to the
   * function. The default action is to zoom to the cluster points range. This
   * can be prevented by calling <code>event.preventDefault()</code>.
   *
   */
  @JSProperty("drillToCluster")
  void setDrillToCluster(@Nullable MarkerClusterDrillCallbackFunction value);

  class Builder {
    private final PlotScatterClusterEventsOptions object = Any.empty();

    public PlotScatterClusterEventsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highmaps) Fires when the cluster point is clicked and
     * <code>drillToCluster</code> is enabled. One parameter, <code>event</code>, is passed to the
     * function. The default action is to zoom to the cluster points range. This
     * can be prevented by calling <code>event.preventDefault()</code>.
     *
     */
    public Builder drillToCluster(@Nullable MarkerClusterDrillCallbackFunction value) {
      object.setDrillToCluster(value);
      return this;
    }
  }
}
