package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Unknown /* Array < Array < ( number | string ) > > */;
import js.lang.external.highcharts.Chart;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/export-data.src.js"
)
public interface ExportDataChart extends Chart {
  /**
   * Generates a data URL of CSV for local download in the browser. This
   * is the default action for a click on the 'Download CSV' button.
   *
   * See Highcharts.Chart#getCSV to get the CSV data itself.
   *
   */
  void downloadCSV();

  /**
   * Generates a data URL of an XLS document for local download in the
   * browser. This is the default action for a click on the 'Download XLS'
   * button.
   *
   * See Highcharts.Chart#getTable to get the table data itself.
   *
   */
  void downloadXLS();

  /**
   * Export-data module required. Returns the current chart data as a CSV
   * string.
   *
   * @param useLocalDecimalPoint
   * Whether to use the local decimal point as detected from the
   * browser. This makes it easier to export data to Excel in the
   * same locale as the user is.
   *
   * @return CSV representation of the data
   *
   */
  String getCSV(boolean useLocalDecimalPoint);

  /**
   * Export-data module required. Returns the current chart data as a CSV
   * string.
   *
   * @return CSV representation of the data
   *
   */
  String getCSV();

  /**
   * Export-data module required. Returns a two-dimensional array
   * containing the current chart data.
   *
   * @param multiLevelHeaders
   * Use multilevel headers for the rows by default. Adds an extra
   * row with top level headers. If a custom columnHeaderFormatter
   * is defined, this can override the behavior.
   *
   * @return The current chart data
   *
   * @fires Highcharts.Chart#exportData
   *
   */
  Unknown /* Array < Array < ( number | string ) > > */ getDataRows(boolean multiLevelHeaders);

  /**
   * Export-data module required. Returns a two-dimensional array
   * containing the current chart data.
   *
   * @return The current chart data
   *
   * @fires Highcharts.Chart#exportData
   *
   */
  Unknown /* Array < Array < ( number | string ) > > */ getDataRows();

  /**
   * Export-data module required. Build a HTML table with the chart's
   * current data.
   *
   * @param useLocalDecimalPoint
   * Whether to use the local decimal point as detected from the
   * browser. This makes it easier to export data to Excel in the
   * same locale as the user is.
   *
   * @return HTML representation of the data.
   *
   * @fires Highcharts.Chart#afterGetTable
   *
   */
  String getTable(boolean useLocalDecimalPoint);

  /**
   * Export-data module required. Build a HTML table with the chart's
   * current data.
   *
   * @return HTML representation of the data.
   *
   * @fires Highcharts.Chart#afterGetTable
   *
   */
  String getTable();

  /**
   * Export-data module required. View the data in a table below the
   * chart.
   *
   * @fires Highcharts.Chart#afterViewData
   *
   */
  void viewData();
}
