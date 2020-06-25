package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

/**
 * (Highstock) A Slow Stochastic indicator. If the type option is not specified,
 * it is inherited from chart.type.
 *
 * In TypeScript the type option must always be set.
 *
 * Configuration options for the series are given in three levels:
 *
 * <ol>
 * <li>
 * Options for all series in a chart are defined in the plotOptions.series
 * object.
 *
 * </li>
 * <li>
 * Options for all <code>slowstochastic</code> series are defined in
 * plotOptions.slowstochastic.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesSlowstochasticOptions</code> via an interface to
 * allow custom properties: ``` declare interface SeriesSlowstochasticOptions {
 * customProperty: string; }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesSlowstochasticOptions extends SeriesOptions, PlotSlowstochasticOptions {
  class Builder {
    private final SeriesSlowstochasticOptions object = Any.empty();

    public SeriesSlowstochasticOptions build() {
      return object;
    }
  }
}
