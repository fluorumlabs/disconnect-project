package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) The <code>timeline</code> series. If the type option is not specified, it
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
 * Options for all <code>timeline</code> series are defined in plotOptions.timeline.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesTimelineOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesTimelineOptions {
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
public interface SeriesTimelineOptions extends SeriesOptions, PlotTimelineOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>timeline</code>
   * series type, points can be given with three general parameters, <code>name</code>,
   * <code>label</code>, and <code>description</code>:
   *
   * Example: (see online documentation for example) If all points
   * additionally have the <code>x</code> values, and xAxis type is set to <code>datetime</code>,
   * then events are laid out on a true time axis, where their placement
   * reflects the actual time between them.
   *
   */
  @JSProperty("data")
  @Nullable
  PointOptionsObject[] getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>timeline</code>
   * series type, points can be given with three general parameters, <code>name</code>,
   * <code>label</code>, and <code>description</code>:
   *
   * Example: (see online documentation for example) If all points
   * additionally have the <code>x</code> values, and xAxis type is set to <code>datetime</code>,
   * then events are laid out on a true time axis, where their placement
   * reflects the actual time between them.
   *
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
  @JSProperty("stack")
  @Nullable
  Unknown /* undefined */ getStack();

  class Builder {
    private final SeriesTimelineOptions object = Any.empty();

    public SeriesTimelineOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>timeline</code>
     * series type, points can be given with three general parameters, <code>name</code>,
     * <code>label</code>, and <code>description</code>:
     *
     * Example: (see online documentation for example) If all points
     * additionally have the <code>x</code> values, and xAxis type is set to <code>datetime</code>,
     * then events are laid out on a true time axis, where their placement
     * reflects the actual time between them.
     *
     */
    public Builder data(PointOptionsObject[] value) {
      object.setData(value);
      return this;
    }
  }
}
