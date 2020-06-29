package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* Array < ( number | [ string , ( number | null ) ] | null | SeriesMapDataOptions ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) A <code>map</code> series. If the type option is not specified, it is
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
 * Options for all <code>map</code> series are defined in plotOptions.map.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesMapOptions</code> via an interface to allow custom
 * properties: ``` declare interface SeriesMapOptions { customProperty: string;
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
public interface SeriesMapOptions extends PlotMapOptions, SeriesOptions {
  /**
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example: (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
  Unknown /* Array < ( number | [ string , ( number | null ) ] | null | SeriesMapDataOptions ) > */ getData(
      );

  /**
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example: (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example: (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
  void setData(SeriesMapDataOptions... value);

  /**
   * (Highmaps) An array of data points for the series. For the <code>map</code> series
   * type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of numerical values. In this case, the numerical values will
   * be interpreted as <code>value</code> options. Example: (see online documentation for
   * example)
   *
   * </li>
   * <li>
   * An array of arrays with 2 values. In this case, the values correspond
   * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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

  interface Data2 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    String getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(String value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    static Data2.Builder builder() {
      return new Data2.Builder();
    }

    final class Builder {
      private final Data2 object = Any.empty();

      private Builder() {
      }

      public Data2 build() {
        return object;
      }

      public Data2.Builder value0(String value) {
        object.setValue0(value);
        return this;
      }

      public Data2.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }
    }
  }

  abstract class Type extends JsEnum {
    public static final Type MAP = JsEnum.of("map");
  }

  final class Builder {
    private final SeriesMapOptions object = Any.empty();

    private Builder() {
    }

    public SeriesMapOptions build() {
      return object;
    }

    /**
     * (Highmaps) An array of data points for the series. For the <code>map</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of numerical values. In this case, the numerical values will
     * be interpreted as <code>value</code> options. Example: (see online documentation for
     * example)
     *
     * </li>
     * <li>
     * An array of arrays with 2 values. In this case, the values correspond
     * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
     * (Highmaps) An array of data points for the series. For the <code>map</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of numerical values. In this case, the numerical values will
     * be interpreted as <code>value</code> options. Example: (see online documentation for
     * example)
     *
     * </li>
     * <li>
     * An array of arrays with 2 values. In this case, the values correspond
     * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
    public Builder data(SeriesMapDataOptions... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highmaps) An array of data points for the series. For the <code>map</code> series
     * type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of numerical values. In this case, the numerical values will
     * be interpreted as <code>value</code> options. Example: (see online documentation for
     * example)
     *
     * </li>
     * <li>
     * An array of arrays with 2 values. In this case, the values correspond
     * to <code>[hc-key, value]</code>. Example: (see online documentation for example)
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
