package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.SVGAttributes;
import js.lang.external.highcharts.Series;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/dumbbell.src.js"
)
public interface DumbbellSeries extends Series {
  /**
   * Get non-presentational attributes for a point. Used internally for
   * both styled mode and classic. Set correct position in link with
   * connector line.
   *
   * @param this
   * The series of points.
   *
   * @return A hash containing those attributes that are not settable from
   * CSS.
   *
   */
  SVGAttributes markerAttribs();
}
