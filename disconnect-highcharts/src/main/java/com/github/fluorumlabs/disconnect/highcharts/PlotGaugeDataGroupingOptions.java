package com.github.fluorumlabs.disconnect.highcharts;

import com.github.fluorumlabs.disconnect.types.StringKeyDoubleArrayValue;
import js.extras.JsEnum;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highstock) Data grouping is the concept of sampling the data values into
 * larger blocks in order to ease readability and increase performance of the
 * JavaScript charts. Highstock by default applies data grouping when the points
 * become closer than a certain pixel value, determined by the <code>groupPixelWidth</code>
 * option.
 *
 * If data grouping is applied, the grouping information of grouped points can
 * be read from the Point.dataGroup. If point options other than the data itself
 * are set, for example <code>name</code> or <code>color</code> or custom properties, the grouping
 * logic doesn't know how to group it. In this case the options of the first
 * point instance are copied over to the group point. This can be altered
 * through a custom <code>approximation</code> callback function.
 *
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping</a>
 *
 */
public interface PlotGaugeDataGroupingOptions extends Any {
  /**
   * (Highstock) The method of approximation inside a group. When for example
   * 30 days are grouped into one month, this determines what value should
   * represent the group. Possible values are &quot;average&quot;, &quot;averages&quot;, &quot;open&quot;,
   * &quot;high&quot;, &quot;low&quot;, &quot;close&quot; and &quot;sum&quot;. For OHLC and candlestick series the
   * approximation is &quot;ohlc&quot; by default, which finds the open, high, low and
   * close values within all the grouped data. For ranges, the approximation
   * is &quot;range&quot;, which finds the low and high values. For multi-dimensional
   * data, like ranges and OHLC, &quot;averages&quot; will compute the average for each
   * dimension.
   *
   * Custom aggregate methods can be added by assigning a callback function as
   * the approximation. This function takes a numeric array as the argument
   * and should return a single numeric value or <code>null</code>. Note that the numeric
   * array will never contain null values, only true numbers. Instead, if null
   * values are present in the raw data, the numeric array will have an
   * <code>.hasNulls</code> property set to <code>true</code>. For single-value data sets the data
   * is available in the first argument of the callback function. For OHLC
   * data sets, all the open values are in the first argument, all high values
   * in the second etc.
   *
   * Since v4.2.7, grouping meta data is available in the approximation
   * callback from <code>this.dataGroupInfo</code>. It can be used to extract information
   * from the raw data.
   *
   * Defaults to <code>average</code> for line-type series, <code>sum</code> for columns, <code>range</code>
   * for range series and <code>ohlc</code> for OHLC and candlestick.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.approximation">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.approximation</a>
   *
   * @implspec approximation?: (&quot;average&quot;|&quot;averages&quot;|&quot;close&quot;|&quot;high&quot;|&quot;low&quot;|&quot;open&quot;|&quot;sum&quot;);
   *
   */
  @JSProperty("approximation")
  @Nullable
  Approximation getApproximation();

  /**
   * (Highstock) The method of approximation inside a group. When for example
   * 30 days are grouped into one month, this determines what value should
   * represent the group. Possible values are &quot;average&quot;, &quot;averages&quot;, &quot;open&quot;,
   * &quot;high&quot;, &quot;low&quot;, &quot;close&quot; and &quot;sum&quot;. For OHLC and candlestick series the
   * approximation is &quot;ohlc&quot; by default, which finds the open, high, low and
   * close values within all the grouped data. For ranges, the approximation
   * is &quot;range&quot;, which finds the low and high values. For multi-dimensional
   * data, like ranges and OHLC, &quot;averages&quot; will compute the average for each
   * dimension.
   *
   * Custom aggregate methods can be added by assigning a callback function as
   * the approximation. This function takes a numeric array as the argument
   * and should return a single numeric value or <code>null</code>. Note that the numeric
   * array will never contain null values, only true numbers. Instead, if null
   * values are present in the raw data, the numeric array will have an
   * <code>.hasNulls</code> property set to <code>true</code>. For single-value data sets the data
   * is available in the first argument of the callback function. For OHLC
   * data sets, all the open values are in the first argument, all high values
   * in the second etc.
   *
   * Since v4.2.7, grouping meta data is available in the approximation
   * callback from <code>this.dataGroupInfo</code>. It can be used to extract information
   * from the raw data.
   *
   * Defaults to <code>average</code> for line-type series, <code>sum</code> for columns, <code>range</code>
   * for range series and <code>ohlc</code> for OHLC and candlestick.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.approximation">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.approximation</a>
   *
   * @implspec approximation?: (&quot;average&quot;|&quot;averages&quot;|&quot;close&quot;|&quot;high&quot;|&quot;low&quot;|&quot;open&quot;|&quot;sum&quot;);
   *
   */
  @JSProperty("approximation")
  void setApproximation(Approximation value);

