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
    version = "^8.1.2"
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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotBbBottomLineOptions object = Any.empty();

    private Builder() {
    }

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
