package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highmaps) Additional styles to apply to the data label of a
 * point that has drilldown data. By default it is underlined and blue to invite
 * to interaction.
 *
 * In styled mode, active data label styles can be applied with the
 * <code>.highcharts-drilldown-data-label</code> class.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DrilldownActiveDataLabelStyleOptions extends Any {
  @JSProperty("color")
  @Nullable
  String getColor();

  @JSProperty("color")
  void setColor(@Nullable String value);

  @JSProperty("cursor")
  @Nullable
  String getCursor();

  @JSProperty("cursor")
  void setCursor(@Nullable String value);

  @JSProperty("fontWeight")
  @Nullable
  String getFontWeight();

  @JSProperty("fontWeight")
  void setFontWeight(@Nullable String value);

  @JSProperty("textDecoration")
  @Nullable
  String getTextDecoration();

  @JSProperty("textDecoration")
  void setTextDecoration(@Nullable String value);

  class Builder {
    private final DrilldownActiveDataLabelStyleOptions object = Any.empty();

    public DrilldownActiveDataLabelStyleOptions build() {
      return object;
    }

    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    public Builder cursor(@Nullable String value) {
      object.setCursor(value);
      return this;
    }

    public Builder fontWeight(@Nullable String value) {
      object.setFontWeight(value);
      return this;
    }

    public Builder textDecoration(@Nullable String value) {
      object.setTextDecoration(value);
      return this;
    }
  }
}
