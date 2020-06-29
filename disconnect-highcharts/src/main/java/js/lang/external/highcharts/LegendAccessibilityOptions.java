package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
 * legend. Requires the Accessibility module.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LegendAccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
   * the legend.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
   * the legend.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
   * for the legend.
   *
   */
  @JSProperty("keyboardNavigation")
  @Nullable
  LegendAccessibilityKeyboardNavigationOptions getKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
   * for the legend.
   *
   */
  @JSProperty("keyboardNavigation")
  void setKeyboardNavigation(@Nullable LegendAccessibilityKeyboardNavigationOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LegendAccessibilityOptions object = Any.empty();

    private Builder() {
    }

    public LegendAccessibilityOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
     * the legend.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
     * for the legend.
     *
     */
    public Builder keyboardNavigation(
        @Nullable LegendAccessibilityKeyboardNavigationOptions value) {
      object.setKeyboardNavigation(value);
      return this;
    }
  }
}
