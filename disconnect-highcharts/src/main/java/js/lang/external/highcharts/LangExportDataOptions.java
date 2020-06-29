package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangExportDataOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
   * axis type set to &quot;datetime&quot;.
   *
   */
  @JSProperty("categoryDatetimeHeader")
  @Nullable
  String getCategoryDatetimeHeader();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
   * axis type set to &quot;datetime&quot;.
   *
   */
  @JSProperty("categoryDatetimeHeader")
  void setCategoryDatetimeHeader(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
   *
   */
  @JSProperty("categoryHeader")
  @Nullable
  String getCategoryHeader();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
   *
   */
  @JSProperty("categoryHeader")
  void setCategoryHeader(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangExportDataOptions object = Any.empty();

    private Builder() {
    }

    public LangExportDataOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
     * axis type set to &quot;datetime&quot;.
     *
     */
    public Builder categoryDatetimeHeader(@Nullable String value) {
      object.setCategoryDatetimeHeader(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
     *
     */
    public Builder categoryHeader(@Nullable String value) {
      object.setCategoryHeader(value);
      return this;
    }
  }
}
