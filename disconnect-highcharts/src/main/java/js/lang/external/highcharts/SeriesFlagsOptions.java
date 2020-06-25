package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>flags</code> series. If the type option is not specified, it is
 * inherited from chart.type.
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
 * Options for all <code>flags</code> series are defined in plotOptions.flags.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesFlagsOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesFlagsOptions { customProperty:
 * string; }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesFlagsOptions extends PlotFlagsOptions, SeriesOptions {
  /**
   * Not available
   *
   */
  @JSProperty("borderRadius")
  @Nullable
  Unknown /* undefined */ getBorderRadius();

  /**
   * Not available
   *
   */
  @JSProperty("colorByPoint")
  @Nullable
  Unknown /* undefined */ getColorByPoint();

  /**
   * (Highstock) An array of data points for the series. For the <code>flags</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available. (see online documentation for example)</li>
   * </ol>
   */
  @JSProperty("data")
  @Nullable
  PointOptionsObject[] getData();

  /**
   * (Highstock) An array of data points for the series. For the <code>flags</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available. (see online documentation for example)</li>
   * </ol>
   */
  @JSProperty("data")
  void setData(PointOptionsObject[] value);

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

  /**
   * Not available
   *
   */
  @JSProperty("pointPadding")
  @Nullable
  Unknown /* undefined */ getPointPadding();

  /**
   * Not available
   *
   */
  @JSProperty("pointWidth")
  @Nullable
  Unknown /* undefined */ getPointWidth();

  /**
   * Not available
   *
   */
  @JSProperty("useOhlcData")
  @Nullable
  Unknown /* undefined */ getUseOhlcData();

  class Builder {
    private final SeriesFlagsOptions object = Any.empty();

    public SeriesFlagsOptions build() {
      return object;
    }

    /**
     * (Highstock) An array of data points for the series. For the <code>flags</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>An array of objects with named values. The following snippet shows
     * only a few settings, see the complete options set below. If the total
     * number of data points exceeds the series' turboThreshold, this option is
     * not available. (see online documentation for example)</li>
     * </ol>
     */
    public Builder data(PointOptionsObject[] value) {
      object.setData(value);
      return this;
    }
  }
}
