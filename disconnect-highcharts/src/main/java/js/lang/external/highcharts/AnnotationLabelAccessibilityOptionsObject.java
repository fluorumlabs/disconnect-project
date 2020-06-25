package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for an
 * annotation label.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AnnotationLabelAccessibilityOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
   * label for screen readers and other assistive technology.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
   * label for screen readers and other assistive technology.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  class Builder {
    private final AnnotationLabelAccessibilityOptionsObject object = Any.empty();

    public AnnotationLabelAccessibilityOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Description of an annotation
     * label for screen readers and other assistive technology.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }
  }
}
