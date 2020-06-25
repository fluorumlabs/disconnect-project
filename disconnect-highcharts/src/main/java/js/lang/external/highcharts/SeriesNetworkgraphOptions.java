package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( PointOptionsObject | Array < ( object | any [ ] | number ) > ) */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>networkgraph</code> series. If the type option is not specified, it
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
 * Options for all <code>networkgraph</code> series are defined in
 * plotOptions.networkgraph.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesNetworkgraphOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesNetworkgraphOptions {
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
public interface SeriesNetworkgraphOptions extends SeriesOptions, PlotNetworkgraphOptions {
  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>networkgraph</code> series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  @Nullable
  Unknown /* ( PointOptionsObject | Array < ( object | any [ ] | number ) > ) */ getData();

  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>networkgraph</code> series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  void setData(double[] value);

  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>networkgraph</code> series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  void setData(@Nullable PointOptionsObject value);

  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>networkgraph</code> series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  void setData(Any[] value);

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a networkgraph diagram are auto-generated instances of
   * <code>Highcharts.Point</code>, but options can be applied here and linked by the
   * <code>id</code>.
   *
   */
  @JSProperty("nodes")
  @Nullable
  SeriesNetworkgraphNodesOptions[] getNodes();

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a networkgraph diagram are auto-generated instances of
   * <code>Highcharts.Point</code>, but options can be applied here and linked by the
   * <code>id</code>.
   *
   */
  @JSProperty("nodes")
  void setNodes(SeriesNetworkgraphNodesOptions[] value);

  /**
   * Not available
   *
   */
  @JSProperty("stack")
  @Nullable
  Unknown /* undefined */ getStack();

  /**
   * Not available
   *
   */
  @JSProperty("xAxis")
  @Nullable
  Unknown /* undefined */ getXAxis();

  /**
   * Not available
   *
   */
  @JSProperty("yAxis")
  @Nullable
  Unknown /* undefined */ getYAxis();

  class Builder {
    private final SeriesNetworkgraphOptions object = Any.empty();

    public SeriesNetworkgraphOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>networkgraph</code> series type, points can be given in the following way:
     *
     * An array of objects with named values. The following snippet shows only a
     * few settings, see the complete options set below. If the total number of
     * data points exceeds the series' turboThreshold, this option is not
     * available. (see online documentation for example)
     *
     */
    public Builder data(double[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>networkgraph</code> series type, points can be given in the following way:
     *
     * An array of objects with named values. The following snippet shows only a
     * few settings, see the complete options set below. If the total number of
     * data points exceeds the series' turboThreshold, this option is not
     * available. (see online documentation for example)
     *
     */
    public Builder data(@Nullable PointOptionsObject value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>networkgraph</code> series type, points can be given in the following way:
     *
     * An array of objects with named values. The following snippet shows only a
     * few settings, see the complete options set below. If the total number of
     * data points exceeds the series' turboThreshold, this option is not
     * available. (see online documentation for example)
     *
     */
    public Builder data(Any[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) A collection of options for the individual nodes. The nodes
     * in a networkgraph diagram are auto-generated instances of
     * <code>Highcharts.Point</code>, but options can be applied here and linked by the
     * <code>id</code>.
     *
     */
    public Builder nodes(SeriesNetworkgraphNodesOptions[] value) {
      object.setNodes(value);
      return this;
    }
  }
}
