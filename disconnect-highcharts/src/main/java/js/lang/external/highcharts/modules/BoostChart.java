package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Chart;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/boost.src.js"
)
public interface BoostChart extends Chart {
  /**
   * Returns true if the chart is in series boost mode.
   *
   * @param chart
   * the chart to check
   *
   * @return true if the chart is in series boost mode
   *
   */
  boolean isChartSeriesBoosting(BoostChart chart);
}
