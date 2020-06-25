package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( string | HTMLElement ) */;
import js.lang.Unknown /* Array < Array < DataValueType > > */;
import js.lang.Unknown /* number */;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
 * simplified interface for adding data to a chart from sources like CVS, HTML
 * tables or grid views. See also the tutorial article on the Data module.
 *
 * It requires the <code>modules/data.js</code> file to be loaded.
 *
 * Please note that the default way of adding data in Highcharts, without the
 * need of a module, is through the series.<em>type</em>.data option.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DataOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
   * the CSV before parsing it. Return the modified string.
   *
   */
  @JSProperty("beforeParse")
  @Nullable
  DataBeforeParseCallbackFunction getBeforeParse();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
   * the CSV before parsing it. Return the modified string.
   *
   */
  @JSProperty("beforeParse")
  void setBeforeParse(@Nullable DataBeforeParseCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
   * representing the input data on tabular form. This input can be used when
   * the data is already parsed, for example from a grid view component. Each
   * cell can be a string or number. If not switchRowsAndColumns is set, the
   * columns are interpreted as series.
   *
   */
  @JSProperty("columns")
  @Nullable
  Unknown /* Array < Array < DataValueType > > */ getColumns();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
   * representing the input data on tabular form. This input can be used when
   * the data is already parsed, for example from a grid view component. Each
   * cell can be a string or number. If not switchRowsAndColumns is set, the
   * columns are interpreted as series.
   *
   */
  @JSProperty("columns")
  void setColumns(double[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
   * representing the input data on tabular form. This input can be used when
   * the data is already parsed, for example from a grid view component. Each
   * cell can be a string or number. If not switchRowsAndColumns is set, the
   * columns are interpreted as series.
   *
   */
  @JSProperty("columns")
  void setColumns(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
   * structured as a column array. Will be fetched when the chart is created
   * using Ajax.
   *
   */
  @JSProperty("columnsURL")
  @Nullable
  String getColumnsURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
   * structured as a column array. Will be fetched when the chart is created
   * using Ajax.
   *
   */
  @JSProperty("columnsURL")
  void setColumnsURL(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
   * when the data is finished loading, optionally from an external source,
   * and parsed. The first argument passed is a finished chart options object,
   * containing the series. These options can be extended with additional
   * options and passed directly to the chart constructor.
   *
   */
  @JSProperty("complete")
  @Nullable
  DataCompleteCallbackFunction getComplete();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
   * when the data is finished loading, optionally from an external source,
   * and parsed. The first argument passed is a finished chart options object,
   * containing the series. These options can be extended with additional
   * options and passed directly to the chart constructor.
   *
   */
  @JSProperty("complete")
  void setComplete(@Nullable DataCompleteCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
   * parsed. Related options are startRow, endRow, startColumn and endColumn
   * to delimit what part of the table is used. The lineDelimiter and
   * itemDelimiter options define the CSV delimiter formats.
   *
   * The built-in CSV parser doesn't support all flavours of CSV, so in some
   * cases it may be necessary to use an external CSV parser. See this example
   * of parsing CSV through the MIT licensed Papa Parse library.
   *
   */
  @JSProperty("csv")
  @Nullable
  String getCsv();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
   * parsed. Related options are startRow, endRow, startColumn and endColumn
   * to delimit what part of the table is used. The lineDelimiter and
   * itemDelimiter options define the CSV delimiter formats.
   *
   * The built-in CSV parser doesn't support all flavours of CSV, so in some
   * cases it may be necessary to use an external CSV parser. See this example
   * of parsing CSV through the MIT licensed Papa Parse library.
   *
   */
  @JSProperty("csv")
  void setCsv(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
   * Will be fetched when the chart is created using Ajax.
   *
   */
  @JSProperty("csvURL")
  @Nullable
  String getCsvURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
   * Will be fetched when the chart is created using Ajax.
   *
   */
  @JSProperty("csvURL")
  void setCsvURL(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
   * polling when importing remote dataset by setting data.csvURL,
   * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
   *
   * Note that polling must be enabled by setting data.enablePolling to true.
   *
   * The value is the number of seconds between pollings. It cannot be set to
   * less than 1 second.
   *
   */
  @JSProperty("dataRefreshRate")
  double getDataRefreshRate();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
   * polling when importing remote dataset by setting data.csvURL,
   * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
   *
   * Note that polling must be enabled by setting data.enablePolling to true.
   *
   * The value is the number of seconds between pollings. It cannot be set to
   * less than 1 second.
   *
   */
  @JSProperty("dataRefreshRate")
  void setDataRefreshRate(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
   * formats in Date.prototype.dateFormats to use to parse date values.
   * Defaults to a best guess based on what format gives valid and ordered
   * dates. Valid options include: <code>YYYY/mm/dd</code>, <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>,
   * <code>dd/mm/YY</code>, <code>mm/dd/YY</code>.
   *
   */
  @JSProperty("dateFormat")
  @Nullable
  DateFormat getDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
   * formats in Date.prototype.dateFormats to use to parse date values.
   * Defaults to a best guess based on what format gives valid and ordered
   * dates. Valid options include: <code>YYYY/mm/dd</code>, <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>,
   * <code>dd/mm/YY</code>, <code>mm/dd/YY</code>.
   *
   */
  @JSProperty("dateFormat")
  void setDateFormat(@Nullable DateFormat value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
   * parsing numbers in the CSV.
   *
   * If both this and data.delimiter is set to <code>undefined</code>, the parser will
   * attempt to deduce the decimal point automatically.
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
   * parsing numbers in the CSV.
   *
   * If both this and data.delimiter is set to <code>undefined</code>, the parser will
   * attempt to deduce the decimal point automatically.
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
   * remote datasets every <em>n</em> seconds (defined by setting
   * data.dataRefreshRate).
   *
   * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
   * data.googleSpreadsheetKey.
   *
   */
  @JSProperty("enablePolling")
  boolean getEnablePolling();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
   * remote datasets every <em>n</em> seconds (defined by setting
   * data.dataRefreshRate).
   *
   * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
   * data.googleSpreadsheetKey.
   *
   */
  @JSProperty("enablePolling")
  void setEnablePolling(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
   * column (indexed by 0) to use. Defaults to the last column containing
   * data.
   *
   */
  @JSProperty("endColumn")
  double getEndColumn();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
   * column (indexed by 0) to use. Defaults to the last column containing
   * data.
   *
   */
  @JSProperty("endColumn")
  void setEndColumn(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
   * row (indexed by 0) to use. Defaults to the last row containing data.
   *
   */
  @JSProperty("endRow")
  double getEndRow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
   * row (indexed by 0) to use. Defaults to the last row containing data.
   *
   */
  @JSProperty("endRow")
  void setEndRow(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
   * set as series names.
   *
   */
  @JSProperty("firstRowAsNames")
  boolean getFirstRowAsNames();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
   * set as series names.
   *
   */
  @JSProperty("firstRowAsNames")
  void setFirstRowAsNames(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
   * to load. See general information on GS.
   *
   */
  @JSProperty("googleSpreadsheetKey")
  @Nullable
  String getGoogleSpreadsheetKey();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
   * to load. See general information on GS.
   *
   */
  @JSProperty("googleSpreadsheetKey")
  void setGoogleSpreadsheetKey(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
   * to use in combination with googleSpreadsheetKey. The available id's from
   * your sheet can be read from
   * <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.
   *
   */
  @JSProperty("googleSpreadsheetWorksheet")
  @Nullable
  String getGoogleSpreadsheetWorksheet();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
   * to use in combination with googleSpreadsheetKey. The available id's from
   * your sheet can be read from
   * <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.
   *
   */
  @JSProperty("googleSpreadsheetWorksheet")
  void setGoogleSpreadsheetWorksheet(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
   * parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is
   * found in the CSV string, if not it defaults to <code>,</code>.
   *
   * If this is set to false or undefined, the parser will attempt to deduce
   * the delimiter automatically.
   *
   */
  @JSProperty("itemDelimiter")
  @Nullable
  String getItemDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
   * parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is
   * found in the CSV string, if not it defaults to <code>,</code>.
   *
   * If this is set to false or undefined, the parser will attempt to deduce
   * the delimiter automatically.
   *
   */
  @JSProperty("itemDelimiter")
  void setItemDelimiter(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
   *
   */
  @JSProperty("lineDelimiter")
  @Nullable
  String getLineDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
   *
   */
  @JSProperty("lineDelimiter")
  void setLineDelimiter(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
   * the parsed columns, the two-dimentional input data array directly, before
   * they are interpreted into series data and categories. Return <code>false</code> to
   * stop completion, or call <code>this.complete()</code> to continue async.
   *
   */
  @JSProperty("parsed")
  @Nullable
  DataParsedCallbackFunction getParsed();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
   * the parsed columns, the two-dimentional input data array directly, before
   * they are interpreted into series data and categories. Return <code>false</code> to
   * stop completion, or call <code>this.complete()</code> to continue async.
   *
   */
  @JSProperty("parsed")
  void setParsed(@Nullable DataParsedCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
   * string representations of dates into JavaScript timestamps. Should return
   * an integer timestamp on success.
   *
   */
  @JSProperty("parseDate")
  @Nullable
  DataParseDateCallbackFunction getParseDate();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
   * string representations of dates into JavaScript timestamps. Should return
   * an integer timestamp on success.
   *
   */
  @JSProperty("parseDate")
  void setParseDate(@Nullable DataParseDateCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
   * option, but defining rows intead of columns.
   *
   */
  @JSProperty("rows")
  @Nullable
  Unknown /* Array < Array < DataValueType > > */ getRows();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
   * option, but defining rows intead of columns.
   *
   */
  @JSProperty("rows")
  void setRows(double[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
   * option, but defining rows intead of columns.
   *
   */
  @JSProperty("rows")
  void setRows(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
   * structured as a row array. Will be fetched when the chart is created
   * using Ajax.
   *
   */
  @JSProperty("rowsURL")
  @Nullable
  String getRowsURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
   * structured as a row array. Will be fetched when the chart is created
   * using Ajax.
   *
   */
  @JSProperty("rowsURL")
  void setRowsURL(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
   * for each series. A dictionary exists of Point property names as the key
   * and the CSV column index as the value.
   *
   */
  @JSProperty("seriesMapping")
  @Nullable
  Dictionary<Unknown /* number */> getSeriesMapping();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
   * for each series. A dictionary exists of Point property names as the key
   * and the CSV column index as the value.
   *
   */
  @JSProperty("seriesMapping")
  void setSeriesMapping(@Nullable Dictionary<Unknown /* number */> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
   * column (indexed by 0) to use.
   *
   */
  @JSProperty("startColumn")
  double getStartColumn();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
   * column (indexed by 0) to use.
   *
   */
  @JSProperty("startColumn")
  void setStartColumn(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
   * row (indexed by 0) to use.
   *
   */
  @JSProperty("startRow")
  double getStartRow();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
   * row (indexed by 0) to use.
   *
   */
  @JSProperty("startRow")
  void setStartRow(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
   * input data, so that <code>this.columns</code> effectively becomes the rows of the
   * data set, and the rows are interpreted as series.
   *
   */
  @JSProperty("switchRowsAndColumns")
  boolean getSwitchRowsAndColumns();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
   * input data, so that <code>this.columns</code> effectively becomes the rows of the
   * data set, and the rows are interpreted as series.
   *
   */
  @JSProperty("switchRowsAndColumns")
  void setSwitchRowsAndColumns(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
   * to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   */
  @JSProperty("table")
  @Nullable
  Unknown /* ( string | HTMLElement ) */ getTable();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
   * to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   */
  @JSProperty("table")
  void setTable(@Nullable HTMLElement value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
   * to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   */
  @JSProperty("table")
  void setTable(@Nullable String value);

  abstract class DateFormat extends JsEnum {
    public static final DateFormat DD_MM_YY = JsEnum.of("dd/mm/YY");

    public static final DateFormat DD_MM_YYYY = JsEnum.of("dd/mm/YYYY");

    public static final DateFormat MM_DD_YY = JsEnum.of("mm/dd/YY");

    public static final DateFormat MM_DD_YYYY = JsEnum.of("mm/dd/YYYY");

    public static final DateFormat YYYY_MM_DD = JsEnum.of("YYYY/mm/dd");
  }

  class Builder {
    private final DataOptions object = Any.empty();

    public DataOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
     * the CSV before parsing it. Return the modified string.
     *
     */
    public Builder beforeParse(@Nullable DataBeforeParseCallbackFunction value) {
      object.setBeforeParse(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
     * representing the input data on tabular form. This input can be used when
     * the data is already parsed, for example from a grid view component. Each
     * cell can be a string or number. If not switchRowsAndColumns is set, the
     * columns are interpreted as series.
     *
     */
    public Builder columns(double[] value) {
      object.setColumns(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
     * representing the input data on tabular form. This input can be used when
     * the data is already parsed, for example from a grid view component. Each
     * cell can be a string or number. If not switchRowsAndColumns is set, the
     * columns are interpreted as series.
     *
     */
    public Builder columns(String[] value) {
      object.setColumns(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
     * structured as a column array. Will be fetched when the chart is created
     * using Ajax.
     *
     */
    public Builder columnsURL(@Nullable String value) {
      object.setColumnsURL(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
     * when the data is finished loading, optionally from an external source,
     * and parsed. The first argument passed is a finished chart options object,
     * containing the series. These options can be extended with additional
     * options and passed directly to the chart constructor.
     *
     */
    public Builder complete(@Nullable DataCompleteCallbackFunction value) {
      object.setComplete(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
     * parsed. Related options are startRow, endRow, startColumn and endColumn
     * to delimit what part of the table is used. The lineDelimiter and
     * itemDelimiter options define the CSV delimiter formats.
     *
     * The built-in CSV parser doesn't support all flavours of CSV, so in some
     * cases it may be necessary to use an external CSV parser. See this example
     * of parsing CSV through the MIT licensed Papa Parse library.
     *
     */
    public Builder csv(@Nullable String value) {
      object.setCsv(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
     * Will be fetched when the chart is created using Ajax.
     *
     */
    public Builder csvURL(@Nullable String value) {
      object.setCsvURL(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
     * polling when importing remote dataset by setting data.csvURL,
     * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
     *
     * Note that polling must be enabled by setting data.enablePolling to true.
     *
     * The value is the number of seconds between pollings. It cannot be set to
     * less than 1 second.
     *
     */
    public Builder dataRefreshRate(double value) {
      object.setDataRefreshRate(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
     * formats in Date.prototype.dateFormats to use to parse date values.
     * Defaults to a best guess based on what format gives valid and ordered
     * dates. Valid options include: <code>YYYY/mm/dd</code>, <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>,
     * <code>dd/mm/YY</code>, <code>mm/dd/YY</code>.
     *
     */
    public Builder dateFormat(@Nullable DateFormat value) {
      object.setDateFormat(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
     * parsing numbers in the CSV.
     *
     * If both this and data.delimiter is set to <code>undefined</code>, the parser will
     * attempt to deduce the decimal point automatically.
     *
     */
    public Builder decimalPoint(@Nullable String value) {
      object.setDecimalPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
     * remote datasets every <em>n</em> seconds (defined by setting
     * data.dataRefreshRate).
     *
     * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
     * data.googleSpreadsheetKey.
     *
     */
    public Builder enablePolling(boolean value) {
      object.setEnablePolling(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
     * column (indexed by 0) to use. Defaults to the last column containing
     * data.
     *
     */
    public Builder endColumn(double value) {
      object.setEndColumn(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
     * row (indexed by 0) to use. Defaults to the last row containing data.
     *
     */
    public Builder endRow(double value) {
      object.setEndRow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
     * set as series names.
     *
     */
    public Builder firstRowAsNames(boolean value) {
      object.setFirstRowAsNames(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
     * to load. See general information on GS.
     *
     */
    public Builder googleSpreadsheetKey(@Nullable String value) {
      object.setGoogleSpreadsheetKey(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
     * to use in combination with googleSpreadsheetKey. The available id's from
     * your sheet can be read from
     * <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.
     *
     */
    public Builder googleSpreadsheetWorksheet(@Nullable String value) {
      object.setGoogleSpreadsheetWorksheet(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
     * parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is
     * found in the CSV string, if not it defaults to <code>,</code>.
     *
     * If this is set to false or undefined, the parser will attempt to deduce
     * the delimiter automatically.
     *
     */
    public Builder itemDelimiter(@Nullable String value) {
      object.setItemDelimiter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
     *
     */
    public Builder lineDelimiter(@Nullable String value) {
      object.setLineDelimiter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
     * the parsed columns, the two-dimentional input data array directly, before
     * they are interpreted into series data and categories. Return <code>false</code> to
     * stop completion, or call <code>this.complete()</code> to continue async.
     *
     */
    public Builder parsed(@Nullable DataParsedCallbackFunction value) {
      object.setParsed(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
     * string representations of dates into JavaScript timestamps. Should return
     * an integer timestamp on success.
     *
     */
    public Builder parseDate(@Nullable DataParseDateCallbackFunction value) {
      object.setParseDate(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
     * option, but defining rows intead of columns.
     *
     */
    public Builder rows(double[] value) {
      object.setRows(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
     * option, but defining rows intead of columns.
     *
     */
    public Builder rows(String[] value) {
      object.setRows(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
     * structured as a row array. Will be fetched when the chart is created
     * using Ajax.
     *
     */
    public Builder rowsURL(@Nullable String value) {
      object.setRowsURL(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
     * for each series. A dictionary exists of Point property names as the key
     * and the CSV column index as the value.
     *
     */
    public Builder seriesMapping(@Nullable Dictionary<Unknown /* number */> value) {
      object.setSeriesMapping(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
     * column (indexed by 0) to use.
     *
     */
    public Builder startColumn(double value) {
      object.setStartColumn(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
     * row (indexed by 0) to use.
     *
     */
    public Builder startRow(double value) {
      object.setStartRow(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
     * input data, so that <code>this.columns</code> effectively becomes the rows of the
     * data set, and the rows are interpreted as series.
     *
     */
    public Builder switchRowsAndColumns(boolean value) {
      object.setSwitchRowsAndColumns(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
     * to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
     * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
     *
     */
    public Builder table(@Nullable HTMLElement value) {
      object.setTable(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
     * to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
     * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
     *
     */
    public Builder table(@Nullable String value) {
      object.setTable(value);
      return this;
    }
  }
}
