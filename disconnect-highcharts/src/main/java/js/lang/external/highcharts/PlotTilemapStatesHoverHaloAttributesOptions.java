package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A collection of SVG attributes to override the
 * appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotTilemapStatesHoverHaloAttributesOptions extends Any {
  @JSProperty("zIndex")
  double getZIndex();

  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotTilemapStatesHoverHaloAttributesOptions object = Any.empty();

    private Builder() {
    }

    public PlotTilemapStatesHoverHaloAttributesOptions build() {
      return object;
    }

    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