  /**
   * (Highstock) Datetime formats for the header of the tooltip in a stock
   * chart. The format can vary within a chart depending on the currently
   * selected time range and the current data grouping.
   *
   * The default formats are:
   *
   * (see online documentation for example)
   *
   * For each of these array definitions, the first item is the format used
   * when the active time span is one unit. For instance, if the current data
   * applies to one week, the first item of the week array is used. The second
   * and third items are used when the active time span is more than two
   * units. For instance, if the current data applies to two weeks, the second
   * and third item of the week array are used, and applied to the start and
   * end date of the time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: object;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  @Nullable
  Any getDateTimeLabelFormats();

  /**
   * (Highstock) Datetime formats for the header of the tooltip in a stock
   * chart. The format can vary within a chart depending on the currently
   * selected time range and the current data grouping.
   *
   * The default formats are:
   *
   * (see online documentation for example)
   *
   * For each of these array definitions, the first item is the format used
   * when the active time span is one unit. For instance, if the current data
   * applies to one week, the first item of the week array is used. The second
   * and third items are used when the active time span is more than two
   * units. For instance, if the current data applies to two weeks, the second
   * and third item of the week array are used, and applied to the start and
   * end date of the time span.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.dateTimeLabelFormats">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.dateTimeLabelFormats</a>
   *
   * @implspec dateTimeLabelFormats?: object;
   *
   */
  @JSProperty("dateTimeLabelFormats")
  void setDateTimeLabelFormats(Any value);

  /**
   * (Highstock) Enable or disable data grouping.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.enabled">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable or disable data grouping.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.enabled">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) When data grouping is forced, it runs no matter how small the
   * intervals are. This can be handy for example when the sum should be
   * calculated for values appearing at random times within each hour.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.forced">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.forced</a>
   *
   * @implspec forced?: boolean;
   *
   */
  @JSProperty("forced")
  boolean getForced();

  /**
   * (Highstock) When data grouping is forced, it runs no matter how small the
   * intervals are. This can be handy for example when the sum should be
   * calculated for values appearing at random times within each hour.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.forced">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.forced</a>
   *
   * @implspec forced?: boolean;
   *
   */
  @JSProperty("forced")
  void setForced(boolean value);

  /**
   * (Highstock) By default only points within the visible range are grouped.
   * Enabling this option will force data grouping to calculate all grouped
   * points for a given dataset. That option prevents for example a column
   * series from calculating a grouped point partially. The effect is similar
   * to Series.getExtremesFromAll but does not affect yAxis extremes.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupAll">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupAll</a>
   *
   * @implspec groupAll?: boolean;
   *
   */
  @JSProperty("groupAll")
  boolean getGroupAll();

  /**
   * (Highstock) By default only points within the visible range are grouped.
   * Enabling this option will force data grouping to calculate all grouped
   * points for a given dataset. That option prevents for example a column
   * series from calculating a grouped point partially. The effect is similar
   * to Series.getExtremesFromAll but does not affect yAxis extremes.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupAll">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupAll</a>
   *
   * @implspec groupAll?: boolean;
   *
   */
  @JSProperty("groupAll")
  void setGroupAll(boolean value);

