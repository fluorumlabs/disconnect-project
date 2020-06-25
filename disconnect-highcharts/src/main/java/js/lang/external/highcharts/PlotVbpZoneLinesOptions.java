package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) The styles for lines which determine price zones.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotVbpZoneLinesOptions extends Any {
  /**
   * (Highstock) Enable/disable zone lines.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable/disable zone lines.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Specify the style of zone lines.
   *
   */
  @JSProperty("styles")
  @Nullable
  CSSObject getStyles();

  /**
   * (Highstock) Specify the style of zone lines.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable CSSObject value);

  class Builder {
    private final PlotVbpZoneLinesOptions object = Any.empty();

    public PlotVbpZoneLinesOptions build() {
      return object;
    }

    /**
     * (Highstock) Enable/disable zone lines.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) Specify the style of zone lines.
     *
     */
    public Builder styles(@Nullable CSSObject value) {
      object.setStyles(value);
      return this;
    }
  }
}
