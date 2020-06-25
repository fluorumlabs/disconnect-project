package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language options for accessibility
 * of the legend.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityLegendOptions extends Any {
  @JSProperty("legendItem")
  @Nullable
  String getLegendItem();

  @JSProperty("legendItem")
  void setLegendItem(@Nullable String value);

  @JSProperty("legendLabel")
  @Nullable
  String getLegendLabel();

  @JSProperty("legendLabel")
  void setLegendLabel(@Nullable String value);

  class Builder {
    private final LangAccessibilityLegendOptions object = Any.empty();

    public LangAccessibilityLegendOptions build() {
      return object;
    }

    public Builder legendItem(@Nullable String value) {
      object.setLegendItem(value);
      return this;
    }

    public Builder legendLabel(@Nullable String value) {
      object.setLegendLabel(value);
      return this;
    }
  }
}
