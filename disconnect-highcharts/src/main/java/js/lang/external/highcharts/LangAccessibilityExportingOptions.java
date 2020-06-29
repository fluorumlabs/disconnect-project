package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings for
 * accessibility module.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityExportingOptions extends Any {
  @JSProperty("chartMenuLabel")
  @Nullable
  String getChartMenuLabel();

  @JSProperty("chartMenuLabel")
  void setChartMenuLabel(@Nullable String value);

  @JSProperty("exportRegionLabel")
  @Nullable
  String getExportRegionLabel();

  @JSProperty("exportRegionLabel")
  void setExportRegionLabel(@Nullable String value);

  @JSProperty("menuButtonLabel")
  @Nullable
  String getMenuButtonLabel();

  @JSProperty("menuButtonLabel")
  void setMenuButtonLabel(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityExportingOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityExportingOptions build() {
      return object;
    }

    public Builder chartMenuLabel(@Nullable String value) {
      object.setChartMenuLabel(value);
      return this;
    }

    public Builder exportRegionLabel(@Nullable String value) {
      object.setExportRegionLabel(value);
      return this;
    }

    public Builder menuButtonLabel(@Nullable String value) {
      object.setMenuButtonLabel(value);
      return this;
    }
  }
}
