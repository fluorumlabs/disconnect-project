package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( AnnotationsMeasureTypeLabelStyleOptions | CSSObject ) */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationsMeasureTypeLabelOptions extends Any {
  /**
   * (Highstock) Enable or disable the label text (min, max, average, bins
   * values).
   *
   * Defaults to true.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable the label text (min, max, average, bins
   * values).
   *
   * Defaults to true.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Formatter function for the label text.
   *
   * Available data are:
   *
   * (see online documentation for example)
   *
   */
  @JSProperty("formatter")
  @Nullable
  JsFunction getFormatter();

  /**
   * (Highstock) Formatter function for the label text.
   *
   * Available data are:
   *
   * (see online documentation for example)
   *
   */
  @JSProperty("formatter")
  void setFormatter(@Nullable JsFunction value);

  /**
   * (Highstock) CSS styles for the measure label.
   *
   */
  @JSProperty("style")
  @Nullable
  Unknown /* ( AnnotationsMeasureTypeLabelStyleOptions | CSSObject ) */ getStyle();

  /**
   * (Highstock) CSS styles for the measure label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highstock) CSS styles for the measure label.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable AnnotationsMeasureTypeLabelStyleOptions value);

  class Builder {
    private final AnnotationsMeasureTypeLabelOptions object = Any.empty();

    public AnnotationsMeasureTypeLabelOptions build() {
      return object;
    }

    /**
     * (Highstock) Enable or disable the label text (min, max, average, bins
     * values).
     *
     * Defaults to true.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) Formatter function for the label text.
     *
     * Available data are:
     *
     * (see online documentation for example)
     *
     */
    public Builder formatter(@Nullable JsFunction value) {
      object.setFormatter(value);
      return this;
    }

    /**
     * (Highstock) CSS styles for the measure label.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highstock) CSS styles for the measure label.
     *
     */
    public Builder style(@Nullable AnnotationsMeasureTypeLabelStyleOptions value) {
      object.setStyle(value);
      return this;
    }
  }
}
