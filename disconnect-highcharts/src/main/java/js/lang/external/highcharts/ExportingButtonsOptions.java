package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
 * buttons, print and export. In addition to the default buttons listed here,
 * custom buttons can be added. See navigation.buttonOptions for general
 * options.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingButtonsOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
   *
   * In styled mode, export button styles can be applied with the
   * <code>.highcharts-contextbutton</code> class.
   *
   */
  @JSProperty("contextButton")
  @Nullable
  ExportingButtonsOptionsObject getContextButton();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
   *
   * In styled mode, export button styles can be applied with the
   * <code>.highcharts-contextbutton</code> class.
   *
   */
  @JSProperty("contextButton")
  void setContextButton(@Nullable ExportingButtonsOptionsObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ExportingButtonsOptions object = Any.empty();

    private Builder() {
    }

    public ExportingButtonsOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
     *
     * In styled mode, export button styles can be applied with the
     * <code>.highcharts-contextbutton</code> class.
     *
     */
    public Builder contextButton(@Nullable ExportingButtonsOptionsObject value) {
      object.setContextButton(value);
      return this;
    }
  }
}
