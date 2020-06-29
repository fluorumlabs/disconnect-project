package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>dependencywheel</code> series. If the type option is not specified,
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
 * Options for all <code>dependencywheel</code> series are defined in
 * plotOptions.dependencywheel.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesDependencywheelOptions</code> via an interface to
 * allow custom properties: ``` declare interface SeriesDependencywheelOptions {
 * customProperty: string; }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesDependencywheelOptions extends SeriesOptions, PlotDependencywheelOptions {
  /**
   * (Highcharts) An array of data points for the series. For the
   * <code>dependencywheel</code> series type, points can be given in the following way:
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
   * (Highcharts) An array of data points for the series. For the
   * <code>dependencywheel</code> series type, points can be given in the following way:
   *
   * An array of objects with named values. The following snippet shows only a
   * few settings, see the complete options set below. If the total number of
   * data points exceeds the series' turboThreshold, this option is not
   * available. (see online documentation for example)
   *
   */
  @JSProperty("data")
  void setData(SeriesSankeyPointOptionsObject... value);

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a dependency diagram are auto-generated instances of
   * <code>Highcharts.Point</code>, but options can be applied here and linked by the
   * <code>id</code>.
   *
   */
  @JSProperty("nodes")
  @Nullable
  SeriesSankeyNodesOptionsObject[] getNodes();

  /**
   * (Highcharts) A collection of options for the individual nodes. The nodes
   * in a dependency diagram are auto-generated instances of
   * <code>Highcharts.Point</code>, but options can be applied here and linked by the
   * <code>id</code>.
   *
   */
  @JSProperty("nodes")
  void setNodes(SeriesSankeyNodesOptionsObject... value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
   * TypeScript non-optional and might be <code>undefined</code> in series objects from
   * unknown sources.
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
   * TypeScript non-optional and might be <code>undefined</code> in series objects from
   * unknown sources.
   *
   */
  @JSProperty("type")
  void setType(Type value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type DEPENDENCYWHEEL = JsEnum.of("dependencywheel");
  }

  final class Builder {
    private final SeriesDependencywheelOptions object = Any.empty();

    private Builder() {
    }

    public SeriesDependencywheelOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the
     * <code>dependencywheel</code> series type, points can be given in the following way:
     *
     * An array of objects with named values. The following snippet shows only a
     * few settings, see the complete options set below. If the total number of
     * data points exceeds the series' turboThreshold, this option is not
     * available. (see online documentation for example)
     *
     */
    public Builder data(SeriesSankeyPointOptionsObject... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) A collection of options for the individual nodes. The nodes
     * in a dependency diagram are auto-generated instances of
     * <code>Highcharts.Point</code>, but options can be applied here and linked by the
     * <code>id</code>.
     *
     */
    public Builder nodes(SeriesSankeyNodesOptionsObject... value) {
      object.setNodes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
     * TypeScript non-optional and might be <code>undefined</code> in series objects from
     * unknown sources.
     *
     */
    public Builder type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
