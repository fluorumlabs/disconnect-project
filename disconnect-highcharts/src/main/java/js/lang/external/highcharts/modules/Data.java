package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( Array < Array < ( number | string ) > > | undefined ) */;
import js.lang.Unknown /* ( Array < Array < DataValueType > > | undefined ) */;
import js.lang.Unknown /* Array < Array < DataValueType > > */;
import js.lang.Unknown /* _Highcharts */;
import js.lang.external.highcharts.DataOptions;
import js.lang.external.highcharts.Dictionary;
import js.lang.external.highcharts.Highcharts;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    symbols = {"factory as Data_factory", "Highcharts as Data_Highcharts"},
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
public interface Data extends Any {
  /**
   * Adds the module to the imported Highcharts namespace.
   *
   * @param highcharts
   * The imported Highcharts namespace to extend.
   *
   */
  @JSBody(
      params = {"highcharts"},
      script = "Data_factory(highcharts)"
  )
  static void factory(Highcharts highcharts) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return Data_Highcharts"
  )
  static Unknown /* _Highcharts */ Highcharts() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A collection of available date formats, extendable from the outside
   * to support custom date formats.
   *
   */
  @JSProperty("dateFormats")
  Dictionary<DataDateFormatObject> getDateFormats();

  /**
   * A collection of available date formats, extendable from the outside
   * to support custom date formats.
   *
   */
  @JSProperty("dateFormats")
  void setDateFormats(Dictionary<DataDateFormatObject> value);

  /**
   * If a complete callback function is provided in the options, interpret
   * the columns into a Highcharts options object.
   *
   */
  void complete();

  /**
   * Fetch or refetch live data
   *
   * @return The URLs that were tried can be found in the options
   *
   */
  boolean fetchLiveData();

  /**
   * Get the column distribution. For example, a line series takes a
   * single column for Y values. A range series takes two columns for low
   * and high values respectively, and an OHLC series takes four columns.
   *
   */
  void getColumnDistribution();

  /**
   * Get the parsed data in a form that we can apply directly to the
   * <code>series.data</code> config. Array positions can be mapped using the
   * <code>series.keys</code> option.
   *
   * @return Data rows
   *
   */
  @Nullable
  Unknown /* ( Array < Array < ( number | string ) > > | undefined ) */ getData();

  /**
   * Parse a single column. Set properties like .isDatetime and
   * .isNumeric.
   *
   * @param column
   * Column to parse
   *
   * @param col
   * Column index
   *
   */
  void parseColumn(String[] column, double col);

  /**
   * Parse a single column. Set properties like .isDatetime and
   * .isNumeric.
   *
   * @param column
   * Column to parse
   *
   * @param col
   * Column index
   *
   */
  void parseColumn(double[] column, double col);

  /**
   * Parse a CSV input string
   *
   */
  Unknown /* Array < Array < DataValueType > > */ parseCSV(@Nullable DataOptions inOptions);

  /**
   * Parse a CSV input string
   *
   */
  Unknown /* Array < Array < DataValueType > > */ parseCSV();

  /**
   * A hook for working directly on the parsed columns
   *
   */
  boolean parsed();

  /**
   * Parse a date and return it as a number. Overridable through
   * <code>options.parseDate</code>.
   *
   */
  double parseDate(String val);

  /**
   * Parse a Google spreadsheet.
   *
   * @return Always returns false, because it is an intermediate fetch.
   *
   */
  boolean parseGoogleSpreadsheet();

  /**
   * Parse a HTML table
   *
   */
  Unknown /* Array < Array < DataValueType > > */ parseTable();

  /**
   * Parse numeric cells in to number types and date types in to true
   * dates.
   *
   */
  void parseTypes();

  /**
   * Reorganize rows into columns.
   *
   */
  @Nullable
  Unknown /* ( Array < Array < DataValueType > > | undefined ) */ rowsToColumns(String[] rows);

  /**
   * Reorganize rows into columns.
   *
   */
  @Nullable
  Unknown /* ( Array < Array < DataValueType > > | undefined ) */ rowsToColumns(double[] rows);

  /**
   * Trim a string from whitespaces.
   *
   * @param str
   * String to trim
   *
   * @param inside
   * Remove all spaces between numbers.
   *
   * @return Trimed string
   *
   */
  String trim(String str, boolean inside);

  /**
   * Trim a string from whitespaces.
   *
   * @param str
   * String to trim
   *
   * @return Trimed string
   *
   */
  String trim(String str);

  /**
   * Updates the chart with new data options.
   *
   */
  void update(DataOptions options, boolean redraw);

  /**
   * Updates the chart with new data options.
   *
   */
  void update(DataOptions options);
}
