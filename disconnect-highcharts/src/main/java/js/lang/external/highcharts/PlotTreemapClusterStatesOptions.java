package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotTreemapClusterStatesOptions extends Any {
  @JSProperty("hover")
  @Nullable
  PlotTreemapClusterStatesHoverOptions getHover();

  @JSProperty("hover")
  void setHover(@Nullable PlotTreemapClusterStatesHoverOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotTreemapClusterStatesOptions object = Any.empty();

    private Builder() {
    }

    public PlotTreemapClusterStatesOptions build() {
      return object;
    }

    public Builder hover(@Nullable PlotTreemapClusterStatesHoverOptions value) {
      object.setHover(value);
      return this;
    }
  }
}
