package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) Accessibility options for a data point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointAccessibilityOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Gantt) Provide a description of the data point,
   * announced to screen readers.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Gantt) Provide a description of the data point,
   * announced to screen readers.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  class Builder {
    private final PointAccessibilityOptionsObject object = Any.empty();

    public PointAccessibilityOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) Provide a description of the data point,
     * announced to screen readers.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }
  }
}
