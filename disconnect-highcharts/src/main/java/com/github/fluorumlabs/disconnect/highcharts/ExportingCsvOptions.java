package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for exporting data to CSV or ExCel,
 * or displaying the data in a HTML table or a JavaScript structure. Requires
 * the <code>export-data.js</code> module. This module adds data export options to the
 * export menu and provides functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>,
 * <code>Chart.getDataRows</code> and <code>Chart.viewData</code>.
 *
 * The XLS converter is limited and only creates a HTML string that is passed
 * for download, which works but creates a warning before opening. The
 * workaround for this is to use a third party XLSX converter, as demonstrated
 * in the sample below.
 *
 * @see <a href="https://api.highcharts.com/highcharts/exporting.csv">https://api.highcharts.com/highcharts/exporting.csv</a>
 * @see <a href="https://api.highcharts.com/highstock/exporting.csv">https://api.highcharts.com/highstock/exporting.csv</a>
 * @see <a href="https://api.highcharts.com/highmaps/exporting.csv">https://api.highcharts.com/highmaps/exporting.csv</a>
 *
 */
public interface ExportingCsvOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Formatter callback for the column
   * headers. Parameters are:
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
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highcharts/exporting.csv.columnHeaderFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highstock/exporting.csv.columnHeaderFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highmaps/exporting.csv.columnHeaderFormatter</a>
   *
   * @implspec columnHeaderFormatter?: (() =&gt; void|null);
   *
   */
  @JSProperty("columnHeaderFormatter")
  @Nullable
  ColumnHeaderFormatter getColumnHeaderFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Formatter callback for the column
   * headers. Parameters are:
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
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highcharts/exporting.csv.columnHeaderFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highstock/exporting.csv.columnHeaderFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.columnHeaderFormatter">https://api.highcharts.com/highmaps/exporting.csv.columnHeaderFormatter</a>
   *
   * @implspec columnHeaderFormatter?: (() =&gt; void|null);
   *
   */
  @JSProperty("columnHeaderFormatter")
  void setColumnHeaderFormatter(ColumnHeaderFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps) Which date format to use for exported
   * dates on a datetime X axis. See <code>Highcharts.dateFormat</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.dateFormat">https://api.highcharts.com/highcharts/exporting.csv.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.dateFormat">https://api.highcharts.com/highstock/exporting.csv.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.dateFormat">https://api.highcharts.com/highmaps/exporting.csv.dateFormat</a>
   *
   * @implspec dateFormat?: string;
   *
   */
  @JSProperty("dateFormat")
  @Nullable
  String getDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps) Which date format to use for exported
   * dates on a datetime X axis. See <code>Highcharts.dateFormat</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.dateFormat">https://api.highcharts.com/highcharts/exporting.csv.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.dateFormat">https://api.highcharts.com/highstock/exporting.csv.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.dateFormat">https://api.highcharts.com/highmaps/exporting.csv.dateFormat</a>
   *
   * @implspec dateFormat?: string;
   *
   */
  @JSProperty("dateFormat")
  void setDateFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Which decimal point to use for exported
   * CSV. Defaults to the same as the browser locale, typically <code>.</code> (English)
   * or <code>,</code> (German, French etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.decimalPoint">https://api.highcharts.com/highcharts/exporting.csv.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.decimalPoint">https://api.highcharts.com/highstock/exporting.csv.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.decimalPoint">https://api.highcharts.com/highmaps/exporting.csv.decimalPoint</a>
   *
   * @implspec decimalPoint?: (string|null);
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps) Which decimal point to use for exported
   * CSV. Defaults to the same as the browser locale, typically <code>.</code> (English)
   * or <code>,</code> (German, French etc).
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.decimalPoint">https://api.highcharts.com/highcharts/exporting.csv.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.decimalPoint">https://api.highcharts.com/highstock/exporting.csv.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.decimalPoint">https://api.highcharts.com/highmaps/exporting.csv.decimalPoint</a>
   *
   * @implspec decimalPoint?: (string|null);
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The item delimiter in the exported
   * data. Use <code>;</code> for direct exporting to Excel. Defaults to a best guess
   * based on the browser locale. If the locale <em>decimal point</em> is <code>,</code>, the
   * <code>itemDelimiter</code> defaults to <code>;</code>, otherwise the <code>itemDelimiter</code> defaults
   * to <code>,</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.itemDelimiter">https://api.highcharts.com/highcharts/exporting.csv.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.itemDelimiter">https://api.highcharts.com/highstock/exporting.csv.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.itemDelimiter">https://api.highcharts.com/highmaps/exporting.csv.itemDelimiter</a>
   *
   * @implspec itemDelimiter?: (string|null);
   *
   */
  @JSProperty("itemDelimiter")
  @Nullable
  String getItemDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps) The item delimiter in the exported
   * data. Use <code>;</code> for direct exporting to Excel. Defaults to a best guess
   * based on the browser locale. If the locale <em>decimal point</em> is <code>,</code>, the
   * <code>itemDelimiter</code> defaults to <code>;</code>, otherwise the <code>itemDelimiter</code> defaults
   * to <code>,</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.itemDelimiter">https://api.highcharts.com/highcharts/exporting.csv.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.itemDelimiter">https://api.highcharts.com/highstock/exporting.csv.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.itemDelimiter">https://api.highcharts.com/highmaps/exporting.csv.itemDelimiter</a>
   *
   * @implspec itemDelimiter?: (string|null);
   *
   */
  @JSProperty("itemDelimiter")
  void setItemDelimiter(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The line delimiter in the exported
   * data, defaults to a newline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.lineDelimiter">https://api.highcharts.com/highcharts/exporting.csv.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.lineDelimiter">https://api.highcharts.com/highstock/exporting.csv.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.lineDelimiter">https://api.highcharts.com/highmaps/exporting.csv.lineDelimiter</a>
   *
   * @implspec lineDelimiter?: string;
   *
   */
  @JSProperty("lineDelimiter")
  @Nullable
  String getLineDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps) The line delimiter in the exported
   * data, defaults to a newline.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv.lineDelimiter">https://api.highcharts.com/highcharts/exporting.csv.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv.lineDelimiter">https://api.highcharts.com/highstock/exporting.csv.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv.lineDelimiter">https://api.highcharts.com/highmaps/exporting.csv.lineDelimiter</a>
   *
   * @implspec lineDelimiter?: string;
   *
   */
  @JSProperty("lineDelimiter")
  void setLineDelimiter(String value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface ColumnHeaderFormatter extends Any {
    void apply();
  }
}
