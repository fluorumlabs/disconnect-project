package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Allow panning in a chart. Best used with
 * panKey to combine zooming and panning.
 *
 * On touch devices, when the tooltip.followTouchMove option is <code>true</code>
 * (default), panning requires two fingers. To allow panning with one finger,
 * set <code>followTouchMove</code> to <code>false</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartPanningOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  class Builder {
    private final ChartPanningOptions object = Any.empty();

    public ChartPanningOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
