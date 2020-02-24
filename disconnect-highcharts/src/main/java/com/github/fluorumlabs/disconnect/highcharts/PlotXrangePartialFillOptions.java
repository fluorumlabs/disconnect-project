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
 * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill">https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill</a>
 * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.partialFill">https://api.highcharts.com/highstock/plotOptions.xrange.partialFill</a>
 * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.partialFill">https://api.highcharts.com/gantt/plotOptions.xrange.partialFill</a>
 *
 */
public interface PlotXrangePartialFillOptions extends Any {
  /**
   * (Highcharts, Highstock, Gantt) The fill color to be used for partial
   * fills. Defaults to a darker shade of the point color.
   *
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/highstock/plotOptions.xrange.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/gantt/plotOptions.xrange.partialFill.fill</a>
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
   * @see <a href="https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/highcharts/plotOptions.xrange.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/highstock/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/highstock/plotOptions.xrange.partialFill.fill</a>
   * @see <a href="https://api.highcharts.com/gantt/plotOptions.xrange.partialFill.fill">https://api.highcharts.com/gantt/plotOptions.xrange.partialFill.fill</a>
   *
   * @implspec fill?: ColorString;
   *
   */
  @JSProperty("fill")
  void setFill(String value);
}
