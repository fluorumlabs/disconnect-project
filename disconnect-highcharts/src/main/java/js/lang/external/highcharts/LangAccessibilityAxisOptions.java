package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityAxisOptions extends Any {
  @JSProperty("rangeCategories")
  @Nullable
  String getRangeCategories();

  @JSProperty("rangeCategories")
  void setRangeCategories(@Nullable String value);

  @JSProperty("rangeFromTo")
  @Nullable
  String getRangeFromTo();

  @JSProperty("rangeFromTo")
  void setRangeFromTo(@Nullable String value);

  @JSProperty("timeRangeDays")
  @Nullable
  String getTimeRangeDays();

  @JSProperty("timeRangeDays")
  void setTimeRangeDays(@Nullable String value);

  @JSProperty("timeRangeHours")
  @Nullable
  String getTimeRangeHours();

  @JSProperty("timeRangeHours")
  void setTimeRangeHours(@Nullable String value);

  @JSProperty("timeRangeMinutes")
  @Nullable
  String getTimeRangeMinutes();

  @JSProperty("timeRangeMinutes")
  void setTimeRangeMinutes(@Nullable String value);

  @JSProperty("timeRangeSeconds")
  @Nullable
  String getTimeRangeSeconds();

  @JSProperty("timeRangeSeconds")
  void setTimeRangeSeconds(@Nullable String value);

  @JSProperty("xAxisDescriptionPlural")
  @Nullable
  String getXAxisDescriptionPlural();

  @JSProperty("xAxisDescriptionPlural")
  void setXAxisDescriptionPlural(@Nullable String value);

  @JSProperty("xAxisDescriptionSingular")
  @Nullable
  String getXAxisDescriptionSingular();

  @JSProperty("xAxisDescriptionSingular")
  void setXAxisDescriptionSingular(@Nullable String value);

  @JSProperty("yAxisDescriptionPlural")
  @Nullable
  String getYAxisDescriptionPlural();

  @JSProperty("yAxisDescriptionPlural")
  void setYAxisDescriptionPlural(@Nullable String value);

  @JSProperty("yAxisDescriptionSingular")
  @Nullable
  String getYAxisDescriptionSingular();

  @JSProperty("yAxisDescriptionSingular")
  void setYAxisDescriptionSingular(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityAxisOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityAxisOptions build() {
      return object;
    }

    public Builder rangeCategories(@Nullable String value) {
      object.setRangeCategories(value);
      return this;
    }

    public Builder rangeFromTo(@Nullable String value) {
      object.setRangeFromTo(value);
      return this;
    }

    public Builder timeRangeDays(@Nullable String value) {
      object.setTimeRangeDays(value);
      return this;
    }

    public Builder timeRangeHours(@Nullable String value) {
      object.setTimeRangeHours(value);
      return this;
    }

    public Builder timeRangeMinutes(@Nullable String value) {
      object.setTimeRangeMinutes(value);
      return this;
    }

    public Builder timeRangeSeconds(@Nullable String value) {
      object.setTimeRangeSeconds(value);
      return this;
    }

    public Builder xAxisDescriptionPlural(@Nullable String value) {
      object.setXAxisDescriptionPlural(value);
      return this;
    }

    public Builder xAxisDescriptionSingular(@Nullable String value) {
      object.setXAxisDescriptionSingular(value);
      return this;
    }

    public Builder yAxisDescriptionPlural(@Nullable String value) {
      object.setYAxisDescriptionPlural(value);
      return this;
    }

    public Builder yAxisDescriptionSingular(@Nullable String value) {
      object.setYAxisDescriptionSingular(value);
      return this;
    }
  }
}
