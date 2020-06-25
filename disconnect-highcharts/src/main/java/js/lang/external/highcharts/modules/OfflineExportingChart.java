package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.ExportingOptions;
import js.lang.external.highcharts.Options;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/offline-exporting.src.js"
)
public interface OfflineExportingChart extends Chart {
  /**
   * Exporting and offline-exporting modules required. Export a chart to
   * an image locally in the user's browser.
   *
   * @param exportingOptions
   * Exporting options, the same as in
   * Highcharts.Chart#exportChart.
   *
   * @param chartOptions
   * Additional chart options for the exported chart. For example a
   * different background color can be added here, or <code>dataLabels</code>
   * for export only.
   *
   */
  void exportChartLocal(@Nullable ExportingOptions exportingOptions,
      @Nullable Options chartOptions);

  /**
   * Exporting and offline-exporting modules required. Export a chart to
   * an image locally in the user's browser.
   *
   * @param exportingOptions
   * Exporting options, the same as in
   * Highcharts.Chart#exportChart.
   *
   */
  void exportChartLocal(@Nullable ExportingOptions exportingOptions);

  /**
   * Exporting and offline-exporting modules required. Export a chart to
   * an image locally in the user's browser.
   *
   */
  void exportChartLocal();
}
