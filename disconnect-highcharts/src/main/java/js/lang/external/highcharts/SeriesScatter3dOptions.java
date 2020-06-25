package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* Array < ( Array < number > | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>scatter3d</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * scatter3d](#plotOptions.scatter3d).
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
 * Options for all <code>scatter3d</code> series are defined in plotOptions.scatter3d.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesScatter3dOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesScatter3dOptions {
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
public interface SeriesScatter3dOptions extends PlotScatter3dOptions, SeriesOptions {
  /**
   * Not available
   *
   */
  @JSProperty("cluster")
  @Nullable
  Unknown /* undefined */ getCluster();

  /**
   * (Highcharts) An array of data points for the series. For the <code>scatter3d</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of
   * the point, and the <code>x</code> value is inferred. (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available. (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  @Nullable
  Unknown /* Array < ( Array < number > | PointOptionsObject ) > */ getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>scatter3d</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of
   * the point, and the <code>x</code> value is inferred. (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available. (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  void setData(PointOptionsObject[] value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>scatter3d</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of
   * the point, and the <code>x</code> value is inferred. (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of objects with named values. The following snippet shows
   * only a few settings, see the complete options set below. If the total
   * number of data points exceeds the series' turboThreshold, this option is
   * not available. (see online documentation for example)
   *
   * </li>
   * </ol>
   */
  @JSProperty("data")
  void setData(double[] value);

  class Builder {
    private final SeriesScatter3dOptions object = Any.empty();

    public SeriesScatter3dOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>scatter3d</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 3 values. In this case, the values correspond
     * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of
     * the point, and the <code>x</code> value is inferred. (see online documentation for
     * example)
     *
     * </li>
     * <li>
     * An array of objects with named values. The following snippet shows
     * only a few settings, see the complete options set below. If the total
     * number of data points exceeds the series' turboThreshold, this option is
     * not available. (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder data(PointOptionsObject[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>scatter3d</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 3 values. In this case, the values correspond
     * to <code>x,y,z</code>. If the first value is a string, it is applied as the name of
     * the point, and the <code>x</code> value is inferred. (see online documentation for
     * example)
     *
     * </li>
     * <li>
     * An array of objects with named values. The following snippet shows
     * only a few settings, see the complete options set below. If the total
     * number of data points exceeds the series' turboThreshold, this option is
     * not available. (see online documentation for example)
     *
     * </li>
     * </ol>
     */
    public Builder data(double[] value) {
      object.setData(value);
      return this;
    }
  }
}
