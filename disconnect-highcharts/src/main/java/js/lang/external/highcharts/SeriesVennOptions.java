package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>venn</code> series. If the type option is not specified, it is
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
 * Options for all <code>venn</code> series are defined in plotOptions.venn.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesVennOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesVennOptions { customProperty: string;
 * }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesVennOptions extends PlotVennOptions, SeriesOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>scatter</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>y</code> options. The <code>x</code> values will be automatically
   * calculated, either starting at 0 and incremented by 1, or from
   * <code>pointStart</code> and <code>pointInterval</code> given in the series options. If the axis
   * has categories, these will be used. Example: (see online documentation
   * for example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>x,y</code>. If the first value is a string, it is applied as the name of
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
  PointOptionsObject[] getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>scatter</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>y</code> options. The <code>x</code> values will be automatically
   * calculated, either starting at 0 and incremented by 1, or from
   * <code>pointStart</code> and <code>pointInterval</code> given in the series options. If the axis
   * has categories, these will be used. Example: (see online documentation
   * for example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>x,y</code>. If the first value is a string, it is applied as the name of
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
  void setData(PointOptionsObject... value);

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

  /**
   * Not available
   *
   */
  @JSProperty("steps")
  @Nullable
  Unknown /* undefined */ getSteps();

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

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type VENN = JsEnum.of("venn");
  }

  final class Builder {
    private final SeriesVennOptions object = Any.empty();

    private Builder() {
    }

    public SeriesVennOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>scatter</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of numerical values. In this case, the numerical values will
     * be interpreted as <code>y</code> options. The <code>x</code> values will be automatically
     * calculated, either starting at 0 and incremented by 1, or from
     * <code>pointStart</code> and <code>pointInterval</code> given in the series options. If the axis
     * has categories, these will be used. Example: (see online documentation
     * for example)
     *
     * </li>
     * <li>
     * An array of arrays with 2 values. In this case, the values correspond
     * to <code>x,y</code>. If the first value is a string, it is applied as the name of
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
    public Builder data(PointOptionsObject... value) {
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
