package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to CSV or
 * ExCel, or displaying the data in a HTML table or a JavaScript structure.
 *
 * This module adds data export options to the export menu and provides
 * functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and
 * <code>Chart.viewData</code>.
 *
 * The XLS converter is limited and only creates a HTML string that is passed
 * for download, which works but creates a warning before opening. The
 * workaround for this is to use a third party XLSX converter, as demonstrated
 * in the sample below.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingCsvOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
   * column headers. Parameters are:
   *
   * <ul>
   * <li>
   * <code>item</code> - The series or axis object)
   *
   * </li>
   * <li>
   * <code>key</code> - The point key, for example y or z
   *
   * </li>
   * <li>
   * <code>keyLength</code> - The amount of value keys for this item, for example a
   * range series has the keys <code>low</code> and <code>high</code> so the key length is 2.
   *
   * </li>
   * </ul>
   * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
   * an object with columnTitle and topLevelColumnTitle for each key. Columns
   * with the same topLevelColumnTitle have their titles merged into a single
   * cell with colspan for table/Excel export.
   *
   * If <code>useMultiLevelHeaders</code> is false, or for CSV export, it returns the
   * series name, followed by the key if there is more than one key.
   *
   * For the axis it returns the axis title or &quot;Category&quot; or &quot;DateTime&quot; by
   * default.
   *
   * Return <code>false</code> to use Highcharts' proposed header.
   *
   */
  @JSProperty("columnHeaderFormatter")
  @Nullable
  JsFunction getColumnHeaderFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
   * column headers. Parameters are:
   *
   * <ul>
   * <li>
   * <code>item</code> - The series or axis object)
   *
   * </li>
   * <li>
   * <code>key</code> - The point key, for example y or z
   *
   * </li>
   * <li>
   * <code>keyLength</code> - The amount of value keys for this item, for example a
   * range series has the keys <code>low</code> and <code>high</code> so the key length is 2.
   *
   * </li>
   * </ul>
   * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
   * an object with columnTitle and topLevelColumnTitle for each key. Columns
   * with the same topLevelColumnTitle have their titles merged into a single
   * cell with colspan for table/Excel export.
   *
   * If <code>useMultiLevelHeaders</code> is false, or for CSV export, it returns the
   * series name, followed by the key if there is more than one key.
   *
   * For the axis it returns the axis title or &quot;Category&quot; or &quot;DateTime&quot; by
   * default.
   *
   * Return <code>false</code> to use Highcharts' proposed header.
   *
   */
  @JSProperty("columnHeaderFormatter")
  void setColumnHeaderFormatter(@Nullable JsFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
   * exported dates on a datetime X axis. See <code>Highcharts.dateFormat</code>.
   *
   */
  @JSProperty("dateFormat")
  @Nullable
  String getDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
   * exported dates on a datetime X axis. See <code>Highcharts.dateFormat</code>.
   *
   */
  @JSProperty("dateFormat")
  void setDateFormat(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
   * exported CSV. Defaults to the same as the browser locale, typically <code>.</code>
   * (English) or <code>,</code> (German, French etc).
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
   * exported CSV. Defaults to the same as the browser locale, typically <code>.</code>
   * (English) or <code>,</code> (German, French etc).
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
   * exported data. Use <code>;</code> for direct exporting to Excel. Defaults to a best
   * guess based on the browser locale. If the locale <em>decimal point</em> is <code>,</code>,
   * the <code>itemDelimiter</code> defaults to <code>;</code>, otherwise the <code>itemDelimiter</code>
   * defaults to <code>,</code>.
   *
   */
  @JSProperty("itemDelimiter")
  @Nullable
  String getItemDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
   * exported data. Use <code>;</code> for direct exporting to Excel. Defaults to a best
   * guess based on the browser locale. If the locale <em>decimal point</em> is <code>,</code>,
   * the <code>itemDelimiter</code> defaults to <code>;</code>, otherwise the <code>itemDelimiter</code>
   * defaults to <code>,</code>.
   *
   */
  @JSProperty("itemDelimiter")
  void setItemDelimiter(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
   * exported data, defaults to a newline.
   *
   */
  @JSProperty("lineDelimiter")
  @Nullable
  String getLineDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
   * exported data, defaults to a newline.
   *
   */
  @JSProperty("lineDelimiter")
  void setLineDelimiter(@Nullable String value);

  class Builder {
    private final ExportingCsvOptions object = Any.empty();

    public ExportingCsvOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
     * column headers. Parameters are:
     *
     * <ul>
     * <li>
     * <code>item</code> - The series or axis object)
     *
     * </li>
     * <li>
     * <code>key</code> - The point key, for example y or z
     *
     * </li>
     * <li>
     * <code>keyLength</code> - The amount of value keys for this item, for example a
     * range series has the keys <code>low</code> and <code>high</code> so the key length is 2.
     *
     * </li>
     * </ul>
     * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
     * an object with columnTitle and topLevelColumnTitle for each key. Columns
     * with the same topLevelColumnTitle have their titles merged into a single
     * cell with colspan for table/Excel export.
     *
     * If <code>useMultiLevelHeaders</code> is false, or for CSV export, it returns the
     * series name, followed by the key if there is more than one key.
     *
     * For the axis it returns the axis title or &quot;Category&quot; or &quot;DateTime&quot; by
     * default.
     *
     * Return <code>false</code> to use Highcharts' proposed header.
     *
     */
    public Builder columnHeaderFormatter(@Nullable JsFunction value) {
      object.setColumnHeaderFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
     * exported dates on a datetime X axis. See <code>Highcharts.dateFormat</code>.
     *
     */
    public Builder dateFormat(@Nullable String value) {
      object.setDateFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
     * exported CSV. Defaults to the same as the browser locale, typically <code>.</code>
     * (English) or <code>,</code> (German, French etc).
     *
     */
    public Builder decimalPoint(@Nullable String value) {
      object.setDecimalPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
     * exported data. Use <code>;</code> for direct exporting to Excel. Defaults to a best
     * guess based on the browser locale. If the locale <em>decimal point</em> is <code>,</code>,
     * the <code>itemDelimiter</code> defaults to <code>;</code>, otherwise the <code>itemDelimiter</code>
     * defaults to <code>,</code>.
     *
     */
    public Builder itemDelimiter(@Nullable String value) {
      object.setItemDelimiter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
     * exported data, defaults to a newline.
     *
     */
    public Builder lineDelimiter(@Nullable String value) {
      object.setLineDelimiter(value);
      return this;
    }
  }
}
