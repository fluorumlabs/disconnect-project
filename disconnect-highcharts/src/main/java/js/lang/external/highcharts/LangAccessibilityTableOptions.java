package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options for
 * the data table.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityTableOptions extends Any {
  @JSProperty("tableSummary")
  @Nullable
  String getTableSummary();

  @JSProperty("tableSummary")
  void setTableSummary(@Nullable String value);

  @JSProperty("viewAsDataTableButtonText")
  @Nullable
  String getViewAsDataTableButtonText();

  @JSProperty("viewAsDataTableButtonText")
  void setViewAsDataTableButtonText(@Nullable String value);

  class Builder {
    private final LangAccessibilityTableOptions object = Any.empty();

    public LangAccessibilityTableOptions build() {
      return object;
    }

    public Builder tableSummary(@Nullable String value) {
      object.setTableSummary(value);
      return this;
    }

    public Builder viewAsDataTableButtonText(@Nullable String value) {
      object.setViewAsDataTableButtonText(value);
      return this;
    }
  }
}
