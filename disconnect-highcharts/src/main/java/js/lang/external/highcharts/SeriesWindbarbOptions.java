package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* Array < ( [ ( number | string ) , number , number ] | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock) A <code>windbarb</code> series. If the type option is not
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
 * Options for all <code>windbarb</code> series are defined in plotOptions.windbarb.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesWindbarbOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesWindbarbOptions {
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
public interface SeriesWindbarbOptions extends SeriesOptions, PlotWindbarbOptions {
  /**
   * (Highcharts, Highstock) An array of data points for the series. For the
   * <code>windbarb</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,value,direction</code>. If the first value is a string, it is applied as
   * the name of the point, and the <code>x</code> value is inferred. (see online
   * documentation for example)
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
  Unknown /* Array < ( [ ( number | string ) , number , number ] | PointOptionsObject ) > */ getData(
      );

  /**
   * (Highcharts, Highstock) An array of data points for the series. For the
   * <code>windbarb</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,value,direction</code>. If the first value is a string, it is applied as
   * the name of the point, and the <code>x</code> value is inferred. (see online
   * documentation for example)
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
   * (Highcharts, Highstock) An array of data points for the series. For the
   * <code>windbarb</code> series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 3 values. In this case, the values correspond
   * to <code>x,value,direction</code>. If the first value is a string, it is applied as
   * the name of the point, and the <code>x</code> value is inferred. (see online
   * documentation for example)
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
  void setData(Data3... value);

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
    public static final Type WINDBARB = JsEnum.of("windbarb");
  }

  final class Builder {
    private final SeriesWindbarbOptions object = Any.empty();

    private Builder() {
    }

    public SeriesWindbarbOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock) An array of data points for the series. For the
     * <code>windbarb</code> series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 3 values. In this case, the values correspond
     * to <code>x,value,direction</code>. If the first value is a string, it is applied as
     * the name of the point, and the <code>x</code> value is inferred. (see online
     * documentation for example)
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
     * (Highcharts, Highstock) An array of data points for the series. For the
     * <code>windbarb</code> series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 3 values. In this case, the values correspond
     * to <code>x,value,direction</code>. If the first value is a string, it is applied as
     * the name of the point, and the <code>x</code> value is inferred. (see online
     * documentation for example)
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
    public Builder data(Data3... value) {
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
