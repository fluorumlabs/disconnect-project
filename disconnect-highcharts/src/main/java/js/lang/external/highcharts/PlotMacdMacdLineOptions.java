package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for macd line
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotMacdMacdLineOptions extends Any {
  @JSProperty("styles")
  @Nullable
  PlotMacdMacdLineStylesOptions getStyles();

  @JSProperty("styles")
  void setStyles(@Nullable PlotMacdMacdLineStylesOptions value);

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   */
  @JSProperty("zones")
  @Nullable
  SeriesZonesOptionsObject[] getZones();

  /**
   * (Highcharts, Highstock) An array defining zones within a series. Zones
   * can be applied to the X axis, Y axis or Z axis for bubbles, according to
   * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
   * regarding to the value.
   *
   * In styled mode, the color zones are styled with the
   * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
   * option (view live demo).
   *
   */
  @JSProperty("zones")
  void setZones(SeriesZonesOptionsObject... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotMacdMacdLineOptions object = Any.empty();

    private Builder() {
    }

    public PlotMacdMacdLineOptions build() {
      return object;
    }

    public Builder styles(@Nullable PlotMacdMacdLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) An array defining zones within a series. Zones
     * can be applied to the X axis, Y axis or Z axis for bubbles, according to
     * the <code>zoneAxis</code> option. The zone definitions have to be in ascending order
     * regarding to the value.
     *
     * In styled mode, the color zones are styled with the
     * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
     * option (view live demo).
     *
     */
    public Builder zones(SeriesZonesOptionsObject... value) {
      object.setZones(value);
      return this;
    }
  }
}
