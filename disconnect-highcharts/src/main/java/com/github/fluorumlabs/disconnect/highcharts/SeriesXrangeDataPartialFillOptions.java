package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Gantt) A partial fill for each point, typically used
 * to visualize how much of a task is performed. The partial fill object can be
 * set either on series or point level.
 *
 * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill">https://api.highcharts.com/highcharts/series.xrange.data.partialFill</a>
 * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill">https://api.highcharts.com/highstock/series.xrange.data.partialFill</a>
 * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill">https://api.highcharts.com/gantt/series.xrange.data.partialFill</a>
 *
 */
public interface SeriesXrangeDataPartialFillOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
   * filled. Values can be 0-1 and are converted to percentages in the default
   * data label formatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill.amount">https://api.highcharts.com/highcharts/series.xrange.data.partialFill.amount</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill.amount">https://api.highcharts.com/highstock/series.xrange.data.partialFill.amount</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill.amount">https://api.highcharts.com/gantt/series.xrange.data.partialFill.amount</a>
   *
   * @implspec amount?: number;
   *
   */
  @JSProperty("amount")
  double getAmount();

  /**
   * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
   * filled. Values can be 0-1 and are converted to percentages in the default
   * data label formatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill.amount">https://api.highcharts.com/highcharts/series.xrange.data.partialFill.amount</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill.amount">https://api.highcharts.com/highstock/series.xrange.data.partialFill.amount</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill.amount">https://api.highcharts.com/gantt/series.xrange.data.partialFill.amount</a>
   *
   * @implspec amount?: number;
   *
   */
  @JSProperty("amount")
  void setAmount(double value);

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill.fill">https://api.highcharts.com/highcharts/series.xrange.data.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill.fill">https://api.highcharts.com/highstock/series.xrange.data.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill.fill">https://api.highcharts.com/gantt/series.xrange.data.partialFill.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  @Nullable
  String getFill();

  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/series.xrange.data.partialFill.fill">https://api.highcharts.com/highcharts/series.xrange.data.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/series.xrange.data.partialFill.fill">https://api.highcharts.com/highstock/series.xrange.data.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/series.xrange.data.partialFill.fill">https://api.highcharts.com/gantt/series.xrange.data.partialFill.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  void setFill(String value);
}
