package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
 * language options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityZoomOptions extends Any {
  @JSProperty("mapZoomIn")
  @Nullable
  String getMapZoomIn();

  @JSProperty("mapZoomIn")
  void setMapZoomIn(@Nullable String value);

  @JSProperty("mapZoomOut")
  @Nullable
  String getMapZoomOut();

  @JSProperty("mapZoomOut")
  void setMapZoomOut(@Nullable String value);

  @JSProperty("resetZoomButton")
  @Nullable
  String getResetZoomButton();

  @JSProperty("resetZoomButton")
  void setResetZoomButton(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityZoomOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityZoomOptions build() {
      return object;
    }

    public Builder mapZoomIn(@Nullable String value) {
      object.setMapZoomIn(value);
      return this;
    }

    public Builder mapZoomOut(@Nullable String value) {
      object.setMapZoomOut(value);
      return this;
    }

    public Builder resetZoomButton(@Nullable String value) {
      object.setResetZoomButton(value);
      return this;
    }
  }
}
