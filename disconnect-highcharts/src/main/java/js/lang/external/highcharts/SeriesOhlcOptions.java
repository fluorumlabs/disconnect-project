package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* Array < ( [ ( number | string ) , number , number , number ] | [ ( number | string ) , number , number , number , number ] | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) A <code>ohlc</code> series. If the type option is not specified, it is
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
 * Options for all <code>ohlc</code> series are defined in plotOptions.ohlc.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesOhlcOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesOhlcOptions { customProperty: string;
 * }
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SeriesOhlcOptions extends SeriesOptions, PlotOhlcOptions {
  /**
   * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 5 or 4 values. In this case, the values
   * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
   * is applied as the name of the point, and the <code>x</code> value is inferred. The
   * <code>x</code> value can also be omitted, in which case the inner arrays should be
   * of length 4. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options. (see online documentation
   * for example)
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
  Unknown /* Array < ( [ ( number | string ) , number , number , number ] | [ ( number | string ) , number , number , number , number ] | PointOptionsObject ) > */ getData(
      );

  /**
   * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 5 or 4 values. In this case, the values
   * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
   * is applied as the name of the point, and the <code>x</code> value is inferred. The
   * <code>x</code> value can also be omitted, in which case the inner arrays should be
   * of length 4. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options. (see online documentation
   * for example)
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
  void setData(Data5[] value);

  /**
   * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 5 or 4 values. In this case, the values
   * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
   * is applied as the name of the point, and the <code>x</code> value is inferred. The
   * <code>x</code> value can also be omitted, in which case the inner arrays should be
   * of length 4. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options. (see online documentation
   * for example)
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
  void setData(Data4[] value);

  /**
   * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 5 or 4 values. In this case, the values
   * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
   * is applied as the name of the point, and the <code>x</code> value is inferred. The
   * <code>x</code> value can also be omitted, in which case the inner arrays should be
   * of length 4. Then the <code>x</code> value is automatically calculated, either
   * starting at 0 and incremented by 1, or from <code>pointStart</code> and
   * <code>pointInterval</code> given in the series options. (see online documentation
   * for example)
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
  void setData(PointOptionsObject[] value);

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
    private final SeriesOhlcOptions object = Any.empty();

    public SeriesOhlcOptions build() {
      return object;
    }

    /**
     * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 5 or 4 values. In this case, the values
     * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
     * is applied as the name of the point, and the <code>x</code> value is inferred. The
     * <code>x</code> value can also be omitted, in which case the inner arrays should be
     * of length 4. Then the <code>x</code> value is automatically calculated, either
     * starting at 0 and incremented by 1, or from <code>pointStart</code> and
     * <code>pointInterval</code> given in the series options. (see online documentation
     * for example)
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
    public Builder data(Data5[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 5 or 4 values. In this case, the values
     * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
     * is applied as the name of the point, and the <code>x</code> value is inferred. The
     * <code>x</code> value can also be omitted, in which case the inner arrays should be
     * of length 4. Then the <code>x</code> value is automatically calculated, either
     * starting at 0 and incremented by 1, or from <code>pointStart</code> and
     * <code>pointInterval</code> given in the series options. (see online documentation
     * for example)
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
    public Builder data(Data4[] value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highstock) An array of data points for the series. For the <code>ohlc</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 5 or 4 values. In this case, the values
     * correspond to <code>x,open,high,low,close</code>. If the first value is a string, it
     * is applied as the name of the point, and the <code>x</code> value is inferred. The
     * <code>x</code> value can also be omitted, in which case the inner arrays should be
     * of length 4. Then the <code>x</code> value is automatically calculated, either
     * starting at 0 and incremented by 1, or from <code>pointStart</code> and
     * <code>pointInterval</code> given in the series options. (see online documentation
     * for example)
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
    public Builder data(PointOptionsObject[] value) {
      object.setData(value);
      return this;
    }
  }
}
