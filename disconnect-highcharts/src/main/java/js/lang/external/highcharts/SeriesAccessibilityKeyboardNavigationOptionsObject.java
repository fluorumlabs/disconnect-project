package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Keyboard navigation for a series
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesAccessibilityKeyboardNavigationOptionsObject extends Any {
  /**
   * (Highstock) Enable/disable keyboard navigation support for a specific
   * series.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable/disable keyboard navigation support for a specific
   * series.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SeriesAccessibilityKeyboardNavigationOptionsObject object = Any.empty();

    private Builder() {
    }

    public SeriesAccessibilityKeyboardNavigationOptionsObject build() {
      return object;
    }

    /**
     * (Highstock) Enable/disable keyboard navigation support for a specific
     * series.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }
  }
}
