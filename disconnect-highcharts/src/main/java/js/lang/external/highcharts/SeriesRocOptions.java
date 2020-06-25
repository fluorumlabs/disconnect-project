package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>ROC</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * Rate of change indicator (ROC). The indicator value for each point is defined
 * as:
 *
 * <code>(C - Cn) / Cn * 100</code>
 *
 * where: <code>C</code> is the close value of the point of the same x in the linked series
 * and <code>Cn</code> is the close value of the point <code>n</code> periods ago. <code>n</code> is set through
 * period.
 *
 * This series requires <code>linkedTo</code> option to be set.
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
 * Options for all <code>roc</code> series are defined in plotOptions.roc.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesRocOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesRocOptions { customProperty: string;
 * }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesRocOptions extends SeriesOptions, PlotRocOptions {
  /**
   * Not available
   *
   */
  @JSProperty("dataParser")
  @Nullable
  Unknown /* undefined */ getDataParser();

  /**
   * Not available
   *
   */
  @JSProperty("dataURL")
  @Nullable
  Unknown /* undefined */ getDataURL();

  class Builder {
    private final SeriesRocOptions object = Any.empty();

    public SeriesRocOptions build() {
      return object;
    }
  }
}
