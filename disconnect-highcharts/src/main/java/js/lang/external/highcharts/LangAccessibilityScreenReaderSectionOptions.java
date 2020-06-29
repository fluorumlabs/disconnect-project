package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
 * reader information sections added before and after the charts.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityScreenReaderSectionOptions extends Any {
  @JSProperty("afterRegionLabel")
  @Nullable
  String getAfterRegionLabel();

  @JSProperty("afterRegionLabel")
  void setAfterRegionLabel(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
   * descriptions.
   *
   */
  @JSProperty("annotations")
  @Nullable
  LangAccessibilityScreenReaderSectionAnnotationsOptions getAnnotations();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
   * descriptions.
   *
   */
  @JSProperty("annotations")
  void setAnnotations(@Nullable LangAccessibilityScreenReaderSectionAnnotationsOptions value);

  @JSProperty("beforeRegionLabel")
  @Nullable
  String getBeforeRegionLabel();

  @JSProperty("beforeRegionLabel")
  void setBeforeRegionLabel(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
   * Announced by screen readers.
   *
   */
  @JSProperty("endOfChartMarker")
  @Nullable
  String getEndOfChartMarker();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
   * Announced by screen readers.
   *
   */
  @JSProperty("endOfChartMarker")
  void setEndOfChartMarker(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityScreenReaderSectionOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityScreenReaderSectionOptions build() {
      return object;
    }

    public Builder afterRegionLabel(@Nullable String value) {
      object.setAfterRegionLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for annotation
     * descriptions.
     *
     */
    public Builder annotations(
        @Nullable LangAccessibilityScreenReaderSectionAnnotationsOptions value) {
      object.setAnnotations(value);
      return this;
    }

    public Builder beforeRegionLabel(@Nullable String value) {
      object.setBeforeRegionLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
     * Announced by screen readers.
     *
     */
    public Builder endOfChartMarker(@Nullable String value) {
      object.setEndOfChartMarker(value);
      return this;
    }
  }
}
