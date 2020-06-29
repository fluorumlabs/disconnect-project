package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation for
 * the legend.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendAccessibilityKeyboardNavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
   * the legend.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
   * the legend.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendAccessibilityKeyboardNavigationOptions object = Any.empty();

    private Builder() {
    }

    public LegendAccessibilityKeyboardNavigationOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
     * the legend.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
