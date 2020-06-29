package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>histogram</code> series. If the type option is not specified, it is
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
 * Options for all <code>histogram</code> series are defined in plotOptions.histogram.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesHistogramOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesHistogramOptions {
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
public interface SeriesHistogramOptions extends PlotHistogramOptions, SeriesOptions {
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
   * Not available
   *
   */
  @JSProperty("data")
  @Nullable
  Unknown /* undefined */ getData();

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
    public static final Type HISTOGRAM = JsEnum.of("histogram");
  }

  final class Builder {
    private final SeriesHistogramOptions object = Any.empty();

    private Builder() {
    }

    public SeriesHistogramOptions build() {
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