  /**
   * (Highstock) The approximate pixel width of each group. If for example a
   * series with 30 points is displayed over a 600 pixel wide plot area, no
   * grouping is performed. If however the series contains so many points that
   * the spacing is less than the groupPixelWidth, Highcharts will try to
   * group it into appropriate groups so that each is more or less two pixels
   * wide. If multiple series with different group pixel widths are drawn on
   * the same x axis, all series will take the greatest width. For example,
   * line series have 2px default group width, while column series have 10px.
   * If combined, both the line and the column will have 10px by default.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupPixelWidth">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupPixelWidth</a>
   *
   * @implspec groupPixelWidth?: number;
   *
   */
  @JSProperty("groupPixelWidth")
  double getGroupPixelWidth();

  /**
   * (Highstock) The approximate pixel width of each group. If for example a
   * series with 30 points is displayed over a 600 pixel wide plot area, no
   * grouping is performed. If however the series contains so many points that
   * the spacing is less than the groupPixelWidth, Highcharts will try to
   * group it into appropriate groups so that each is more or less two pixels
   * wide. If multiple series with different group pixel widths are drawn on
   * the same x axis, all series will take the greatest width. For example,
   * line series have 2px default group width, while column series have 10px.
   * If combined, both the line and the column will have 10px by default.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupPixelWidth">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.groupPixelWidth</a>
   *
   * @implspec groupPixelWidth?: number;
   *
   */
  @JSProperty("groupPixelWidth")
  void setGroupPixelWidth(double value);

  /**
   * (Highstock) Normally, a group is indexed by the start of that group, so
   * for example when 30 daily values are grouped into one month, that month's
   * x value will be the 1st of the month. This apparently shifts the data to
   * the left. When the smoothed option is true, this is compensated for. The
   * data is shifted to the middle of the group, and min and max values are
   * preserved. Internally, this is used in the Navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.smoothed">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.smoothed</a>
   *
   * @implspec smoothed?: boolean;
   *
   */
  @JSProperty("smoothed")
  boolean getSmoothed();

  /**
   * (Highstock) Normally, a group is indexed by the start of that group, so
   * for example when 30 daily values are grouped into one month, that month's
   * x value will be the 1st of the month. This apparently shifts the data to
   * the left. When the smoothed option is true, this is compensated for. The
   * data is shifted to the middle of the group, and min and max values are
   * preserved. Internally, this is used in the Navigator series.
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.smoothed">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.smoothed</a>
   *
   * @implspec smoothed?: boolean;
   *
   */
  @JSProperty("smoothed")
  void setSmoothed(boolean value);

  /**
   * (Highstock) An array determining what time intervals the data is allowed
   * to be grouped to. Each array item is an array where the first value is
   * the time unit and the second value another array of allowed multiples.
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.units">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.units</a>
   *
   * @implspec units?: Array&lt;[string, (Array<number>|null)]&gt;;
   *
   */
  @JSProperty("units")
  @Nullable
  Array<StringKeyDoubleArrayValue> getUnits();

  /**
   * (Highstock) An array determining what time intervals the data is allowed
   * to be grouped to. Each array item is an array where the first value is
   * the time unit and the second value another array of allowed multiples.
   * Defaults to:
   *
   * (see online documentation for example)
   *
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.units">https://api.highcharts.com/highstock/plotOptions.gauge.dataGrouping.units</a>
   *
   * @implspec units?: Array&lt;[string, (Array<number>|null)]&gt;;
   *
   */
  @JSProperty("units")
  void setUnits(Array<StringKeyDoubleArrayValue> value);

  /**
   */
  abstract class Approximation extends JsEnum {
    public static final Approximation AVERAGE = JsEnum.of("average");

    public static final Approximation AVERAGES = JsEnum.of("averages");

    public static final Approximation CLOSE = JsEnum.of("close");

    public static final Approximation HIGH = JsEnum.of("high");

    public static final Approximation LOW = JsEnum.of("low");

    public static final Approximation OPEN = JsEnum.of("open");

    public static final Approximation SUM = JsEnum.of("sum");
  }
}
