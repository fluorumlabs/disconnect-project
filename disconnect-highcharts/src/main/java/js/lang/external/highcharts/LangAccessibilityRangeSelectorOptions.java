package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options for
 * accessibility.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityRangeSelectorOptions extends Any {
  @JSProperty("buttonText")
  @Nullable
  String getButtonText();

  @JSProperty("buttonText")
  void setButtonText(@Nullable String value);

  @JSProperty("maxInputLabel")
  @Nullable
  String getMaxInputLabel();

  @JSProperty("maxInputLabel")
  void setMaxInputLabel(@Nullable String value);

  @JSProperty("minInputLabel")
  @Nullable
  String getMinInputLabel();

  @JSProperty("minInputLabel")
  void setMinInputLabel(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityRangeSelectorOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityRangeSelectorOptions build() {
      return object;
    }

    public Builder buttonText(@Nullable String value) {
      object.setButtonText(value);
      return this;
    }

    public Builder maxInputLabel(@Nullable String value) {
      object.setMaxInputLabel(value);
      return this;
    }

    public Builder minInputLabel(@Nullable String value) {
      object.setMinInputLabel(value);
      return this;
    }
  }
}
