package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Chart;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/parallel-coordinates.src.js"
)
public interface ParallelCoordinatesChart extends Chart {
  /**
   * Flag used in parallel coordinates plot to check if chart has
   * ||-coords (parallel coords).
   *
   */
  @JSProperty("hasParallelCoordinates")
  boolean getHasParallelCoordinates();

  /**
   * Flag used in parallel coordinates plot to check if chart has
   * ||-coords (parallel coords).
   *
   */
  @JSProperty("hasParallelCoordinates")
  void setHasParallelCoordinates(boolean value);
}
