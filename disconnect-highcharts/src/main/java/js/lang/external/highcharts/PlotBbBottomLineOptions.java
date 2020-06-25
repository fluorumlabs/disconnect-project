package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Bottom line options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotBbBottomLineOptions extends Any {
  /**
   * (Highstock) Styles for a bottom line.
   *
   */
  @JSProperty("styles")
  @Nullable
  PlotBbBottomLineStylesOptions getStyles();

  /**
   * (Highstock) Styles for a bottom line.
   *
   */
  @JSProperty("styles")
  void setStyles(@Nullable PlotBbBottomLineStylesOptions value);

  class Builder {
    private final PlotBbBottomLineOptions object = Any.empty();

    public PlotBbBottomLineOptions build() {
      return object;
    }

    /**
     * (Highstock) Styles for a bottom line.
     *
     */
    public Builder styles(@Nullable PlotBbBottomLineStylesOptions value) {
      object.setStyles(value);
      return this;
    }
  }
}
