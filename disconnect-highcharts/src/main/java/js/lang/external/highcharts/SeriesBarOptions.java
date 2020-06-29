package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* Array < ( number | [ ( number | string ) , ( number | null ) ] | null | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>bar</code> series. If the type option is not specified, it is
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
 * Options for all <code>bar</code> series are defined in plotOptions.bar.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesBarOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesBarOptions { customProperty: string;
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
public interface SeriesBarOptions extends PlotBarOptions, SeriesOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>bar</code> series
   * type, points can be given in the following ways:
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
  Unknown /* Array < ( number | [ ( number | string ) , ( number | null ) ] | null | PointOptionsObject ) > */ getData(
      );

  /**
   * (Highcharts) An array of data points for the series. For the <code>bar</code> series
   * type, points can be given in the following ways:
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
   * (Highcharts) An array of data points for the series. For the <code>bar</code> series
   * type, points can be given in the following ways:
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
  void setData(double... value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>bar</code> series
   * type, points can be given in the following ways:
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
  void setData(Data2... value);

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
    public static final Type BAR = JsEnum.of("bar");
  }

  final class Builder {
    private final SeriesBarOptions object = Any.empty();

    private Builder() {
    }

    public SeriesBarOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>bar</code> series
     * type, points can be given in the following ways:
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
     * (Highcharts) An array of data points for the series. For the <code>bar</code> series
     * type, points can be given in the following ways:
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
    public Builder data(double... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>bar</code> series
     * type, points can be given in the following ways:
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
    public Builder data(Data2... value) {
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
