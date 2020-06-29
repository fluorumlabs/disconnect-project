package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( number | string ) */;
import js.lang.Unknown /* Array < ( [ ( number | string ) , number , number , number , number ] | [ ( number | string ) , number , number , number , number , number ] | PointOptionsObject ) > */;
import js.lang.Unknown /* undefined */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) A <code>boxplot</code> series. If the type option is not specified, it is
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
 * Options for all <code>boxplot</code> series are defined in plotOptions.boxplot.
 *
 * </li>
 * <li>
 * Options for one single series are given in the series instance array. (see
 * online documentation for example)
 *
 * </li>
 * </ol>
 * You have to extend the <code>SeriesBoxplotOptions</code> via an interface to allow
 * custom properties: ``` declare interface SeriesBoxplotOptions {
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
public interface SeriesBoxplotOptions extends PlotBoxplotOptions, SeriesOptions {
  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
  Unknown /* Array < ( [ ( number | string ) , number , number , number , number ] | [ ( number | string ) , number , number , number , number , number ] | PointOptionsObject ) > */ getData(
      );

  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
  void setData(Data5... value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
  void setData(PointOptionsObject... value);

  /**
   * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
   * series type, points can be given in the following ways:
   *
   * <ol>
   * <li>
   * An array of arrays with 6 or 5 values. In this case, the values
   * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
   * it is applied as the name of the point, and the <code>x</code> value is inferred.
   * The <code>x</code> value can also be omitted, in which case the inner arrays should
   * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
  void setData(Data6... value);

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

  interface Data6 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    Unknown /* ( number | string ) */ getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(double value);

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

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    @JSBody(
        script = "return this[3]"
    )
    double getValue3();

    @JSBody(
        params = "value",
        script = "this[3] = value"
    )
    void setValue3(double value);

    @JSBody(
        script = "return this[4]"
    )
    double getValue4();

    @JSBody(
        params = "value",
        script = "this[4] = value"
    )
    void setValue4(double value);

    @JSBody(
        script = "return this[5]"
    )
    double getValue5();

    @JSBody(
        params = "value",
        script = "this[5] = value"
    )
    void setValue5(double value);

    static Data6.Builder builder() {
      return new Data6.Builder();
    }

    final class Builder {
      private final Data6 object = Any.empty();

      private Builder() {
      }

      public Data6 build() {
        return object;
      }

      public Data6.Builder value0(double value) {
        object.setValue0(value);
        return this;
      }

      public Data6.Builder value0(String value) {
        object.setValue0(value);
        return this;
      }

      public Data6.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public Data6.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }

      public Data6.Builder value3(double value) {
        object.setValue3(value);
        return this;
      }

      public Data6.Builder value4(double value) {
        object.setValue4(value);
        return this;
      }

      public Data6.Builder value5(double value) {
        object.setValue5(value);
        return this;
      }
    }
  }

  abstract class Type extends JsEnum {
    public static final Type BOXPLOT = JsEnum.of("boxplot");
  }

  final class Builder {
    private final SeriesBoxplotOptions object = Any.empty();

    private Builder() {
    }

    public SeriesBoxplotOptions build() {
      return object;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 6 or 5 values. In this case, the values
     * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
     * it is applied as the name of the point, and the <code>x</code> value is inferred.
     * The <code>x</code> value can also be omitted, in which case the inner arrays should
     * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
    public Builder data(Data5... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 6 or 5 values. In this case, the values
     * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
     * it is applied as the name of the point, and the <code>x</code> value is inferred.
     * The <code>x</code> value can also be omitted, in which case the inner arrays should
     * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
    public Builder data(PointOptionsObject... value) {
      object.setData(value);
      return this;
    }

    /**
     * (Highcharts) An array of data points for the series. For the <code>boxplot</code>
     * series type, points can be given in the following ways:
     *
     * <ol>
     * <li>
     * An array of arrays with 6 or 5 values. In this case, the values
     * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string,
     * it is applied as the name of the point, and the <code>x</code> value is inferred.
     * The <code>x</code> value can also be omitted, in which case the inner arrays should
     * be of length 5. Then the <code>x</code> value is automatically calculated, either
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
    public Builder data(Data6... value) {
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
