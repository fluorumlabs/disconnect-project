package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
 * exporting menu. Requires the Accessibility module.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingAccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
   * the export menu.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
   * the export menu.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  class Builder {
    private final ExportingAccessibilityOptions object = Any.empty();

    public ExportingAccessibilityOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
     * the export menu.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
