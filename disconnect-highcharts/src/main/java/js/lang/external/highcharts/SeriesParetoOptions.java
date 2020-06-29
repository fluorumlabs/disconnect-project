package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* Array < ( Array < ( number | string ) > | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>pareto</code> series. If the type option is not specified, it is
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
 * Options for all <code>pareto</code> series are defined in plotOptions.pareto.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesParetoOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesParetoOptions { customProperty:
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
public interface SeriesParetoOptions extends SeriesOptions, PlotParetoOptions {
  /**
   * (Highcharts) An integer identifying the index to use for the base series,
   * or a string representing the id of the series.
   *
   */
  @JSProperty("baseSeries")
  @Nullable
  Unknown /* ( number | string ) */ getBaseSeries();

  /**
   * (Highcharts) An integer identifying the index to use for the base series,
   * or a string representing the id of the series.
   *
   */
  @JSProperty("baseSeries")
  void setBaseSeries(double value);

  /**
   * (Highcharts) An integer identifying the index to use for the base series,
   * or a string representing the id of the series.
   *
   */
  @JSProperty("baseSeries")
  void setBaseSeries(@Nullable String value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>pareto</code>
   * series type, points are calculated dynamically.
   *
   */
  @JSProperty("data")
  @Nullable
  Unknown /* Array < ( Array < ( number | string ) > | PointOptionsObject ) > */ getData();

  /**
   * (Highcharts) An array of data points for the series. For the <code>pareto</code>
   * series type, points are calculated dynamically.
   *
   */
  @JSProperty("data")
  void setData(PointOptionsObject... value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>pareto</code>
   * series type, points are calculated dynamically.
   *
   */
  @JSProperty("data")
  void setData(double... value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>pareto</code>
   * series type, points are calculated dynamically.
   *
   */
  @JSProperty("data")
  void setData(String... value);

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
    public static final Type PARETO = JsEnum.of("pareto");
  }

  final class Builder {
    private final SeriesParetoOptions object = Any.empty();

    private Builder() {
    }

    public SeriesParetoOptions build() {
      return object;
    }

    /**
     * (Highcharts) An integer identifying the index to use for the base series,
     * or a string representing the id of the series.
     *
     */
    public Builder baseSeries(double value) {
      object.setBaseSeries(value);
      return this;
    }

    /**
     * (Highcharts) An integer identifying the index to use for the base series,
     * or a string representing the id of the series.
     *
     */
    public Builder baseSeries(@Nullable String value) {
      object.setBaseSeries(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>pareto</code>
     * series type, points are calculated dynamically.
     *
     */
    public Builder data(PointOptionsObject... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>pareto</code>
     * series type, points are calculated dynamically.
     *
     */
    public Builder data(double... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>pareto</code>
     * series type, points are calculated dynamically.
     *
     */
    public Builder data(String... value) {
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
