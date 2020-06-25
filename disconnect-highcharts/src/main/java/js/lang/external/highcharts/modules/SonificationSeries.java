package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.highcharts.Series;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface SonificationSeries extends Series {
  /**
   * Sonify a series.
   *
   * @param options
   * The options for sonifying this series.
   *
   */
  void sonify(SonifySeriesOptionsObject options);
}
