package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
 * descriptions.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityScreenReaderSectionAnnotationsOptions extends Any {
  @JSProperty("descriptionMultiplePoints")
  @Nullable
  String getDescriptionMultiplePoints();

  @JSProperty("descriptionMultiplePoints")
  void setDescriptionMultiplePoints(@Nullable String value);

  @JSProperty("descriptionNoPoints")
  @Nullable
  String getDescriptionNoPoints();

  @JSProperty("descriptionNoPoints")
  void setDescriptionNoPoints(@Nullable String value);

  @JSProperty("descriptionSinglePoint")
  @Nullable
  String getDescriptionSinglePoint();

  @JSProperty("descriptionSinglePoint")
  void setDescriptionSinglePoint(@Nullable String value);

  @JSProperty("heading")
  @Nullable
  String getHeading();

  @JSProperty("heading")
  void setHeading(@Nullable String value);

  class Builder {
    private final LangAccessibilityScreenReaderSectionAnnotationsOptions object = Any.empty();

    public LangAccessibilityScreenReaderSectionAnnotationsOptions build() {
      return object;
    }

    public Builder descriptionMultiplePoints(@Nullable String value) {
      object.setDescriptionMultiplePoints(value);
      return this;
    }

    public Builder descriptionNoPoints(@Nullable String value) {
      object.setDescriptionNoPoints(value);
      return this;
    }

    public Builder descriptionSinglePoint(@Nullable String value) {
      object.setDescriptionSinglePoint(value);
      return this;
    }

    public Builder heading(@Nullable String value) {
      object.setHeading(value);
      return this;
    }
  }
}
