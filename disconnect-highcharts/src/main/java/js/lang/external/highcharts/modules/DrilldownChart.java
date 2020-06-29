package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.Point;
import js.lang.external.highcharts.SeriesOptionsRegistry;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/drilldown.src.js"
)
public interface DrilldownChart extends Chart {
  /**
   * Add a series to the chart as drilldown from a specific point in the
   * parent series. This method is used for async drilldown, when clicking
   * a point in a series should result in loading and displaying a more
   * high-resolution series. When not async, the setup is simpler using
   * the drilldown.series options structure.
   *
   * @param point
   * The point from which the drilldown will start.
   *
   * @param options
   * The series options for the new, detailed series.
   *
   */
  void addSeriesAsDrilldown(Point point, SeriesOptionsRegistry[] options);

  /**
   * When the chart is drilled down to a child series, calling
   * <code>chart.drillUp()</code> will drill up to the parent series.
   *
   */
  void drillUp();
}
