package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>bellcurve</code> series. If the type option is not specified, it is
 * inherited from chart.type.
 *
 * For options that apply to multiple series, it is recommended to add them to
 * the plotOptions.series options structure. To apply to all series of this
 * specific type, apply it to plotOptions.bellcurve.
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
 * Options for all <code>bellcurve</code> series are defined in plotOptions.bellcurve.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesBellcurveOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesBellcurveOptions {
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
public interface SeriesBellcurveOptions extends SeriesOptions, PlotBellcurveOptions {
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

  class Builder {
    private final SeriesBellcurveOptions object = Any.empty();

    public SeriesBellcurveOptions build() {
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
  }
}
