package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Options for the button appearing when traversing down in a
 * treemap.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotTreemapTraverseUpButtonOptions extends Any {
  /**
   * (Highcharts) The position of the button.
   *
   */
  @JSProperty("position")
  @Nullable
  PlotTreemapTraverseUpButtonPositionOptions getPosition();

  /**
   * (Highcharts) The position of the button.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable PlotTreemapTraverseUpButtonPositionOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotTreemapTraverseUpButtonOptions object = Any.empty();

    private Builder() {
    }

    public PlotTreemapTraverseUpButtonOptions build() {
      return object;
    }

    /**
     * (Highcharts) The position of the button.
     *
     */
    public Builder position(@Nullable PlotTreemapTraverseUpButtonPositionOptions value) {
      object.setPosition(value);
      return this;
    }
  }
}
