package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Contains information about the export data event.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportDataEventObject extends Any {
  /**
   * Contains the data rows for the current export task and can be modified.
   *
   */
  @JSProperty("dataRows")
  String[] getDataRows();

  /**
   * Contains the data rows for the current export task and can be modified.
   *
   */
  @JSProperty("dataRows")
  void setDataRows(String... value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ExportDataEventObject object = Any.empty();

    private Builder() {
    }

    public ExportDataEventObject build() {
      return object;
    }

    /**
     * Contains the data rows for the current export task and can be modified.
     *
     */
    public Builder dataRows(String... value) {
      object.setDataRows(value);
      return this;
    }
  }
}
