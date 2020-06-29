package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.ExportingOptions;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/exporting.src.js"
)
public interface ExportingChart extends Chart {
  @JSProperty("fullscreen")
  Fullscreen getFullscreen();

  @JSProperty("fullscreen")
  void setFullscreen(Fullscreen value);

  /**
   * Exporting module required. Submit an SVG version of the chart to a
   * server along with some parameters for conversion.
   *
   * @param exportingOptions
   * Exporting options in addition to those defined in exporting.
   *
   * @param chartOptions
   * Additional chart options for the exported chart. For example a
   * different background color can be added here, or <code>dataLabels</code>
   * for export only.
   *
   */
  void exportChart(ExportingOptions exportingOptions, ExportingOptions chartOptions);

  /**
   * Return the unfiltered innerHTML of the chart container. Used as hook
   * for plugins. In styled mode, it also takes care of inlining CSS style
   * rules.
   *
   * @return The unfiltered SVG of the chart.
   *
   */
  String getChartHTML();

  /**
   * Get the default file name used for exported charts. By default it
   * creates a file name based on the chart title.
   *
   * @return A file name without extension.
   *
   */
  String getFilename();

  /**
   * Return an SVG representation of the chart.
   *
   * @param chartOptions
   * Additional chart options for the generated SVG representation.
   * For collections like <code>xAxis</code>, <code>yAxis</code> or <code>series</code>, the
   * additional options is either merged in to the original item of
   * the same <code>id</code>, or to the first item if a common id is not
   * found.
   *
   * @return The SVG representation of the rendered chart.
   *
   * @fires Highcharts.Chart#getSVG
   *
   */
  String getSVG(@Nullable ExportingOptions chartOptions);

  /**
   * Return an SVG representation of the chart.
   *
   * @return The SVG representation of the rendered chart.
   *
   * @fires Highcharts.Chart#getSVG
   *
   */
  String getSVG();

  /**
   * Exporting module required. Clears away other elements in the page and
   * prints the chart as it is displayed. By default, when the exporting
   * module is enabled, a context button with a drop down menu in the
   * upper right corner accesses this function.
   *
   * @fires Highcharts.Chart#beforePrint
   * @fires Highcharts.Chart#afterPrint
   *
   */
  void print();
}
