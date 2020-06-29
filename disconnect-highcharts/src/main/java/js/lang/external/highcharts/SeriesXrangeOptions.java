package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) An <code>xrange</code> series. If the type option is not
 * specified, it is inherited from chart.type.
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
 * Options for all <code>xrange</code> series are defined in plotOptions.xrange.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesXrangeOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesXrangeOptions { customProperty:
 * string; }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesXrangeOptions extends SeriesOptions, PlotXrangeOptions {
  /**
   * (Highcharts, Highstock, Gantt) An array of data points for the series.
   * For the <code>xrange</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The objects are point
   * configuration objects as seen below. (see online documentation for
   * example)</li>
   * </ol>
   */
  @JSProperty("data")
  @Nullable
  XrangePointOptionsObject[] getData();

  /**
   * (Highcharts, Highstock, Gantt) An array of data points for the series.
   * For the <code>xrange</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>An array of objects with named values. The objects are point
   * configuration objects as seen below. (see online documentation for
   * example)</li>
   * </ol>
   */
  @JSProperty("data")
  void setData(XrangePointOptionsObject... value);

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
    public static final Type XRANGE = JsEnum.of("xrange");
  }

  final class Builder {
    private final SeriesXrangeOptions object = Any.empty();

    private Builder() {
    }

    public SeriesXrangeOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Gantt) An array of data points for the series.
     * For the <code>xrange</code> series type, points can be given in the following ways:
     *
     * <ol>
     * <li>An array of objects with named values. The objects are point
     * configuration objects as seen below. (see online documentation for
     * example)</li>
     * </ol>
     */
    public Builder data(XrangePointOptionsObject... value) {
      object.setData(value);
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
