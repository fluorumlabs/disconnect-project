package com.github.fluorumlabs.disconnect.highcharts;

import com.github.fluorumlabs.disconnect.types.IntRecord;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps) The Data module provides a simplified
 * interface for adding data to a chart from sources like CVS, HTML tables or
 * grid views. See also the tutorial article on the Data module.
 *
 * It requires the <code>modules/data.js</code> file to be loaded.
 *
 * Please note that the default way of adding data in Highcharts, without the
 * need of a module, is through the series.data option.
 *
 * @see <a href="https://api.highcharts.com/highcharts/data">https://api.highcharts.com/highcharts/data</a>
 * @see <a href="https://api.highcharts.com/highstock/data">https://api.highcharts.com/highstock/data</a>
 * @see <a href="https://api.highcharts.com/highmaps/data">https://api.highcharts.com/highmaps/data</a>
 *
 */
public interface DataOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) A callback function to modify the CSV
   * before parsing it. Return the modified string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.beforeParse">https://api.highcharts.com/highcharts/data.beforeParse</a>
   * @see <a href="https://api.highcharts.com/highstock/data.beforeParse">https://api.highcharts.com/highstock/data.beforeParse</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.beforeParse">https://api.highcharts.com/highmaps/data.beforeParse</a>
   *
   * @implspec beforeParse?: DataBeforeParseCallbackFunction;
   *
   */
  @JSProperty("beforeParse")
  @Nullable
  DataBeforeParseCallbackFunction getBeforeParse();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to modify the CSV
   * before parsing it. Return the modified string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.beforeParse">https://api.highcharts.com/highcharts/data.beforeParse</a>
   * @see <a href="https://api.highcharts.com/highstock/data.beforeParse">https://api.highcharts.com/highstock/data.beforeParse</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.beforeParse">https://api.highcharts.com/highmaps/data.beforeParse</a>
   *
   * @implspec beforeParse?: DataBeforeParseCallbackFunction;
   *
   */
  @JSProperty("beforeParse")
  void setBeforeParse(DataBeforeParseCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) A two-dimensional array representing
   * the input data on tabular form. This input can be used when the data is
   * already parsed, for example from a grid view component. Each cell can be
   * a string or number. If not switchRowsAndColumns is set, the columns are
   * interpreted as series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.columns">https://api.highcharts.com/highcharts/data.columns</a>
   * @see <a href="https://api.highcharts.com/highstock/data.columns">https://api.highcharts.com/highstock/data.columns</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.columns">https://api.highcharts.com/highmaps/data.columns</a>
   *
   * @implspec columns?: Array&lt;Array<any>&gt;;
   *
   */
  @JSProperty("columns")
  @Nullable
  Array<Array<Any>> getColumns();

  /**
   * (Highcharts, Highstock, Highmaps) A two-dimensional array representing
   * the input data on tabular form. This input can be used when the data is
   * already parsed, for example from a grid view component. Each cell can be
   * a string or number. If not switchRowsAndColumns is set, the columns are
   * interpreted as series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.columns">https://api.highcharts.com/highcharts/data.columns</a>
   * @see <a href="https://api.highcharts.com/highstock/data.columns">https://api.highcharts.com/highstock/data.columns</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.columns">https://api.highcharts.com/highmaps/data.columns</a>
   *
   * @implspec columns?: Array&lt;Array<any>&gt;;
   *
   */
  @JSProperty("columns")
  void setColumns(Array<Array<Any>> value);

  /**
   * (Highcharts, Highstock, Highmaps) A URL to a remote JSON dataset,
   * structured as a column array. Will be fetched when the chart is created
   * using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.columnsURL">https://api.highcharts.com/highcharts/data.columnsURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.columnsURL">https://api.highcharts.com/highstock/data.columnsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.columnsURL">https://api.highcharts.com/highmaps/data.columnsURL</a>
   *
   * @implspec columnsURL?: string;
   *
   */
  @JSProperty("columnsURL")
  @Nullable
  String getColumnsURL();

  /**
   * (Highcharts, Highstock, Highmaps) A URL to a remote JSON dataset,
   * structured as a column array. Will be fetched when the chart is created
   * using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.columnsURL">https://api.highcharts.com/highcharts/data.columnsURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.columnsURL">https://api.highcharts.com/highstock/data.columnsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.columnsURL">https://api.highcharts.com/highmaps/data.columnsURL</a>
   *
   * @implspec columnsURL?: string;
   *
   */
  @JSProperty("columnsURL")
  void setColumnsURL(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The callback that is evaluated when the
   * data is finished loading, optionally from an external source, and parsed.
   * The first argument passed is a finished chart options object, containing
   * the series. These options can be extended with additional options and
   * passed directly to the chart constructor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.complete">https://api.highcharts.com/highcharts/data.complete</a>
   * @see <a href="https://api.highcharts.com/highstock/data.complete">https://api.highcharts.com/highstock/data.complete</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.complete">https://api.highcharts.com/highmaps/data.complete</a>
   *
   * @implspec complete?: DataCompleteCallbackFunction;
   *
   */
  @JSProperty("complete")
  @Nullable
  DataCompleteCallbackFunction getComplete();

  /**
   * (Highcharts, Highstock, Highmaps) The callback that is evaluated when the
   * data is finished loading, optionally from an external source, and parsed.
   * The first argument passed is a finished chart options object, containing
   * the series. These options can be extended with additional options and
   * passed directly to the chart constructor.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.complete">https://api.highcharts.com/highcharts/data.complete</a>
   * @see <a href="https://api.highcharts.com/highstock/data.complete">https://api.highcharts.com/highstock/data.complete</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.complete">https://api.highcharts.com/highmaps/data.complete</a>
   *
   * @implspec complete?: DataCompleteCallbackFunction;
   *
   */
  @JSProperty("complete")
  void setComplete(DataCompleteCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) A comma delimited string to be parsed.
   * Related options are startRow, endRow, startColumn and endColumn to
   * delimit what part of the table is used. The lineDelimiter and
   * itemDelimiter options define the CSV delimiter formats.
   *
   * The built-in CSV parser doesn't support all flavours of CSV, so in some
   * cases it may be necessary to use an external CSV parser. See this example
   * of parsing CSV through the MIT licensed Papa Parse library.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.csv">https://api.highcharts.com/highcharts/data.csv</a>
   * @see <a href="https://api.highcharts.com/highstock/data.csv">https://api.highcharts.com/highstock/data.csv</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.csv">https://api.highcharts.com/highmaps/data.csv</a>
   *
   * @implspec csv?: string;
   *
   */
  @JSProperty("csv")
  @Nullable
  String getCsv();

  /**
   * (Highcharts, Highstock, Highmaps) A comma delimited string to be parsed.
   * Related options are startRow, endRow, startColumn and endColumn to
   * delimit what part of the table is used. The lineDelimiter and
   * itemDelimiter options define the CSV delimiter formats.
   *
   * The built-in CSV parser doesn't support all flavours of CSV, so in some
   * cases it may be necessary to use an external CSV parser. See this example
   * of parsing CSV through the MIT licensed Papa Parse library.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.csv">https://api.highcharts.com/highcharts/data.csv</a>
   * @see <a href="https://api.highcharts.com/highstock/data.csv">https://api.highcharts.com/highstock/data.csv</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.csv">https://api.highcharts.com/highmaps/data.csv</a>
   *
   * @implspec csv?: string;
   *
   */
  @JSProperty("csv")
  void setCsv(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An URL to a remote CSV dataset. Will be
   * fetched when the chart is created using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.csvURL">https://api.highcharts.com/highcharts/data.csvURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.csvURL">https://api.highcharts.com/highstock/data.csvURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.csvURL">https://api.highcharts.com/highmaps/data.csvURL</a>
   *
   * @implspec csvURL?: string;
   *
   */
  @JSProperty("csvURL")
  @Nullable
  String getCsvURL();

  /**
   * (Highcharts, Highstock, Highmaps) An URL to a remote CSV dataset. Will be
   * fetched when the chart is created using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.csvURL">https://api.highcharts.com/highcharts/data.csvURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.csvURL">https://api.highcharts.com/highstock/data.csvURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.csvURL">https://api.highcharts.com/highmaps/data.csvURL</a>
   *
   * @implspec csvURL?: string;
   *
   */
  @JSProperty("csvURL")
  void setCsvURL(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Sets the refresh rate for data polling
   * when importing remote dataset by setting data.csvURL, data.rowsURL,
   * data.columnsURL, or data.googleSpreadsheetKey.
   *
   * Note that polling must be enabled by setting data.enablePolling to true.
   *
   * The value is the number of seconds between pollings. It cannot be set to
   * less than 1 second.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.dataRefreshRate">https://api.highcharts.com/highcharts/data.dataRefreshRate</a>
   * @see <a href="https://api.highcharts.com/highstock/data.dataRefreshRate">https://api.highcharts.com/highstock/data.dataRefreshRate</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.dataRefreshRate">https://api.highcharts.com/highmaps/data.dataRefreshRate</a>
   *
   * @implspec dataRefreshRate?: number;
   *
   */
  @JSProperty("dataRefreshRate")
  double getDataRefreshRate();

  /**
   * (Highcharts, Highstock, Highmaps) Sets the refresh rate for data polling
   * when importing remote dataset by setting data.csvURL, data.rowsURL,
   * data.columnsURL, or data.googleSpreadsheetKey.
   *
   * Note that polling must be enabled by setting data.enablePolling to true.
   *
   * The value is the number of seconds between pollings. It cannot be set to
   * less than 1 second.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.dataRefreshRate">https://api.highcharts.com/highcharts/data.dataRefreshRate</a>
   * @see <a href="https://api.highcharts.com/highstock/data.dataRefreshRate">https://api.highcharts.com/highstock/data.dataRefreshRate</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.dataRefreshRate">https://api.highcharts.com/highmaps/data.dataRefreshRate</a>
   *
   * @implspec dataRefreshRate?: number;
   *
   */
  @JSProperty("dataRefreshRate")
  void setDataRefreshRate(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Which of the predefined date formats in
   * Date.prototype.dateFormats to use to parse date values. Defaults to a
   * best guess based on what format gives valid and ordered dates. Valid
   * options include: <code>YYYY/mm/dd</code>, <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>, <code>dd/mm/YY</code>,
   * <code>mm/dd/YY</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.dateFormat">https://api.highcharts.com/highcharts/data.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/data.dateFormat">https://api.highcharts.com/highstock/data.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.dateFormat">https://api.highcharts.com/highmaps/data.dateFormat</a>
   *
   * @implspec dateFormat?: (&quot;dd/mm/YY&quot;|&quot;dd/mm/YYYY&quot;|&quot;dd/mm/YYYY&quot;|&quot;mm/dd/YY&quot;|&quot;mm/dd/YYYY&quot;|&quot;YYYY/mm/dd&quot;);
   *
   */
  @JSProperty("dateFormat")
  @Nullable
  DateFormat getDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps) Which of the predefined date formats in
   * Date.prototype.dateFormats to use to parse date values. Defaults to a
   * best guess based on what format gives valid and ordered dates. Valid
   * options include: <code>YYYY/mm/dd</code>, <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>, <code>dd/mm/YY</code>,
   * <code>mm/dd/YY</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.dateFormat">https://api.highcharts.com/highcharts/data.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/data.dateFormat">https://api.highcharts.com/highstock/data.dateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.dateFormat">https://api.highcharts.com/highmaps/data.dateFormat</a>
   *
   * @implspec dateFormat?: (&quot;dd/mm/YY&quot;|&quot;dd/mm/YYYY&quot;|&quot;dd/mm/YYYY&quot;|&quot;mm/dd/YY&quot;|&quot;mm/dd/YYYY&quot;|&quot;YYYY/mm/dd&quot;);
   *
   */
  @JSProperty("dateFormat")
  void setDateFormat(DateFormat value);

  /**
   * (Highcharts, Highstock, Highmaps) The decimal point used for parsing
   * numbers in the CSV.
   *
   * If both this and data.delimiter is set to <code>undefined</code>, the parser will
   * attempt to deduce the decimal point automatically.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.decimalPoint">https://api.highcharts.com/highcharts/data.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/data.decimalPoint">https://api.highcharts.com/highstock/data.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.decimalPoint">https://api.highcharts.com/highmaps/data.decimalPoint</a>
   *
   * @implspec decimalPoint?: string;
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps) The decimal point used for parsing
   * numbers in the CSV.
   *
   * If both this and data.delimiter is set to <code>undefined</code>, the parser will
   * attempt to deduce the decimal point automatically.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.decimalPoint">https://api.highcharts.com/highcharts/data.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/data.decimalPoint">https://api.highcharts.com/highstock/data.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.decimalPoint">https://api.highcharts.com/highmaps/data.decimalPoint</a>
   *
   * @implspec decimalPoint?: string;
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Enables automatic refetching of remote
   * datasets every <em>n</em> seconds (defined by setting data.dataRefreshRate).
   *
   * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
   * data.googleSpreadsheetKey.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.enablePolling">https://api.highcharts.com/highcharts/data.enablePolling</a>
   * @see <a href="https://api.highcharts.com/highstock/data.enablePolling">https://api.highcharts.com/highstock/data.enablePolling</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.enablePolling">https://api.highcharts.com/highmaps/data.enablePolling</a>
   *
   * @implspec enablePolling?: boolean;
   *
   */
  @JSProperty("enablePolling")
  boolean getEnablePolling();

  /**
   * (Highcharts, Highstock, Highmaps) Enables automatic refetching of remote
   * datasets every <em>n</em> seconds (defined by setting data.dataRefreshRate).
   *
   * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
   * data.googleSpreadsheetKey.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.enablePolling">https://api.highcharts.com/highcharts/data.enablePolling</a>
   * @see <a href="https://api.highcharts.com/highstock/data.enablePolling">https://api.highcharts.com/highstock/data.enablePolling</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.enablePolling">https://api.highcharts.com/highmaps/data.enablePolling</a>
   *
   * @implspec enablePolling?: boolean;
   *
   */
  @JSProperty("enablePolling")
  void setEnablePolling(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the last column
   * (indexed by 0) to use. Defaults to the last column containing data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.endColumn">https://api.highcharts.com/highcharts/data.endColumn</a>
   * @see <a href="https://api.highcharts.com/highstock/data.endColumn">https://api.highcharts.com/highstock/data.endColumn</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.endColumn">https://api.highcharts.com/highmaps/data.endColumn</a>
   *
   * @implspec endColumn?: number;
   *
   */
  @JSProperty("endColumn")
  double getEndColumn();

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the last column
   * (indexed by 0) to use. Defaults to the last column containing data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.endColumn">https://api.highcharts.com/highcharts/data.endColumn</a>
   * @see <a href="https://api.highcharts.com/highstock/data.endColumn">https://api.highcharts.com/highstock/data.endColumn</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.endColumn">https://api.highcharts.com/highmaps/data.endColumn</a>
   *
   * @implspec endColumn?: number;
   *
   */
  @JSProperty("endColumn")
  void setEndColumn(double value);

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the last row
   * (indexed by 0) to use. Defaults to the last row containing data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.endRow">https://api.highcharts.com/highcharts/data.endRow</a>
   * @see <a href="https://api.highcharts.com/highstock/data.endRow">https://api.highcharts.com/highstock/data.endRow</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.endRow">https://api.highcharts.com/highmaps/data.endRow</a>
   *
   * @implspec endRow?: number;
   *
   */
  @JSProperty("endRow")
  double getEndRow();

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the last row
   * (indexed by 0) to use. Defaults to the last row containing data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.endRow">https://api.highcharts.com/highcharts/data.endRow</a>
   * @see <a href="https://api.highcharts.com/highstock/data.endRow">https://api.highcharts.com/highstock/data.endRow</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.endRow">https://api.highcharts.com/highmaps/data.endRow</a>
   *
   * @implspec endRow?: number;
   *
   */
  @JSProperty("endRow")
  void setEndRow(double value);

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
   * set as series names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.firstRowAsNames">https://api.highcharts.com/highcharts/data.firstRowAsNames</a>
   * @see <a href="https://api.highcharts.com/highstock/data.firstRowAsNames">https://api.highcharts.com/highstock/data.firstRowAsNames</a>
   * @see <a href="https://api.highcharts.com/gantt/data.firstRowAsNames">https://api.highcharts.com/gantt/data.firstRowAsNames</a>
   *
   * @implspec firstRowAsNames?: boolean;
   *
   */
  @JSProperty("firstRowAsNames")
  boolean getFirstRowAsNames();

  /**
   * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
   * set as series names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.firstRowAsNames">https://api.highcharts.com/highcharts/data.firstRowAsNames</a>
   * @see <a href="https://api.highcharts.com/highstock/data.firstRowAsNames">https://api.highcharts.com/highstock/data.firstRowAsNames</a>
   * @see <a href="https://api.highcharts.com/gantt/data.firstRowAsNames">https://api.highcharts.com/gantt/data.firstRowAsNames</a>
   *
   * @implspec firstRowAsNames?: boolean;
   *
   */
  @JSProperty("firstRowAsNames")
  void setFirstRowAsNames(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The key for a Google Spreadsheet to
   * load. See general information on GS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.googleSpreadsheetKey">https://api.highcharts.com/highcharts/data.googleSpreadsheetKey</a>
   * @see <a href="https://api.highcharts.com/highstock/data.googleSpreadsheetKey">https://api.highcharts.com/highstock/data.googleSpreadsheetKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.googleSpreadsheetKey">https://api.highcharts.com/highmaps/data.googleSpreadsheetKey</a>
   *
   * @implspec googleSpreadsheetKey?: string;
   *
   */
  @JSProperty("googleSpreadsheetKey")
  @Nullable
  String getGoogleSpreadsheetKey();

  /**
   * (Highcharts, Highstock, Highmaps) The key for a Google Spreadsheet to
   * load. See general information on GS.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.googleSpreadsheetKey">https://api.highcharts.com/highcharts/data.googleSpreadsheetKey</a>
   * @see <a href="https://api.highcharts.com/highstock/data.googleSpreadsheetKey">https://api.highcharts.com/highstock/data.googleSpreadsheetKey</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.googleSpreadsheetKey">https://api.highcharts.com/highmaps/data.googleSpreadsheetKey</a>
   *
   * @implspec googleSpreadsheetKey?: string;
   *
   */
  @JSProperty("googleSpreadsheetKey")
  void setGoogleSpreadsheetKey(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The Google Spreadsheet worksheet to use
   * in combination with googleSpreadsheetKey. The available id's from your
   * sheet can be read from
   * <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highcharts/data.googleSpreadsheetWorksheet</a>
   * @see <a href="https://api.highcharts.com/highstock/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highstock/data.googleSpreadsheetWorksheet</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highmaps/data.googleSpreadsheetWorksheet</a>
   *
   * @implspec googleSpreadsheetWorksheet?: string;
   *
   */
  @JSProperty("googleSpreadsheetWorksheet")
  @Nullable
  String getGoogleSpreadsheetWorksheet();

  /**
   * (Highcharts, Highstock, Highmaps) The Google Spreadsheet worksheet to use
   * in combination with googleSpreadsheetKey. The available id's from your
   * sheet can be read from
   * <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highcharts/data.googleSpreadsheetWorksheet</a>
   * @see <a href="https://api.highcharts.com/highstock/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highstock/data.googleSpreadsheetWorksheet</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.googleSpreadsheetWorksheet">https://api.highcharts.com/highmaps/data.googleSpreadsheetWorksheet</a>
   *
   * @implspec googleSpreadsheetWorksheet?: string;
   *
   */
  @JSProperty("googleSpreadsheetWorksheet")
  void setGoogleSpreadsheetWorksheet(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Item or cell delimiter for parsing CSV.
   * Defaults to the tab character <code>\t</code> if a tab character is found in the CSV
   * string, if not it defaults to <code>,</code>.
   *
   * If this is set to false or undefined, the parser will attempt to deduce
   * the delimiter automatically.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.itemDelimiter">https://api.highcharts.com/highcharts/data.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/data.itemDelimiter">https://api.highcharts.com/highstock/data.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.itemDelimiter">https://api.highcharts.com/highmaps/data.itemDelimiter</a>
   *
   * @implspec itemDelimiter?: string;
   *
   */
  @JSProperty("itemDelimiter")
  @Nullable
  String getItemDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps) Item or cell delimiter for parsing CSV.
   * Defaults to the tab character <code>\t</code> if a tab character is found in the CSV
   * string, if not it defaults to <code>,</code>.
   *
   * If this is set to false or undefined, the parser will attempt to deduce
   * the delimiter automatically.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.itemDelimiter">https://api.highcharts.com/highcharts/data.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/data.itemDelimiter">https://api.highcharts.com/highstock/data.itemDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.itemDelimiter">https://api.highcharts.com/highmaps/data.itemDelimiter</a>
   *
   * @implspec itemDelimiter?: string;
   *
   */
  @JSProperty("itemDelimiter")
  void setItemDelimiter(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Line delimiter for parsing CSV.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.lineDelimiter">https://api.highcharts.com/highcharts/data.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/data.lineDelimiter">https://api.highcharts.com/highstock/data.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.lineDelimiter">https://api.highcharts.com/highmaps/data.lineDelimiter</a>
   *
   * @implspec lineDelimiter?: string;
   *
   */
  @JSProperty("lineDelimiter")
  @Nullable
  String getLineDelimiter();

  /**
   * (Highcharts, Highstock, Highmaps) Line delimiter for parsing CSV.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.lineDelimiter">https://api.highcharts.com/highcharts/data.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highstock/data.lineDelimiter">https://api.highcharts.com/highstock/data.lineDelimiter</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.lineDelimiter">https://api.highcharts.com/highmaps/data.lineDelimiter</a>
   *
   * @implspec lineDelimiter?: string;
   *
   */
  @JSProperty("lineDelimiter")
  void setLineDelimiter(String value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to access the
   * parsed columns, the two-dimentional input data array directly, before
   * they are interpreted into series data and categories. Return <code>false</code> to
   * stop completion, or call <code>this.complete()</code> to continue async.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.parsed">https://api.highcharts.com/highcharts/data.parsed</a>
   * @see <a href="https://api.highcharts.com/highstock/data.parsed">https://api.highcharts.com/highstock/data.parsed</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.parsed">https://api.highcharts.com/highmaps/data.parsed</a>
   *
   * @implspec parsed?: DataParsedCallbackFunction;
   *
   */
  @JSProperty("parsed")
  @Nullable
  DataParsedCallbackFunction getParsed();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to access the
   * parsed columns, the two-dimentional input data array directly, before
   * they are interpreted into series data and categories. Return <code>false</code> to
   * stop completion, or call <code>this.complete()</code> to continue async.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.parsed">https://api.highcharts.com/highcharts/data.parsed</a>
   * @see <a href="https://api.highcharts.com/highstock/data.parsed">https://api.highcharts.com/highstock/data.parsed</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.parsed">https://api.highcharts.com/highmaps/data.parsed</a>
   *
   * @implspec parsed?: DataParsedCallbackFunction;
   *
   */
  @JSProperty("parsed")
  void setParsed(DataParsedCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to parse string
   * representations of dates into JavaScript timestamps. Should return an
   * integer timestamp on success.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.parseDate">https://api.highcharts.com/highcharts/data.parseDate</a>
   * @see <a href="https://api.highcharts.com/highstock/data.parseDate">https://api.highcharts.com/highstock/data.parseDate</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.parseDate">https://api.highcharts.com/highmaps/data.parseDate</a>
   *
   * @implspec parseDate?: DataParseDateCallbackFunction;
   *
   */
  @JSProperty("parseDate")
  @Nullable
  DataParseDateCallbackFunction getParseDate();

  /**
   * (Highcharts, Highstock, Highmaps) A callback function to parse string
   * representations of dates into JavaScript timestamps. Should return an
   * integer timestamp on success.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.parseDate">https://api.highcharts.com/highcharts/data.parseDate</a>
   * @see <a href="https://api.highcharts.com/highstock/data.parseDate">https://api.highcharts.com/highstock/data.parseDate</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.parseDate">https://api.highcharts.com/highmaps/data.parseDate</a>
   *
   * @implspec parseDate?: DataParseDateCallbackFunction;
   *
   */
  @JSProperty("parseDate")
  void setParseDate(DataParseDateCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) The same as the columns input option,
   * but defining rows intead of columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.rows">https://api.highcharts.com/highcharts/data.rows</a>
   * @see <a href="https://api.highcharts.com/highstock/data.rows">https://api.highcharts.com/highstock/data.rows</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.rows">https://api.highcharts.com/highmaps/data.rows</a>
   *
   * @implspec rows?: Array&lt;Array<any>&gt;;
   *
   */
  @JSProperty("rows")
  @Nullable
  Array<Array<Any>> getRows();

  /**
   * (Highcharts, Highstock, Highmaps) The same as the columns input option,
   * but defining rows intead of columns.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.rows">https://api.highcharts.com/highcharts/data.rows</a>
   * @see <a href="https://api.highcharts.com/highstock/data.rows">https://api.highcharts.com/highstock/data.rows</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.rows">https://api.highcharts.com/highmaps/data.rows</a>
   *
   * @implspec rows?: Array&lt;Array<any>&gt;;
   *
   */
  @JSProperty("rows")
  void setRows(Array<Array<Any>> value);

  /**
   * (Highcharts, Highstock, Highmaps) A URL to a remote JSON dataset,
   * structured as a row array. Will be fetched when the chart is created
   * using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.rowsURL">https://api.highcharts.com/highcharts/data.rowsURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.rowsURL">https://api.highcharts.com/highstock/data.rowsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.rowsURL">https://api.highcharts.com/highmaps/data.rowsURL</a>
   *
   * @implspec rowsURL?: string;
   *
   */
  @JSProperty("rowsURL")
  @Nullable
  String getRowsURL();

  /**
   * (Highcharts, Highstock, Highmaps) A URL to a remote JSON dataset,
   * structured as a row array. Will be fetched when the chart is created
   * using Ajax.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.rowsURL">https://api.highcharts.com/highcharts/data.rowsURL</a>
   * @see <a href="https://api.highcharts.com/highstock/data.rowsURL">https://api.highcharts.com/highstock/data.rowsURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.rowsURL">https://api.highcharts.com/highmaps/data.rowsURL</a>
   *
   * @implspec rowsURL?: string;
   *
   */
  @JSProperty("rowsURL")
  void setRowsURL(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An array containing dictionaries for
   * each series. A dictionary exists of Point property names as the key and
   * the CSV column index as the value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.seriesMapping">https://api.highcharts.com/highcharts/data.seriesMapping</a>
   * @see <a href="https://api.highcharts.com/highstock/data.seriesMapping">https://api.highcharts.com/highstock/data.seriesMapping</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.seriesMapping">https://api.highcharts.com/highmaps/data.seriesMapping</a>
   *
   * @implspec seriesMapping?: Array&lt;Dictionary<number>&gt;;
   *
   */
  @JSProperty("seriesMapping")
  @Nullable
  Array<IntRecord> getSeriesMapping();

  /**
   * (Highcharts, Highstock, Highmaps) An array containing dictionaries for
   * each series. A dictionary exists of Point property names as the key and
   * the CSV column index as the value.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.seriesMapping">https://api.highcharts.com/highcharts/data.seriesMapping</a>
   * @see <a href="https://api.highcharts.com/highstock/data.seriesMapping">https://api.highcharts.com/highstock/data.seriesMapping</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.seriesMapping">https://api.highcharts.com/highmaps/data.seriesMapping</a>
   *
   * @implspec seriesMapping?: Array&lt;Dictionary<number>&gt;;
   *
   */
  @JSProperty("seriesMapping")
  void setSeriesMapping(Array<IntRecord> value);

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the first column
   * (indexed by 0) to use.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.startColumn">https://api.highcharts.com/highcharts/data.startColumn</a>
   * @see <a href="https://api.highcharts.com/highstock/data.startColumn">https://api.highcharts.com/highstock/data.startColumn</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.startColumn">https://api.highcharts.com/highmaps/data.startColumn</a>
   *
   * @implspec startColumn?: number;
   *
   */
  @JSProperty("startColumn")
  double getStartColumn();

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the first column
   * (indexed by 0) to use.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.startColumn">https://api.highcharts.com/highcharts/data.startColumn</a>
   * @see <a href="https://api.highcharts.com/highstock/data.startColumn">https://api.highcharts.com/highstock/data.startColumn</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.startColumn">https://api.highcharts.com/highmaps/data.startColumn</a>
   *
   * @implspec startColumn?: number;
   *
   */
  @JSProperty("startColumn")
  void setStartColumn(double value);

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the first row
   * (indexed by 0) to use.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.startRow">https://api.highcharts.com/highcharts/data.startRow</a>
   * @see <a href="https://api.highcharts.com/highstock/data.startRow">https://api.highcharts.com/highstock/data.startRow</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.startRow">https://api.highcharts.com/highmaps/data.startRow</a>
   *
   * @implspec startRow?: number;
   *
   */
  @JSProperty("startRow")
  double getStartRow();

  /**
   * (Highcharts, Highstock, Highmaps) In tabular input data, the first row
   * (indexed by 0) to use.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.startRow">https://api.highcharts.com/highcharts/data.startRow</a>
   * @see <a href="https://api.highcharts.com/highstock/data.startRow">https://api.highcharts.com/highstock/data.startRow</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.startRow">https://api.highcharts.com/highmaps/data.startRow</a>
   *
   * @implspec startRow?: number;
   *
   */
  @JSProperty("startRow")
  void setStartRow(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Switch rows and columns of the input
   * data, so that <code>this.columns</code> effectively becomes the rows of the data
   * set, and the rows are interpreted as series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.switchRowsAndColumns">https://api.highcharts.com/highcharts/data.switchRowsAndColumns</a>
   * @see <a href="https://api.highcharts.com/highstock/data.switchRowsAndColumns">https://api.highcharts.com/highstock/data.switchRowsAndColumns</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.switchRowsAndColumns">https://api.highcharts.com/highmaps/data.switchRowsAndColumns</a>
   *
   * @implspec switchRowsAndColumns?: boolean;
   *
   */
  @JSProperty("switchRowsAndColumns")
  boolean getSwitchRowsAndColumns();

  /**
   * (Highcharts, Highstock, Highmaps) Switch rows and columns of the input
   * data, so that <code>this.columns</code> effectively becomes the rows of the data
   * set, and the rows are interpreted as series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.switchRowsAndColumns">https://api.highcharts.com/highcharts/data.switchRowsAndColumns</a>
   * @see <a href="https://api.highcharts.com/highstock/data.switchRowsAndColumns">https://api.highcharts.com/highstock/data.switchRowsAndColumns</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.switchRowsAndColumns">https://api.highcharts.com/highmaps/data.switchRowsAndColumns</a>
   *
   * @implspec switchRowsAndColumns?: boolean;
   *
   */
  @JSProperty("switchRowsAndColumns")
  void setSwitchRowsAndColumns(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) An HTML table or the id of such to be
   * parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.table">https://api.highcharts.com/highcharts/data.table</a>
   * @see <a href="https://api.highcharts.com/highstock/data.table">https://api.highcharts.com/highstock/data.table</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.table">https://api.highcharts.com/highmaps/data.table</a>
   *
   * @implspec table?: (string|HTMLElement);
   *
   */
  @JSProperty("table")
  @Nullable
  Unknown getTable();

  /**
   * (Highcharts, Highstock, Highmaps) An HTML table or the id of such to be
   * parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.table">https://api.highcharts.com/highcharts/data.table</a>
   * @see <a href="https://api.highcharts.com/highstock/data.table">https://api.highcharts.com/highstock/data.table</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.table">https://api.highcharts.com/highmaps/data.table</a>
   *
   * @implspec table?: (string|HTMLElement);
   *
   */
  @JSProperty("table")
  void setTable(HTMLElement value);

  /**
   * (Highcharts, Highstock, Highmaps) An HTML table or the id of such to be
   * parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>,
   * <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/data.table">https://api.highcharts.com/highcharts/data.table</a>
   * @see <a href="https://api.highcharts.com/highstock/data.table">https://api.highcharts.com/highstock/data.table</a>
   * @see <a href="https://api.highcharts.com/highmaps/data.table">https://api.highcharts.com/highmaps/data.table</a>
   *
   * @implspec table?: (string|HTMLElement);
   *
   */
  @JSProperty("table")
  void setTable(String value);

  /**
   */
  abstract class DateFormat extends JsEnum {
    public static final DateFormat DD_MM_YY = JsEnum.of("dd/mm/YY");

    public static final DateFormat DD_MM_YYYY = JsEnum.of("dd/mm/YYYY");

    public static final DateFormat MM_DD_YY = JsEnum.of("mm/dd/YY");

    public static final DateFormat MM_DD_YYYY = JsEnum.of("mm/dd/YYYY");

    public static final DateFormat YYYY_MM_DD = JsEnum.of("YYYY/mm/dd");
  }
}
