package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( PointOptionsObject | Array < ( object | any [ ] ) > ) */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>packedbubble</code> series. If the type option is not specified, it
 * is inherited from chart.type.
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
 * Options for all <code>packedbubble</code> series are defined in
 * plotOptions.packedbubble.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesPackedbubbleOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesPackedbubbleOptions {
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
public interface SeriesPackedbubbleOptions extends SeriesOptions, PlotPackedbubbleOptions {
  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>packedbubble</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of <code>values</code>. (see online documentation for example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The objects are point
   * configuration objects as seen below. If the total number of data points
   * exceeds the series' turboThreshold, this option is not available. (see
   * online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  @Nullable
  Unknown /* ( PointOptionsObject | Array < ( object | any [ ] ) > ) */ getData();

  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>packedbubble</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of <code>values</code>. (see online documentation for example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The objects are point
   * configuration objects as seen below. If the total number of data points
   * exceeds the series' turboThreshold, this option is not available. (see
   * online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  void setData(@Nullable PointOptionsObject value);

  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>packedbubble</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of <code>values</code>. (see online documentation for example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The objects are point
   * configuration objects as seen below. If the total number of data points
   * exceeds the series' turboThreshold, this option is not available. (see
   * online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  void setData(Any[] value);

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
  @JSProperty("stack")
  @Nullable
  Unknown /* undefined */ getStack();

  class Builder {
    private final SeriesPackedbubbleOptions object = Any.empty();

    public SeriesPackedbubbleOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>packedbubble</code> series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of <code>values</code>. (see online documentation for example)
     *
     * </li>
     * <li>
     * An array of objects with named values. The objects are point
     * configuration objects as seen below. If the total number of data points
     * exceeds the series' turboThreshold, this option is not available. (see
     * online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder data(@Nullable PointOptionsObject value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>packedbubble</code> series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of <code>values</code>. (see online documentation for example)
     *
     * </li>
     * <li>
     * An array of objects with named values. The objects are point
     * configuration objects as seen below. If the total number of data points
     * exceeds the series' turboThreshold, this option is not available. (see
     * online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder data(Any[] value) {
      object.setData(value);
      return this;
    }
  }
}
