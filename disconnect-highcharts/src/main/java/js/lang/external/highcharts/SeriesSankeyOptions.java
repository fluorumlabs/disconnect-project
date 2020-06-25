package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>sankey</code> series. If the type option is not specified, it is
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
 * Options for all <code>sankey</code> series are defined in plotOptions.sankey.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesSankeyOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesSankeyOptions { customProperty:
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
public interface SeriesSankeyOptions extends SeriesOptions, PlotSankeyOptions {
  /**
   * Not available
   *
   */
  @JSProperty("borderRadius")
  @Nullable
  Unknown /* undefined */ getBorderRadius();

  /**
   * (Highcharts) An array of data points for the series. For the <code>sankey</code>
   * series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  @Nullable
  SeriesSankeyPointOptionsObject[] getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>sankey</code>
   * series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  void setData(SeriesSankeyPointOptionsObject[] value);

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
  @JSProperty("depth")
  @Nullable
  Unknown /* undefined */ getDepth();

  /**
   * Not available
   *
   */
  @JSProperty("edgeColor")
  @Nullable
  Unknown /* undefined */ getEdgeColor();

  /**
   * Not available
   *
   */
  @JSProperty("edgeWidth")
  @Nullable
  Unknown /* undefined */ getEdgeWidth();

  /**
   * Not available
   *
   */
  @JSProperty("grouping")
  @Nullable
  Unknown /* undefined */ getGrouping();

  /**
   * Not available
   *
   */
  @JSProperty("groupPadding")
  @Nullable
  Unknown /* undefined */ getGroupPadding();

  /**
   * Not available
   *
   */
  @JSProperty("groupZPadding")
  @Nullable
  Unknown /* undefined */ getGroupZPadding();

  /**
   * Not available
   *
   */
  @JSProperty("maxPointWidth")
  @Nullable
  Unknown /* undefined */ getMaxPointWidth();

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a sankey diagram are auto-generated instances of <code>Highcharts.Point</code>,
   * but options can be applied here and linked by the <code>id</code>.
   *
   */
  @JSProperty("nodes")
  @Nullable
  SeriesSankeyNodesOptionsObject[] getNodes();

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a sankey diagram are auto-generated instances of <code>Highcharts.Point</code>,
   * but options can be applied here and linked by the <code>id</code>.
   *
   */
  @JSProperty("nodes")
  void setNodes(SeriesSankeyNodesOptionsObject[] value);

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

  class Builder {
    private final SeriesSankeyOptions object = Any.empty();

    public SeriesSankeyOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>sankey</code>
     * series type, points can be given in the following way:
     *
     * An array of objects with named values. The following snippet shows only a
     * few settings, see the complete options set below. If the total number of
     * data points exceeds the series' turboThreshold, this option is not
     * available. (see online documentation for example)
     *
     */
    public Builder data(SeriesSankeyPointOptionsObject[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) A collection of options for the individual nodes. The nodes
     * in a sankey diagram are auto-generated instances of <code>Highcharts.Point</code>,
     * but options can be applied here and linked by the <code>id</code>.
     *
     */
    public Builder nodes(SeriesSankeyNodesOptionsObject[] value) {
      object.setNodes(value);
      return this;
    }
  }
}
